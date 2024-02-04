public class ReversedStrings  {
public static void main(String[] args) {

    String originalStr = ("HelloWorld"); //Original Word

    String reversedStr = "";  // Blank word required

    for (int i = 0; i < originalStr.length(); i++)
        reversedStr = originalStr.charAt(i) + reversedStr;


    System.out.println("\nReversed string: " + reversedStr);


}
}