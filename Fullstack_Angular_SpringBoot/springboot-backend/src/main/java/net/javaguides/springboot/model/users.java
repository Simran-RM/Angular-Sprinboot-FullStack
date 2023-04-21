package net.javaguides.springboot.model;

import javax.persistence.*;


@Entity
@Table(name="users")



public class users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "address")
	String address;
	
	@Column(name = "city")
	String city;
	
	@Column(name = "state")
    String state;
	
	@Column(name = "email")
    String email;
	
	@Column(name = "telephone")
    String telephone;
	
	@Column(name = "dos")
    String dos;
	
	@Column(name = "review")
    String review;
	
	@Column(name = "liked")
    String liked;
	
	@Column(name = "recommendation")
    String recommendation;
	
	@Column(name = "interest")
    String interest;
	
	@Column(name = "url")
    String url;
    
	@Column(name = "zip")
    Integer zip;
	
	@Column(name = "feedback")
    String feedback;
    
    public users() {
    	
    	
    }
    
    
    
    public users(String name, String address, String city, String state, String email, String telephone, String dos,
			String review, String liked, String recommendation, String interest, String url, Integer zip, String feedback) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.email = email;
		this.telephone = telephone;
		this.dos = dos;
		this.review = review;
		this.liked = liked;
		this.recommendation = recommendation;
		this.interest = interest;
		this.url = url;
		this.zip = zip;
		this.feedback= feedback;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getDos() {
		return dos;
	}
	public void setDos(String dos) {
		this.dos = dos;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public String getLiked() {
		return liked;
	}
	public void setLiked(String liked) {
		this.liked = liked;
	}
	public String getRecommendation() {
		return recommendation;
	}
	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getZip() {
		return zip;
	}
	public void setZip(Integer zip) {
		this.zip = zip;
	}
	public String getfeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	

}
