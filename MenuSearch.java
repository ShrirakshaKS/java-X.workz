package Com.Xworkz.online;

public class MenuSearch {

	
private static String[] nameOfFoods= {"Dosa","salad","Juice","coffee","Tea","Roti","poha","Idli-vada","Rice-sambar","puri","cake","ice-cream","paneer-masala"};

public static void findFood(String food) {
	System.out.println("search kareyuvudu");
	System.out.println("Total items available" + nameOfFoods.length);
	System.out.println("arg1 :" + food);
	boolean foodFound = false;
	
	for (int count = 0; count < nameOfFoods.length; count++) {
		
		String item = nameOfFoods[count];
		if (item.equals(food)) {
		
			foodFound = true;
			break;
		} else {
			
			foodFound = false;
		}
	}

	if (foodFound) {
		System.out.println("item is found ");
	} else {
		System.out.println("item is not found");
	}
	System.out.println("search nirgamana");
}

public static int totalFood() {
	return nameOfFoods.length;
}
}
