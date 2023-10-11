package de.ait.ec.repositories;

import de.ait.ec.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 20/09/2023 education-center
 *
 * @author Wladimir Weizen
 */
public interface CoursesRepository extends JpaRepository<Course, Long> {

}
