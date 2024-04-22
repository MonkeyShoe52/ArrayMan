public class PutterGetter2 implements Runnable {
    DopeData myData;
    public PutterGetter2(DopeData myData) {this.myData = myData;}


    public void run() {
        for (int i = 0; i < 100; i = i + 1) {
            myData.put(i);
        }
        for (int i = 0; i < 100; i = i + 1) {
            Object data2 = myData.get();
            System.out.println(data2);


        }
    }
}