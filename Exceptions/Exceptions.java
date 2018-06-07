import java.util.ArrayList;
class Exceptions{
    public ArrayList ex(){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        for(int i = 0; i < myList.size(); i++) {
            try{
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("it worked");
            }
            catch(Exception e){
                System.out.println("it didnt work");
            }
        }
        return myList;
    }
}