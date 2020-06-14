package com.komiles.study.test;

import lombok.extern.slf4j.Slf4j;

/**
 * @author komiles@163.com
 * @date 2020-06-14 23:56
 */
@Slf4j
public class Hello {

    public class Inner{

        public void show() {
            log.info("message:{}","this is System Inner Class!");
        }
    }
}
