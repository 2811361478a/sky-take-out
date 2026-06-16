package com.sky.config;

import com.sky.properties.CloudinaryProperties;
import com.sky.utils.CloudinaryUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class OssConfiguration {
    @Bean
    @ConditionalOnMissingBean
    public CloudinaryUtil cloudinaryUtil(CloudinaryProperties cloudinaryProperties) {
        log.info("开始创建CloudinaryUtil对象，参数：{}", cloudinaryProperties);
        return new CloudinaryUtil(cloudinaryProperties.getCloudName(),
                cloudinaryProperties.getApiKey(),
                cloudinaryProperties.getApiSecret());
     }
}
