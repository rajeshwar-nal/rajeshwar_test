package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Booking;

public interface BookingRepository extends MongoRepository<Booking, String> {

	}