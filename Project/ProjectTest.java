public class ProjectTest{
    public static void main(String[] args){
        Project p1 = new Project("Aria", "I am a nice guy");
        String result = p1.elevatorPitch();
        String p1Name = p1.getName();
        String p1Description = p1.getDescription();
        System.out.println(p1Name + ":" + p1Description);
        System.out.println(result);
    }
}