package com.movie.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class Users
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long uId;
	
	@Column(name="u_name", nullable=false)
	private String uName;
	
	
	@Column(name="u_Number" , nullable= false)
	private Long uNumber;
	
	public Users()
	{
		
	}
	public Users(Long uId, String uName, Long uNumber) 
	{
		super();
		this.uId = uId;
		this.uName = uName;
		this.uNumber = uNumber;
	}
	public Long getuId() {
		return uId;
	}
	public void setuId(Long uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public Long getuNumber() {
		return uNumber;
	}
	public void setuNumber(Long uNumber) {
		this.uNumber = uNumber;
	}
}
