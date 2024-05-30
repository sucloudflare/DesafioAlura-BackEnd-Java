package conversor;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class CarregadorTaxas {

    private static final String API_URL = "https://api.exchangerate-api.com/v4/latest/USD";
    private static final Map<String, Double> taxasDeCambio = new HashMap<>();

    public static CompletableFuture<Void> carregarTaxasDeCambio() {
        return HttpClient.newHttpClient()
                .sendAsync(HttpRequest.newBuilder()
                        .uri(URI.create(API_URL))
                        .build(), HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenApply(JsonParser::parseString)
                .thenApply(jsonResponse -> jsonResponse.getAsJsonObject().get("rates").getAsJsonObject())
                .thenAccept(rates -> {
                    taxasDeCambio.put("USD", rates.get("USD").getAsDouble());
                    taxasDeCambio.put("BRL", rates.get("BRL").getAsDouble());
                    taxasDeCambio.put("ARS", rates.get("ARS").getAsDouble());
                    taxasDeCambio.put("BOB", rates.get("BOB").getAsDouble());
                    taxasDeCambio.put("CLP", rates.get("CLP").getAsDouble());
                    taxasDeCambio.put("COP", rates.get("COP").getAsDouble());
                });
    }

    public static Map<String, Double> getTaxasDeCambio() {
        return taxasDeCambio;
    }
}
