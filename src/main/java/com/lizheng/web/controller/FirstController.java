package com.lizheng.web.controller;

import com.lizheng.web.model.Boyfriend;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FirstController {

    @GetMapping("/index")
    public String test(Model model) {
        return "index";
    }

    @GetMapping("/boy")
    public String boy(Model model) {
        Boyfriend boyfriend = new Boyfriend();
        boyfriend.setName("赵本山");
        boyfriend.setHeight(175);
        boyfriend.setAge(61);
        boyfriend.setWeight(70);
        boyfriend.setCharacter("逗");
        boyfriend.setLink("https://baike.baidu.com/pic/%E8%B5%B5%E6%9C%AC%E5%B1%B1/131652/0/48540923dd54564e078bd8d5b6de9c82d0584f6b?fr=lemma&ct=single#aid=0&pic=48540923dd54564e078bd8d5b6de9c82d0584f6b");
        model.addAttribute("boyfriend",boyfriend);
        return "boy";
    }
}
