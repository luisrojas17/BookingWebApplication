package com.example.booking.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author josel.rojas
 *
 */
@Entity
@Table(name="ROOM")
public class Room {

	@Id
	@Column(name="ROOM_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="ROOM_NUMBER")
	private String number;
		
	@Column(name="BED_INFO")
	private String info;

	public Room() {
	}

	public Room(long id, String name, String number, String info) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.info = info;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Room [id=");
		builder.append(id);
		builder.append(", number=");
		builder.append(number);
		builder.append(", name=");
		builder.append(name);
		builder.append(", info=");
		builder.append(info);
		builder.append("]");
		return builder.toString();
	}
	
}
