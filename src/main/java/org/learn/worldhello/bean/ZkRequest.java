package org.learn.worldhello.bean;

import lombok.Data;

/**
 * @Classname ZkRequest
 * @Description TODO
 * @Date 2020-06-15 12:56
 * @Created by smallfish
 */
@Data
public class ZkRequest {
    private String name;
    private String username;
    private String zkaddress;
    private String classname;
    private String method;
    private String version;
    private String content;
}
