public class spilt {
    public static void main(String[] args) {
        String text = "hello";
        String splited = "";

        for (int i = 0; i < text.length(); i++) {
            if (i != text.length() - 1) {
                splited = splited + text.charAt(i) + '.';
            }
            else {
                splited = splited + text.charAt(i);
            }
        }
        System.out.println(splited);

    }
}