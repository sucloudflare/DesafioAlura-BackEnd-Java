package conversor;

public class SelecionadorMoeda {

    public static String selecionarMoeda(int opcao) {
        return switch (opcao) {
            case 1 -> "USD";
            case 2 -> "BRL";
            case 3 -> "ARS";
            case 4 -> "BOB";
            case 5 -> "CLP";
            case 6 -> "COP";
            default -> "USD";
        };
    }
}
