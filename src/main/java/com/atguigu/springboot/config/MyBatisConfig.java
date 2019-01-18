package com.atguigu.springboot.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangge
 * @date 2019/1/18 - 23:24
 */
/*@Configuration
public class MyBatisConfig {

    // 解决数据库表中为下划线,实体类中参数为驼峰参数
    @Bean
    public ConfigurationCustomizer configurationCustomizer(){
        return new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }
}*/
