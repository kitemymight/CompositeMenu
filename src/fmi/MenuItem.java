package fmi;

public interface MenuItem {
	public void add(MenuItem menuItem);
	public void remove(MenuItem menuItem);
	
	public MenuItem getChild(int i);
	
	public String getName();
	public String getUrl();
	
	public void print();
}
