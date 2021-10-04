package start;

import java.util.ArrayList;

public class B_6_2D_ArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 2D ArrayList: = a dynamic list of lists;
		// Can change the size of list during runtime
		// Declaration can also be:
		// ArrayList<ArrayList<String>> grL = new ArrayList();
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> bakeryList = new ArrayList<String>();
		bakeryList.add("pasta");
		bakeryList.add("donuts");
		bakeryList.add("garlic bread");
		
		ArrayList<String> productList = new ArrayList<String>();
		productList.add("tomatoes");
		productList.add("corn");
		
		ArrayList<String> drinkList = new ArrayList<String>();
		drinkList.add("Coke");
		drinkList.add("7up");
		
		groceryList.add(bakeryList);
		groceryList.add(productList);
		groceryList.add(drinkList);
		
		System.out.println(groceryList);
		System.out.println(groceryList.get(0));
		System.out.println(groceryList.get(0).get(0));
	}
}
