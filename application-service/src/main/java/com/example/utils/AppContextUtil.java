package com.example.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Description: spring上下文工具类
 * @Author: admin
 * @Date: 2020/9/24 16:14
 */
@Component
public class AppContextUtil  implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    public static Object getBean(String beanName){
        return applicationContext.getBean(beanName);
    }
    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        applicationContext = context;
    }
}
