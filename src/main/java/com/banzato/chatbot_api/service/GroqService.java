package com.banzato.chatbot_api.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class GroqService {

    @Value("${groq.api.key}")
    private String apiKey;

    public String chat(String mensagem) {
        String url = "https://api.groq.com/openai/v1/chat/completions";

        String body = """
            {
              "model": "llama-3.3-70b-versatile",
              "messages": [
                {
                  "role": "system",
                  "content": "Você é um assistente virtual prestativo. Responda sempre em português de forma clara e objetiva."
                },
                {
                  "role": "user",
                  "content": "%s"
                }
              ]
            }
            """.formatted(mensagem.replace("\"", "\\\""));

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + apiKey)
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String respBody = response.body();
            System.out.println("Resposta Groq: " + respBody);

            int start = respBody.indexOf("\"content\":\"") + 11;
            int end = respBody.indexOf("\"", start);
            return respBody.substring(start, end);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return "Desculpe, ocorreu um erro ao processar sua mensagem.";
        }
    }
}