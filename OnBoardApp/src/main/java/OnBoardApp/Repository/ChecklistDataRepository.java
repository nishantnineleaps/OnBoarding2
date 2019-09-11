package OnBoardApp.Repository;

import OnBoardApp.Model.ChecklistData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChecklistDataRepository extends JpaRepository<ChecklistData,String> {
}
