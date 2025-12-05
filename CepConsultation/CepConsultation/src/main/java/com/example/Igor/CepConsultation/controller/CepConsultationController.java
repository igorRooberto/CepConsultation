package com.example.Igor.CepConsultation.controller;

import com.example.Igor.CepConsultation.dto.CepResultDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/CepConsultation")
public class CepConsultationController {

    @GetMapping("/{cep}")
    public CepResultDto CepConsultation(@PathVariable("cep") String cep){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<CepResultDto> resp = restTemplate
                .getForEntity(String.format("https://viacep.com.br/ws/%s/json/", cep), CepResultDto.class);

        return resp.getBody();
    }



}
