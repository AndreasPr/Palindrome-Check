/**
 * Created on 08/Jan/2021 to Palindrome-String
 */
public class palindromeCheck {

    private static boolean palindrome(String str){

        int i = 0; //points to the start of the str
        int j = str.length() - 1; //points to the end of the str

        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }

            i++;
            j--;
        }
        return true;
    }

    public static void main(String args[]){
        String str = "andreassaerdna";

        if(palindrome(str)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
