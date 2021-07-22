package com.example.spring_cloud_client.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class StaticConfigService {

    @Value("${who.am.i}")
    private String whoAmI;

    public String getConfig() {
        return whoAmI;
    }
}
