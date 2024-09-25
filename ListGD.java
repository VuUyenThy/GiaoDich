package uyenThy23730871;

import java.util.ArrayList;
import java.util.List;

public class ListGD {
	List<GiaoDich> ls;
	public ListGD() {
		ls= new ArrayList<GiaoDich>(2);
	}
public boolean themGD(GiaoDich g) {
	if(!ls.contains(g)) {
		return false;
	}else {
		return ls.add(g);
	}
}
public List<GiaoDich>getAll(){
	return ls;
}
public GiaoDich tim (String maGD) {
	for (GiaoDich giaoDich : ls) {
		if(giaoDich.getMaGD().equalsIgnoreCase(maGD))
			return giaoDich;
	}
	return null;
}	

public boolean xoaGD (GiaoDich g) {
	if(tim(g.maGD)!= null)
		ls.remove(g);
	return false;
}

	
}
