package com.mmall.testController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("upload")
    public String upload(){
        return "upload";
    }
}