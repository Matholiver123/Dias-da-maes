import java.util.Scanner;

public class SistemaHomenagem {

    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {

        System.out.println("=================================");
        System.out.println("   HOMENAGEM DIA DAS MÃES ");
        System.out.println("=================================");

        System.out.print("\nDigite o nome da sua mãe: ");
        String nomeMae = scanner.nextLine();

        Mae mae = new Mae(nomeMae);

        System.out.println("\nEscolha um presente:");
        System.out.println("1 - Flores");
        System.out.println("2 - Chocolate");
        System.out.println("3 - Perfume");
        System.out.println("4 - Cartão");
        System.out.println("5 - Abraço ");

        System.out.print("\nOpção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        Presente presente;

        switch (opcao) {

            case 1:
                presente = new Presente("Flores");
                break;

            case 2:
                presente = new Presente("Chocolate");
                break;

            case 3:
                presente = new Presente("Perfume");
                break;

            case 4:
                presente = new Presente("Cartão");
                break;

            case 5:
                presente = new Presente("Abraço ");
                break;

            default:
                presente = new Presente("Abraço ");
        }

        System.out.print("\nDigite sua mensagem: ");
        String texto = scanner.nextLine();

        Mensagem mensagem = new Mensagem();

        System.out.println(
                mensagem.gerarMensagem(mae, presente, texto)
        );

        System.out.println("\n=================================");
        System.out.println(" Obrigado por usar o sistema");
        

        scanner.close();
    }
}