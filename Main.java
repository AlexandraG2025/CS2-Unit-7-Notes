// Import the ArrayList CLASS
// (from the java.util PACKAGE)
import java.util.ArrayList;

public class Main {

   public static void main(String []args) {
      // DECLARE an ArrayList object
      // <Type> is required, each ArrayList can hold one type of object 
      ArrayList<String> buzzwords;
      
      // DECLARE & CREATE an ArrayList
      // by calling the CONSTRUCTOR method
      ArrayList<String> shoppingList = new ArrayList<String>();

      // ArrayLists can ONLY STORE OBJECTS!!!
      // so for int and double (primitive types),
      // you must use their WRAPPER CLASSES
      // Integer and Double "wrap" primitives into OBJECTS
      // objects have methods, primitives don't.
      ArrayList<Integer> ages = new ArrayList<Integer>();
      ArrayList<Double> testScores = new ArrayList<Double>();
      // Java will handle the "wrapping" for you, 
      // this is called AUTOBOXING

      // Use the .add( obj ) METHOD to populate/fill list
      testScores.add(40.00); // double gets wrapped into Double
      System.out.println(testScores); // prints [40.0]

      // 7.2: ArrayList METHODS
      // after "new", make call to the CONSTRUCTOR 
      ArrayList<String> toBuy = new ArrayList<String>();

      //.add(obj) append object to END OF LIST
      toBuy.add("Salt and Vinigar Chips");
      toBuy.add("Hair products");
      toBuy.add("Dr. Pepper");
      toBuy.add("Matcha");

      System.out.println("SHOPPING LIST; ");
      System.out.println(toBuy);

      //.size() returns int -> number of items 
      System.out.println(toBuy.size() + " things left to buy!");

      //.add(int index, obj) -> "INSTERT" at index

      toBuy.add(0,  "Dinner");
      System.out.println(toBuy);
      // ALSO shift over elements from that index on

      //.get(int index) returns an object of the same type as list holds 
      // like array[int index]
      int lastIndex = toBuy.size() - 1;
      String lastElement = toBuy.get(lastIndex);
      System.out.println(lastElement);
      System.out.println(toBuy.get(3));

      // .set(int index, obj) REPLACES element at that index with the new obj
      // returns the replaced element (same type as the list holds)
      String replacedElement = toBuy.set(1, "Baked Cheetos");
      System.out.println(toBuy);
      // Often, you won't need to store the return output
      toBuy.set(2, "Iced Tea"); // like calling a VOID method
      System.out.println(toBuy);

      // .remove(int index) DELETES element at that index
      // returns the removed object (same type as the list holds)
      String removedElement = toBuy.remove(0);
      System.out.println(toBuy);
      System.out.println("Moved to shopping cart: " + removedElement);
      // ALSO shifts all remaining elements to the left (lower index)
      // Often, you won't need to actually store the removed item
      toBuy.remove(3);
      System.out.println(toBuy);

      // 7.3 Traversing with Loops
      ArrayList<Integer> bingoNumbers = new ArrayList<Integer>();
      bingoNumbers.add(99);
      bingoNumbers.add(29);
      bingoNumbers.add(77);
      bingoNumbers.add(13);

      // ENHANCED FOR-EACH LOOP
      int total = 0;
      int product = 1;
      for (Integer num : bingoNumbers) {
         total = total + num; // same as total += num
         product *= num;
      }
      System.out.println("Sum of bingo numbers: " + total);
      System.out.println("Product of bingo numbers: " + product);
      
      
      // STANDARD FOR LOOP (indexed)
      int sum = 0;
      // DIFFERENT from Arrays;
      // 1. use ArrayList.size() insetead of Array.length
      //2. use ArrayList.get(i) instead of Array[i]
      for (int i=0; i < bingoNumbers.size(); i++) {
         sum = sum + bingoNumbers.get(i);
      }
      System.out.println(sum);

      //WHILE LOOPS (for conditonals, when you don't know exactly how many times to loop)
      ArrayList<String> watchList = new ArrayList<String>();
      watchList.add("The OC");
      watchList.add("Traitors");
      watchList.add("Grey's Anatomy");
      watchList.add("Nobody wants this");

      // Example: search and remove
      boolean found = false; // haven't searched yet
      int index = 0; // need index to use list methods
      String watchedShow = "Grey's Anatomy";
      // loop while current index is still less than list size
      while (index < watchList.size()) {
         if (watchedShow.equals(watchList.get(index))) {
            watchList.remove(index);
            found = true;
         }
         else {
            index++;
         }
      }
      System.out.println(watchList);



   }
}
