package com.generator.api.service;

import org.springframework.web.bind.annotation.RequestMapping;

public interface GeneratorRemoteService {
@RequestMapping("/generator/getId")
public String getId();

}
