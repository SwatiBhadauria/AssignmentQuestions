public class SorcererSpell {
    public static void main(String[] args) {
        String input = "abc";
        System.out.println(reverse(input));
    }
    public static String reverse(String s) {
        if (s.isEmpty()) return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
