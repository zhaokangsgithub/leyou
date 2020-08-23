package com.leyou.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author kuaitingting
 * @date 2020/8/23
 */
@Controller
@RequestMapping("/hello")
public class RequestController {

    @ResponseBody
    public String sayHello(){

        return "hello zhaokang";

    }

}
