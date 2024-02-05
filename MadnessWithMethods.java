public class MadnessWithMethods{

   public class Main { //File in Main
       public static void getAnintFromTheUser() {   //Name of Method

           System.out.println("My Integer");  //Output when method is called


       }
         public static void main(String[] args) {
                     getAnintFromTheUser(); //This should output "My Integer," but I'm missing something


       }
   }}

   public class Main {  //File in Main

       public static void compareTwoInts() { //Name of Method


           System.out.println("Larger of Two Integers"); // Output of Method

           public static void main(String[] args) {

               int number1, number2; // Desired Integers

               System.out.print(" Enter First Number "); //Output
               number1 = sc.nextInt();

               System.out.print(" Enter Second Number "); //Output
               number2 = sc.nextInt();

               if(number1 > number2)
               {
                   System.out.println("\n The Largest Number = " + number1);
               }
               else if (number2 > number1)
               {
                   System.out.println("\n The Largest Number = " + number2);
               }

           }

}

       public class Main {  //File in Main

           public static void sumTwoInts() { //Name of Method


               System.out.println("Sum of Two Integers"); // Output of Method

               public static void main (String[]args){
                   int a = 50; //Int 1
                   double b = 70; //Int 2
                   double sum = a + b; //Equation being performed

                   System.out.println("\n\n The sum of " + a + " and " + b + " is " + sum); //Output to read

               }
           }
           //Really struggled with these exercises as I'm sure you can tell.   
