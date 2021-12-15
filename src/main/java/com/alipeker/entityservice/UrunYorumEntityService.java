package com.alipeker.entityservice;

import com.alipeker.dao.UrunDao;
import com.alipeker.dao.UrunYorumDao;
import com.alipeker.dto.UrunDetayDto;
import com.alipeker.dto.UrunYorumDto;
import com.alipeker.entity.Urun;
import com.alipeker.entity.UrunYorum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrunYorumEntityService {

    @Autowired
    private UrunYorumDao urunYorumDao;

    public UrunYorumEntityService(UrunYorumDao urunYorumDao) {
        this.urunYorumDao = urunYorumDao;
    }

    public List<UrunYorumDto> findAllYorum(Long id) {
        return this.urunYorumDao.findAllYorumByUrunId(id);
    }

}
