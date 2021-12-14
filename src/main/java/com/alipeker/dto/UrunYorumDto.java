package com.alipeker.dto;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.math.BigDecimal;
import java.util.Date;

public class UrunYorumDto {
    private String urunAdi;
    private String kategoriAdi;
    private BigDecimal urunFiyati;
    private String adi;
    private String soyadi;
    private String email;
    private String telefon;
    private String yorum;
    private Date yorumTarihi;

    public UrunYorumDto(String urunAdi, String kategoriAdi, BigDecimal urunFiyati, String adi, String soyadi,
                        String email, String telefon, String yorum, Date yorumTarihi) {
        this.urunAdi = urunAdi;
        this.kategoriAdi = kategoriAdi;
        this.urunFiyati = urunFiyati;
        this.adi = adi;
        this.soyadi = soyadi;
        this.email = email;
        this.telefon = telefon;
        this.yorum = yorum;
        this.yorumTarihi = yorumTarihi;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getKategoriAdi() {
        return kategoriAdi;
    }

    public void setKategoriAdi(String kategoriAdi) {
        this.kategoriAdi = kategoriAdi;
    }

    public BigDecimal getUrunFiyati() {
        return urunFiyati;
    }

    public void setUrunFiyati(BigDecimal urunFiyati) {
        this.urunFiyati = urunFiyati;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getYorum() {
        return yorum;
    }

    public void setYorum(String yorum) {
        this.yorum = yorum;
    }

    public Date getYorumTarihi() {
        return yorumTarihi;
    }

    public void setYorumTarihi(Date yorumTarihi) {
        this.yorumTarihi = yorumTarihi;
    }

}
