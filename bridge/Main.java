public class Main {
    public static abstract class Node<T> {
        public abstract void setData(T data);
    }

    public static class MyNode extends Node<Integer> {
        private Integer data;

        @Override
        public void setData(Integer data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        MyNode mn = new MyNode();
        Node n = mn;
        n.setData("Hello");

        Integer x = (Integer)mn.data;
        System.out.println(x);  
    }
}
