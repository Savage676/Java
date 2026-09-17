import java.util.Scanner;

public class CountA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("请输入一个字符串：");
        String text = scan.nextLine();

        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println("字母 a 出现了 " + count + " 次");

        scan.close();
    }
}
