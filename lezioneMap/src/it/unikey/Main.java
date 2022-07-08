package it.unikey;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> provaMappa = new HashMap<>();
        provaMappa.put(1, "Alessandroeee");
        provaMappa.putIfAbsent(1, "Alessandro");
        provaMappa.put(2, "Federico");
        provaMappa.put(3, "Alessandro");

        provaMappa.remove(1, "Ciao");


        HashMap<String, Integer> mapStringInteger = new HashMap<>();
        mapStringInteger.put("Inter", 1);
        mapStringInteger.put("Roma", 2);
        mapStringInteger.put("Milan", 3);


        System.out.println(provaMappa);

        System.out.println(provaMappa.get(1));

        System.out.println(provaMappa.values());

        Set<Integer> set = provaMappa.keySet();

        for(Integer i : set){
            System.out.println(i);
        }

        System.out.println(provaMappa.containsKey(2));
        System.out.println(provaMappa.containsKey(4));

        System.out.println(provaMappa.containsValue("Ciao"));
        System.out.println(provaMappa.containsValue("Alessandro"));
        System.out.println(provaMappa.containsValue("Alessandroeee"));

        LinkedHashMap<Integer, List<String>> linkedHashMap = new LinkedHashMap<>();
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("ciao");
        lista1.add("ciao");
        LinkedList<String> lista2 = new LinkedList<>();
        lista2.add("ciao");
        lista2.add("ciao");

        linkedHashMap.put(1, lista1);
        linkedHashMap.put(2, lista2);
        linkedHashMap.remove(1, lista2);

        System.out.println(linkedHashMap);

        Person francesco = new Person("Francesco", "Di Rosa", 28);
        Person francesco2 = new Person("Francesco", "Di Rosa", 29);
        Person francesco3 = new Person("Francesco", "Totti", 58);
        Person francesco4 = new Person("Francesco", "Caputo", 34);

        TreeSet<Person> people = new TreeSet<>(new PersonSorterBySurname());
        people.add(francesco);
        people.add(francesco2);
        people.add(francesco3);
        people.add(francesco4);

        System.out.println(people);


        TreeSet<Person> people2 = new TreeSet<>(new PersonSorterByAge());
        people2.add(francesco);
        people2.add(francesco2);
        people2.add(francesco3);
        people2.add(francesco4);

        System.out.println(people2);

        //prova develop
        System.out.println("develop");

    }
}
