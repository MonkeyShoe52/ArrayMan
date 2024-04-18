public class DopeData implements DAtaStructure{
    Object[] objects = new Object[100];


int X = 0;


    //Feilds for knowing where to get next
    //Feilds for knowing If there is a space to put

   public boolean put(Object obj) {
        objects[X]= obj;
        X=X+1;

       return false;
   }
    public Object get() {
        if (X < 1) {
            return null;
        }

       Object value = objects[X-1];
        X = X-1;
      return value;
    }
}
