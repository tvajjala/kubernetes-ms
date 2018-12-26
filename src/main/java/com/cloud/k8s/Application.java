package com.cloud.k8s;

import com.cloud.k8s.response.model.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ThirupathiReddy Vajjala
 */
@SpringBootApplication
@RestController
public class Application {


    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }


    private static OffsetDateTime UNIQUE_ID = OffsetDateTime.now();

    AtomicInteger atomicInteger = new AtomicInteger();

    /**
     * This is to provide unique instanceId with in the cluster
     *
     * @return unique instanceId
     */
    @GetMapping("/instance")
    public ResponseEntity<Response> getInstanceId() {

        Response response = new Response();
        response.setId(DateTimeFormatter.ISO_INSTANT.format(UNIQUE_ID));
        response.setTotalRequests(atomicInteger.incrementAndGet());

        LOGGER.info("Total {} requests served on Instance {} ", response.getTotalRequests(), UNIQUE_ID);
        return ResponseEntity.ok(response);
    }
}

