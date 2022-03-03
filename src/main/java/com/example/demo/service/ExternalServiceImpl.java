package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.ContainerEnquiryRequestDto;
import com.example.demo.dto.ContainerSpaceResponseDto;

@Service
public class ExternalServiceImpl implements ExternalService {

	@Override
	public ContainerSpaceResponseDto findContainerSpace(ContainerEnquiryRequestDto containerEnquiryDto) {
		ContainerSpaceResponseDto responseDto = new ContainerSpaceResponseDto();
		responseDto.setAvailableSpace(6);
		return responseDto;
	}

}
