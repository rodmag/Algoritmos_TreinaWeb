package api.consultacep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConsultaCep {

    public static void main(String[] args) {
        try {
            // Cria um BufferedReader para ler a entrada do usuário a partir do console
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // Solicita ao usuário que insira um CEP
            System.out.println("Digite o CEP para consulta:");
            String cep = reader.readLine();

            // Constrói a URL para consulta na API do ViaCEP com base no CEP fornecido
            String url = "https://viacep.com.br/ws/" + cep + "/json/";

            // Cria uma conexão HTTP para a URL fornecida
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            // Define o método de requisição como GET
            connection.setRequestMethod("GET");

            // Obtém o código de resposta da requisição HTTP
            int responseCode = connection.getResponseCode();

            // Verifica se a requisição foi bem-sucedida (código 200)
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Cria um BufferedReader para ler a resposta da API
                BufferedReader inputReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                // Cria uma StringBuilder para armazenar a resposta da API
                StringBuilder response = new StringBuilder();
                String line;

                // Lê cada linha da resposta e adiciona à StringBuilder
                while ((line = inputReader.readLine()) != null) {
                    response.append(line);
                }

                // Fecha o BufferedReader
                inputReader.close();

                // Imprime a resposta da API
                System.out.println("Resposta da API:");
                System.out.println(response.toString());
            } else {
                // Se a requisição não foi bem-sucedida, imprime uma mensagem de erro
                System.out.println("Erro ao consultar o CEP. Código de resposta: " + responseCode);
            }

            // Fecha a conexão HTTP
            connection.disconnect();
        } catch (IOException e) {
            // Captura e imprime quaisquer exceções de E/S (por exemplo, erro de conexão)
            e.printStackTrace();
        }
    }
}
