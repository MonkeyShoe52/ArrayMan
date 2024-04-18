// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
     public static void main(String[] args) {
          DopeData myData = new DopeData();
          for (int i = 500; i < 600; i = i + 1) {
               myData.put(i);
               //Object data1 = myData.get();
              // System.out.println(data1);

          }

          for (int i = 0; i < 100; i = i + 1) {
               Object data1 = myData.get();
               System.out.println(data1);

          }
     }
}
