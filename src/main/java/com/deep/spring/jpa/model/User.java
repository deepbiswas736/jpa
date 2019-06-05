package com.deep.spring.jpa.model;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "User")
@Getter @Setter
public class User {
	
	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<Address> getAddress() {
		return Address;
	}

	public void setAddress(List<Address> address) {
		Address = address;
	}

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private Long userID;
	
	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "EMAIL_ADDRESS")
	private String email;
	
	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "AGE")
	private Integer age;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="ADDRESS", joinColumns={@JoinColumn(referencedColumnName="USER_ID")}
    , inverseJoinColumns={@JoinColumn(referencedColumnName="ADDRESS_ID")})
	private List<Address> Address;

	public User(String userName, String email, String firstName, String lastName, Integer age) {
		super();
		this.userName = userName;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	
}
