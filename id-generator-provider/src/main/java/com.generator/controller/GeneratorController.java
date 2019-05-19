package com.generator.controller;

import com.generator.api.service.GeneratorRemoteService;
import com.generator.service.GeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/generator")
public class GeneratorController implements GeneratorRemoteService {
    @Autowired
    GeneratorService generatorService;

    @RequestMapping("/getId")
    public String getId() {
        return String.valueOf(generatorService.getUid());
    }
}
