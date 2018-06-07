public class Bucky{
    private String girlName;

    public Bucky(String name){
        girlName=name;
    }
    public void setName(String name){
        girlName=name;
    }
    public String getName(){
        return girlName;
    }
    public void saying(){
        System.out.println("Your first gf was " + getName());
    }
}