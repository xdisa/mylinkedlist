public class Test {
    public static void main(String[] args) {
        MyLinkedList test = new MyLinkedList();
        test.add(1);
        test.add(4);
        test.add(18);
        test.add(167);

        System.out.println(test);
        System.out.println(test.get(2));
        test.remove(1);
        System.out.println(test);
    }
}
