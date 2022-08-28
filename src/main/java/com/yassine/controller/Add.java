package com.yassine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.*;

@Controller
public class Add {

    @RequestMapping("/Add")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
        String name=request.getParameter("name");
        String password=request.getParameter("password");

        ModelAndView view=new ModelAndView();

        view.addObject("name",name);
        view.addObject("password",password);
        if(name.equalsIgnoreCase("Admin")&& password.equalsIgnoreCase("password")){
            view.setViewName("homePage");
        }
       else
            view.setViewName("error");
        return view;

    }
}
