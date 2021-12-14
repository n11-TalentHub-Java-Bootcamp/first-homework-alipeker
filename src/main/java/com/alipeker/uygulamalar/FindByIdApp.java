package com.alipeker.uygulamalar;

import com.alipeker.AnnotationBasedApplication;
import com.alipeker.entity.Urun;
import com.alipeker.entityservice.UrunEntityService;
import org.springframework.context.ApplicationContext;

public class FindByIdApp {

    public static void main(String[] args) {

        ApplicationContext applicationContext = AnnotationBasedApplication.getApplicationContext();
        UrunEntityService service = applicationContext.getBean(UrunEntityService.class);

        Urun urun = service.findById(1L);

        System.out.println(urun);
    }
}
