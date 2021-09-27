import java.util.*;


// Modifying the set to SortedSet

public class FindDups {

    static final Comparator<String> Ignore_case_order = new Comparator<String>() {
        public int compare(String str1, String str2) {
            return str1.compareToIgnoreCase(str2);
        }
    };

    public static void main(String[] args) {
        
        SortedSet<String> str = new TreeSet<String>(Ignore_case_order);
        for (String a : args) {
            str.add(a);
        }
        System.out.println(str.size() + " Distinct words: " + str);
    }
}