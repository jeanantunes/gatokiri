package com.gatokiri;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

	@Column(unique = true)
    private String name;

	@Column(unique = true)
    private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}