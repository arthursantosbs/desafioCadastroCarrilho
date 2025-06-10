package src.model;

import src.view.Formulario;
import src.view.MenuInicial;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Formulario formulario = new Formulario();
        MenuInicial menu = new MenuInicial();
        String caminhoArquivo = "C:/Users/arthu/IdeaProjects/formulario.txt";
        formulario.lerFormulario(caminhoArquivo);
        System.out.println("--------------------------------------");
        menu.menuInicial();
        System.out.println("Escolha uma opção: ");
        Integer op = sc.nextInt();
        if (op <= 0){

        }
        switch (op){
            case 1:
               //[1]Cadastrar um novo pet
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
    }
}
