/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl6.zad3;

/**
 *
 * @author Tomasz
 */
public class Complex {

    double re, im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public static double Modul(Complex c) {
        return Math.sqrt(Math.pow(c.re, 2) + Math.pow(c.im, 2));
    }

    public static Complex Sprzezenie(Complex c) {
        return new Complex(c.re, (c.im) * (-1));
    }

    public static Complex SumaAlg(Complex c1, Complex c2) {
        return new Complex(c1.re + c2.re, c1.im + c2.im);
    }

    public static Complex RoznicaAlg(Complex c1, Complex c2) {
        return new Complex(c1.re - c2.re, c1.im - c2.im);
    }

    public static Complex IloczynAlg(Complex c1, Complex c2) {
        return new Complex((c1.re * c2.re) - (c1.im * c2.im), (c1.re * c2.im) + (c1.im * c2.re));
    }

    public static Complex IlorazAlg(Complex c1, Complex c2) {
        return new Complex((c1.re * c2.re + c1.im * c2.im) / (c2.re * c2.re + c2.im * c2.im), (c1.im * c2.re - c1.re * c2.im) / (c2.re * c2.re + c2.im * c2.im));
    }

    @Override
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }

    public static void main(String[] args) {
        Complex z1 = new Complex(4, 2);
        Complex z2 = new Complex(8, -3);
        Complex c1 = new Complex(7, 6);
        Complex c2 = new Complex(4, -4);

        System.out.println("Modul liczby " + z1 + " = " + Modul(z1));
        System.out.println("Sprzezenie liczby " + z2 + " = " + Sprzezenie(z2));
        System.out.println("Suma:\t " + c1 + " + " + c2 + " = " + SumaAlg(c1, c2));
        System.out.println("Roznica:\t " + c1 + " + " + c2 + " = " + RoznicaAlg(c1, c2));
        System.out.println("Iloczyn:\t " + c1 + " + " + c2 + " = " + IloczynAlg(c1, c2));
        System.out.println("Iloraz:\t " + c1 + " + " + c2 + " = " + IlorazAlg(c1, c2));
    }
}
