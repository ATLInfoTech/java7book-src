package ch03;

public class RationalVer1 {
	
	public int numer;
	public int denom;
	
	public RationalVer1(int n, int d) {
		numer = n;
		denom = d;
	}
	
	public void addTo(int n, int d) {
		n += numer; // n에 numer를 더함
		d += denom; // d에 denom을 더함
	}
	
	public void addTo(RationalVer1 r) {
		r.numer += numer; // r.numer에 numer 더함
		r.denom += denom; // r.denom에 denom 더함
	}

}