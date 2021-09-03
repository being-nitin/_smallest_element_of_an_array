package com.nitincodes;

public class Main {

    public static void main(String[] args) {
	// java program to find the smallest element in a given arera:
    int arr[] = new int[]{2,5,9,6,4};
    int min = arr[0];
    for(int i=0;i<arr.length;i++){
        if(min<arr[i]){
            arr[i] = min;
        }
    }
        System.out.println("The smallest element in the given array is " +min);
    }
}
