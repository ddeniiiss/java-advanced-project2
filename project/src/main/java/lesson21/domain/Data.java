package lesson21.domain;

import java.sql.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "data")
public class Data {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "faculty")
	@ManyToOne
	private Faculty faculty;

	@Column(name = "applicant")
	@ManyToOne
	private Applicant applicant;

	@Column(name = "submission_date")
	private Date submissionDate;

	@Column(name = "approved")
	private Boolean approved;

	public Data() {
		super();
	}

	public Data(Long id, Faculty faculty, Applicant applicant, Date submissionDate, Boolean approved) {
		super();
		this.id = id;
		this.faculty = faculty;
		this.applicant = applicant;
		this.submissionDate = submissionDate;
		this.approved = approved;
	}

	public Data(Faculty faculty, Applicant applicant, Date submissionDate, Boolean approved) {
		super();
		this.faculty = faculty;
		this.applicant = applicant;
		this.submissionDate = submissionDate;
		this.approved = approved;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public Applicant getApplicant() {
		return applicant;
	}

	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}

	public Date getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(Date submissionDate) {
		this.submissionDate = submissionDate;
	}

	public Boolean getApproved() {
		return approved;
	}

	public void setApproved(Boolean approved) {
		this.approved = approved;
	}

	@Override
	public int hashCode() {
		return Objects.hash(applicant, approved, faculty, id, submissionDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data other = (Data) obj;
		return Objects.equals(applicant, other.applicant) && Objects.equals(approved, other.approved)
				&& Objects.equals(faculty, other.faculty) && Objects.equals(id, other.id)
				&& Objects.equals(submissionDate, other.submissionDate);
	}

	@Override
	public String toString() {
		return "Data [id=" + id + ", faculty=" + faculty + ", applicant=" + applicant + ", submissionDate="
				+ submissionDate + ", approved=" + approved + "]";
	}
}