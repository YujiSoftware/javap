import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new String[]{"Hello", "world"}).mapToInt(s -> s.length()).sum());
    }
}
