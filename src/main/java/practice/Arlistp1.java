package practice;
import java.util.*;


public class Arlistp1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        System.out.println(sumOf(list));
        System.out.println(removeEven(list));
        removeEvenInPlace(list);
        System.out.println(list);

    }
    private static int sumOf(List<Integer> list){
        int ans = 0;
        for(int value : list){
            ans += value;
        }
        return ans;
    }
    private static List<Integer> removeEven(List<Integer> list){
        List<Integer> ans = new ArrayList<>();
        for(int value : list){
            if(value % 2 != 0){
                ans.add(value);
            }
        }
        return ans;

    }
    private static void removeEvenInPlace(List<Integer> list){
        for(int i = list.size() - 1 ; i >= 0 ; i--){
            if(list.get(i) % 2  == 0){
                list.remove(i);
            }
        }
    }




}
