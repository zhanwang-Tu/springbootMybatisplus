package com.example.springbootmybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_user")
public class User {
    @TableId("id")
    private Integer id;
    private String name;
    private Float balance;
}
