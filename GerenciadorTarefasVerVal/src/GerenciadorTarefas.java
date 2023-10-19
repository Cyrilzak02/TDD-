import org.junit.Test;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class GerenciadorTarefas {
    private ArrayList<String> tarefas = new ArrayList<String >();
    private Scanner scanner = new Scanner((System.in));


    public void exibirMenu() {
        while (true) {
            System.out.println(" \n---- Gerenciador de Tarefas ----");
            System.out.println("1- Adicionar tarefa");
            System.out.println("2- Listar tarefas");
            System.out.println("3- Excluir tarefa");
            System.out.println("4- Sair");
            System.out.println("Escolha uma opção: ");

            int opcaoEscolhida = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoEscolhida){
                case 1:
                    adicionarTarefa();
                    break;

            }

        }
    }

    private void adicionarTarefa() {
        System.out.println("Digite o nome e o horário da tarefa a ser adicionada: ");
        String novaTarefa = scanner.nextLine();
        tarefas.add(novaTarefa);
        System.out.println("Tarefa adicionada com êxito.");
    }
}
