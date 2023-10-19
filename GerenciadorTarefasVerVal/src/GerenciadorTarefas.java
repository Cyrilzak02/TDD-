
import java.util.ArrayList;
import java.util.Scanner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


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
                case 2:
                    listarTarefa();
                    break;
                case 3:
                    removerTarefa();
                    break;
                case 4:
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

    private void listarTarefa(){
        System.out.println("++++++++++++++++++++++++");
        System.out.println("Lista Tarefas: ");
        if(tarefas.size() == 0 ){
            System.out.println("Lista de tarefas vazia.");
        }
        else{
        for (int i =0 ; i<tarefas.size() ; i++){
            System.out.println(i+" - "+tarefas.get(i));

        }}
        System.out.println("++++++++++++++++++++++++");

    }

    private void removerTarefa(){
        listarTarefa();
        int c =0;
        if(tarefas.size() ==0 ){
            System.out.println("Nao podemos deletar, a lista de tarefa esta vazia.");
        }
        else {
            while (true) {
                System.out.println("Digite o numero da tarefa que voce deseja excluir: ");
                Scanner scanner = new Scanner(System.in);
                c = scanner.nextInt();

                if (c >= tarefas.size() || c < 0) {
                    System.out.println("Numero da tarefa invalida. Tenta de novo.");
                    continue;
                }
                tarefas.remove(c);
                break;
            }
            System.out.println("Tarefa n " + c + " removida com sucesso");
        }


    }

}
