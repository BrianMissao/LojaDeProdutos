import java.util.Scanner;

public class DizValorDaCompra {
    private static double precoDoItem2 = 4.50;
    private static double precoDoItem3 = 5.0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int codigoDoItem = obterDadosDoItem("Digite o código do item");
        int quantidadeDoItem = obterDadosDoItem("Agora, digite a quantidade do item:");
        calcularEImprimirValorDaCompra(codigoDoItem, quantidadeDoItem);
    }

    private static void calcularEImprimirValorDaCompra(int codigoDoItem, int quantidadeDoItem) {
        double valorTotal;
        switch (codigoDoItem) {
            case 2:
                valorTotal = quantidadeDoItem * precoDoItem2;
                break;
            case 3:
                valorTotal = quantidadeDoItem * precoDoItem3;
                break;
            default:
                valorTotal = 0.0;
        }
        System.out.printf("Código do item: %d%nQuantidade do item: %d%nValor total a pagar: %.2f", codigoDoItem, quantidadeDoItem, valorTotal);
    }

    private static int obterDadosDoItem(String mensagemAoUsuario) {
        System.out.println(mensagemAoUsuario);
        return scanner.nextInt();
    }
}
