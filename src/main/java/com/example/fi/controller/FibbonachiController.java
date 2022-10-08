package com.example.fi.controller;

import com.example.fi.FibbonachiImp;
import com.example.fi.FibbonachiService;
import com.example.fi.model.Fibbonachi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class FibbonachiController {
    private final FibbonachiImp fibbonachi;
    Integer result = 0;
    @Autowired
    public FibbonachiController(FibbonachiImp fibbonachi) {
        this.fibbonachi = fibbonachi;
    }
    @RequestMapping(value = "/fibbonachi/{n}")
    public Fibbonachi get(@PathVariable(value = "n" ) Integer N) {
        result = fibbonachi.f(N);
        return new Fibbonachi(result);
    }
}
