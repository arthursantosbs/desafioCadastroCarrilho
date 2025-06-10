package src.model;

import src.view.Formulario;
import src.view.MenuInicial;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static <or> void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Formulario formulario = new Formulario();
        MenuInicial menu = new MenuInicial();
        String caminhoArquivo = "formulario.txt";
        Integer op = 0;
        boolean flag = true;
        formulario.lerFormulario(caminhoArquivo);
        System.out.println("--------------------------------------");

        try {
            while (flag) {

                menu.menuInicial();
                System.out.println("Escolha uma opção: ");
                op = sc.nextInt();
                if (op <= 0) {
                    flag = true;
                } else if (op > 6) {
                    flag = true;
                } else {
                    switch (op) {
                        case 1:
                            //System.out.println("[1]Cadastrar um novo pet");
                        case 2:
                            //[2]Alterar os dados do pet cadastrado
                        case 3:
                            //[3]Deletar um pet cadastrado
                        case 4:
                            //[4]Listar todos os pets cadastrados
                        case 5:
                            //[5]Listar pets por algum critério (idade, nome, raça)
                        case 6:
                            // sair

                    }
                    flag = false;// flag usada após a opção ser confirmada
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Você digitou um caracter, error:" + e.getMessage());
            //mensagem de erro, caso tenha digitado uma letra ou caractere espercial
        }
    }
}
