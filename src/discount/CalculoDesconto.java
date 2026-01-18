package discount;

public class CalculoDesconto {
    public static void main(String[] args) {
        int quantidadeUva = 2;
        int quantidadeMorango = 3;
        int quantidadeMelao = 2;

        double precoDaUva = 10.0;
        double precoDoMorango = 20.0;
        double precoDoMelao = 8.0;

        double totalUva = precoDaUva * quantidadeUva;
        double totalMorango = precoDoMorango * quantidadeMorango;
        double totalMelao = precoDoMelao * quantidadeMelao;

        double totalBruto =totalUva + totalMorango + totalMelao;  //Cálculo do total bruto

        double percentualDesconto = 5.0;
        double valorDesconto = (percentualDesconto / 100.0) * totalBruto;
        /*Sempre divida o percentual por 100.0. Usamos o .0 para
        garantir que o Java entenda que é um número decimal*/

        double totalComDesconto = totalBruto - valorDesconto;

        System.out.println("--- Resumo da Compra ---");

        System.out.printf("Total Bruto: R$ %.2f %n", totalBruto);
        System.out.printf("Valor do Desconto (5%%): R$ %.2f %n", valorDesconto);
        System.out.printf("Total a Pagar: R$ %.2f %n", totalComDesconto);
        /*
        System.out.println("Total a Pagar: R$ %.2f %n" + totalComDesconto);
        System.out.printf("Valor do Desconto (5%): R$ %.2f %n", valorDesconto);
         */
    }
}

