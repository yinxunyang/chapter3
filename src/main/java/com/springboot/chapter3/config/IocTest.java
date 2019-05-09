package com.springboot.chapter3.config;

import com.springboot.chapter3.pojo.BussinessPerson;
import com.springboot.chapter3.pojo.User;
import com.springboot.chapter3.pojo.definition.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class IocTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Person person = ctx.getBean(BussinessPerson.class);
        person.service();
    }
}
