package ch05;

public class PriceService {

	public int calculatePrice(Product product, Coupon coupon) {
		int productPrice = product.getPrice();
		if (coupon.isValid(product.getCode())) {
			return productPrice - coupon.calculateDiscount(productPrice);
		}
		return productPrice;
	}

}
