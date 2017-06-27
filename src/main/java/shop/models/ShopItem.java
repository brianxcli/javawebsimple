package shop.models;

public class ShopItem {
	public String name;
	public int count;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}	
	
	public ShopItem(String name, int count) {
		this.name = name;
		this.count = count;
	}
}
