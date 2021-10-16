package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int mat, fizik , kimya, turkce, tarih, music;
        Scanner input = new Scanner(System.in);

        System.out.print("Mat Notunuzu Giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        tarih = input.nextInt();

        System.out.print("Music Notunuzu Giriniz: ");
        music = input.nextInt();

        int dersler = (mat + fizik + kimya + turkce + tarih + music);
        double ortalama = dersler/6;
        System.out.println("Ortalamanız: " + ortalama);
        System.out.println(ortalama > 60? "Sınıfı Geçti":"Sınıfta Kaldı");
    }
}
