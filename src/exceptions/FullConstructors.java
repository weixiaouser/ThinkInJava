package exceptions;

//exceptions /FullConstructors

class MyException extends Exception{
    public MyException(){}
    public MyException(String msg){
        super(msg);
    }
}
public class FullConstructors {
    public static void f() throws MyException {
        System.out.println("Throwing MyException form f()");
        throw new MyException();
    }
    public static void g() throws MyException {
        System.out.println("Throwing MyException from g()");
        throw new MyException("Originated in g()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
    }/*output:
Throwing MyException form f()
exceptions.MyException
	at exceptions.FullConstructors.f(FullConstructors.java:14)
	at exceptions.FullConstructors.main(FullConstructors.java:23)
Throwing MyException from g()
exceptions.MyException: Originated in g()
	at exceptions.FullConstructors.g(FullConstructors.java:18)
	at exceptions.FullConstructors.main(FullConstructors.java:28)
    */
}
