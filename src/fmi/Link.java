package fmi;

public class Link implements MenuItem {

	private String name;
	private String url;
	
	public Link(String name, String url) {
		this.name = name;
		this.url = url;
	}

	@Override
	public void add(MenuItem menuItem) {
		// Leaf node cannot add
	}

	@Override
	public void remove(MenuItem menuItem) {
		// Leaf node cannot remove
	}

	@Override
	public MenuItem getChild(int i) {
		// // Leaf node cannot getChild
		return null;
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
		System.out.println("      > " + this.getName());
		System.out.println("      > " + this.getUrl());
		System.out.println("==============");
	}

}
