package fmi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu implements MenuItem {

	private String name;
	private String url;
	List<MenuItem> items = new ArrayList<MenuItem>();
	
	public Menu(String name, String url) {
		this.name = name;
		this.url = url;
	}

	@Override
	public void add(MenuItem menuItem) {
		items.add(menuItem);
	}

	@Override
	public void remove(MenuItem menuItem) {
		items.remove(menuItem);
	}

	@Override
	public MenuItem getChild(int i) {
		return items.get(i);
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getUrl() {
		return this.url;
	}

	@Override
	public void print() {
		System.out.println("==============");
		System.out.println(" > " + this.getName());
		System.out.println(" > " + this.getUrl());
		System.out.println("==============");
		
		Iterator<MenuItem> menIter = items.iterator();
		
		while(menIter.hasNext()) {
			MenuItem menuItem = menIter.next();
			menuItem.print();
		}

	}

}
