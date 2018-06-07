import java.util.ArrayList;
class Basics{
    public void oneToTwoFiftyFive(){
        for(int i = 1; i < 256; i++){
            System.out.println(i);
        }
    }
    public void odd(){
        for(int i = 1; i < 256; i++){
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
    }
    public void sum(){
        int sum = 0;
        for(int i = 1; i < 256; i++){
            sum += i;
            System.out.println("New Number: " + i);
            System.out.println("Sum: " + sum);
        }
    }
    public void iterate(){
        int arr[] = {1,3,5,7,9,13};
        for (int i: arr){
            System.out.println(i);
        }
    }
    public void max(int[] arr){
        int max = arr[0];
        for(int i : arr){
            if(i > max){
                max = i;
            }
        }
        System.out.println(max);
    }
    public void average(int[] arr){
        double sum = 0;
        for(double num: arr){
            sum += num;
        }
        double average = sum/arr.length;
        System.out.println(average);
    }
    public void oddarray(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 1; i < 256; i++){
            if(i % 2 == 1){
                arr.add(i);
        }
            }
        System.out.println(arr);
    }
    public int y(int[] arr, int Y){
        int count = 0;
        for(int i: arr){
            if(Y > i){
                count += 1;
            }
        }
        return count;
    }
    public int[] square(int[] arr){
        for(int num: arr){
            num = num * num;
        }
        return arr;
    }
    public int[] eliminate(int[] arr){
        for(int num: arr){
            if(num < 0){
                num = 0;
            }
        }
        return arr;
        
    }
    public ArrayList maxminaverage(int[] arr){
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        ArrayList<Integer> newarr = new ArrayList<Integer>();
        for(int num: arr){
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
            sum += num;
        }
        int average = sum/arr.length;
        newarr.add(max);
        newarr.add(min);
        newarr.add(average);
        return newarr;
    }
    public int[] shift(int[] arr){
        for(int num: arr){
            arr[num] = arr[num-1];
        }
        return arr;
    }
}