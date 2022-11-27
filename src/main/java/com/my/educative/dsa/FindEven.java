package com.my.educative.dsa;

public class FindEven {
    
    public static void main(String[] agrs){
        FindEven ef = new FindEven();
        int[] input ={1,2,5,6,7,8};
        int[] result=ef.findEven(input);
        for(int val: result){
            System.out.print(val);
            System.out.print(",");
        }
    }

    public int[] findEven(int[] input){
        
        int size=0;
        for(int i=0;i<input.length;i++){
            if(input[i]%2!=0){
                size++;
            }
        }
        int[] result= new int[size];
        int index=0;    
        for(int i=0;i<input.length;i++){
            if(input[i]%2!=0){
                result[index]=input[i];
                index++;
            }
        }
        return result;
        }
    

}
