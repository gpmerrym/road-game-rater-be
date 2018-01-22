package com.lmig.gfc.roadgameraterbe.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="app_user")
public class User implements UserDetails {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false, unique = true)
	private String username;
	
	@Column(nullable = false)
    private String firstName;

	@Column(nullable = false)
    private String lastName;
	
	@Column(nullable = false)
	private String password;
	
	@OneToMany(mappedBy = "user")//, fetch = FetchType.EAGER)
	private List<RatingInfo> ratingInfo;
	
	@ManyToMany(mappedBy = "user")
	@JsonIgnore
	private List<Place> places;
	
	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Role> roles;

	public User() {
		roles = new ArrayList<Role>();
	}
	
	public User(String firstName, String lastName, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;

    }


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	public boolean canSeeAdmin() {
		return hasRole("ADMIN");
	}

	public boolean canSeeInvoices() {
		return hasRole("ACCOUNTANT") || hasRole("ADMIN");
	}

	public boolean canSeeBillingRecords() {
		return hasRole("CLERK") || hasRole("ADMIN");
	}
	
	public void addRole(String roleName) {
		Role role = new Role();
		role.setName(roleName);
		role.setUser(this);
		roles.add(role);
	}

//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		ArrayList<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//		
//		for (Role role : roles) {
//			String roleName = "ROLE_" + role.getName();
//			SimpleGrantedAuthority authority = new SimpleGrantedAuthority(roleName);
//			authorities.add(authority);
//		}
//		
//		return authorities;
//	}
	
	@Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO Auto-generated method stub
        return null;
    }


	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	
	private boolean hasRole(String roleName) {
		boolean hasRole = false;
		for (Role role : roles) {
			if (role.getName().equals(roleName)) {
				hasRole = true;
				break;
			}
		}
		return hasRole;
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

	public List<RatingInfo> getRatingInfo() {
		return ratingInfo;
	}

	public void setRatingInfo(List<RatingInfo> ratingInfo) {
		this.ratingInfo = ratingInfo;
	}

	public List<Place> getPlaces() {
		return places;
	}

	public void setPlaces(List<Place> places) {
		this.places = places;
	}

//	public List<Place> getPlaces() {
//		return places;
//	}
//
//	public void setPlaces(List<Place> places) {
//		this.places = places;
//	}

	

}


