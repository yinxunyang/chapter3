package com.springboot.chapter3.pojo;

import com.springboot.chapter3.pojo.definition.Animal;
import com.springboot.chapter3.pojo.definition.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BussinessPerson implements Person {
    @Autowired
    private Animal cat = null;
    // @Autowired 首先会根据类型找对应的Bean，如果对应的Bean类型不是唯一的，那么会根据属性名称和Bean名称进行匹配

    @Override
    public void service() {
        this.cat.use();
    }

    @Override
    public void setAnimal(Animal dog) {
        this.cat = dog;
    }
}
