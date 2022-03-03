package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ContainerBookingRequestDto;
import com.example.demo.dto.ContainerBookingResponseDto;
import com.example.demo.dto.ContainerEnquiryRequestDto;
import com.example.demo.dto.ContainerEnquiryResponseDto;
import com.example.demo.service.ContainerService;

@RestController
public class ContainerController {

	@Autowired
	ContainerService containerService;

	@PostMapping(path = "/checkAvailable", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ContainerEnquiryResponseDto> checkContainerAvailablity(
			@RequestBody ContainerEnquiryRequestDto containerEnquiryRequestDto) {
		return ResponseEntity.ok(containerService.checkContainerAvilabilty(containerEnquiryRequestDto));
	}

	@PostMapping(path = "/book", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ContainerBookingResponseDto> bookContainer(
			@RequestBody ContainerBookingRequestDto containerBookingRequestDto) {
		return ResponseEntity.ok(containerService.bookContainer(containerBookingRequestDto));
	}
}