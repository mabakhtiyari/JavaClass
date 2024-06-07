import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void convertRomanToInt(String s) {
        Map<Character,Integer> map= new HashMap<>();
        map.put('I',1);
        map.put('X',10);
        map.put('V',5);
        map.put('L',50);
        int number=0;

        for (int i =0;i<s.length();i++){
            number=number+(map.get(s.charAt(i)));
        }
        System.out.println("The Integer Value is:"+number);
    }

    public static void main(String[] args) {
        convertRomanToInt("XIILV");
    }
}
