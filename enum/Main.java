public enum Main {
    FOO {
        public void foo(){
            System.out.println("foo");
        }
    };

    public abstract void foo();

    public static void main(String[] args) {
        System.out.println("Hello world.");
    }    
}
