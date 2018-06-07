import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
class Puzzle{
    public ArrayList greaterthan10(){
        int[] arr = {3,5,1,2,7,9,8,13,25,32};
        int sum = 0;
        ArrayList<Integer> newarr = new ArrayList<Integer>();
        for(int num: arr){
            sum += num;
            System.out.println(sum);
            if(num > 10){
                newarr.add(num);
            }
        }
        return newarr;
    }
    public ArrayList<Object> shuffle(String[] arr){
        ArrayList<Object> newarr = new ArrayList<Object>();
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
            if(arr[i].length() > 5){
                newarr.add(arr[i]);
            }
        }
        Collections.shuffle(newarr);
        return newarr;
    }
    public ArrayList<Character> alphabet(){
        ArrayList<Character> arr1 = new ArrayList<Character>();
        Collections.addAll(arr1, 'a', 'b', 'c', 'd','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
        Collections.shuffle(arr1);
            if(arr1.get(0) == 'a' || arr1.get(0) == 'e' || arr1.get(0) == 'i' || arr1.get(0) == 'o' || arr1.get(0) == 'u' ){
                System.out.println("ITS A VOWEL");
            }
            else{
                System.out.println(arr1.get(0));
                System.out.println(arr1.get(arr1.size()-1));
        }
        return arr1;
    }
    public ArrayList randint(){
        Random r = new Random();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            arr2.add(r.nextInt(45) + 55);
        }
        return arr2;
    }
    public ArrayList randintsort(){
        Random r = new Random();
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            arr3.add(r.nextInt(45) + 55);
        }
        Collections.sort(arr3);
        return arr3;
    }
    public String randstring(){
        ArrayList<Character> arr4 = new ArrayList<Character>();
        Collections.addAll(arr4, 'a', 'b', 'c', 'd','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
         String word = "";
        for(int i = 0; i < 5; i++){
            Random r = new Random();
            int indx =  r.nextInt(26);
            word += String.valueOf(arr4.get(indx));
        }
        return word;
    }
    public ArrayList<String> arrstring(){
        ArrayList<Character> arr5 = new ArrayList<Character>();
        ArrayList<String> newarr = new ArrayList<String>();
        Collections.addAll(arr5, 'a', 'b', 'c', 'd','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
        for(int i = 0; i < 10; i++){
            String word = "";
            for(int j = 0; j < 5; j++){
                Random r = new Random();
                int indx =  r.nextInt(26);
                word += String.valueOf(arr5.get(indx));
            }
            newarr.add(word);
        }
        return newarr;
    }
}