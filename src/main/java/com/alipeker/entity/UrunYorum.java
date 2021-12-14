package com.alipeker.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Id
 * yorum
 * yorumTarihi
 * urunId
 * kullaniciId
 */
@Entity
@Table(
        name = "URUNYORUM"
)
public class UrunYorum {

    @SequenceGenerator(name = "generator", sequenceName = "URUNYORUM_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(length = 500, name = "YORUM")
    private String yorum;

    @Column(name = "YORUMTARIHI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date yorumTarihi;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_KULLANICI",
            foreignKey = @ForeignKey(name = "FK_URUNYORUM_KULLANICI_ID")
    )
    private Kullanici kullaniciId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_URUN",
            foreignKey = @ForeignKey(name = "FK_URUNYORUM_URUN_ID")
    )
    private Urun urunId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getYorum() {
        return yorum;
    }

    public void setYorum(String yorum) {
        yorum = yorum;
    }

    public Date getYorumTarihi() {
        return yorumTarihi;
    }

    public void setYorumTarihi(Date yorumTarihi) {
        this.yorumTarihi = yorumTarihi;
    }

    public Kullanici getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(Kullanici kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    public Urun getUrunId() {
        return urunId;
    }

    public void setUrunId(Urun urunId) {
        this.urunId = urunId;
    }

    @Override
    public String toString() {
        return "UrunYorum{" +
                "id=" + id +
                ", Yorum='" + yorum + '\'' +
                ", yorumTarihi=" + yorumTarihi +
                ", urunId=" + urunId +
                ", kullaniciId=" + kullaniciId +
                '}';
    }
}

