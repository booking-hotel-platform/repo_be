package com.booking_hotel.api.data.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RequestMapping("/api/data")
@RestController
public class DataController {

    @GetMapping()
    public String fetchData() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:3000/"; // URL của website bạn muốn lấy dữ liệu
        String response = restTemplate.getForObject(url, String.class);
        return response; // Trả về dữ liệu nhận được
    }
}

