package com.springboot.chapter3.pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
// Component是标明该类被扫描进入Spring IOC 容器
public class User {
    @Value("2")
    private Long id;
    @Value("user_name_2")
    private String userName;
    @Value("note_2")
    private String note;
}
