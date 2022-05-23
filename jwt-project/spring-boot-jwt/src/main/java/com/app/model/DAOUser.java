package com.app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "userauthjwt")
@Data
public class DAOUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userid;
	@Column
	private String username;
	@Column
	@JsonIgnore
	private String password;


}