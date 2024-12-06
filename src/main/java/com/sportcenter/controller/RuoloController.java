package com.sportcenter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportcenter.repository.RuoloRepository;

@RequestMapping("api/ruolo")
@RestController
public class RuoloController {

    @Autowired
    private RuoloRepository ruoloRepository;



    
}
