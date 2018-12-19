package com.parking.learning.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.Generated;

@Entity
@Table(name = "Parking")
public class Parking implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@Basic
	int p_id;

	@Version
	long version;

	@Basic
	int f_id;

	@Basic
	int t_id;

	@Basic
	int occupiedQty;

	@Basic
	Boolean occupied;

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public Boolean getOccupied() {
		return occupied;
	}

	public void setOccupied(Boolean occupied) {
		this.occupied = occupied;
	}

	public int getF_id() {
		return f_id;
	}

	public void setF_id(int f_id) {
		this.f_id = f_id;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public long getVersion() {
		return version;
	}

	public void setVersion(long version) {
		this.version = version;
	}

	public int getOccupiedQty() {
		return occupiedQty;
	}

	public void setOccupiedQty(int occupiedQty) {
		this.occupiedQty = occupiedQty;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
