package com.psa.clients.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "region_count")
public class RegionCount {

	@Id
	private int regionId;

	@Column(name = "no_of_male")
	private int noOfMale;

	@Column(name = "no_of_female")
	private int noOfFemale;

	@Column(name = "client_id")
	private int clientId;
	
	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	public int getNoOfMale() {
		return noOfMale;
	}

	public void setNoOfMale(int noOfMale) {
		this.noOfMale = noOfMale;
	}

	public int getNoOfFemale() {
		return noOfFemale;
	}

	public void setNoOfFemale(int noOfFemale) {
		this.noOfFemale = noOfFemale;
	}

}