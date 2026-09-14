public class Question3 {
    public static void main(String[] args){
        String name1 = "Alice";
        int lab1 = 42;
        int bonus1 = 8;

        String name2 = "Bob";
        int lab2 = 38;
        int bonus2 = 7;

        String name3 = "Charlie";
        int lab3 = 45;
        int bonus3 = 10;

        String name4 = "David";
        int lab4 = 40;
        int bonus4 = 6;

        String name5 = "Emma";
        int lab5 = 47;
        int bonus5 = 9;

        System.out.println("/".repeat(20) + "\\".repeat(20));
        System.out.println("==\t\t\t Student Points\t\t\t  ==");
        System.out.println("\\".repeat(20) + "/".repeat(20));
        System.out.println();
        System.out.println("Name\t\tLab\tBonus\tTotal");
        System.out.println("----\t\t---\t-----\t-----");
        System.out.println(name1 + "\t\t" + lab1 + "\t" + bonus1
                + "\t" + (lab1 + bonus1));

        System.out.println(name2 + "\t\t" + lab2 + "\t" + bonus2
                + "\t" + (lab2 + bonus2));

        System.out.println(name3 + "\t" + lab3 + "\t" + bonus3
                + "\t" + (lab3 + bonus3));

        System.out.println(name4 + "\t\t" + lab4 + "\t" + bonus4
                + "\t" + (lab4 + bonus4));

        System.out.println(name5 + "\t\t" + lab5 + "\t" + bonus5
                + "\t" + (lab5 + bonus5));

    }
}
