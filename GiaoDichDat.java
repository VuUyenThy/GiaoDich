package uyenThy23730871;

import java.time.LocalDate;

public class GiaoDichDat extends GiaoDich{
	private String loaiDat;
	
	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}
	
	public GiaoDichDat() {}
	public GiaoDichDat(String maGD, LocalDate ngayGD, double dienTich, double donGia, String loaiDat) {
		super(maGD, ngayGD, dienTich, donGia);
		this.loaiDat = loaiDat;
	}

	@Override
	public double getThanhTien() {
		if (getLoaiDat()=="A") {
			return getDienTich()*getDonGia()*1.5;
		} else {
			return  getDienTich()*getDonGia();
		} 
	}
@Override
public String toString() {
	String s="";
	s+=s.format("%10s|%10s|",getLoaiDat(),getThanhTien());
	return super.toString()+s;
}	

}
