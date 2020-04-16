package com.komiles.study.controller;

import com.komiles.study.entity.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author komiles@163.com
 * @date 2020-04-02 10:07
 */
@RestController
@RequestMapping("/redis")
public class RedisController {


    @Autowired
    RedisTemplate redisTemplate; // 操作对象的redis实例

    @Autowired
    StringRedisTemplate stringRedisTemplate; // 操作字符串的redis实例


    @GetMapping("/setRedis")
    public String setRedis(@RequestParam("name") String name, @RequestParam("value") String value)
    {
        ValueOperations<String, String> ops1 = stringRedisTemplate.opsForValue();
        ops1.set(name, value);
        return name;
    }

    @GetMapping("/getRedis")
    public String getRedis(@RequestParam("name") String name)
    {
        ValueOperations<String, String> ops1 = stringRedisTemplate.opsForValue();
        String value = ops1.get(name);
        return value;
    }


    @GetMapping("/oGetRedis")
    public UserDto oGetRedis(@RequestParam("id") Integer id)
    {
        ValueOperations operations = redisTemplate.opsForValue();
        UserDto value = (UserDto) operations.get("user_"+id);
        return value;
    }
}
