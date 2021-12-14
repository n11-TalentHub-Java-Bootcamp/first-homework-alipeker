package com.alipeker.uygulamalar;

import com.alipeker.AnnotationBasedApplication;
import com.alipeker.entity.Urun;
import com.alipeker.entityservice.UrunEntityService;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class JoinApp {

    public static void main(String[] args) {

        ApplicationContext applicationContext = AnnotationBasedApplication.getApplicationContext();
        UrunEntityService service = applicationContext.getBean(UrunEntityService.class);

        List<Urun> urunList = service.findAllUrunByKategoriKirilim(3L);

        for (Urun urun : urunList) {
            System.out.println(urun);
        }
    }
}
