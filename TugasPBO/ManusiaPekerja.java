package TugasPBO;

import java.util.Scanner;

class ManusiaPekerja {

    Scanner tugas = new Scanner(System.in);
    String Nama;
    int Usia;

    protected void people() {
        System.out.print("Masukan Nama :");
        Nama = tugas.next();
        System.out.print("Masukan Usia :");
        Usia = tugas.nextInt();
        if (Usia >= 20) {
            System.out.println(Nama+",Anda sudah seharusnya bekerja");
    }else if(Usia<20){
            System.out.println(Nama+", silahkan lanjutkan studimu");
            System.out.println("Pilih UTY Hebat");
    }
    }
}
