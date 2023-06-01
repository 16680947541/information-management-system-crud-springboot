package com.kob.backend.service.impl.user.bot;

import com.kob.backend.mapper.BotMapper;
import com.kob.backend.pojo.Bot;
import com.kob.backend.pojo.User;
import com.kob.backend.service.impl.utils.UserDetailsImpl;
import com.kob.backend.service.user.bot.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class AddServiceImpl implements AddService {

    @Autowired
    private BotMapper botMapper;
    @Override
    public Map<String, String> add(Map<String, String> data) {
        UsernamePasswordAuthenticationToken authenticationToken =
                (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        UserDetailsImpl loginUser = (UserDetailsImpl) authenticationToken.getPrincipal();

        User user = loginUser.getUser();

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
        Date now = new Date();
        Bot bot = new Bot(null,
               user.getId(),
               name,
               surname,
               sex,
               address,
               phone,
               email,
                title,
                content,
                description,
                now,
                now
               );

        botMapper.insert(bot);
        map.put("error_message", "success");
        return map;
    }
}
