package com.imooc.controller.rabbitmq.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class User implements Serializable {

    private String username;
    private String password;
}