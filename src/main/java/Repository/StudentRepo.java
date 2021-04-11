package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.StudentModel;

public interface StudentRepo extends JpaRepository<StudentModel, Integer>{

}
