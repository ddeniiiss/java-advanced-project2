package lesson21.domain;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "role")
	private UserRole role;

	@Column(name = "applicant_data")
	private Applicant applicantData;

	public User() {
		super();
	}

	public User(Long id, String email, String password, UserRole role, Applicant applicantData) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.role = role;
		this.applicantData = applicantData;
	}

	public User(String email, String password, UserRole role, Applicant applicantData) {
		super();
		this.email = email;
		this.password = password;
		this.role = role;
		this.applicantData = applicantData;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	public Applicant getApplicantData() {
		return applicantData;
	}

	public void setApplicantData(Applicant applicantData) {
		this.applicantData = applicantData;
	}

	@Override
	public int hashCode() {
		return Objects.hash(applicantData, email, id, password, role);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(applicantData, other.applicantData) && Objects.equals(email, other.email)
				&& Objects.equals(id, other.id) && Objects.equals(password, other.password) && role == other.role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", role=" + role + ", applicantData="
				+ applicantData + "]";
	}
}