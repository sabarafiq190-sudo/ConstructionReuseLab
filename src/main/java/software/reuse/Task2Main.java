package software.reuse;

public class Task2Main {
    public static void main(String[] args) {
        DataBox<String> nameBox = new DataBox<>("Ali Khan");
        DataBox<Integer> idBox = new DataBox<>(101);

        System.out.println("Student Name: " + nameBox.getValue());
        System.out.println("Student ID: " + idBox.getValue());

        // Compile-time safety demo:
        // DataBox<Integer> wrongBox = new DataBox<>("Ali");   // COMPILE ERROR
        // Integer x = nameBox.getValue();                     // COMPILE ERROR
    }
}
