package com.rsfbernardes.hrpayroll.entities;

import java.io.Serializable;

public class Worker implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Double dailyIncome;
	
	public Worker() {
		super();
	}

	public Worker(Long id, String name, Double dailyIncome) {
		super();
		this.id = id;
		this.name = name;
		this.dailyIncome = dailyIncome;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
