package com.example.spring_cloud_client.controller;

import com.example.spring_cloud_client.config.DynamicConfigService;
import com.example.spring_cloud_client.config.StaticConfigService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    private final StaticConfigService configStaticService;
    private final DynamicConfigService configDynamicService;

    public ConfigController(StaticConfigService configStaticService, DynamicConfigService configDynamicService) {
        this.configStaticService = configStaticService;
        this.configDynamicService = configDynamicService;
    }

    @GetMapping(value = "/static")
    public Object getConfigFromStatic() {
        return configStaticService.getConfig();
    }

    @GetMapping(value = "/dynamic")
    public Object getConfigFromDynamic() {
        return configDynamicService.getConfig();
    }

}
