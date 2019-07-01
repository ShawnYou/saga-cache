package com.shawny.sagacache;

import com.shawny.sagacache.annotation.EnableSagaCache;
import com.shawny.sagacache.config.SagaCacheProperties;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableSagaCache
@EnableConfigurationProperties(value = SagaCacheProperties.class)
//@PropertySource(value = "classpath:/application-dev.yml",factory = YamlPropertyLoaderFactory.class)
public class BaseTest {

    @Autowired
    SagaCacheProperties sagaCacheProperties;
}
