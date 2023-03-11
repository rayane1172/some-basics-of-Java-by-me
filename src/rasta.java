

//use the scanner methode:
import java.util.Scanner;               //like a librarie in C or python ............

import java.util.ArrayList;             // librarie for liste in java , it's important when we use lists....
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class rasta {
  // first code source:

  /*
    public static void main(String[] args){
    System.out.println("welcom in my first program in Java");
    
    String varst ="------>My name is Rayane ,i'm a developer ,and i'm 19 years old ";
    char var1 ='R';
    String var2 ="--->Hello im a string var";
    boolean bool = false;
    int nbr =1233;
    //other types of number : float ,double,short ,long...............
    
    
    System.out.println(varst); //how to print a string variable .
    System.out.println("-->this is the character var ."); //result in instruction after this .
    System.out.println(var1); //how to print a character variable .
    System.out.println(var2); //who to print a string variable again .
    System.out.println(bool); //how to print a boolean variable .
    System.out.println(nbr); //how to print a simple number .
    }
   */

  // seconde code source:

  public static void main(String[] args) {
    /*
      double a = 2,2; //use double type if you need a result with float (decimal) number.
      double b=5;
      double c=2.555;
      double varop=a*b*0.97878;
      double k=b/a;
      System.out.println(b/a); // and other operation *,-,+,/.........
      System.out.println(c);
      System.out.println(k); //a result with float number.
      System.out.println(varop);
      
      System.out.println("Give me a text to play it ? ");
      Scanner text = new Scanner(System.in);       //how to get a text from a user
      String aff = text.next();                //(aff) is a string variable
      System.out.println(aff);
      
      
      System.out.println("give me a number ");
      Scanner nbrr = new Scanner(System.in);       //how to get a number from user.
      double N = nbrr.nextDouble();                // stored the number in variable called 'N'.
      System.out.println(N);
      
      System.out.println("Choose 'true' or 'false' ");
      Scanner bool = new Scanner(System.in); //how to get a boolean from user (true
      or false only).
      boolean varbool = bool.nextBoolean(); //stored the result in variable 'varbool'.
      System.out.println(varbool);
     */

    /*
     double aa =12.4;
      double bb= 255.6;
      double kk = 23.002;
      System.out.println("---------------->the result of some operations : ");
      
      boolean rep = aa==bb;
      boolean rep2 = aa<bb;
      boolean rep3 = kk>=aa;
      System.out.println(rep);
      System.out.println(rep2);
      System.out.println(rep3);
     
      
      boolean and = aa==bb && aa<bb ; //'and' Logical.
      boolean or = aa==bb || aa<bb ; // 'or' Logical.
      System.out.
      println("---------------->The result of an 'and' logic , 'or' logic :");
      System.out.println(and);
      System.out.println(or);
    
      // "IF,ELSE" fonctions :
     
     if (kk>aa){
      System.out.println("K is greater than A");
      
      }else if (aa == 12.4){
      System.out.println("A is equal to == 12.4");
      
      }else {System.out.println("B is equal to == 255.6");}
      
     
     
      
      int n1,n2,n3;
      double som;
      Scanner nombre = new Scanner(System.in); //there we use one Scanner to get many values of variables from user
      System.out.print("Give me n1 == ");
      n1 = nombre.nextInt();
      System.out.print("Give me n2 == ");
     n2 = nombre.nextInt();
      System.out.print("Give me n3 == ");
      n3 = nombre.nextInt();
      
      som=(n1+n2+n3)/3;
      
      System.out.println("the totale is == "+som); //how to print a result with
      text
      
     */

    // array in java (table)
    /*
      float[] table = new float[4]; // how to declare a table with 4 elements
      
      table[0] = 1;
      table[1] = 2;
      table[2] = 3;
      table[3] = 4;
      System.out.print("--->The value of first cas in table == ");
     System.out.println(table[0]);
      
      if (table[1] <= table[2]) {
      System.out.print("---->");
      System.out.println(table[2] + " Is greater than " + table[1]); // how to
      print variable with text in the same
      // instruction
      }
      
     */

    // table with string
    /*
      String[] table2 = new String[3]; // how to declare a table of strings with 3
      elements....
      
      table2[0] = "hello";
      table2[1] = "rayane";
      table2[2] = "Java.";
      System.out.print("----->"); // just to understand.......
      System.out.println(table2[0] + ",My name is " + table2[1] + ",I love " +
      table2[2]);
      
      
      
      System.out.println("------> LOOP FONCTION<-----");
      // loop fonction :
      for (int i = 0; i <= 10; i++) { //when step=2 ; we use {i+=2},also we can use
      double type or float .......
      System.out.println("ITERATION NUMBER :" + i);
      
     }
      
      
      System.out.println("------> WHILE FONCTION<-----");
      // while fonction
     int j = 0;
     while (j <= 10) {
      System.out.println("ITERATION NUMBER :" + j);
     j++;
      }
     */

    // exercise in loop fonction :
    // --- we will do an area with a table (data-base) to display this five colors
    // :(red ,blue ,yellow ,grey ,blue)...


    /* 
    String[] tablecolor; // declaration of a table of string variable...
    tablecolor = new String[5];

    tablecolor[0] = "red";
    tablecolor[1] = "blue";
    tablecolor[2] = "yellow";
    tablecolor[3] = "grey";
    tablecolor[4] = "blue";

    for (int i = 0; i < tablecolor.length; i++) { // we use ".length" to get the size of the table of colors.........
      if (tablecolor[i].equals("blue")) {
        System.out.println("the Car number " + i + ",is 'BLUE' ");

      } else {
        System.out.println("the Car number " + i + ",is NOT 'BLUE' ");
      }

    }

    // table with row and column :

    String[][] mat = new String[3][3]; // first[] for row and second[] for column
    System.out.println("------->Now we use a table row and column :");
    mat[0][0] = "----->I'm ";
    mat[0][1] = "R";
    mat[0][2] = "A";
    mat[1][0] = "Y";
    mat[1][1] = "A";
    mat[1][2] = "N";
    mat[2][0] = "E";
    mat[2][1] = "-->GOOD_";
    mat[2][2] = "LUCk";

    for (int j = 0; j < mat.length; j++) {
      for (int t = 0; t < mat[0].length; t++) { // how to get number of column : (nameoftable) plus '[0]' plus (.length).......
        System.out.print(mat[j][t]);

      }
    }
*/

  // linked lists in java :
// we should write the librarie in the begining of public class........


ArrayList<String> list = new ArrayList<>();        //arrayListe is a type like list in algorithm.
 
int listsize = list.size();        // how to get the size of our list

list.add("Heloo");
list.add("rayane");
list.add("bouchair");
list.add("i'm");
list.add("developer");
                                      //  ctrl + space : to show all operation or boucle 
listsize = list.size(); 
System.out.println("the size of list is : "+listsize);
System.out.println(list);
  
String place = list.get(1);         //how to get the element number 1 in the our list  (get).
System.out.println(place);

list.set(1, "rasta");         // how to modifiy a value in list (set).
System.out.println(list);

list.remove(1);                 //how to remove an element in our list.
System.out.println(list);

list.clear();     //how to clear all the list .

// important abour arrayListe and list :
/*
 * when we want to add or delete an element from the end we use the "ARRAYLIST".
 * but when we want to add in the begining or the middle we use the "linkedList" type .
 * 
 * important remarque about deffrence between linkedlist and arrraylist ;
 * --> when we add an element in the end of list ,the fast way is the " ARRAYLIST "
 * ---> but when we add in the begining of list , the fast way is the " LINKED LIST "
 * 
 */

//linkedList methode :

LinkedList<Integer> l_list = new LinkedList<>();    //linked list with integer variable...
l_list.add(2);
l_list.add(0,3);
System.out.println(l_list);



//MAPS is like the arbre binary of recherche (ABR) , with two party in one variabl , key and value......

Map<String,Integer> note = new HashMap();        //hashmap " <key , value > "
  
note.put("rayane",20);
note.put("rasta",12);
note.put("java",13);
note.put("BMW",4);

System.out.println(note);

note.remove("rasta");         //how to remove from the map (arbre)..

System.out.println(note);

int size = note.size();         //how to get the size of map....
System.out.println(size);

System.out.println(note.get("rayane"));       //to get the value with the key "rayane"

























  }
}
