/*
 * Project: amya
 *
 * File Created at 20/6/19
 *
 */
package com.weic.amya.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Type:test
 * @Desc: TODO
 * @Author:weic
 * @date:20/6/19 16:35
 */
@RestController
@RequestMapping("test")
public class test {
    @PostMapping("/testController")
    public String testController() {
        return "ok";
    }
}
