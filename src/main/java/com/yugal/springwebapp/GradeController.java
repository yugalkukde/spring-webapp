package com.yugal.springwebapp;

import com.yugal.springwebapp.POJO.Grade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.expression.Arrays;
import org.thymeleaf.expression.Strings;

@Controller
public class GradeController {

    @GetMapping("/grades")
    public String getGrades(Model model) {
        Grade grade = new Grade("hally", "chemistry", "A+");
        model.addAttribute("grade", grade);
               return "grades";
    }

    @GetMapping("/conditions")
    public String conditions(Model model) {
        model.addAttribute("name", "Rayan");
        return "conditionals";
    }
}
