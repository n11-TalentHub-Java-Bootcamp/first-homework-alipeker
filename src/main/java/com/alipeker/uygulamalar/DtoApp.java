package com.alipeker.uygulamalar;

import com.alipeker.AnnotationBasedApplication;
import com.alipeker.dto.UrunDetayDto;
import com.alipeker.entityservice.UrunEntityService;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class DtoApp {

    public static void main(String[] args) {

        ApplicationContext applicationContext = AnnotationBasedApplication.getApplicationContext();

        UrunEntityService service = applicationContext.getBean(UrunEntityService.class);

        List<UrunDetayDto> urunList = service.findAllUrunDetayDtoByKategoriKirilim(3L);

        for (UrunDetayDto urunDetayDto : urunList) {
            System.out.println(urunDetayDto);
        }
    }
}
