package shop.utils;

import java.util.ArrayList;

import shop.models.ShopItem;

public class Env {
	public static ArrayList<ShopItem> items = new ArrayList<ShopItem>();
	
	static {
		items.add(new ShopItem("Item A", 20));
		items.add(new ShopItem("Item B", 10));
	}	
}
