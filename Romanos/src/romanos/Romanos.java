package romanos;
import java.util.*;
import java.util.Map;
public class Romanos {
    public static void main(String[] args) {
   
        System.out.println("Manera aditiva");
        int a = numRomano("I");
        System.out.print("I es igual a ");
        System.out.println(a);

        a = numRomano("XV");
        System.out.print("XV es igual a ");
        System.out.println(a);

        a = numRomano("XVI");
        System.out.print("XVI es igual a ");
        System.out.println(a);

        a = numRomano("LVII");
        System.out.print("LVII es igual a ");
        System.out.println(a);

        System.out.println("Manera sustractiva");
        a = numRomano("I");
        System.out.print("I es igual a ");
        System.out.println(a);

        a = numRomano("IV");
        System.out.print("IV es igual a ");
        System.out.println(a);

        a = numRomano("XIV");
        System.out.print("XIV es igual a ");
        System.out.println(a);

        a = numRomano("LXIV");
        System.out.print("LXIV es igual a ");
        System.out.println(a);
    }

    public static int numRomano(String s){
        int result = 0;
        int length = s.length();
        Map<Character, Integer> romanM = getRomaMap();
        for (int i = 0; i < length -1; i++) {
            int currentValue = romanM.get(s.charAt(i));
            if (currentValue < romanM.get(s.charAt(i+1))){
                result -= currentValue;
            }
            else {
                result+=currentValue;
            }
        }
        return result + romanM.get(s.charAt(length-1));
    }

    public static Map<Character, Integer> getRomaMap(){
        Map<Character, Integer> roman = new HashMap<Character, Integer>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        return roman;
    }
}
         
      
