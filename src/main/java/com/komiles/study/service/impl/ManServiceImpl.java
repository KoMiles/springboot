package com.komiles.study.service.impl;

import com.komiles.study.service.HumanService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author komiles@163.com
 * @date 2020-03-23 11:48
 */
@Service(value = "manService")
//@Component(value = "manService")
public class ManServiceImpl implements HumanService {

    /**
     * 跑马拉松
     */
    @Override
    public String runMarathon() {
        return " A man run marathon";
    }
}
