import java.util.*;

public class RomanToInteger{
    public static int romanToInt(String s) {

        HashMap<Character,Integer> romanMap=new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);

        int result=0;
        int prevValue=0;

        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            int value=romanMap.get(c);

            if(value<prevValue){
                result-=value;
            } 
	    else{
                result+=value;
            }
            prevValue=value;
        }
        return result;
    }

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Roman Number: ");
        String roman=sc.next(); 
        int num=romanToInt(roman);
        System.out.println("The integer value of "+roman+" is: " +num);
    }
}
