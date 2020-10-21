public class Universe{
public static void main(String[] source)
{
arrayOfBoolean();
}
public static void arrayOfBoolean()
{
boolean sunIsAStar=true;
boolean earthIsFlat=false;
boolean moonIsASatellite=true;
boolean sunIsNotConstant=false;

boolean[] planetaryFacts = {sunIsAStar,earthIsFlat,moonIsASatellite,sunIsNotConstant};

int countOfElementsInAList=planetaryFacts.length;

System.out.println("The length of Array is: " + countOfElementsInAList);

boolean elementAtIndex0=planetaryFacts[0];
boolean elementAtIndex2=planetaryFacts[1];
boolean elementAtIndex4=planetaryFacts[3];

System.out.println("Is element at index 0 is true or false: " +planetaryFacts[0]);
System.out.println("Is element at index 1 is true or false: " +planetaryFacts[1]);
System.out.println("Is element at index 4 is true or false: " +planetaryFacts[3]);

}
}
    