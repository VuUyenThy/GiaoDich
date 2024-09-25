package uyenThy23730871;

import java.time.LocalDate;

public abstract class GiaoDich {
	public abstract double getThanhTien();
	protected String maGD;
	protected LocalDate ngayGD;
	protected double dienTich;
	protected double donGia;
	
	public String getMaGD() {
		return maGD;
	}
	
	public void setMaGD(String maGD) throws Exception {
		if (maGD != null) {
			this.maGD = maGD;
		} else {
			throw new Exception("Loi ma");
		}
		
	}
	public LocalDate getNgayGD() {
		return ngayGD;
	}
	public void setNgayGD(LocalDate ngayGD) {
		this.ngayGD = ngayGD;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public GiaoDich() {
		this("",LocalDate.now(),0,0);
	}
	public GiaoDich(String maGD, LocalDate ngayGD, double dienTich, double donGia) {
		super();
		this.maGD = maGD;
		this.ngayGD = ngayGD;
		this.dienTich = dienTich;
		this.donGia = donGia;
	}
	
@Override
public String toString() {
	String s="";
	s+=s.format("|10%s|10%s|10%s|10%s|", getMaGD(),getNgayGD(),getDienTich(),getDonGia());
	return s;
}	
	
}
