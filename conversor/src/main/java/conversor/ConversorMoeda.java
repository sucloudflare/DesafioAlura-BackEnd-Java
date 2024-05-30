package conversor;

import java.util.Map;

public class ConversorMoeda {

    private static final Map<String, Double> taxasDeCambio = CarregadorTaxas.getTaxasDeCambio();

    public static double converterMoeda(double valor, String moedaOrigem, String moedaDestino) {
        double taxaOrigem = taxasDeCambio.get(moedaOrigem);
        double taxaDestino = taxasDeCambio.get(moedaDestino);
        return valor * (taxaDestino / taxaOrigem);
    }
}
