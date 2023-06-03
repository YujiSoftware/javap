public class Main {
    private static class Inner {
        private static void foo() {
            System.out.println("foo");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world.");
        Inner.foo();
    }
}
