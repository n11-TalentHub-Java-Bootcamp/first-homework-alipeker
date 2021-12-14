package com.alipeker;

import com.alipeker.entity.Urun;
import com.alipeker.entityservice.UrunEntityService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class XmlBasedApplication {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext
                ("applicationcontext/xml-based-config.xml");

        UrunEntityService urunEntityService = context.getBean(UrunEntityService.class);

        List<Urun> urunList = urunEntityService.findAll();

        for (Urun urun : urunList) {
            System.out.println(urun);
        }

    }
}
