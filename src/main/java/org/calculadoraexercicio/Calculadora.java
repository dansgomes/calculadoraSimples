package org.calculadoraexercicio;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        //Vamos criar um programa que solicita ao usuário que insira dois números e uma operação (adição, subtração, multiplicação ou divisão) e, em seguida, realiza o cálculo com base na operação escolhida. Vamos utilizar a classe Scanner, um método apenas para realizar o calculo, tudo pode ser feito dentro da mesma classe, não precisa criar outra, não precisa instancias, porém, entretanto, caso vc queira quebrar em clases, isso vai ser um bonus

        Scanner scan = new Scanner(System.in);

        //public static double realizarCalculo ( double num1, double num2, int operacao){

        System.out.println("Bem-vindo à Calculadora Simples!");

        System.out.println("Digite o primeiro número");
        double num1 = scan.nextDouble();

        System.out.println("Digite o segundo número");
        double num2 = scan.nextDouble();

        System.out.println("Escolha a operação");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("Digite o número da operação desejada: ");
        int operacao = scan.nextInt();

        switch (operacao) {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                if (num1 > 0 && num2 > 0) {
                    System.out.println(num1 / num2);
                    break;
                } else {
                    System.out.println("É impossivel fazer divisões com 0");
                    break;
                }
            default:
                System.out.println("Não é uma operação válida");
        }
    }
}
