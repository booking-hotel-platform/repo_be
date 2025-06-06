package com.booking_hotel.api.hotel.repository;

import com.booking_hotel.api.auth.entity.User;
import com.booking_hotel.api.hotel.entity.Hotel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long>, JpaSpecificationExecutor<Hotel> {
    Page<Hotel> findAll(Pageable pageable);
    List<Hotel> findAllByOwner(User owner);
}
