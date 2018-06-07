public class BasicsTest{
    public static void main(String[] args){
        Basics basic = new Basics();
        basic.oneToTwoFiftyFive();
        basic.odd();
        basic.sum();
        basic.iterate();
        int[] arr = {1,2,3,4,5,6,7};
        basic.max(arr);
        int[] arr = {10,20};
        basic.average(arr);
        basic.oddarray();
        int[] arr3 = {1,2,4,6};
        System.out.println(basic.y(arr3,3));
        int[] arr4 = {1,2,3,4};
        System.out.println(basic.square(arr4));
        int[] arr5 = {1,2,3,4,10};
        System.out.println(basic.eliminate(arr5));
        int[] arr7 = {1,2,3,4};
        System.out.println(basic.maxminaverage(arr7));
        int[] arr6 = {1,2,3,4};
        System.out.println(basic.shift(arr6));

    }
}