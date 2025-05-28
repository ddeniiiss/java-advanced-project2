package lesson21.domain;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "applicant")
public class Applicant {

	@Id
	@Column(name = "id")
	private Long id;

	@OneToOne
	@MapsId
	private User user;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "certificate_average")
	private double certificateAverage;

	@Column(name = "grades")
	@OneToMany(mappedBy = "applicant", cascade = CascadeType.ALL)
	private List<Grade> grades;

	public Applicant() {
		super();
	}

	public Applicant(Long id, User user, String firstName, String lastName, double certificateAverage,
			List<Grade> grades) {
		super();
		this.id = id;
		this.user = user;
		this.firstName = firstName;
		this.lastName = lastName;
		this.certificateAverage = certificateAverage;
		this.grades = grades;
	}

	public Applicant(User user, String firstName, String lastName, double certificateAverage, List<Grade> grades) {
		super();
		this.user = user;
		this.firstName = firstName;
		this.lastName = lastName;
		this.certificateAverage = certificateAverage;
		this.grades = grades;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public double getCertificateAverage() {
		return certificateAverage;
	}

	public void setCertificateAverage(double certificateAverage) {
		this.certificateAverage = certificateAverage;
	}

	public List<Grade> getGrades() {
		return grades;
	}

	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}

	@Override
	public int hashCode() {
		return Objects.hash(certificateAverage, firstName, grades, id, lastName, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Applicant other = (Applicant) obj;
		return Double.doubleToLongBits(certificateAverage) == Double.doubleToLongBits(other.certificateAverage)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(grades, other.grades)
				&& Objects.equals(id, other.id) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(user, other.user);
	}

	@Override
	public String toString() {
		return "Applicant [id=" + id + ", user=" + user + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", certificateAverage=" + certificateAverage + ", grades=" + grades + "]";
	}
}