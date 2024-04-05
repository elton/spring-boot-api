package ink.pwr.springbootapi;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@Slf4j
@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        final Runtime r = Runtime.getRuntime();

        log.info("[APP] Active processors: {}", r.availableProcessors());
        log.info("[APP] Total memory: {}", r.totalMemory());
        log.info("[APP] Free memory: {}", r.freeMemory());
        log.info("[APP] Max memory: {}", r.maxMemory());

        SpringApplication.run(ApiApplication.class, args);
    }

    @PostConstruct
    void started() {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
    }

}
