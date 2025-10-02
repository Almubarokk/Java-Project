/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author USER
 */
public class NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
      //Inisialisasi Data  
      String nama = "Muhammad Azzam Almubarok";
      int nim = 2251003;
      double uts = 78.5;
      double uas = 85.0;
      
      //Perhitungan Nilai Akhir
      double nilai_akhir;
      nilai_akhir = uts*0.4 + uas*0.6;
      nilai_akhir = (uas >95) ? (nilai_akhir + 2) : nilai_akhir;
      nilai_akhir = (uts <40 && uas <40) ? 0 : nilai_akhir;
      
      //Penentuan Grade
      String grade;
      grade = (nilai_akhir >= 85 && nilai_akhir <= 100) ? "A" :
              (nilai_akhir >= 70 && nilai_akhir <= 84) ? "B" :
              (nilai_akhir >= 55 && nilai_akhir <= 69) ? "C" :
              (nilai_akhir >= 40 && nilai_akhir <= 54) ? "D" :
              (nilai_akhir >= 0 && nilai_akhir <= 39) ? "E" : "Error";
      
      //Status Kelulusan
      boolean lulus;
      lulus = (nilai_akhir >= 55) ? true : false;
      
        //Output Program
        System.out.println("Nama    : " + nama);
        System.out.println("NIM    : " + nim);
        System.out.println("UTS    : " + uts);
        System.out.println("UAS    : " + uas);
        System.out.println("-------------------------");
        System.out.println("Nilai akhir : " + nilai_akhir);
        System.out.println("Grade      : " + grade);
        System.out.println("Lulus?     : " + lulus);
    }
    
}
