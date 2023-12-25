/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

public class Matematika {
    
    public int pertambahan (int a ,int b){
        int hasil = a+b;
        return hasil ;   
    }
    
    public int pengurangan (int a,int b){
        int hasil = a-b;
        return hasil ;  
    }
     
    public  double pembagian (int a,int b){     
        if (b ==0) {
            return Double.NaN ; 
        }
        return (double)a / b ;
    }
    
    public int perkalian (int a,int b){
        int hasil = a*b;
        return hasil ;
       
    }
    
}