package uyenThy23730871;

import java.time.LocalDate;

public class GiaoDichNha extends GiaoDich {
	private String loaiNha;
	
	public String getLoaiNha() {
		return loaiNha;
	}

	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}
	
	public GiaoDichNha() {}
	public GiaoDichNha(String maGD, LocalDate ngayGD, double dienTich, double donGia, String loaiNha) {
		super(maGD, ngayGD, dienTich, donGia);
		this.loaiNha = loaiNha;
	}

	@Override
	public double getThanhTien() {
		if(getLoaiNha()=="cao cap") {
			return getDienTich()*getDonGia();
		}else {
			return getDienTich()*getDonGia()*(90/100);
		}
	}		
@Override
public String toString() {
	String s="";
	s+=s.format("%10s|%10s|",getLoaiNha(),getThanhTien());
	return super.toString()+s;
}
}
