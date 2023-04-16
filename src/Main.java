
public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(3);
        System.out.println(myList.get(1)); // Output: 2
        myList.remove(1);
        System.out.println(myList.size()); // Output: 2
        System.out.println(myList.get(1)); // Output: 3
        System.out.println(myList.size()); // Output:
        System.out.println(myList.index0f(1)); // Output: 0
        System.out.println(myList.contains(3)); // Output: true
        System.out.println(myList.index0f(3)); //Output: 1
        System.out.println(myList.lastIndex0f(3)); //Output: 2
        myList.clear();
        System.out.println(myList.size()); // Output: 0
    }
}