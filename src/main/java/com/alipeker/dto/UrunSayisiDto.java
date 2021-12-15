package com.alipeker.dto;

import java.math.BigDecimal;

public class UrunSayisiDto {
    private Long urunId;
    private String urunAdi;
    private BigDecimal urunFiyati;
    private int yorumSayısı;


    public UrunSayisiDto() {
    }

    public UrunSayisiDto(Long urunId, String urunAdi, BigDecimal urunFiyati, int yorumSayısı) {
        this.urunId = urunId;
        this.urunAdi = urunAdi;
        this.urunFiyati = urunFiyati;
        this.yorumSayısı = yorumSayısı;
    }

    public Long getUrunId() {
        return urunId;
    }

    public void setUrunId(Long urunId) {
        this.urunId = urunId;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public BigDecimal getUrunFiyati() {
        return urunFiyati;
    }

    public void setUrunFiyati(BigDecimal urunFiyati) {
        this.urunFiyati = urunFiyati;
    }

    public int getYorumSayısı() {
        return yorumSayısı;
    }

    public void setYorumSayısı(int yorumSayısı) {
        this.yorumSayısı = yorumSayısı;
    }
}
