package MapPractice;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMethode {
    public static <T,U> Map<T,U> mapMethode (Map<T,U> map1, List<T> list1){
        Map<T,U> mapA= new HashMap<>();
        for (T listElement:list1){
            for (Map.Entry<T,U> mapElement: map1.entrySet()){
                if(listElement== mapElement.getKey())
                    mapA.put(mapElement.getKey(),mapElement.getValue());
            }
        }
    return mapA;
    }
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"Marjan");
        map1.put(2,"Negar");
        map1.put(3,"Aria");
        map1.put(4,"Mahsa");

        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(10);
        list1.add(4);

        mapMethode(map1,list1);
        for (Map.Entry<Integer,String> elements:map1.entrySet()){
            System.out.println(elements.getKey());
        }
    }
}
