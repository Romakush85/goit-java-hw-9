import java.util.HashMap;

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

/*        MyQueue<String> borrowers = new MyQueue<>();
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
        System.out.println(borrowers.peek());*/

        // STACK
//        MyStack<String> methods = new MyStack<>();
//        methods.push("mainMethod");
//        methods.push("method1");
//        methods.push("innerMethod1");
//        methods.push("innerMethod2");
//        methods.push("innerMethod3");
//        System.out.println(methods.toString());
//        System.out.println(methods.size());
//        methods.remove(1);
//        System.out.println(methods.toString());
//        System.out.println(methods.size());
//        System.out.println(methods.peek());
//        System.out.println(methods.pop());
//        System.out.println(methods.toString());
//        System.out.println(methods.size());
//        methods.clear();
//        System.out.println(methods.toString());
//        System.out.println(methods.size());

        // MyHashMap
        MyHashMap<String, String> users = new MyHashMap<>();
        System.out.println(users.size());
        users.put("romakush@gmail.com", "Roma");
        users.put("123321@i.ua", "Troll");
        users.put("hr@goit.ua", "HR");
        users.put("romakush@gmail.com", "Roman Kushnir");
        users.put("put.in@hui.lo", "Vova Pitun");
        users.put("", "Anonymus");
//        users.put(null, "Anonymus");
//        System.out.println(users.size());
//        users.clear();
//        System.out.println(users.size());
//        System.out.println(users.get("hr@goit.ua"));
//        System.out.println(users.get("hr@epam.ua"));
        System.out.println("------------------");
        System.out.println(users.get("put.in@hui.lo"));
        System.out.println(users.get(""));
        System.out.println(users.size());
        System.out.println("------------------");
        users.remove("put.in@hui.lo");
        System.out.println(users.size());
        System.out.println(users.get("put.in@hui.lo"));
        users.put("CEO@goit.ua", "CEO");
        users.put("mentor1@goit.ua", "Mentor1");
        users.put("mentor2@goit.ua", "Mentor2");
        users.put("mentor3@goit.ua", "Mentor3");
        users.put("mentor4@goit.ua", "Mentor4");
        users.put("mentor5@goit.ua", "Mentor5");
        users.put("mentor6@goit.ua", "Mentor6");
        users.put("mentor7@goit.ua", "Mentor7");
        users.put("mentor8@goit.ua", "Mentor8");
        users.put("mentor9@goit.ua", "Mentor9");
        users.put("mentor10@goit.ua", "Mentor10");
        users.put("mentor11@goit.ua", "Mentor11");
        users.put("mentor12@goit.ua", "Mentor12");
        users.put("mentor13@goit.ua", "Mentor13");
        System.out.println(users.size());

    }
}
