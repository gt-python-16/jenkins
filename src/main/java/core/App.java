package core;
 
public class App {
       public static void main(String[] args) {
    System.out.println("Debit Card and Bad Credit is anagram? - " + Anagram.validate("Debit Card", "Bad Credit"));
    System.out.println("ab and ba is anagram? - " + Anagram.validate("ab", "ba"));
    System.out.println("School and Class is anagram? - " + Anagram.validate("School", "Class"));
       }
}

