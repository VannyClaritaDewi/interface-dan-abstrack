package com.company;

public class Kambing extends Hewan implements Herbivora{
    public String suara, warna;

    public Kambing(String nama, int kaki, String suara, String warna) {
        super(nama, kaki);
        this.suara = suara;
        this.warna = warna;
    }

    @Override
    public void displayMakan() {
        System.out.println ("Jenis\t\t : " + Herbivora.jenis );
        System.out.println("Makanan\t\t : " + Herbivora.makanan );
    }

    @Override
    public void tampilan() {
        System.out.println("Nama\t\t: " + nama+ "\nJumlah Kaki\t : " + kaki);
        displayMakan();
        System.out.println("Suara\t\t : " + suara +"\nWarna\t\t : " + warna);
    }
}

