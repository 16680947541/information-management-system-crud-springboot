package com.kob.backend.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bot {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer userId;
    private String name;
    private String surname;
    private String sex;
    private String address;
    private String phone;
    private String email;
}
