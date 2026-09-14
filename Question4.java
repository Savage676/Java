public class Question4 {
    public static void main(String[] args) {
        int height = 2;
        int width = 3;
        int depth = 4;

        int perimeter = 4 * height + 4 * width + 4 * depth;
        int volume = height * width * depth;

        System.out.println(
                "The box is " + height + " cm high, "
                        + width + " cm wide and "
                        + depth + " cm deep"
        );

        System.out.println("The volume of the box is " + volume + " cms cubed");
        System.out.println("The perimeter of the box is " + perimeter + " cms");
    }
}
