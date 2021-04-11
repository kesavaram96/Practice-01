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
	
	
	

}
