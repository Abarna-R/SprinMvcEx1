package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
@Controller
public class HomeController {
    @PostMapping("/view")
    public ModelAndView getusername(HttpServletRequest uname){
        String s1= uname.getParameter("username");
        ModelAndView mv = new ModelAndView("display");
        mv.addObject("uname",s1);
        return mv;
    }
}
