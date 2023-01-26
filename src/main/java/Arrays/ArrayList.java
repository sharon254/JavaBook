package Arrays;

import java.util.List;

public class ArrayList {
    public static void main(String[] args){
        /**
         * New array list object
         * Two object share the same type, it is called polymorphism
         * Add element to an arrayList
         * calling the add method
         * We can add as many elements as we want as it can always resize
         * Dynamic resizing
         */
        //List<String> list = (List) new ArrayList();
        List<String> cities = new java.util.ArrayList<>();

        cities.add("Paris");
        cities.add("Florence");
        cities.add("Venice");
        cities.add("Versailles");
        cities.add("London");
        cities.add("Petra");
        cities.add("Oslo");
        cities.add("Rome");
        cities.add("Madrid");
        cities.add("Tokyo");
        System.out.println(cities.get(5));
         cities.set(2, "Naples");
         cities.remove(5);

    }
}
