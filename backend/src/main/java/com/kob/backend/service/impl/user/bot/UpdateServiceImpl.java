package com.kob.backend.service.impl.user.bot;

import com.kob.backend.mapper.BotMapper;
import com.kob.backend.pojo.Bot;
import com.kob.backend.pojo.User;
import com.kob.backend.service.impl.utils.UserDetailsImpl;
import com.kob.backend.service.user.bot.UpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class UpdateServiceImpl implements UpdateService {

    @Autowired
    private BotMapper botMapper;
    @Override
    public Map<String, String> update(Map<String, String> data) {
        UsernamePasswordAuthenticationToken authenticationToken =
                (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        UserDetailsImpl loginUser = (UserDetailsImpl) authenticationToken.getPrincipal();

        User user = loginUser.getUser();
        int bot_id = Integer.parseInt(data.get("bot_id"));


        String name = data.get("name");

        String surname = data.get("surname");

        String sex = data.get("sex");

        String address = data.get("address");

        String phone = data.get("phone");

        String email = data.get("email");

        String title = data.get("title");
        String content = data.get("content");
        String description = data.get("description");

        Map<String, String> map = new HashMap<>();


        if (name.length() > 100) {
            map.put("error_message", "name长度不能大于100");
            return map;
        }
        if (surname.length() > 100) {
            map.put("error_message", "surname长度不能大于100");
        }
        if (sex.length() > 5) {
            map.put("error_message", "sex长度不能大于5");
            return map;
        }
        if (address.length() > 100) {
            map.put("error_message", "address长度不能大于100");
            return map;
        }
        if (phone.length() > 100) {
            map.put("error_message", "phone长度不能大于100");
            return map;
        }
        if (email.length() > 100) {
            map.put("error_message", "email长度不能大于100");
            return map;
        }
        Bot bot = botMapper.selectById(bot_id);

        if (bot == null) {
            map.put("error_message", "Bot不存在或已被删除");
            return map;
        }
        if (!bot.getUserId().equals(user.getId())) {
            map.put("error_message", "没有权限删除该Bot");
            return map;
        }

        Bot new_bot = new Bot(bot.getId(),
                user.getId(),
                name,
                surname,
                sex,
                address,
                phone,
                email,
                title,
                description,
                content,
                bot.getCreatetime(),
                new Date()

        );
        botMapper.updateById(new_bot);
        map.put("error_message", "success");
        return map;
    }
}
