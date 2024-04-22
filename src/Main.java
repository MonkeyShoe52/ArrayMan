// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DopeData myData = new DopeData();

        PutterGetter1 tester1 = new PutterGetter1(myData);
        PutterGetter2 tester2 = new PutterGetter2(myData);

        Thread testing1 = new Thread(tester1);
        Thread testing2 = new Thread(tester2);

        testing1.start();
        testing2.start();
    }
}

