package org.learn.worldhello.entity;

import lombok.Data;

/**
 * @Classname User
 * @Description TODO
 * @Date 2020-05-23 13:47
 * @Created by smallfish
 */
@Data
public class User {
    private Long id;

    private String name;

    private Integer age;
}