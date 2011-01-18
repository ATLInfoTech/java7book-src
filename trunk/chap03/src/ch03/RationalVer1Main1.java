package ch03;

public class RationalVer1Main1 {

	public static void main(String[] args) {
		RationalVer1 r1 = new RationalVer1(3, 5);
		int n1 = 10;
		int d1 = 4;
		
		r1.addTo(n1, d1);
		
		System.out.println("메서드 호출 후 n1:" + n1 + ", d1:" + d1);
		
		RationalVer1 r2 = new RationalVer1(1, 2);
		r1.addTo(r2);
		
		System.out.println("메서드 호출 후 r2.numer:" + r2.numer + 
				", r2.denom:" + r2.denom);
	}
}