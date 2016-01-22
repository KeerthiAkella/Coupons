package Coupon;

import java.util.Date;

public class TryCode {
	public static void main(String[] args) {

		Coupons c1 = new Coupons(20, new Date(1), new Date(222341111), "Shirts", "Clothes");
		Coupons c2 = new Coupons(50, new Date(99), new Date(444466699), "Apples", "Fruits");
		Coupons c3 = new Coupons(10, new Date(777), new Date(67892222), "dogs", "pets");
		Coupons c4 = new Coupons(90, new Date(3999333), new Date(987654599), "perks", "choclates");
		Coupons c5 = new Coupons(70, new Date(3), new Date(765432765), "bata", "Shoes");

		CouponsCode.addCoupon(c1);
		CouponsCode.addCoupon(c2);
		CouponsCode.addCoupon(c3);
		CouponsCode.addCoupon(c4);
		
		CouponsCode.like(c1);
		CouponsCode.like(c1);
		CouponsCode.like(c1);
		CouponsCode.like(c1);
		// CouponsCode.toString(CouponsCode.couponList);
		// System.out.println();
		// System.out.println(CouponsCode.deleteCoupon(c2));
		// CouponsCode.toString(CouponsCode.couponList);

		System.out.println("Sort by Discount");
		CouponsCode.sortByDiscount();
		CouponsCode.toString(CouponsCode.couponList);
		System.out.println();

		System.out.println("Sort by Created date");
		CouponsCode.sortByCreatedDate();
		CouponsCode.toString(CouponsCode.couponList);
		System.out.println();

		System.out.println("Sort by expire Date");
		CouponsCode.sortByExpireDate();
		CouponsCode.toString(CouponsCode.couponList);
		System.out.println();

		System.out.println("Sort by Category");
		CouponsCode.sortByCategory();
		CouponsCode.toString(CouponsCode.couponList);
		System.out.println();

		System.out.println("Sort by titles");
		CouponsCode.sortByTitle();
		CouponsCode.toString(CouponsCode.couponList);
		System.out.println();

	}
}
