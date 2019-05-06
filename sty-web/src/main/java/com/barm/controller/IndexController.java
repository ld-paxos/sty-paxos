package com.barm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class IndexController
{
    @RequestMapping("/index")
    public String index()
    {
        return "index";
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login()
    {
        return "login";
    }
}