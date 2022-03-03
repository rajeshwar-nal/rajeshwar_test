package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ContainerBookingRequestDto;
import com.example.demo.dto.ContainerBookingResponseDto;
import com.example.demo.dto.ContainerEnquiryRequestDto;
import com.example.demo.dto.ContainerEnquiryResponseDto;
import com.example.demo.dto.ContainerSpaceResponseDto;
import com.example.demo.entity.Booking;
import com.example.demo.repository.BookingRepository;

@Service
public class ContainerServiceImpl implements ContainerService {

	@Autowired
	ExternalService externalService;

	@Autowired
	BookingRepository bookingRepository;

	@Override
	public ContainerEnquiryResponseDto checkContainerAvilabilty(ContainerEnquiryRequestDto containerEnquiryDto) {
		ContainerEnquiryResponseDto responseDto = new ContainerEnquiryResponseDto();
		ContainerSpaceResponseDto response = externalService.findContainerSpace(containerEnquiryDto);
		if (response.getAvailableSpace() != null
				&& response.getAvailableSpace().intValue() > containerEnquiryDto.getQuantity().intValue()) {
			responseDto.setAvailable(true);
		} else {
			responseDto.setAvailable(true);
		}
		return responseDto;
	}

	@Override
	public ContainerBookingResponseDto bookContainer(ContainerBookingRequestDto containerBookingRequestDto) {
		Booking booking = bookingRepository.save(convertDtoToEntity(containerBookingRequestDto));
		ContainerBookingResponseDto responseDto = new ContainerBookingResponseDto();
		responseDto.setBookingRef(booking.getId());
		return responseDto;
	}

	private Booking convertDtoToEntity(ContainerBookingRequestDto containerBookingRequestDto) {
		Booking booking = new Booking();
		booking.setContainerSize(containerBookingRequestDto.getContainerSize());
		booking.setContainerType(containerBookingRequestDto.getContainerType().name());
		booking.setDestination(containerBookingRequestDto.getDestination());
		booking.setQuantity(containerBookingRequestDto.getQuantity());
		booking.setSouthampton(containerBookingRequestDto.getSouthampton());
		booking.setTimestamp(containerBookingRequestDto.getTimestamp());
		return booking;
	}
}
