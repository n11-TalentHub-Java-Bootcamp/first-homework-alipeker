package com.alipeker.entityservice;

import com.alipeker.dao.UrunDao;
import com.alipeker.dto.UrunDetayDto;
import com.alipeker.entity.Urun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class UrunEntityService {

    @Autowired
    private UrunDao urunDao;

    public UrunEntityService(UrunDao urunDao) {
        this.urunDao = urunDao;
    }

    public UrunDao getUrunDao() {
        return urunDao;
    }

    public List<Urun> findAll(){
        return urunDao.findAll();
    }

    public Urun findById(Long id){
        return urunDao.findById(id);
    }

    public List<Urun> findAllUrunListByFiyatGeAndFiyatLe(BigDecimal fiyatGe, BigDecimal fiyatLe){
        return urunDao.findAllUrunListByFiyatGeAndFiyatLe(fiyatGe, fiyatLe);
    }

    public List<Urun> findAllUrunListByFiyatBetween(BigDecimal fiyatGe, BigDecimal fiyatLe){
        return urunDao.findAllUrunListByFiyatBetween(fiyatGe, fiyatLe);
    }

    public List<Urun> findAllUrunByKategoriKirilim(Long kirilim){
        return urunDao.findAllUrunByKategoriKirilim(kirilim);
    }

    public List<UrunDetayDto> findAllUrunDetayDtoByKategoriKirilim(Long kirilim) {
        return urunDao.findAllUrunDetayDtoByKategoriKirilim(kirilim);
    }

    }
