package sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number of elements:");
        int num=s.nextInt();
        int arr[]=new int[num];
        System.out.println("enter the elements");
        for(int i=0;i<num;i++){
            arr[i]=s.nextInt();
        }
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j+1]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Array after sorting");
        for(int values:arr){
            System.out.println(values+" ");

        }
    }
}
