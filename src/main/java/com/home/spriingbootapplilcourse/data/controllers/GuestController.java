//package com.home.spriingbootapplilcourse.data.controllers;
//
//import com.home.spriingbootapplilcourse.data.entity.Guest;
//import com.home.spriingbootapplilcourse.data.repository.GuestRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/guests")
//public class GuestController {
//    @Autowired
//    GuestRepository guestRepository;
//
//    @GetMapping
//    public Iterable<Guest> getGuests() {
//        return this.guestRepository.findAll();
//    }
//}
