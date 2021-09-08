package application;

import entidade.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo ret = new Retangulo();

        System.out.println("Digite a largura e a altura do retangulo: ");
        ret.largura = sc.nextDouble();
        ret.altura = sc.nextDouble();

        System.out.printf("Area =%.2f%n", ret.area());
        System.out.printf("Perimetro =%.2f%n", ret.perimetro());
        System.out.printf("Diagonal =%.2f%n", ret.diagonal());
        sc.close();

    }
}
