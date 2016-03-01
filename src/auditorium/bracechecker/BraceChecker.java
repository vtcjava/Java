package auditorium.bracechecker;

public class BraceChecker {
    /** TO store the opened brackets in text to be parsed */
    private Stack<BracketItem> stack;

    /** TO store the parsing result */
    private String message = "No errors";

    /** Error symbol index in parsing text */
    private int errorIndex = -1;

    public BraceChecker() {
        stack = new StackImpl<>();
    }

    /**
     * Getter method for message field
     * @return the value of the message
     */
    public String getMessage() {
        return message;
    }

    public int getErrorIndex() {
        return errorIndex;
    }


    /**
     * Parses the text to check correctness of disposition of brackets in text ,
     * and in case of incorrectness initializes following errorIndex,
     * errorIndexInLine and errorLineNumber fields, to indicate where
     * incorrectness occur.
     *
     * @return true if parsing passed without error, otherwise false
     */
    public boolean parse(String text) {
//TODO  add reset method and call here
        char stackTop = 0;
        char ch = 0;
        int numberInLine = 0;
        int lineNumber = 1;
        int i = 0;

        for (; i < text.length(); i++) {
            ch = text.charAt(i);
            numberInLine++;
            switch (ch) {
                case '\n':
                    numberInLine = 0;
                    lineNumber++;
                case '(':
                case '[':
                case '{':
                    stack.push(new BracketItem(ch, numberInLine, lineNumber, i));
                    break;
                case '}':


            }
        }
        return false;

    }

    public static class BracketItem {
        private char value;
        private int numberInLine;
        private int lineNumber;
        private int index;

        public BracketItem(char ch, int numberInLine, int lineNumber, int index) {
            this.value = ch;
            this.numberInLine = numberInLine;
            this.lineNumber = lineNumber;
            this.index = index;
        }

        public char getValue() {
            return value;
        }

        public void setValue(char value) {
            this.value = value;
        }

        public int getNumberInLine() {
            return numberInLine;
        }

        public void setNumberInLine(int numberInLine) {
            this.numberInLine = numberInLine;
        }

        public int getLineNumber() {
            return lineNumber;
        }

        public void setLineNumber(int lineNumber) {
            this.lineNumber = lineNumber;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }
    }

}
