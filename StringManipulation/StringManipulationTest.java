public class StringManipulationTest{
    public static void main(String[] args){
        StringManipulation manipulation = new StringManipulation();
        String str = manipulation.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str);

        char letter = 'o';
        Integer a = manipulation.getIndexOrNull("Coding", letter);
        Integer b = manipulation.getIndexOrNull("Hello World", letter);
        Integer c = manipulation.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null

        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer d = manipulation.getIndexOrNull(word, subString);
        Integer e = manipulation.getIndexOrNull(word, notSubString);
        System.out.println(d); // 2
        System.out.println(e); // null

        String words = manipulation.concatSubstring("Hello", 1, 2, "world");
        System.out.println(words); // eworld

    }
}