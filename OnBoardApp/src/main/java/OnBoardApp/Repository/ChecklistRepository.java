package OnBoardApp.Repository;

import OnBoardApp.Model.Checklist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChecklistRepository extends JpaRepository<Checklist,String> {
}
