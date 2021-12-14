package com.alipeker.entityservice;

import com.alipeker.dao.KategoriDao;
import com.alipeker.entity.Kategori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KategoriEntityService {

    @Autowired
    private KategoriDao kategoriDao;

    public List<Kategori> findAll(){
        return kategoriDao.findAll();
    }
}
