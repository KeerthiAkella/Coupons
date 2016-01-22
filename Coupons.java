package Coupon;

import java.util.*;

class Coupons {
	int discount;
	Date createdDate;
	Date expireDate;
	String title;
	String category;

	public Coupons(int discount, Date createdDate, Date expireDate, String title, String category) {
		this.discount = discount;
		this.createdDate = createdDate;
		this.expireDate = expireDate;
		this.title = title;
		this.category = category;
	}

	public int getDiscount() {
		return discount;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public void setExpiredate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public static Comparator<Coupons> couponTitle = new Comparator<Coupons>() {

		public int compare(Coupons c1, Coupons c2) {
			String coupon1 = c1.getTitle().toUpperCase();
			String coupon2 = c2.getTitle().toUpperCase();

			return coupon1.compareTo(coupon2);
		}
	};
	public static Comparator<Coupons> couponCreatedDate = new Comparator<Coupons>() {

		public int compare(Coupons c1, Coupons c2) {
			Date coupon1 = c1.getCreatedDate();
			Date coupon2 = c2.getCreatedDate();

			return coupon1.compareTo(coupon2);
		}
	};

	public static Comparator<Coupons> couponExpireDate = new Comparator<Coupons>() {

		public int compare(Coupons c1, Coupons c2) {
			Date coupon1 = c1.getExpireDate();
			Date coupon2 = c2.getExpireDate();

			return coupon1.compareTo(coupon2);
		}
	};

	public static Comparator<Coupons> couponDiscount = new Comparator<Coupons>() {

		public int compare(Coupons c1, Coupons c2) {

			int coupon1 = c1.getDiscount();
			int coupon2 = c2.getDiscount();

			return coupon1 - coupon2;
		}
	};
	public static Comparator<Coupons> couponCategory = new Comparator<Coupons>() {

		public int compare(Coupons c1, Coupons c2) {
			String coupon1 = c1.getCategory().toUpperCase();
			String coupon2 = c2.getCategory().toUpperCase();

			return coupon1.compareTo(coupon2);
		}
	};

}
