import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {

    public Conversor(String source, String target, double amount) {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/8bcab61cd76cb5cfd66d4275/pair/" + source + "/" + target + "/" + amount);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest req = HttpRequest.newBuilder().uri(direccion).build();
        HttpResponse<String> res = null;
        try {
            res = client.send(req, HttpResponse.BodyHandlers.ofString());
            System.out.println("Conversión hecha con éxito c:");
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        String json = res.body();
        Gson gson = new Gson();
        Divisa div = gson.fromJson(json, Divisa.class);

        System.out.println(amount + " " + source + " a " + target + " == " + div.getConversion_result());
        System.out.println("--------------------------------------");


    }


}