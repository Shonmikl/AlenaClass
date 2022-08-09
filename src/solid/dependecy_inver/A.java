package solid.dependecy_inver;

public class A {
    private final B b;

    public A(B b) {
        this.b = b;
    }

    public void someMethod() {
        b.someMethodOfB();
    }
}

class B {
    private final C c;

    public B(C c) {
        this.c = c;
    }

    void someMethodOfB() {
        System.out.println("Hello world");
    }
}

interface C {
}