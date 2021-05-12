package com.home.spriingbootapplilcourse.data.repository;

import com.home.spriingbootapplilcourse.data.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {
}
