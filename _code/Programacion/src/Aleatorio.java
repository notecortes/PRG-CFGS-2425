/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author davpen
 */
public class Aleatorio {

    //declara la constante de gravitación universal
    public static final double G = 6.6743e-11;

    public static void main(String[] args) {
        int n1 = 50;
        int n2 = 30;
        int suma = 0;
        System.out.print((int) ((Math.random() * 26) + 2));
        int direccion = (int) ((Math.random() * 3) + 1);
        System.out.println((direccion == 1) ? " ↑ amunt ↑" : " ↓ avall ↓");
    }
}