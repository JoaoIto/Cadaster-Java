package src.app;

import src.classes.Profile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo ao sistema de login e cadastro de perfis!");

        int menu;
        do {
            System.out.println("Digite 1 para cadastrar\n");
            System.out.println("Digite 2 para fazer login\n");
            System.out.println("Digite 3 para sair do sistema \n");

            menu = scan.nextInt();

            switch (menu){
                case 1 -> {
                    Profile[] profiles = new Profile[5];
                    for(int i = 0; i < profiles.length; i++){
                        System.out.println("Vamos cadastrar um perfil!");

                        System.out.println("Digite seu nome: \n");
                        String nome = scan.next();
                        System.out.println("Digite seu email: \n");
                        String email = scan.next();
                        System.out.println("Crie a senha do perfil: \n");
                        String senha = scan.next();

                        profiles[i] = new Profile(nome, email, senha, i);
                    }
                }
            }
        } while (menu == 1);
    }
}
