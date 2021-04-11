package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "course")
public class CourseModel {
	
	@Id
	@Column(name = "courseid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer courseID;
	
	@Column(name="name")
	private String Coursename;

	public Integer getCourseID() {
		return courseID;
	}

	public void setCourseID(Integer courseID) {
		this.courseID = courseID;
	}

	public String getCoursename() {
		return Coursename;
	}

	public void setCoursename(String coursename) {
		Coursename = coursename;
	}

	@Override
	public String toString() {
		return "CourseModel []";
	}
	
	
	

}
