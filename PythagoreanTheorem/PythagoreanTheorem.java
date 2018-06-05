public class PythagoreanTheorem {
    public double calculateHypotenuse(int legA, int legB) {
        double c = (legA * legA) + (legB * legB);
        double root = Math.sqrt(c);
        return root;
        // the hypotenuse is the side across the right angle. 
        // calculate the value of c given legA and legB
    }
}
