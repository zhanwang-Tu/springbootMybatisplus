package com.example.springbootmybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springbootmybatisplus.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
//我这里用过不用mapper注解的就是用mybatis，但是也是说找不到bean
public interface UserMapper{
        // 根据用户ID查询用户信息
        @Select("SELECT * FROM t_user WHERE id = #{id}")
        User selectById(@Param("id") Long id);

        // 查询所有用户信息
        @Select("SELECT * FROM t_user")
        List<User> selectAll();
    }


