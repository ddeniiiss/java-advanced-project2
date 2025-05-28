package lesson21.domain;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "faculty")
public class Faculty {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "admission_plan")
	private Integer admissionPlan;

	@Column(name = "applicants")
	@OneToMany(mappedBy = "faculty", cascade = CascadeType.ALL)
	private List<Applicant> applicants;

	public Faculty() {
		super();
	}

	public Faculty(Long id, String name, Integer admissionPlan, List<Applicant> applicants) {
		super();
		this.id = id;
		this.name = name;
		this.admissionPlan = admissionPlan;
		this.applicants = applicants;
	}

	public Faculty(String name, Integer admissionPlan, List<Applicant> applicants) {
		super();
		this.name = name;
		this.admissionPlan = admissionPlan;
		this.applicants = applicants;
	}

	@Override
	public int hashCode() {
		return Objects.hash(admissionPlan, applicants, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Faculty other = (Faculty) obj;
		return Objects.equals(admissionPlan, other.admissionPlan) && Objects.equals(applicants, other.applicants)
				&& Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + ", admissionPlan=" + admissionPlan + ", applicants="
				+ applicants + "]";
	}
}