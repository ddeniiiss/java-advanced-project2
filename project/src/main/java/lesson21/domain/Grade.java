package lesson21.domain;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "grade")
public class Grade {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	private Applicant applicant;

	@ManyToOne
	private Subject subject;

	@Column(name = "score")
	private double score;

	public Grade() {
		super();
	}

	public Grade(Long id, Applicant applicant, Subject subject, double score) {
		super();
		this.id = id;
		this.applicant = applicant;
		this.subject = subject;
		this.score = score;
	}

	public Grade(Applicant applicant, Subject subject, double score) {
		super();
		this.applicant = applicant;
		this.subject = subject;
		this.score = score;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Applicant getApplicant() {
		return applicant;
	}

	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public int hashCode() {
		return Objects.hash(applicant, id, score, subject);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Grade other = (Grade) obj;
		return Objects.equals(applicant, other.applicant) && Objects.equals(id, other.id)
				&& Double.doubleToLongBits(score) == Double.doubleToLongBits(other.score)
				&& Objects.equals(subject, other.subject);
	}

	@Override
	public String toString() {
		return "Grade [id=" + id + ", applicant=" + applicant + ", subject=" + subject + ", score=" + score + "]";
	}
}