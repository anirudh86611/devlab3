package com.example;
import java.net.InetAddress;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ServerInfo {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String skadoosh = now.format(formatter);

        String hostname = "Unknown";
        try {
            InetAddress ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
        } catch (Exception e) {
            System.err.println("Error getting hostname: " + e.getMessage());
        }
        System.out.println("Current Time: " + skadoosh);
        System.out.println("Hostname: " + hostname);
    }
}
