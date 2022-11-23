package com.echo.pip.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @Author Echo
 * @Description just a test case class
 * @Date 21:42 2022/11/23
 * @Param
 * @return
 **/
@RestController
public class HelloController {

    /*
     * @Author Echo
     * @Description helloPip
     * @Date 21:41 2022/11/23
     * @Param []
     * @return java.lang.String
     **/
    @GetMapping("/helloPip")
    public String sayBoot() {
        return "Hi Pinpoint!";
    }


    /*
     * @Author Echo
     * @Description excpPip
     * @Date 21:42 2022/11/23
     * @Param []
     * @return java.lang.String
     **/
    @GetMapping("/excpPip")
    public String exception() {
        int i = 1/0;
        return "I made an exception";
    }

}

