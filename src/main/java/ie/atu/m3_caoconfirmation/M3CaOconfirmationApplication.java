package ie.atu.m3_caoconfirmation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class M3CaOconfirmationApplication {

    public static void main(String[] args) {
        SpringApplication.run(M3CaOconfirmationApplication.class, args);
    }

}
