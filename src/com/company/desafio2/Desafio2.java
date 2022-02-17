package com.company.desafio2;

import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {

        Scanner write = new Scanner(System.in);

        System.out.println("Insira uma senha observando os seguintes critérios: " + "\n" +
                "* Conter no mínimo 6 caracteres." + "\n" +
                "* Conter no mínimo 1 digito." + "\n" +
                "* Conter pelo menos 1 letra em minúsculo." + "\n" +
                "* Conter no mínimo 1 letra em maiúsculo." + "\n" +
                "* Conter no mínimo 1 caracter especial: (!@#$%^&*()-+)."
        );

        System.out.print("Digite: ");
        String password = write.nextLine();

        ValidatePassword(password);
        System.out.println("Registro realizado com sucesso!");

        write.close();
    }

    public static void ValidatePassword(String password) {

        int caracteresValidos = 0;

        if (password.length() < 6) {
            caracteresValidos = 6 - password.length();
        } else {

            if (!password.matches("(.*)[0-9](.*)")) {
                caracteresValidos++;
            }
            if (!password.matches("(.*)[a-z](.*)")) {
                caracteresValidos++;
            }
            if (!password.matches("(.*)[A-Z](.*)")) {
                caracteresValidos++;
            }
            if (!password.matches("(.*)[!@#$%^&*()-+](.*)")) {
                caracteresValidos++;
            }
        }

        System.out.printf("\n Caracteres restantes para sua senha para atender aos requisitos de segurança: %s", caracteresValidos);

        System.out.println(" ");

        if (caracteresValidos > 0) {
            Menu();
        }
    }
}