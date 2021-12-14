package com.alipeker.uygulamalar;

import com.alipeker.AnnotationBasedApplication;
import com.alipeker.entity.Kategori;
import com.alipeker.entityservice.KategoriEntityService;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class KategoriFindAllApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = AnnotationBasedApplication.getApplicationContext();
        KategoriEntityService service = applicationContext.getBean(KategoriEntityService.class);

        List<Kategori> kategoriList = service.findAll();

        for (Kategori kategori : kategoriList) {
            System.out.println(kategori.getAdi());
        }
    }
}
