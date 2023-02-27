package DZ.Hw03;

public class Main {
    public static void main(String[] args) {
        LinkedList test = new LinkedList();
        test.add(1);
        test.add(2);
        test.add(4);
        test.add( 61);
        test.add(5);
        test.add(5);
        test.add(18);
    
        
        test.print();
        System.out.println("Длина списка " + test.size() + " элементов");
        // test.remove(5);
        // test.print();
        // System.out.println("Длина списка " + test.size() + " элементов");
        // test.add(0);
        // test.print();
        // System.out.println("Длина списка " + test.size() + " элементов");


        for (var element : test) {
            System.out.println(element);
        }
    }
}
