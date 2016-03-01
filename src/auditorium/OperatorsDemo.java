package auditorium;


import javax.swing.*;

public class OperatorsDemo {
    static int[] array;

    public static void main(String[] args) {


        double d = 1.0;

        while(d != 0){
            d = d - 0.1;
            System.out.println("d = " + d);
        }
//        float fl = 1.0f;

        int r = -1;
        long l = r;
        String s = "ddd\"\n\r \\dd";
        System.out.println(s);
        char ch = '\'';
        byte a = !true ? -1 : 0;
        a = 1 * 5;
        byte b = (byte) (a + a);
        b <<= 1;

//       /* Scanner scanner = new Scanner(System.in);
////        String inputAsStr = scanner.next();
//
////
//
//        byte bt1 = 4;
//
//        byte bt2 = 5;
//        byte bt3 = (byte)(bt1 + bt1);
//
//        boolean b1 = true;
//        boolean b2 = false;
//        boolean b3 = true;
//        boolean b4 = false;
//
//        if( b1 || b2 && b3 && !b4) System.out.println("kuku");
////        {
////            System.out.println("in If block");
////        }
//        int a = 4;
//        int i = 1;
//        a = a * (++i);
//        System.out.println("a = " + a);
//        System.out.println("i = " + i);*/
//        array = new int[10];
        String inputStr = JOptionPane.showInputDialog("Please input the numbers");

        while (inputStr != null) {
            array = convertToIntArray(inputStr);
            printArray(array);
            inputStr = JOptionPane.showInputDialog("Please input the numbers");
        }
    }

    static int[] convertToIntArray(String inputStr) {
        String[] strElements = inputStr.split(" ");
        array = new int[strElements.length];
        for (int i = 0; i < strElements.length; i++) {
            array[i] = Integer.parseInt(strElements[i]);
        }
        return array;
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }

    static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }


}
