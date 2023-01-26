package Arrays;

import java.util.List;

public class LinkedList {
    public static void main(String[] args){
        /**
         * The current node stores the link to the previous node
         * Retrieving data from a linked list is very slow
         * there are no indexes , they are a chain of nodes, eachnode is linked to the previous and next list
         * ArrayList is better in retrieving data
         * while LinkedList is better in removing elements from the middle
         *
         */

        //List<String> list = (List) new ArrayList();
        List<String> cities = new java.util.LinkedList<>();


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
