package com.springboot.chapter3.pojo;

import com.springboot.chapter3.pojo.definition.Animal;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
// 当有多个动物的时候，使用@Primary 修改注入IOC容器的优先权
public class Cat implements Animal {
    @Override
    public void use() {
        System.out.println("猫【" + Cat.class.getSimpleName() + "】是抓老鼠的。");
    }
}
