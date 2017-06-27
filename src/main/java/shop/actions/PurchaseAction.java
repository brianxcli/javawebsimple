package shop.actions;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import shop.models.ShopItem;
import shop.utils.Env;

public class PurchaseAction extends ActionSupport {
	private static final long serialVersionUID = 387508879324561760L;

	private String item1;
	private String item2;
	private int count1;
	private int count2;
	
	private ArrayList<ShopItem> itemList = new ArrayList<ShopItem>();
	
	public ArrayList<ShopItem> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<ShopItem> itemList) {
		this.itemList = itemList;
	}
	public String getItem1() {
		return item1;
	}

	public void setItem1(String item1) {
		this.item1 = item1;
	}

	public String getItem2() {
		return item2;
	}

	public void setItem2(String item2) {
		this.item2 = item2;
	}

	public int getCount1() {
		return count1;
	}

	public void setCount1(int count1) {
		this.count1 = count1;
	}

	public int getCount2() {
		return count2;
	}

	public void setCount2(int count2) {
		this.count2 = count2;
	}


	@Override
	public void validate() {
		itemList = Env.items;
		
		int cnt1 = getCount1();
		int cnt2 = getCount2();
		
		if (cnt1 < 1) {
	        addFieldError("count1", "Invalid number of items input.");
	    } else {
	    	ShopItem item = itemList.get(0);
	    	if (item.count < cnt1) {
	    		addFieldError("count1", "Sorry, not enough in stock.");
	    	}
	    }
		
		if (cnt2 < 1) {
			addFieldError("count2", "Invalid number of items input.");
		} else {
			ShopItem item = itemList.get(1);
	    	if (item.count < cnt2) {
	    		addFieldError("count2", "Sorry, not enough in stock.");
	    	}
		}
	}
	
	@Override
	public String execute() throws Exception {
		ShopItem item = itemList.get(0);
		item.count -= getCount1();
		item = itemList.get(1);
		item.count -= getCount2();
		
		return SUCCESS;
	}	
}