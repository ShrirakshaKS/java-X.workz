package Com.Xworkz.online;

public class PlacesName {
		
	private static String[] nameOfPlaces= {"Hangal","Haveri","Hubli","Dharwad","Gadag","Sirsi","Karwar"};

	public static void findPlaces(String place) {
		System.out.println("search kareyuvudu");
		System.out.println("Total items available" + nameOfPlaces.length);
		System.out.println("arg1 :" + place);
		boolean placeFound = false;
		
		for (int count = 0; count < nameOfPlaces.length; count++) {
			
			String item = nameOfPlaces[count];
			if (item.equals(place)) {
			
				placeFound = true;
				break;
			} else {
				
				placeFound = false;
			}
		}

		if (placeFound) {
			System.out.println("item is found ");
		} else {
			System.out.println("item is not found");
		}
		System.out.println("search nirgamana");
	}

	public static int totalPlaces() {
		return nameOfPlaces.length;
	}
}
