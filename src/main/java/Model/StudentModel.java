package Model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StudentModel {
	
	@Id
	@Column(name="stuid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer stuId;
	
	@Column(name = "stuname")
	private String stuName;
	
	@Column(name="dob")
	private Date DOB;
	
	@Column(name="gender")
	private Gender gender;
	
	@Column(name="courseid")
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private CourseModel courseID;

	public Integer getStuId() {
		return stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public CourseModel getCourseID() {
		return courseID;
	}

	public void setCourseID(CourseModel courseID) {
		this.courseID = courseID;
	}

	@Override
	public String toString() {
		return "StudentModel []";
	}
	
	
	
	

}
