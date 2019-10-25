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