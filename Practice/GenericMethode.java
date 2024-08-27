package Practice;

import java.util.ArrayList;
import java.util.List;

public class GenericMethode{

    public GenericMethode() {

    }
    public static <T,U> void equalsListElements(List <T> list1, List <U> list2){
        for (T element:list1){

            System.out.println(element);
        }
        for (U element:list2){
            System.out.println(element);
        }

        System.out.println("Equality State is:");

        if(list1.equals(list2))
            System.out.println("true");
        else
            System.out.println("false");


    }
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Sara");
        list1.add("Mona");
        list1.add("Neda");
        list1.add("Ali");
        list1.add("Nilo");
        list1.add("Hasan");

        List<String> list2= new ArrayList<>();
        list2.add("Mina");
        list2.add("Mona");
        list2.add("Neda");
        list2.add("Ali");
       // list2.add("Aria");
       // list2.add("Maria");

        equalsListElements(list1,list2);
    }




}
