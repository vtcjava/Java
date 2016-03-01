package auditorium.classes.arrays;


public class ArrayDemo {

    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle(1, 2);

        String s = "ku";
        String s2 = "ku";
        System.out.println("s == s2 : " + (s == s2));
        String [] array = new String [10];

        array[0] = "ku";
        array[1] = "ku";
        array[2] = new String("ku");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("array[0] == array[1]" + (array[0] == array[1]));
        System.out.println("array[2] == array[1]" + (array[2] == array[1]));
    }
}
