package com.juLog.Controller.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogViewController {


    @GetMapping("/blog/view")
    public String getBlogView() {
        return "blog/view.html";
    }
}
