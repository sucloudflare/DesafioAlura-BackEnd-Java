package conversor;

import java.util.Scanner;

public class ConversorMoedas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Load exchange rates from the API
        CarregadorTaxas.carregarTaxasDeCambio().join();

        boolean continuar = true;
        while (continuar) {
            System.out.println("Selecione a moeda de origem:");
            System.out.println("1. USD - Dólar americano");
            System.out.println("2. BRL - Real brasileiro");
            System.out.println("3. ARS - Peso argentino");
            System.out.println("4. BOB - Boliviano boliviano");
            System.out.println("5. CLP - Peso chileno");
            System.out.println("6. COP - Peso colombiano");

            int opcaoOrigem = scanner.nextInt();
            String moedaOrigem = SelecionadorMoeda.selecionarMoeda(opcaoOrigem);

            System.out.println("Selecione a moeda de destino:");
            System.out.println("1. USD - Dólar americano");
            System.out.println("2. BRL - Real brasileiro");
            System.out.println("3. ARS - Peso argentino");
            System.out.println("4. BOB - Boliviano boliviano");
            System.out.println("5. CLP - Peso chileno");
            System.out.println("6. COP - Peso colombiano");

            int opcaoDestino = scanner.nextInt();
            String moedaDestino = SelecionadorMoeda.selecionarMoeda(opcaoDestino);

            System.out.println("Digite o valor a ser convertido:");
            double valor = scanner.nextDouble();

            double valorConvertido = ConversorMoeda.converterMoeda(valor, moedaOrigem, moedaDestino);
            System.out.printf("Valor convertido: %.2f %s%n", valorConvertido, moedaDestino);

            System.out.println("Deseja realizar outra conversão? (s/n)");
            char resposta = scanner.next().charAt(0);
            if (resposta != 's') {
                continuar = false;
            }
        }
        scanner.close();
    }
}
