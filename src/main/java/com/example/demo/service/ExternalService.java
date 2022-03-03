package com.example.demo.service;

import com.example.demo.dto.ContainerEnquiryRequestDto;
import com.example.demo.dto.ContainerSpaceResponseDto;

public interface ExternalService {
	public ContainerSpaceResponseDto findContainerSpace(ContainerEnquiryRequestDto containerEnquiryDto);	
}
