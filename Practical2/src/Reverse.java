public class Reverse {
    public static void main(String[] args){
        String text = "hello";
        String reversed = "";

        for (int i = text.length() - 1;i >= 0;i--){
            reversed = reversed + text.charAt(i);
        }

        System.out.println(reversed);

    }

}
