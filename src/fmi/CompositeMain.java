package fmi;

public class CompositeMain {

	public static void main(String[] args) {

		Link link1 = new Link("Categories", "/categories");
		Link link2 = new Link("Tags", "/tags");
		
		Menu menu1 = new Menu("Articles", "/articles");
		
		menu1.add(link1);
		menu1.add(link2);
		
		Link link3 = new Link("Contacts", "/contacts");
		
		Menu menu2 = new Menu("Blog", "/blog");
		
		menu2.add(link3);
		menu2.add(menu1);
		
		menu2.print();

	}

}
