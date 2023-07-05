package sorting;

import java.util.Scanner;

public class BinarySort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number of words");
        int size=s.nextInt();
        System.out.println("enter array of words");
        String arr[]=new String[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextLine();
        }
        for(int j=0;j<size;j++){
            for(int k=0;k<size;k++){
                if(arr[k+1].compareTo(arr[k])<0){
                    String temp=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                }
            }
        }
        System.out.println("array after sorting:");
        for(int i=0;i<size;i++)
            System.out.println(arr[i]+" ");
    }
}
