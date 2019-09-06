package com.vega.springit.controller;

import com.vega.springit.domain.Link;
import com.vega.springit.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

@Controller
public class LinkController {
    @GetMapping("/foo")
    public String foo(Model model) {
        model.addAttribute("pageTitle", "This is page now");
        return "foo";
    }

}
