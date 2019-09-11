package OnBoardApp.Service;

import OnBoardApp.Model.Checklist;
import OnBoardApp.Repository.ChecklistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChecklistService {

    @Autowired
    ChecklistRepository checklistRepository;
    public void save_checklist(Checklist checklist) {
        checklistRepository.save(checklist);
    }
}
