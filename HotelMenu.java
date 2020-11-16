package Com.Xworkz.online;

public class HotelMenu {
	public static void main(String[] food) {

		System.out.println("jvm kareyuvudu main");

		System.out.println("Total items to search" + MenuSearch.totalFood());
		MenuSearch.findFood(food[0]);

		System.out.println("main nirgamana");
	}

}
