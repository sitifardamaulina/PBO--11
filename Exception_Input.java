
package Tugas11;

import java.util.Scanner;
public class Exception_Input {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean lanjutkanInput = true;
        
        do{
            
            try{
                
                System.out.print("Masukan integer : ");
                int angka = input.nextInt();
                
                System.out.println("Angka yang dimasukkan " + angka);
                lanjutkanInput = false;
                
            }catch(InputMismatchException ex){
                System.out.println("Coba lagi masukan angka");
                input.nextLine();
            }
        }while(lanjutkanInput);
        
    }
    
}
