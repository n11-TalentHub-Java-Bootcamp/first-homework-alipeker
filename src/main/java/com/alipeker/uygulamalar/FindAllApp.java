package com.alipeker.uygulamalar;

import com.alipeker.AnnotationBasedApplication;
import com.alipeker.dto.UrunYorumDto;
import com.alipeker.entity.Urun;
import com.alipeker.entityservice.UrunEntityService;
import com.alipeker.entityservice.UrunYorumEntityService;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class FindAllApp {

    public static void main(String[] args) {

        ApplicationContext applicationContext = AnnotationBasedApplication.getApplicationContext();
        UrunEntityService service = applicationContext.getBean(UrunEntityService.class);

        /*
        List<Urun> urunList = service.findAll();
        for (Urun urun : urunList) {
            System.out.println(urun);
        }
*/
        UrunYorumEntityService service2 = applicationContext.getBean(UrunYorumEntityService.class);

        List<UrunYorumDto> yorumList = service2.findAllYorum(3L);

        for (UrunYorumDto urun : yorumList) {
            System.out.println(urun);
        }
    }
}
