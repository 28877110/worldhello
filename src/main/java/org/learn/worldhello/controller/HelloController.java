package org.learn.worldhello.controller;

import org.learn.worldhello.bean.ValidateCode;
import org.learn.worldhello.bean.ZkRequest;
import org.learn.worldhello.exception.MyException;
import org.learn.worldhello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @Autowired
    UserService userService;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello{file}")
    public String hello2(@PathVariable String file) throws MyException {
        userService.insertUseList();
        HashMap<String,String> hashMap = new HashMap<>();
        Map<String,String> hashMap2 = new HashMap<>();
        hashMap.put(null,null);
        hashMap2.put(null,null);
        hashMap.put(null,"dd");




        return "hello"+file;
    }

    @PostMapping("/zkrequest")
    public String zkrequest(@RequestBody ZkRequest zkRequest){
        System.out.println(zkRequest);
        return "dd";
    }

    // 生成验证码图片
    @RequestMapping("/getCaptchaImage")
    @ResponseBody
    public void getCaptcha(HttpServletRequest request, HttpServletResponse response) {

        try {

            response.setContentType("image/png");
            response.setHeader("Cache-Control", "no-cache");
            response.setHeader("Expire", "0");
            response.setHeader("Pragma", "no-cache");

            ValidateCode validateCode = new ValidateCode();

            // 直接返回图片
            validateCode.getRandomCodeImage(request, response);

        } catch (Exception e) {
            System.out.println(e);
        }

    }


}