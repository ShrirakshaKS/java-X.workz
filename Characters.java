public class Characters{
public static void main(String[] alpha)
{
arrayOfCharacters();
}
public static void arrayOfCharacters()
{
char ageBetween1To10='A';
char ageBetween11To20='B';
char ageBetween21To30='C';
char ageBetween31To40='D';
char ageBetween41To50='E';
char ageBetween51To60='F';
char ageBetween61To70='G';
char ageBetween71To80='H';
char ageBetween81To90='I';
char ageBetween91To100='J';
char ageBetween101To110='K';

char[] allAgeGroup = { ageBetween1To10,ageBetween11To20,ageBetween31To40,ageBetween41To50,ageBetween51To60,ageBetween61To70,ageBetween71To80,ageBetween81To90,ageBetween91To100,ageBetween101To110};

int countOfArray=allAgeGroup.length;
System.out.println("The length of Array is " + countOfArray);
char elementAtIndex1=allAgeGroup[2];
System.out.println("number of people between 31 to 40 represented in group: " + elementAtIndex1);
System.out.println("number of people between 71 to 80 represented in group: " + allAgeGroup[6]);

System.out.println("number of people between 101 to 110 represented in group: " + allAgeGroup[9]);


}
}
    
