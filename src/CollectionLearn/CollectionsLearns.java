package CollectionLearn;

import java.util.*;

/*@ShashankS
* @Date 2025-05-22
* @Description: This is a collection learn class which contains the methods to learn about collections in java
 */
public class CollectionsLearns {
    public static void runCollection(){
        //List
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //Different ways to print the list

        //Simply print list
        System.out.println("List: "+list);

        //Using For Enhanced Each loop in collection it is present in java.lang.Iterable
        list.forEach(a -> System.out.println("Element: "+a));

        //Using Iterator
        Iterator<Integer> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println("Element: "+itr.next());
        }


        //HashMap
        Map<Character,Integer> map=new HashMap<>();
        map.put('a',1);
        map.put('b',2);
        map.put('c',3);
        map.put('d',4);
        map.put('e',5);
        System.out.println(map);
        System.out.println(map.keySet());//returns the set of keys
        Set<Character> set=  map.keySet();
        for(Character c:set){
            System.out.println("Key: "+c+" ->> Value: "+map.get(c));
        }

    }
}
