package sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number of words");
        int size=s.nextInt();
        String names[]=new String[size];
        System.out.println("enter array of words");
        for(int i=0;i<size;i++){
            names[i]=s.nextLine();
        }
        insertionSortAsc(names,size);
        System.out.println("car manufacturers listed sort in ascending order(via insertion sort):");
        for(int z=0;z<names.length;z++){
            System.out.println(names[z]);
        }
    }

    public static void insertionSortAsc(String[]names,int n){
        for(int i=1;i<n;i++){
            insert(names,i);
        }
    }

    public static void insert(String[]names,int i){
        String temp=names[i];
        int j=i-1;
        while(j>=0 && names[j].compareToIgnoreCase(temp)>0){
            names[j+1]=names[j];
            j--;
        }
        names[j+1]=temp;

    }
}
