package com.example.fi.controller;

import com.example.fi.service.FibbonachiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FibbonachiController {
    private final FibbonachiService fibbonachi;
    Integer result = 0;
    @Autowired
    public FibbonachiController(FibbonachiService fibbonachi) {
        this.fibbonachi = fibbonachi;
    }
    @RequestMapping(value = "/fibbonachi/{n}")
    public Integer get(@PathVariable(value = "n" ) Integer n) {
        return fibbonachi.f(n);
    }
}
