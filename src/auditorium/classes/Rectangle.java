package auditorium.classes;//package auditorium_old.classes;
//
//import auditorium_old.figure.Figure;
//
//import java.awt.*;
//
//public class Rectangle extends Figure {
//    public static final int X_COORDINATE  = 3;
//    public static final int Y_COORDINATE  = 3;
//
//    public static final int DEFAULT_WIDTH  = 5;
//    public static final int DEFAULT_HEIGHT = 5;
//
//    private int x;
//    private int y;
//    private int width;
//    private int height;
//
//    public Rectangle() {
//        this(X_COORDINATE, Y_COORDINATE, DEFAULT_WIDTH, DEFAULT_HEIGHT);
////        super();
//    }
//
//    public Rectangle(int x, int y, int width, int height) {
//      super(x, y, width, height);
//    }
//
//// TODO later we must implement draw method together, but now You can implement the isBelong method for Rectangle
////    @Override
//    public boolean isBelong(int x, int y) {
//        return false;  //ToDo    complete implementation     <--   H O M E W O R K
//    }
//
////    @Override
//    public void draw(Graphics g) {
//        // TODO: This method we will implement during the lesson in auditorium_old
//    }
//
//
//    public void printOnConsole() {
//        StringBuilder buffer = new StringBuilder(getX()-1);
//        for (int i = 1; i < getX(); i++) {
//            buffer.append(' ');
//        }
//        String horizontalIndent = buffer.toString();
////        for (int i = 1; i < getX(); i++) {
////            horizontalIndent += ' ';
////        }
//        for (int i = 1; i < getY() - 1; i++) {
//            System.out.println();
//        }
//
//        printFilledRow(horizontalIndent);
//        for (int i = 2; i < getHeight(); i++) {
//            printNotFilledRow(horizontalIndent);
//        }
//        printFilledRow(horizontalIndent);
//    }
//
//    private void printFilledRow (String indent) {
//        System.out.print(indent);
//        for (int j = 0; j < getWidth(); j++) {
//            System.out.print("* ");
//        }
//        System.out.println();
//    }
//
//    private void printNotFilledRow(String indent) {
//        System.out.print(indent);
//        System.out.print("* ");
//        for (int j = 2; j < getWidth(); j++) {
//            System.out.print("  ");
//        }
//        System.out.print("*");
//        System.out.println();
//    }
//
////    @Override
////    public String toString() {
////        return "Rectangle{" +
////                "x=" + x +
////                ", y=" + y +
////                ", width=" + width +
////                ", height=" + height +
////                '}';
////    }
//}
//
