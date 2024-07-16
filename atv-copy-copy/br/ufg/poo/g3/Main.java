package br.ufg.poo.g3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua matrícula:");
        String matricula = scanner.nextLine();

        System.out.println("Digite seu curso:");
        String curso = scanner.nextLine();

        System.out.println("Digite seu email:");
        String email = scanner.nextLine();

        Usuario usuario = new Usuario(nome, matricula, curso, email);
        usuario.login();

        System.out.println("Bem-vindo, " + usuario.getNome() + "!");
        System.out.println("Matrícula: " + usuario.getMatricula());
        System.out.println("Curso: " + usuario.getCurso());

        usuario.logout();
        scanner.close();
    }
}
