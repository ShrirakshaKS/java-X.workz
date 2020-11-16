package Com.Xworkz.online;

public class PhoneNumber {
	
	private static long[] numbers= {9482988962l,9591649788l,8431656218l,7259438432l,9448743916l};

	public static void findNumber(long number) {
		System.out.println("search kareyuvudu");
		System.out.println("Total items available" + numbers.length);
		System.out.println("arg1 :" + number);
		boolean placeFound = false;
		
		for (int count = 0; count < numbers.length; count++) {
			
			long item = numbers[count];
			if (item==number) {
			
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

	public static int totalNumbers() {
		return numbers.length;
	}
}
