package com.example.demo.service;

import com.example.demo.dto.ContainerBookingRequestDto;
import com.example.demo.dto.ContainerBookingResponseDto;
import com.example.demo.dto.ContainerEnquiryRequestDto;
import com.example.demo.dto.ContainerEnquiryResponseDto;

public interface ContainerService {
	public ContainerEnquiryResponseDto checkContainerAvilabilty(ContainerEnquiryRequestDto containerEnquiryDto);

	public ContainerBookingResponseDto bookContainer(ContainerBookingRequestDto containerBookingRequestDto);

}
