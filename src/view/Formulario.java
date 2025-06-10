package src.view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Formulario {
 //preciso fazer uma classe que leia um arquivo chamado fomulario.txt e que eu
 //possa instanciar na classe main
    // A classe formulario deve conter métodos para ler o arquivo, processar os dados
    // e retornar informações formatadas ou armazenadas em uma estrutura de dados.

    // Exemplo de método para ler o arquivo:
    public void lerFormulario(String caminhoArquivo) {
        // Implementação da leitura do arquivo fomulario.txt
        // Pode usar BufferedReader, Scanner ou outra abordagem para ler o conteúdo do arquivo
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                // Processar cada linha do arquivo
                System.out.println(linha); // Exemplo: apenas imprimir a linha
            }
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado: " + caminhoArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }

    }


    // Outros métodos podem ser adicionados conforme necessário para manipular os dados lidos
}
