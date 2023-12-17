package com.phonebooker.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookphoneRepository extends JpaRepository<BookingEntity, Long> {

}

