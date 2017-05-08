import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by 임승현 on 2017-05-09.
 */

/*
 * Array
 * ArrayList
 * HashSet
 * HashMap
 *
 * ArrayList - HashMap - Array - HashSet
 */
public class CollectionFrameworks {
    public void explainArray() {
        int[] intArray = new int[5];

        intArray[0] = 5;
        System.out.println(intArray[0]); // 1
        System.out.println(intArray[1]); // 2
        System.out.println(intArray[2]); // 3
        System.out.println(intArray[3]); // 4
        System.out.println(intArray[4]); // 5
    }
    public void explainArrayList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));
    }
    // 순서가 없다. 리스트의 중복을 한번에 없애줄때 사용. HashSet <-> ArrayList
    public void  explainHashSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Hello");
        hashSet.add("Hello");
        hashSet.add("Hello");

        System.out.println(hashSet.size());
        System.out.println(hashSet.contains("Hello"));
        System.out.println(hashSet.contains("임승현"));

        ArrayList<String> arrayList = new ArrayList<String>(hashSet);
        System.out.println(arrayList.get(0));
    }
    public void explainHashMap() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "임승현");
        System.out.println(hashMap.get("name"));
    }
}
