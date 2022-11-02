package http;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        HttpClient httpClient = HttpClient.newBuilder().build();

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://api.postcodes.io/postcodes/EC2Y5AS%22"))
                        .setHeader("Content-type", "application/json")
                        .build();

        HttpResponse<String> httpResponse = null;
        try {
            httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(httpResponse);
        assert httpResponse != null;
        System.out.println("URI: " + httpResponse.uri());
        System.out.println("Headers: " + httpResponse.headers());
        System.out.println(("Status code: " + httpResponse.statusCode()));
        System.out.println();
        Map<String, List<String>> headers = httpResponse.headers().map();
        for (var item : headers.entrySet()) {
            System.out.print(item.getKey() + " ");
            System.out.println(item.getValue());
        }

        System.out.println("Interrogating the response body using simple-json");
        JSONParser jsonParser = new JSONParser();
        try {
            JSONObject jsonObject = (JSONObject)jsonParser.parse(httpResponse.body());
            System.out.println(jsonObject.get("status"));
        } catch (org.json.simple.parser.ParseException e) {
            throw new RuntimeException(e);
        }
    }
}