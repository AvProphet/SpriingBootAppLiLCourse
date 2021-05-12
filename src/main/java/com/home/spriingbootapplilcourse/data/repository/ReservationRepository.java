package com.home.spriingbootapplilcourse.data.repository;

import com.home.spriingbootapplilcourse.data.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    List<Reservation> findReservationByResDate(Date date);
}
