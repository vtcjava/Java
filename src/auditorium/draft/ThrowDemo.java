package auditorium.draft;

// Demonstrate throw.
class ThrowDemo {

    static void demoproc() {

        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside demoproc.");
            throw e; // rethrow the exception
        } finally {
//            throw new RuntimeException("Runtime >>>>>>>> ");
        }
    }

    public static void main(String args[]) {
        int [] a;


        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Recaught: " + e);
        } catch (RuntimeException e) {
            System.out.println("test " + e.getMessage());
        }
    }

}