package edu.directory.phoenix.controller;

import edu.directory.phoenix.model.Courses;
import edu.directory.phoenix.model.Inquiry;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("inquiry", new Inquiry());
        return "index";
    }

    @PostMapping("/search_course")
    public String searchCourse(@ModelAttribute Inquiry inquiry, Model model){
        System.out.println(inquiry.getKeyword());
        System.out.println(inquiry.getCategory());
        System.out.println(inquiry.getRating());

        List<Courses> courses = new ArrayList<Courses>();
        courses.add(new Courses("Introduction to Python",
                "Tasnim Ara Islam",
                "Python Basics: Variable, data types, lists, functions and packages.",
                30, 5, 10));

        courses.add(new Courses("Intermediate Python",
                "Md Shahidullah Kawsar",
                "Matplotlib, dictionaries, pandas, logic control flow and filtering, loops",
                30, 5, 10));

        courses.add(new Courses("Python Data Science Toolbox (Part 1)",
                "Jakir Hossain",
                "Default arguments, variable-length arguments and scope, nested and lambda functions",
                30, 5, 10));

        courses.add(new Courses("Python Data Science Toolbox (Part 2)",
                "Amrina Ferdous",
                "Iterator, zip-unzip, list comprehensions, generators",
                30, 5, 10));

        courses.add(new Courses("Introduction to Importing Data in Python",
                "Tasnim Ara Islam",
                "Importing flat files, pickled files, Excel spreadsheets, SAS and Stata files, HDF5 files, MATLAB files and relational databases.",
                30, 5, 10));

        courses.add(new Courses("Intermediate Importing Data in Python",
                "Md Shahidullah Kawsar",
                "Importing data from the Internet, and APIs",
                30, 5, 10));

        model.addAttribute("courses", courses);
        return "courses";
    }
}
