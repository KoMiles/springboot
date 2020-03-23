package com.komiles.study.service.impl;

import com.komiles.study.service.HumanService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author komiles@163.com
 * @date 2020-03-23 12:01
 */
@Service(value = "womanService")
//@Component(value = "womanService")
//@Primary
public class WomanServiceImpl implements HumanService {

    /**
     * 跑马拉松
     */
    @Override
    public String runMarathon() {
        return "A Woman run marathon";
    }
}
