import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ElementsRemoval{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the Array !!! ");
        int size=scanner.nextInt();

        System.out.println("Enter the Array Elements !!!");
        Integer[] array=new Integer[size];
        for(int i=0;i<size;i++){
            array[i]=scanner.nextInt();
        }

        int cost=findCost(array,size);
        System.out.println(cost);
    }

    private static int findCost(Integer[] array, int size) {
        int cost=0;
        Arrays.sort(array, Collections.reverseOrder());
//        System.out.println(Arrays.toString(array));
        for(int i=0;i<size;i++){
            cost+=array[i]*(i+1);
        }
        return cost;
    }
}