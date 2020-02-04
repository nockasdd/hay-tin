package net.haytin.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
    @GetMapping(value = {"/admin"})
    public ModelAndView homepage(){
        ModelAndView mav = new ModelAndView("admin/home");
        return mav;
    }
}
