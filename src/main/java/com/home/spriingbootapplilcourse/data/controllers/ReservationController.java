//package com.home.spriingbootapplilcourse.data.controllers;
//
//import com.home.spriingbootapplilcourse.data.entity.Reservation;
//import com.home.spriingbootapplilcourse.data.repository.ReservationRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/reservations")
//public class ReservationController {
//    @Autowired
//    ReservationRepository reservationRepository;
//
//    @GetMapping
//    public Iterable<Reservation> getReservations() {
//        return this.reservationRepository.findAll();
//    }
//}
