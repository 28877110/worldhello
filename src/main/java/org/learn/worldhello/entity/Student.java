package org.learn.worldhello.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Student {
    private Long id;
    private String name;
    private String score;
    private LocalDateTime brithday;
}
