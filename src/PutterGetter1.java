public class PutterGetter1 implements Runnable{
    DopeData myData;
    public PutterGetter1(DopeData myData) {this.myData = myData;}



    public void run(){
        DopeData myData = new DopeData();
        for (int i = 500; i < 600; i = i + 1) {
            boolean succcess = myData.put(i);
            while(!succcess) {
                Thread.sleep(100);
                succcess = myData.put(i);
            }
        }
        for (int i = 500; i < 600; i = i + 1) {
            Object data1 = myData.get();
            System.out.println(data1);

        }
           // Object data2 = myData.get();
          //  System.out.println(data2);
CAtch


        }

}
