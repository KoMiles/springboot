package com.komiles.study.controller;

import com.komiles.study.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author komiles@163.com
 * @date 2020-04-02 14:22
 */
@RequestMapping("/redis")
@RestController
public class RedisTestController {

    @Autowired
    RedisTemplate redisTemplate; // 对象Redis实例

    @Autowired
    StringRedisTemplate stringRedisTemplate; // 字符串Redis实例


    @GetMapping("/strTest")
    public String redisStrTest()
    {
        ValueOperations<String,String> valueOperations = stringRedisTemplate.opsForValue();
        valueOperations.set("name", "hello world");

        String value = valueOperations.get("name");
        return value;
    }

    @GetMapping("/objTest")
    public User redisObjTest()
    {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        User user = new User();
        user.setId(1111);
        user.setUsername("哈哈哈");
        user.setPassword("123456");
        valueOperations.set("user_obj", user);
        return (User) valueOperations.get("user_obj");
    }
}
