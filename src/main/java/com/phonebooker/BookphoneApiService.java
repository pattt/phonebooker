package com.phonebooker;


import com.phonebooker.jpa.BookingEntity;
import com.phonebooker.jpa.BookphoneRepository;
import com.phonebooker.openapi.model.BookPhone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookphoneApiService implements com.phonebooker.openapi.api.BookphoneApiDelegate {

    @Autowired
    private BookphoneRepository bookphoneRepository;

    public ResponseEntity<Void> bookPhone(BookPhone bookPhone) {
        BookingEntity bookingEntity =
                new BookingEntity(bookPhone.getId().intValue(), bookPhone.getTestername());
        bookphoneRepository.save(bookingEntity);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public ResponseEntity<Void> unbookPhone(BookPhone bookPhone) {
        bookphoneRepository.deleteById(bookPhone.getId());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}

