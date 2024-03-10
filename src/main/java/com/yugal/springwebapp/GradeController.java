package com.yugal.springwebapp;

import com.yugal.springwebapp.POJO.Grade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradeController {

    @GetMapping("/grades")
    public String getGrades(Model model) {
        Grade grade = new Grade("hally", "chemistry", "A+");
        model.addAttribute("grade", grade);
        return "grades";
    }
}
