public class AddressTester
{
 public static void main(String[] param)
 {
	 short houseNo=Address.doorNo;
	 String streetName=Address.street;
	 String cityName=Address.city;
	 int pinCode=Address.pinCode;
	 
	 System.out.println(houseNo);
	 System.out.println(streetName);
	 System.out.println(cityName);
	 System.out.println(pinCode);
	 
	 System.out.println("*******************************");
	 
	 houseNo=2565;
	 streetName="Shivaji Nagar";
	 
	 System.out.println(houseNo);
	 System.out.println(streetName);
	 System.out.println(cityName);
	 System.out.println(pinCode);
	 
	 System.out.println("********************************");
	 
	 Address.doorNo=724;
	 Address.street="Rajaji Nagar";
	 Address.city="Bengaluru";
	 Address.pinCode=560002;
	 
	 System.out.println(Address.doorNo);
	 System.out.println(Address.street);
	 System.out.println(Address.city);
	 System.out.println(Address.pinCode);
 }


}