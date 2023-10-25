import mypkg.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Integer[] t = {1, 2, 3};
        Stack<Integer> s = new Stack<Integer>(t);
        System.out.println(s);
    }
}
