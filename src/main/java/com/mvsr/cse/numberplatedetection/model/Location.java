package com.mvsr.cse.numberplatedetection.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@RequiredArgsConstructor
@Entity
@Table(name="location")
@ToString
public class Location  implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private Short locId;
	private String locName;
	private String locAddress;
}
