
package Tugas11;

public class Exception_Array {

    
    public static void main(String[] args) {
        try{
            
            String[] siswa = new String[2];
            siswa[0] = "Rena";
            siswa[1] = "Tiwi";
            siswa[2] = "Fikri";
            siswa[3] = "Taufiq";
            siswa[4] = "Fauzi";
        }catch(ArrayIndexOutOfBoundsException ex){
            
            System.out.println("Data Array Yang Ingin Dikeluarkan Tidak "); 
        }
    }
    
}
