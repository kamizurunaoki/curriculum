package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Name;
import com.example.demo.repository.NameRepository;

@Controller
@RequestMapping("/names")
public class NameController {
    private final NameRepository nameRepository;

    @Autowired
    public NameController(NameRepository nameRepository) {
        this.nameRepository = nameRepository;
    }

    @GetMapping
    public String getAllNames(Model model) {
        model.addAttribute("names", nameRepository.findAll());
        return "index";
    }

    @GetMapping("/create")
    public String createForm() {
        return "create";
    }

    @PostMapping("/create")
    public String createName(@RequestParam("name") String name) {
        Name newName = new Name(name);
        nameRepository.save(newName);
        return "redirect:/names";
    }

    @GetMapping("/delete/{id}")
    public String deleteName(@PathVariable("id") Long id) {
        nameRepository.deleteById(id);
        return "redirect:/names";
    }
}
