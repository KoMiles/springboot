package com.komiles.study.controller;

import com.komiles.study.service.HumanService;
import com.komiles.study.service.impl.ManServiceImpl;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author komiles@163.com
 * @date 2020-03-23 11:49
 */
@RestController
@RequestMapping("/human")
public class HumanController {

    @Autowired
    @Qualifier(value = "manService")
//    @Resource(name="manService")

    private HumanService humanService;

    @GetMapping("/run")
    public String runMarathon()
    {
        return humanService.runMarathon();
    }
}
