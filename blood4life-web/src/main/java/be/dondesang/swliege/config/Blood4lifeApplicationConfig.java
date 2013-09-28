package be.dondesang.swliege.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @since 28/09/13
 */
@Configuration
@ImportResource("classpath:applicationContext.xml")
public class Blood4lifeApplicationConfig {

//    @Autowired
//    private MongoDBFactoryConfig mongoDbFactoryConfig;
//
//    @Bean
//    public MongoTemplate mongoTemplate() throws Exception {
//        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactoryConfig.mongoDbFactory());
//        return mongoTemplate;
//    }

}
