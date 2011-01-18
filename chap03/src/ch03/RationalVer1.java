package ch03;

public class RationalVer1 {
	
	public int numer;
	public int denom;
	
	public RationalVer1(int n, int d) {
		numer = n;
		denom = d;
	}
	
	public void addTo(int n, int d) {
		n += numer; // n�� numer�� ����
		d += denom; // d�� denom�� ����
	}
	
	public void addTo(RationalVer1 r) {
		r.numer += numer; // r.numer�� numer ����
		r.denom += denom; // r.denom�� denom ����
	}

}