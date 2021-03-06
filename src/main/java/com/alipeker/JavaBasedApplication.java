package com.alipeker;


import com.alipeker.springbeans.Dao;
import com.alipeker.springbeans.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaBasedApplication {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaBasedApplication.class);

        Service service = context.getBean(Service.class);
        service.test();
    }

    @Bean
    public static Service getService(){
        return new Service(new Dao());
    }

    @Bean
    public static Dao getDao(){
        return new Dao();
    }
}
