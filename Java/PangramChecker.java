import java.util.*;
public class PangramChecker{
    public static boolean isPangram(String input) {

        boolean[] present=new boolean[26];
        input=input.toLowerCase();
        for(int i=0;i<input.length();i++){
            char ch =input.charAt(i);

            if('a'<=ch && ch<='z'){
                present[ch-'a']=true;
            }
        }
        for(int i=0;i<26;i++){
            if(!present[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Sentence: ");
        String sentence=sc.next();
        boolean result=isPangram(sentence);
        if(result){
            System.out.println("The input is a pangram.");
        } 
	else{
            System.out.println("The input is not a pangram.");
        }
    }
}
