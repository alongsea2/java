package com.test.service.impl;

import com.test.service.UtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class UtilServiceImpl implements UtilService {

    @Autowired
    RedisTemplate redisTemplateByteArrayService;

    @Override
    public String test(String code) {
        redisTemplateByteArrayService.getValueSerializer()
        return code;
    }
}
