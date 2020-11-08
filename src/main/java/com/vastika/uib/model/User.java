package com.vastika.uib.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Table(name="user_tbl")
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String username;
	private String password;
	private String gender;
	private String hobbies;
	private String nationality;
	private String email;
	@DateTimeFormat(pattern="yyyy-mm-dd")
	@Temporal(TemporalType.DATE)
	private Date dob;
	@Column(name="mobile_no")
	private long mobileNo;
	private String comments;
	
	
	
	

}
