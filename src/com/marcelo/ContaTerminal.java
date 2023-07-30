package com.marcelo;

import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a conta: ");
        int numero = scanner.nextInt();
        
        System.out.println("Digite a agencia: ");
        String agencia = scanner.next();
        
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scanner.next();
        
        System.out.println("Digite o saldo: ");
        Double saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nomeCompleto+" , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta "+ numero +" e seu saldo "+ saldo+" já está disponível para saque.");
    }
    
}