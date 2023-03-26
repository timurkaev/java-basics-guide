public class Strings {
    public static void main(String[] args) {
        String str1 = new String("Hello ");
        String str2 = "Hello";
        String str3 = str1 + str2; // string concatenation
        String str4 = str2.substring(0, 2); // "Ja"

        String str5 = "Java";
        String str6 = "java";

        String str7 = str6.toUpperCase(); // JAVA
        String str8 = str6.toLowerCase(); // java

        int strLen = ("Hello").length(); // 5

        System.out.println(str1.equals(str2)); // string comparison
        System.out.println(str5.equalsIgnoreCase(str6)); // case-ignoring string comparison
        System.out.println(str3);
    }
}
