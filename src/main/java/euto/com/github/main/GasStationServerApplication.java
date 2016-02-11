package euto.com.github.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
@ComponentScan({"euto.com.github.stationdata",
        "euto.com.github.gasdata",
        "euto.com.github.main",
        "euto.com.github.configuration"})
public class GasStationServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(GasStationServerApplication.class, args);
    }
}