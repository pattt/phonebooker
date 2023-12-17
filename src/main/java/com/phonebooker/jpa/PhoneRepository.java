package com.phonebooker.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
public interface PhoneRepository extends JpaRepository<PhoneEntity, Long> {

}

