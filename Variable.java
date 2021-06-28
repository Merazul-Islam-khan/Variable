/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprojectgoogler;

/**
 *
 * @author User
 */
public class Variable {
    static public boolean porkiya(int numa,int numb){
        boolean answer=numa>numb;
        return answer;   
}
    public static void main(String args[]){
        short First_Number;
        int Secend_Number;
        float MyFloat_Number;
        boolean statmante = porkiya(4,3);
        int [] cards={2,5,6,4,7,8,9};
                     //0 1 2 3 4 5 6  index in array
        char [] words={'a','b','c','d'};
        
        First_Number=10;
        Secend_Number=5;
        MyFloat_Number=10;
       
        
        
        int result=First_Number%3; //last number in Divied
        
        float  result_two=MyFloat_Number/3;
        System.out.println(First_Number);
        
        System.out.println(Secend_Number);
        
        System.out.println(result);
        
        System.out.println(result_two);
        
        System.out.println(cards[4]);// cards index number 7 print
        
        System.out.println(words[2]);// char index number print
        
        System.out.println(statmante);
        
        
        
        
    }
    
}
