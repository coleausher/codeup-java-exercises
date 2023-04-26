import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsLecture {

    public static void main(String[] args) {
        // just values
        ArrayList<Integer> numbers = new ArrayList<>();

        // .add method I WANT TO ADD AN ELEMENT -------------------
        numbers.add(7); // adding an element
        System.out.println(numbers);

        numbers.add(20); // adding an element
        System.out.println(numbers);

        numbers.add(1,5); // adding an element
        System.out.println(numbers);

        numbers.add(0, 3); // adding an element
        System.out.println(numbers);

        //.size method I WANT TO GET THE SIZE OF THE LIST ------------------
        System.out.println(numbers.size()); // returns the size of the list '4'

        //.get method I WANT TO GET THE INDEX OF THE ELEMENT -------------------
        // .get() method returns the element at the specified index
        System.out.println(numbers.get(0)); // returns 3 because index '0' is the first element in the list

        //.indexOf method opposite of .get() method I WANT TO GET THE INDEX OF THE ELEMENT -------------------
        System.out.println(numbers.indexOf(20)); // returns the spot in the array list '3'
        System.out.println(numbers.indexOf(1)); // returns -1 if the element is not found

        //.remove method I WANT TO REMOVE THE INDEX OF THE ELEMENT -----------------
        System.out.println(numbers.remove(0)); // returns the array list without the 3 at the specified index of '0'
        System.out.println(numbers);

        //.contains method I WANT TO CHECK IF THE ELEMENT IS IN THE LIST -------------------
        System.out.println(numbers.contains(20)); // returns true because 20 is in the list
        System.out.println(numbers.contains(1)); // returns false because 1 is not in the list

        //lastIndexOf method opposite of.contains() method I WANT TO GET THE INDEX OF THE ELEMENT -------------------
        System.out.println(numbers.lastIndexOf(20)); // returns the spot in the array list '3'
        System.out.println(numbers.lastIndexOf(1)); // returns -1 if the element is not found

        //.isEmpty method I WANT TO CHECK IF THE LIST IS EMPTY -------------------
        System.out.println(numbers.isEmpty()); // returns false because the list is not empty
        System.out.println(numbers);

        //.remove method I WANT TO REMOVE IT -------------------
        System.out.println(numbers.remove(0)); // returns the array list without the 3 at the specified index of '0'
        System.out.println(numbers);

        //.clear method I WANT TO CLEAR THE LIST -------------------
        numbers.clear(); // removes all the elements from the list
        System.out.println(numbers);

// new arraylist for Strings
        ArrayList<String> roasts = new ArrayList<>();

        System.out.println(roasts.isEmpty()); // returns true because the list is empty

        roasts.add("light"); // adding an element
        roasts.add("medium"); // adding an element
        roasts.add("medium"); // adding an element
        roasts.add("dark"); // adding an element

        System.out.println(roasts.isEmpty()); // returns false because the list is not empty anymore
        System.out.println(roasts);

        //.contains method returns boolean if that element exists in collection I WANT TO CHECK IF THE ELEMENT IS IN THE LIST -------------------
        System.out.println(roasts.contains("light")); // returns true because 'light' is in the list
        System.out.println(roasts.contains("medium")); // returns true because 'medium' is in the list
        System.out.println(roasts.contains("dark")); // returns true because 'dark' is in the list
        System.out.println(roasts.contains("sunny")); // returns false because 'sunny' is not in the list

        //.lastIndexOf method will return the lastIndexOf the occurrence of the element I WANT TO GET THE INDEX OF THE ELEMENT -------------------

        System.out.println(roasts.lastIndexOf("medium")); // returns 1 because 'medium' is the last element in the list

        //.remove method has two variants can specify the index of an element we want to be removed or if we dont it will remove the first index occurrence of that element
        System.out.println(roasts.remove("light")); // returns the array list without the 'light' element at the specified index of '0'
       System.out.println(roasts);

       roasts.remove(1); // removes the element at the specified index of ''
        System.out.println(roasts);

// ---------------------------------- HASHMAPS key & value pairs --------------------------------
//               key     value
        HashMap<String, String> username = new HashMap<>();

        // .put method I WANT TO ADD AN ELEMENT -------------------
        username.put("John", "Doe"); // adding an element
        username.put("Jay", "Jayarredondo"); // adding an element
        username.put("Jacob", "Wells"); // adding an element
        username.put("Britanny", "Usher"); // adding an element


        // {Britanny=Usher, Jay=Jayarredondo, John=Doe, Jacob=Wells}
        System.out.println(username);

        // .get method looks for the key and returns the value of that key
        System.out.println(username.get("Jacob")); // returns 'Wells' because 'Jacob' is the key in hashmap
        System.out.println(username.get("Jay")); // returns 'Jayarredondo' because 'Jay' is the key in hashmap

        // .getOrDefault method looks for the key and returns the value of that key -- if the key does not exist it returns the default value
        System.out.println(username.getOrDefault("Cole", "codeup")); // returns 'default'

        //.containsKey method returns boolean if that element exists in collection
        System.out.println(username.containsKey("Britanny")); // returns true because 'Britanny' is in the list of keys
        System.out.println(username.containsKey("caleb")); // returns false because 'caleb' is not in the list of keys

        //.containsValue method returns boolean if that element exists in collection
        System.out.println(username.containsValue("Usher")); // returns true because 'Usher' is in the list of values
        System.out.println(username.containsValue("codeup")); // returns false because 'codeup' is not in the list of values


//new hashmap
//               key      value
        HashMap<Integer, String> usernames = new HashMap<>();

        usernames.put(1, "John"); // adding an element with .put() method
        usernames.put(2, "Jay");
        usernames.put(3, "Jacob");
        usernames.put(4, "Britanny");
// {1=John, 2=Jay, 3=Jacob, 4=Britanny}
        System.out.println(usernames);


        //. putIfAbsent method has two variants can specify the index of an element we want to be added or if we
        System.out.println(usernames.putIfAbsent(5, "cole")); // returns true because 'cole' or '5' is not in the HashMap, so it will be added

        //.remove method removes the element at the specified by the key of '1'
        System.out.println(usernames.remove(1, "John")); // removes the element at the specified by the key of '1'

        //.replace method replaces the element at the specified by the key of '2' with 'Cole'
        System.out.println(usernames.replace(2, "Cole")); // replaces the element at the specified by the key of '2' with 'Cole'
        System.out.println(usernames);

        //.clear method clears the hashmap
        usernames.clear(); // clears the hashmap
        System.out.println(usernames.isEmpty()); // returns true






    }
}
