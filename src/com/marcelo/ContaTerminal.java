package com.marcelo;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        boolean restart;
        do {
            Scanner scanner = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
            restart = false;
            try {
                System.out.println("Digite a conta: ");
                int numero = scanner.nextInt();

                System.out.println("Digite a agencia: ");
                String agencia = scanner.next();

                System.out.println("Digite seu nome completo: ");
                String nomeCompleto = scanner.next();

                System.out.println("Digite o saldo: ");
                double saldo = scanner.nextDouble();

                System.out.println("Olá " + nomeCompleto + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

            } catch (InputMismatchException e) {
                System.out.println("Utilize números inteiros para a conta, alfanumérico para agencia, e decimal (x.x) para saldo");
                restart = true;
            }
        } while (restart);

    }
}