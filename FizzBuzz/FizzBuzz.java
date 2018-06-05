public class FizzBuzz {
    public String number(int num) {
        String string = "";
        if (num % 3 == 0 && num % 5 == 0){
            string = "FizzBuzz";
        }
        else if (num % 3 == 0){
            string = "Fizz";
        }
        else if(num % 5 == 0){
            string = "Buzz";
        }
        else{
            return Integer.toString(num);
        }
        return string;
    }
}
