package com.company;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URL;
import java.security.ProtectionDomain;
@SpringBootApplication
public class Main {
    public static void main(String[] args) throws Exception {
        /*Server server = new Server(8189);
        ProtectionDomain domain = Main.class.getProtectionDomain();
        URL location = domain.getCodeSource().getLocation();
        WebAppContext webapp = new WebAppContext();
        webapp.setContextPath("/");
        webapp.setWar(location.toExternalForm());
        server.setHandler(webapp);
        server.start();
        server.join();*/
        SpringApplication.run(Main.class, args);

    }
}
