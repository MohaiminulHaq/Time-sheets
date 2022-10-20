package walton.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import walton.springboot.model.TimeSheets;

import java.util.List;

public interface TimeSheetsRepository extends JpaRepository<TimeSheets, Long>{
 List<TimeSheets> findBySubmit (boolean submit);
}
