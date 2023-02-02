//use the scanner methode:
import java.util.Scanner;           //like a librarie in C or python ............


public class rasta{
//first code source:

   /*  public static void main(String[] args){
        System.out.println("welcom in my first program in Java");
        
        String varst ="------>My name is Rayane ,i'm a developer ,and i'm 19 years old ";
        char var1 ='R';
        String var2 ="--->Hello im a string var";
        boolean bool = false;
        int nbr =1233; 
//other types of number : float ,double,short ,long...............


        System.out.println(varst);         //how to print  a string variable .
        System.out.println("-->this is the character var .");   //result in instruction after this .
        System.out.println(var1);          //how to print a character variable .
        System.out.println(var2);          //who to print a string variable again .

        System.out.println(bool);          //how to print a boolean variable .
        System.out.println(nbr);           //how to print a simple number .
    } */

//seconde code source:

public static void main(String[] args) {
  double a=2;                        //use double type if you need a result with float (decimal) number.
  double b=5;
  double c=2.555;
  double varop=a*b*0.97878;
  double k=b/a;
  System.out.println(b/a);                   // and other operation *,-,+,/......... 
  System.out.println(c); 
  System.out.println(k);                     //a result with float number.
  System.out.println(varop);  

System.out.println("Give me a text to play it ? ");
  Scanner text = new Scanner(System.in);                  //how to get a text from a user
  String aff = text.next();                            //(aff) is a string variable 
    System.out.println(aff);


    System.out.println("give me a number ");
   Scanner nbrr = new Scanner(System.in);                //how to get a number from user. 
   double N = nbrr.nextDouble();                         // stored the number in variable called 'N'.
   System.out.println(N);

   System.out.println("Chose 'true' or 'false' ");
  Scanner bool = new Scanner(System.in);              //how to get a boolean from user (true or false only).
  boolean varbool = bool.nextBoolean();               //stored the result in variable 'varbool'.
  System.out.println(varbool);





}
=======
        System.out.println(bool);          //how to print a bollean variable .
        System.out.println(nbr);           //how to print a simple number .
    }

}
