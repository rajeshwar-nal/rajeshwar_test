package com.example.demo.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bookings")
public class Booking {

	@Id
	private String id;
	private String containerType;
	private Integer containerSize;
	private String Southampton;
	private String destination;
	private Integer quantity;
	private LocalDateTime timestamp;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContainerType() {
		return containerType;
	}

	public void setContainerType(String containerType) {
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
