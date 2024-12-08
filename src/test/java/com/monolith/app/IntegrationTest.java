package com.monolith.app;

import com.monolith.app.config.AsyncSyncConfiguration;
import com.monolith.app.config.EmbeddedElasticsearch;
import com.monolith.app.config.EmbeddedKafka;
import com.monolith.app.config.EmbeddedMongo;
import com.monolith.app.config.JacksonConfiguration;
import com.monolith.app.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(
    classes = { JhipsterMonolithApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class }
)
@EmbeddedMongo
@EmbeddedElasticsearch
@EmbeddedKafka
public @interface IntegrationTest {
}
