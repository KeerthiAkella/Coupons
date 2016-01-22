package Coupon;

import java.util.*;

public class CouponsCode {

	static ArrayList<Coupons> couponList = new ArrayList<Coupons>();
	static Map<Coupons, Integer> likes = new HashMap<Coupons, Integer>();

	public static String addCoupon(Coupons obj) {
		couponList.add(obj);
		likes.put(obj, 0);
		return "Coupon is added successfully";
	}

	public static String deleteCoupon(Coupons obj) {
		for (Coupons temp : couponList) {
			if (compareTo(temp, obj)) {
				couponList.remove(obj);
				return "Coupon removed";
			}
		}
		return "Coupon not Found";
	}

	public static void sortByTitle() {
		Collections.sort(couponList, Coupons.couponTitle);
	}

	public static void sortByDiscount() {
		Collections.sort(couponList, Coupons.couponDiscount);
	}

	public static void sortByCreatedDate() {
		Collections.sort(couponList, Coupons.couponCreatedDate);
	}

	public static void sortByExpireDate() {
		Collections.sort(couponList, Coupons.couponExpireDate);
	}

	public static void sortByCategory() {
		Collections.sort(couponList, Coupons.couponCategory);
	}

	public static void like(Coupons c) {
		int count = likes.get(c);
		count++;
		likes.replace(c, count);
	}

	public static boolean compareTo(Coupons c1, Coupons c2) {
		if (c1.getDiscount() == c2.getDiscount() && c1.getCategory().equals(c2.getCategory())
				&& c1.getTitle().equals(c2.getTitle()) && c1.getCreatedDate() == c2.getCreatedDate()) {
			return true;
		}
		return false;
	}

	public static String toString(ArrayList<Coupons> arrL) {
		for (Coupons temp : arrL)
			System.out.println("Discount : " + temp.getDiscount() + "   Title : " + temp.getTitle()
					+ "   Created Date : " + temp.getCreatedDate() + "   Expire Date : " + temp.getExpireDate() + "\n"
					+ "   Title : " + temp.getTitle() + "   Category : " + temp.getCategory() + "   Likes : "
					+ likes.get(temp));
		return null;
	}

}
