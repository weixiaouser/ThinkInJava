package initialization;

/**
 * Created by weixiao on 2018/7/16.
 * initialization/TerminationCondition.java
 * Using finalize() to detect an object that
 * hasn't been properly cleaned up.
 */
class Book {
    boolean checkedOut = false;

    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    protected void finalize() {
        if (checkedOut) {
            System.out.println("Error: checked out ");
        }
    }

}

public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        novel.checkIn();
        new Book(true);
        System.gc();
    }

}/* Output
Error: checked out
*/
