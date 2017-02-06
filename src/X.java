/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class X {
    public static void  main(String [] arg){
       java.util.Scanner lectura = new java.util.Scanner(System.in);
        int d[] = new int[5];
        for (int i = 0; i < 5; i++) {
             System.out.println("Ingrese " + i);
             d[i]= lectura.nextInt();
        }
       
        
        int r = suma(d);
        System.out.println(r);
               
          
}
    
public static int suma(int[] vector){
              
              int r=0;
              for(int i: vector)
                  r+= i;
                          
              return r;
          }


}
