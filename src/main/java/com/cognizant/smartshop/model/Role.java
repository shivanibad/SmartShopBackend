package com.cognizant.smartshop.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ro_id")
	private Integer id;
	
	@Column(name="ro_name")
	private String name;
	
	/*@OneToMany(mappedBy = "role", fetch = FetchType.EAGER)
	private Set<User> userList;*/
    @ManyToMany(mappedBy = "userType",fetch = FetchType.EAGER)
    private Set<User> userList;

	public Role() {
		super();
	}

	public Role(String name, Set<User> userList) {
		super();
		this.name = name;
		this.userList = userList;
	}

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

	public Set<User> getUserList() {
		return userList;
	}

	public void setUserList(Set<User> userList) {
		this.userList = userList;
	}

	
}
