package com.phonebooker.jpa;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Entity
@Table(name = "booking")
@EntityListeners(AuditingEntityListener.class)
public class BookingEntity {

    public BookingEntity() {
    }
    public BookingEntity(Integer phoneId, String testerName) {
        this.phoneId = phoneId;
        this.testerName = testerName;
    }
    @Id
    private Integer phoneId;

    @Column(length = 255)
    private String testerName;

    @CreatedDate
    private LocalDateTime bookingdate;

    public Integer getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(Integer phoneId) {
        this.phoneId = phoneId;
    }

    public String getTesterName() {
        return testerName;
    }

    public void setTesterName(String testerName) {
        this.testerName = testerName;
    }

    public LocalDateTime getBookingdate() {
        return bookingdate;
    }

    public void setBookingdate(LocalDateTime bookingdate) {
        this.bookingdate = bookingdate;
    }
}
