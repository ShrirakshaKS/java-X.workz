package com.xworkz.concepts;
import com.xworkz.concepts.obj.Mobile;

public class MobileTester {

	public static void main(String[] args) {
		Mobile.founder="Lee Byung-chul";
		
		Mobile mob=new Mobile();
		mob.modelName="Samsung Galaxy M51";
		mob.colorOfModel="Celestial Black";
		mob.yearOfRelease="31/08/2020";
		mob.price="26999";
		mob.displayInfo();
		
		System.out.println("*************************************");
		
		Mobile mob2=new Mobile();
		mob2.modelName="Samsung Galaxy M01";
		mob2.colorOfModel="Red";
		mob2.yearOfRelease="02/06/2020";
		mob2.price="7999";
		mob2.displayInfo();		
		System.out.println("*************************************");
		
		Mobile mob3=new Mobile();
		mob3.modelName="Samsung Galaxy M10";
		mob3.colorOfModel="Metallic Blue";
		mob3.yearOfRelease="18/09/2019";
		mob3.price="8990";
		mob3.displayInfo();
		System.out.println("*************************************");
		
		Mobile mob4=new Mobile();
		mob4.modelName="Samsung Galaxy A6";
		mob4.colorOfModel="Blue";
		mob4.yearOfRelease="21/05/2018";
		mob4.price="16990";
		mob4.displayInfo();
		System.out.println("*************************************");
		
		
		Mobile mob5=new Mobile();
		mob5.modelName="Samsung Galaxy J2";
		mob5.colorOfModel="White";
		mob5.yearOfRelease="07/10/2017";
		mob5.price="3079";
		mob5.displayInfo();
		System.out.println("*************************************");
		
		Mobile mob6=new Mobile();
		mob6.modelName="Samsung Galaxy Note8";
		mob6.colorOfModel="Midnight Black";
		mob6.yearOfRelease="25/08/2017";
		mob6.price="59990";
		mob6.displayInfo();
		System.out.println("*************************************");
		
		Mobile mob7=new Mobile();
		mob7.modelName="Samsung Galaxy C9 Pro";
		mob7.colorOfModel="Gold";
		mob7.yearOfRelease="12/10/2016";
		mob7.price="19629";
		mob7.displayInfo();
		System.out.println("*************************************");
		
		Mobile mob8=new Mobile();
		mob8.modelName="Samsung Galaxy A7";
		mob8.colorOfModel="Champagne Gold";
		mob8.yearOfRelease="22/01/2015";
		mob8.price="5099";
		mob8.displayInfo();
		System.out.println("*************************************");
		
		Mobile mob9=new Mobile();
		mob9.modelName="Samsung Galaxy F41";
		mob9.colorOfModel="Fusion Blue";
		mob9.yearOfRelease="08/10/2020";
		mob9.price="16999";
		mob9.displayInfo();
		System.out.println("*************************************");
		
		Mobile mob10=new Mobile();
		mob10.modelName="Samsung Galaxy Note 20";
		mob10.colorOfModel="Mystic Black";
		mob10.yearOfRelease="05/08/2020";
		mob10.price="104999";
		mob10.displayInfo();
	}

}
