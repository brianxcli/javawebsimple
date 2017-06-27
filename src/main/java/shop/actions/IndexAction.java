package shop.actions;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import shop.models.ShopItem;
import shop.utils.Env;

public class IndexAction extends ActionSupport {
	private static final long serialVersionUID = 1842522492023602323L;

	private ArrayList<ShopItem> itemList = new ArrayList<ShopItem>();
	
	public ArrayList<ShopItem> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<ShopItem> itemList) {
		this.itemList = itemList;
	}

	@Override
	public String execute() throws Exception {
		itemList = Env.items;
		return SUCCESS; 
	}	
}
