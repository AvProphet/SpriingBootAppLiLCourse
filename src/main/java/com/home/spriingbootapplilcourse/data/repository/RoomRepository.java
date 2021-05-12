package com.home.spriingbootapplilcourse.data.repository;

import com.home.spriingbootapplilcourse.data.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
