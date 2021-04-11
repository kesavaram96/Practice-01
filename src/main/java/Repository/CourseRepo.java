package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.CourseModel;

public interface CourseRepo extends JpaRepository<CourseModel, Integer>{

}
