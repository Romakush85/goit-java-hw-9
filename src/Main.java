

public class Main {
    public static void main(String[] args) {
        // ARRAYLIST
//        String[] arr1 = new String[] {"Pig", "Dog", null, "Cow", "Frog", "Bee", "Cat"};
//        MyArrayList list1 = new MyArrayList(arr1);
//        list1.add("Tiger");
//        list1.add("Lion");
//        list1.add("Goose");
//        list1.add("Mouse");
//        list1.add("Rat");
//        list1.add("Hamster");
//        System.out.println(list1);
//        System.out.println(list1.get(3));
//        System.out.println(list1.size());
//        list1.remove(5);
//        System.out.println(list1);
//        System.out.println(list1.size());
//        System.out.println(list1.get(0));
//        System.out.println(list1.get(4));
//        list1.clear();
//        System.out.println(list1);

        // LINKEDLIST
//        MyLinkedList<String> students = new MyLinkedList<>();
//        students.add("Petrenko");
//        students.add("Stepanenko");
//        students.add("Sydorenko");
//        students.add("Shikhman");
//        students.add("Ivanenko");
//        System.out.println(students.toString());
//        System.out.println(students.size());
//        System.out.println(students.get(3));
//        students.remove(4);
//        System.out.println(students.toString());
//        System.out.println(students.size());
//        students.remove(0);
//        System.out.println(students.toString());
//        System.out.println(students.size());
//        students.clear();
//        System.out.println(students.toString());
//        System.out.println(students.size());

        // QUEUE

        MyQueue<String> borrowers = new MyQueue<>();
        borrowers.add("Yushchenko");
        borrowers.add("Yanukovych");
        borrowers.add("Poroshenko");
        borrowers.add("Zelensky");
        borrowers.add("Kuchma");
        borrowers.add("Kravchuk");
        System.out.println(borrowers.toString());
        System.out.println(borrowers.size());
        System.out.println(borrowers.poll());
        System.out.println(borrowers.toString());
        System.out.println(borrowers.peek());

    }
}
