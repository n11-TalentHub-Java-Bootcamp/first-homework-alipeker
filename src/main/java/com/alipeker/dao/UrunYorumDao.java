package com.alipeker.dao;

import com.alipeker.base.BaseDao;
import com.alipeker.dto.UrunDetayDto;
import com.alipeker.dto.UrunYorumDto;
import com.alipeker.entity.Urun;
import com.alipeker.entity.UrunYorum;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public class UrunYorumDao extends BaseDao {

    public List<Urun> findAll(){

        String sql = "select urun from Urun urun";

        Query query = getCurrentSession().createQuery(sql);

        return query.list();
    }

    public Urun findById(Long id){

        String sql = "select urun from Urun urun where urun.id = :givenId";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("givenId", id);

        return (Urun) query.uniqueResult();
    }

    public List<Urun> findAllUrunListByFiyatGeAndFiyatLe(BigDecimal fiyatGe, BigDecimal fiyatLe){

        String sql = "select urun from Urun urun where 1=1 ";

        if (fiyatGe != null){
            sql = sql + " and urun.fiyat >= :fiyatGe ";
        }

        if (fiyatLe != null){
            sql = sql + " and urun.fiyat <= :fiyatLe ";
        }

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("fiyatLe", fiyatLe);
        query.setParameter("fiyatGe", fiyatGe);

        return query.list();
    }

    public List<Urun> findAllUrunListByFiyatBetween(BigDecimal fiyatGe, BigDecimal fiyatLe){

        String sql = "select urun from Urun urun where 1=1 ";

        if (fiyatGe != null && fiyatLe != null){
            sql = sql + " and urun.fiyat between :fiyatGe and :fiyatLe ";
        }

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("fiyatLe", fiyatLe);
        query.setParameter("fiyatGe", fiyatGe);

        return query.list();
    }

    public List<Urun> findAllUrunByKategoriKirilim(Long kirilim) {

        String sql = " select urun from Urun urun " +
                " left join Kategori kategori  on urun.kategori.id = kategori.id " +
                " where kategori.kirilim = :kirilim ";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("kirilim", kirilim);

        return query.list();
    }

    public List<UrunYorumDto> findAllYorumByUrunId(Long urunId) {
        String sql = " select " +
                " new com.alipeker.dto.UrunYorumDto( urun.adi, urun.fiyat ) " +
                " from URUN urun " +
                " inner join URUNYORUM urunYorum on urun.id = urunYorum.id_urun";

        Query query = getCurrentSession().createQuery(sql);

        return query.list();
    }

    private String urunAdi;
    private String kategoriAdi;
    private BigDecimal urunFiyati;
    private String adi;
    private String soyadi;
    private String email;
    private String telefon;
    private String yorum;
    private Date yorumTarihi;

}
