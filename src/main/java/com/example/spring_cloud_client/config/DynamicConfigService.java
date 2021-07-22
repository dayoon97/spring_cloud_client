package com.example.spring_cloud_client.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope  //StaticConfigService 와 다른 부분
public class DynamicConfigService {

    @Value("${who.am.i}")
    private String whoAmI;

    public String getConfig() {
        return whoAmI;
    }
}
