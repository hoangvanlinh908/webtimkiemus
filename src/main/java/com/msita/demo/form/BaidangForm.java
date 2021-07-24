package com.msita.demo.form;



import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "baidang")
public class BaidangForm {
    @Id
    @GeneratedValue(generator = "my_generator")
    @GenericGenerator(name = "my_generator", strategy = "com.msita.demo.controller.MyGeneratorBD")

    @Column(name = "MaBaiDang")
    private String MaBaiDang;
    @NotBlank
    @Column(name = "TieuDe")
    @Min(1)
    private String TieuDe;
    @Column(name = "NgayDang")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private Date NgayDang;
    @Min(1)
    @Column(name = "SLTuyenDung")
    private Integer SLTuyenDung;
    @NotBlank
    @Column(name = "TinhChat")
    private String TinhChat;
    @Min(1)
    @Column(name = "MucLuong")
    private String MucLuong;
    @NotBlank
    @Column(name = "DiaChiLamViec")
    private String DiaChiLamViec;
    @NotBlank
    @Column(name = "TieuChi")
    private String TieuChi;
    @NotBlank
    @Column(name = "ChiTietCV")
    private String ChiTietCV;

    @Column(name = "TinhTrang")
    private String TinhTrang;
    @Column(name = "MaNhaTuyenDung")
    private String MaNhaTuyenDung;
    @Column(name = "MaNganhNghe")
    private String MaNganhNghe;
//    @ManyToOne
//    @JoinColumn(name = "MaNhaTuyenDung")
////    private NhaTuyenDung nhaTuyenDung;
//   @ManyToOne
//   @JoinColumn(name = "MaNganhNghe")
//   private NganhNghe nganhNghe;
////
//
//    @OneToMany(mappedBy ="baidang",fetch = FetchType.EAGER)
//    private List<HoSoUngTuyen> hoSoUngTuyens;
public BaidangForm() {

}

    public BaidangForm( String tieuDe, Date ngayDang, Integer SLTuyenDung, String tinhChat, String mucLuong, String diaChiLamViec, String tieuChi, String chiTietCV, String hinhAnh, String maNhaTuyenDung, String maNganhNghe) {

        TieuDe = tieuDe;
        NgayDang = ngayDang;
        this.SLTuyenDung = SLTuyenDung;
        TinhChat = tinhChat;
        MucLuong = mucLuong;
        DiaChiLamViec = diaChiLamViec;
        TieuChi = tieuChi;
        ChiTietCV = chiTietCV;

        MaNhaTuyenDung = maNhaTuyenDung;
        MaNganhNghe = maNganhNghe;
    }
    public String getMaBaiDang() {
        return MaBaiDang;
    }

    public void setMaBaiDang(String maBaiDang) {
        MaBaiDang = maBaiDang;
    }

    public String getTieuDe() {
        return TieuDe;
    }

    public void setTieuDe(String tieuDe) {
        TieuDe = tieuDe;
    }

    public Date getNgayDang() {
        return NgayDang;
    }

    public void setNgayDang(Date ngayDang) {
        NgayDang = ngayDang;
    }

    public Integer getSLTuyenDung() {
        return SLTuyenDung;
    }

    public void setSLTuyenDung(Integer SLTuyenDung) {
        this.SLTuyenDung = SLTuyenDung;
    }

    public String getTinhChat() {
        return TinhChat;
    }

    public void setTinhChat(String tinhChat) {
        TinhChat = tinhChat;
    }

    public String getMucLuong() {
        return MucLuong;
    }

    public void setMucLuong(String mucLuong) {
        MucLuong = mucLuong;
    }

    public String getDiaChiLamViec() {
        return DiaChiLamViec;
    }

    public void setDiaChiLamViec(String diaChiLamViec) {
        DiaChiLamViec = diaChiLamViec;
    }

    public String getTieuChi() {
        return TieuChi;
    }

    public void setTieuChi(String tieuChi) {
        TieuChi = tieuChi;
    }

    public String getChiTietCV() {
        return ChiTietCV;
    }

    public void setChiTietCV(String chiTietCV) {
        ChiTietCV = chiTietCV;
    }


    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        TinhTrang = tinhTrang;
    }

    public String getMaNhaTuyenDung() {
        return MaNhaTuyenDung;
    }

    public void setMaNhaTuyenDung(String maNhaTuyenDung) {
        MaNhaTuyenDung = maNhaTuyenDung;
    }

    public String getMaNganhNghe() {
        return MaNganhNghe;
    }

    public void setMaNganhNghe(String maNganhNghe) {
        MaNganhNghe = maNganhNghe;
    }
}
