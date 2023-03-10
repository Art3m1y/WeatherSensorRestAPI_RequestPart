package org.example;

import org.springframework.http.RequestEntity;
import org.springframework.web.client.RestTemplate;

import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        RestTemplate restTemplate = new RestTemplate();

        String urlRegistrationSensor = "http://localhost:7379/sensors/registration";
        String urlAddMeasurement = "http://localhost:7379/measurements/add";

        Sensor sensor = new Sensor("New sensor");

        String responseCreate = restTemplate.postForObject(urlRegistrationSensor, sensor, String.class);

        System.out.println(responseCreate);

        Set<String> responseAdd = new HashSet<>();

        for (int i = 0; i < 1000; i++) {
            Measurement measurement = new Measurement(new Sensor("New sensor"), generateValue(), generateRaining());
            responseAdd.add(restTemplate.postForObject(urlAddMeasurement, measurement, String.class));
        }

        System.out.println(responseAdd);

    }

    public static double generateValue() {
        Random r = new Random();
        return -100 + r.nextDouble() * (200);
    }

    public static boolean generateRaining() {
        Random r = new Random();
        return r.nextBoolean();
    }
}
