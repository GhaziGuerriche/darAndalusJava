/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dar.andalusService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author ghazi.guerriche
 */
public class ApplicationContextLoader {

    private static ApplicationContext  ctx;

    public ApplicationContextLoader() {
        ctx = new ClassPathXmlApplicationContext("spring-config-main.xml");
    }

    public ApplicationContext  getCtx() {
        return ctx;
    }

}
