/* 3. Дописать простейший веб-сервер, который начали писать на вебинаре,
чтобы он отправлял в качестве ответа на запрос содержимлое файла из HTTP-запроса.
Подробная инструкция по этому заданию была в конце занятия */

package com.gb.Lesson012.WebServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Server {

    public static String getResponseContent(File file) throws FileNotFoundException {
        String responseContent;
        if (!file.isFile()) {
            responseContent = "Unfortunately, this page was not found!";
        }
        else {
            StringBuilder builder = new StringBuilder();
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                builder.append(scanner.nextLine());
            }
            responseContent = builder.toString();
        }
        return responseContent;
    }

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Server has been started...");

            while (true) {
                System.out.println("Waiting for a client...");
                Socket socket = serverSocket.accept();
                System.out.println("Client has been connected...");
                BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                        socket.getInputStream(), StandardCharsets.UTF_8));

                PrintWriter writer = new PrintWriter(
                    socket.getOutputStream());

                while (!reader.ready()) ;

                System.out.println("Server has started reading...");
                String requestedPage = "";
                while (reader.ready()) {
                    String header = reader.readLine();
                    if (header.split(" ")[0].equals("GET")) {
                        requestedPage = header.split(" ")[1];
                    }
                    System.out.println(header);
                }
                System.out.println("Server has finished reading...");

                File file = new File(new File(".") + requestedPage);
                String content = getResponseContent(file);

                int responseCode;
                String response;
                if (!file.exists()) {
                    responseCode = 404;
                    response = "Not Found";
                }
                else {
                    responseCode = 200;
                    response = "OK";
                }

                System.out.println("Server is responding...");
                writer.println("HTTP/1.1" + " " + responseCode + " " + response);
                writer.println("Content-Type: text/html; charset=utf-8");
                writer.println();
                writer.println(content);
                writer.flush();
                System.out.println("Server has responded...");

                socket.close();
                System.out.println("Socket has been closed...");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
