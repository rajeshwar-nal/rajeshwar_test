package com.example.demo.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.demo.utils.ContainerTypeEnum;
import com.example.demo.utils.EnumValidator;

public class ContainerBookingRequestDto {

	@EnumValidator(enumClazz = ContainerTypeEnum.class)
	private ContainerTypeEnum containerType;
	private Integer containerSize;
	@Size(min = 5, max = 20)
	private String Southampton;
	@Size(min = 5, max = 20)
	private String destination;
	@NotNull
	@Min(1)
	@Max(100)
	private Integer quantity;
	private LocalDateTime timestamp;

	public ContainerTypeEnum getContainerType() {
		return containerType;
	}

	public void setContainerType(ContainerTypeEnum containerType) {
		this.containerType = containerType;
	}

	public Integer getContainerSize() {
		return containerSize;
	}

	public void setContainerSize(Integer containerSize) {
		this.containerSize = containerSize;
	}

	public String getSouthampton() {
		return Southampton;
	}

	public void setSouthampton(String southampton) {
		Southampton = southampton;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

}
