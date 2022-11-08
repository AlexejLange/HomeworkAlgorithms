package homeworkarraylist;
/**
 * Algorithms. Homework ArrayList
 * @author Alexej Lange
 * @version 23 Sep 2022
 */

public class UseDynamicArray {
    public static void main(String[] args) {
        DynamicArray defaultDynamicArray = new DynamicArray();
        System.out.println(defaultDynamicArray);
        defaultDynamicArray.add(4);
        defaultDynamicArray.add(5);
        System.out.println(defaultDynamicArray);
        defaultDynamicArray.clear();
        System.out.println(defaultDynamicArray.isEmpty());
        System.out.println("---------------------------------------");
        DynamicArray dynamicArray = new DynamicArray(4);
        System.out.println(dynamicArray);
        dynamicArray.add(5);
        dynamicArray.add(8);
        dynamicArray.add(35);
        dynamicArray.add(5);
        System.out.println(dynamicArray);
        dynamicArray.add(1,99);
        System.out.println(dynamicArray);
        dynamicArray.add(3,100);
        dynamicArray.shrinkSize();
        System.out.println(dynamicArray);
        dynamicArray.remove(5);
        dynamicArray.set(0, 9);
        System.out.println(dynamicArray);
        System.out.println(dynamicArray.get(2));
        System.out.println(dynamicArray.contains(100));
        int[] array = {9, 8, 100, 35, 5};
        System.out.println(dynamicArray.compare(array));
    }
}
