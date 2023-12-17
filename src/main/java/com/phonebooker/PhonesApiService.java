package com.phonebooker;


import com.phonebooker.jpa.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class PhonesApiService implements com.phonebooker.openapi.api.PhonesApiDelegate {

    @Autowired
    private PhoneRepository phoneRepository;

    @Autowired
    private PhoneMapper phoneMapper;

    @Override
    public ResponseEntity<List<com.phonebooker.openapi.model.Phone>> listPhones(Integer limit) {
        List<com.phonebooker.openapi.model.Phone> phones = phoneRepository.findAll()
                .stream().map(phoneMapper::mapToApiModel).toList();




        return new ResponseEntity<>(phones, HttpStatus.OK);
    }

}

