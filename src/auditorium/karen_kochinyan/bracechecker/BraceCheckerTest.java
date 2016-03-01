package auditorium.karen_kochinyan.bracechecker;

import auditorium.bracechecker.BraceChecker;

public class BraceCheckerTest {

    public static void main(String[] args) {
        String text  = "asasa{{{{";
        parseTest(text);
    }

    public static void parseTest(String text) {
     //   boolean isOk = true;
        BraceChecker braceChecker = new BraceChecker();
       // braceChecker.parse("asas{}}");

        boolean isOk = true;
        // Here You have to write different test cases, for instance:
        //  opened '(' but not closed
        //  opened '{' but not closed
        //  opened '[' but not closed
        //
        //  opened '(' but closed other type's bracket
        //  opened '(' but closed other type's bracket
        //  opened '(' but closed other type's bracket
        //
        //  closed ')' but not opened
        //  closed '}' but not opened
        //  closed ']' but not opened


//        if (isOk) {
//            System.out.println("'parseTest' is passed with 'No Error'");
//        }else {
//            System.err.println(braceChecker.getMessage());
//        }

        new BraceCheckerFrame();
    }
}
