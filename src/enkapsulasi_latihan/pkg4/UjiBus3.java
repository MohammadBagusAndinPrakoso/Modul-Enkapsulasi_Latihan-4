/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi_latihan.pkg4;

/**
 *
 * @author MOKLET1
 */
public class UjiBus3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat objek busMii dari kelas Bus
        Bus3 Bus = new Bus3(5);
        Bus.getpenumpang(17);
        Bus.getpenumpang(24);
        Bus.cetakPenumpang();
        
        //Penambahan penumpang
        Bus.addPenumpang(2); //tambah 2 penumpang
        Bus.cetakPenumpang();
        
        //Penambahan penumpang
        Bus.addPenumpang(2); //tambah 2 penumpang
        Bus.cetakPenumpang();
        
        //Penambahan penumpang
        Bus.addPenumpang(1); //tambah 1 penumpang
        Bus.cetakPenumpang();
        
        //Penambahan penumpang
        Bus.addPenumpang(2); //tambah 2 penumpang
        Bus.cetakPenumpang();
    }
    
}
