package com.alipeker.dao;

import com.alipeker.base.BaseDao;
import com.alipeker.entity.Kategori;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KategoriDao extends BaseDao {

    public List<Kategori> findAll(){

        Query query = getCurrentSession().createQuery(
                "select kategori from Kategori kategori");

        return query.list();
    }
}
