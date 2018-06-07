public class PuzzleTest{
    public static void main(String[] args){
        Puzzle p = new Puzzle();
        System.out.println(p.greaterthan10());
        String[] arr = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        System.out.println(p.shuffle(arr));
        System.out.println(p.alphabet());
        System.out.println(p.randint());
        System.out.println(p.randintsort());
        System.out.println(p.randstring());
        System.out.println(p.arrstring());
    }
}