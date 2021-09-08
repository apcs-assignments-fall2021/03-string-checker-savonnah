import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a'){
                count++;
            }
            else if(str.charAt(i) == 'b'){
                count++;
            }
            else if(str.charAt(i) == 'c'){
                count++;

            }
        }
        return count;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
            int x = str.indexOf("The");
            int y = str.indexOf("the");
            if (x != -1 || y != -1){
                 return true;
            }
            else{
                return false;
            }
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        String newstr = "";
        for (int i = str.length()-1; i >=0; i=i-1) {
            String newstring = newstr + str.charAt(i);
        }
        if(newstr.equals(newstring)){
            return true;
        }
        else{
            return false;
        }

    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string (please lowercase):");
        String inputstr = scan.nextLine();
        System.out.println("Your string contains "+ countABC(inputstr)+" a's, b's, or c's");
        if (containsThe(inputstr) == true){
            System.out.println("Your string DOES contain the");
        }
        else {
            System.out.println("Your string DOES NOT contain the");
        }
        if (isPalindrome(inputstr) == true){
            System.out.println("Your string IS a palindrome");
        }
        else {
            System.out.println("Your string IS NOT a palindrome");
        }

        // YOUR CODE HERE
    }
}
