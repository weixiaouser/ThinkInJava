package exceptions;

public class Rethrowing {
    public static void f() throws Exception {
        System.out.println("Originating the exception in f()");
        throw new Exception("thrown from f()");
    }

    public static void g() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Inside g(),e.printStackTrace");
            e.printStackTrace();
            throw e;
        }
    }

    public static void h() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Inside h(),e.printStackTrace()");
            e.printStackTrace(System.out);
            throw (Exception)e.fillInStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            g();
        } catch (Exception e) {
            System.out.println("main:printStackTrace()");
            e.printStackTrace(System.out);
        }
        try {
            h();
        } catch (Exception e) {
            System.out.println("main:printStackTrace()");
            e.printStackTrace();
        }

    }
}/*output:
Originating the exception in f()
Inside g(),e.printStackTrace
main:printStackTrace()
java.lang.Exception: thrown from f()
	at exceptions.Rethrowing.f(Rethrowing.java:6)java.lang.Exception: thrown from f()

	at exceptions.Rethrowing.f(Rethrowing.java:6)
	at exceptions.Rethrowing.g(Rethrowing.java:11)
	at exceptions.Rethrowing.g(Rethrowing.java:11)
	at exceptions.Rethrowing.main(Rethrowing.java:31)
	at exceptions.Rethrowing.main(Rethrowing.java:31)
Originating the exception in f()
java.lang.Exception: thrown from f()
Inside h(),e.printStackTrace()
	at exceptions.Rethrowing.h(Rethrowing.java:25)
java.lang.Exception: thrown from f()
	at exceptions.Rethrowing.main(Rethrowing.java:37)
	at exceptions.Rethrowing.f(Rethrowing.java:6)
	at exceptions.Rethrowing.h(Rethrowing.java:21)
	at exceptions.Rethrowing.main(Rethrowing.java:37)
main:printStackTrace()
*/
