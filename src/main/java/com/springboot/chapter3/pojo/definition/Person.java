package com.springboot.chapter3.pojo.definition;

import org.springframework.stereotype.Component;

@Component
public interface Person {
    // 使用动物服务
    public void service();

    // 设置动物
    public void setAnimal(Animal animal);
}
