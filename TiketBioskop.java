
package Tugas11;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.util.Arrays;

public class TiketBioskop {
private int maxAmount = 0;
  private int currentIndex = 0;
  private String[] items = new String[1];

  void setMaxItemAmount(int maxAmount) {
    this.maxAmount = maxAmount;
    this.items = new String[this.maxAmount];
  }

  void addItem(String item) throws ArrayIndexOutOfBoundsException {
    this.items[this.currentIndex] = item;
    this.currentIndex++;
  }

  String[] getItems() {
    return this.items;
  }
  
    
    public static void main(String[] args) {
    TiketBioskop tiketBioskop = new TiketBioskop();
    Scanner jumlahItemHandler = new Scanner(System.in);
    Scanner penjualanInput = new Scanner(System.in);
    Scanner statusInput = new Scanner(System.in);
    boolean addingPenjualan = true;

    System.out.print("Mau beli berapa tiket ? : ");
    int jumlahMaksimalPenjualan = jumlahItemHandler.nextInt();
    tiketBioskop.setMaxItemAmount(jumlahMaksimalPenjualan);
    System.out.println(jumlahMaksimalPenjualan);
    
     try {
      while(addingPenjualan) {
        System.out.println();
        System.out.println("=======================");
        System.out.println("[1] Tambah tiket ");
        System.out.println("[2] Terjual ");
        System.out.println("=======================");
        System.out.println();

        System.out.print("Pilih : ");
        int decision = statusInput.nextInt();
        if (decision == 1) {
          System.out.print("Masukan judul film yang di pilih     : ");
          String penjualan = penjualanInput.nextLine();
          tiketBisokop.addItem(penjualan);

          System.out.println("PENJUALAN DITAMBAHKAN");
        }

        if (decision == 2) {
          addingPenjualan = false;
        }
      }
      
       } catch (InputMismatchException err) {
      System.out.println("Jangan masukan apapun selain angka");
    } catch (ArrayIndexOutOfBoundsException err) {
      System.out.println("Bangku sudah penuh");
    } finally {
      System.out.println("No bangku : " + Arrays.deepToString(tiketBisokop.getItems()));
    }
  }
    }
    
    
    

