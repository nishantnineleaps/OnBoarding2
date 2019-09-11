package OnBoardApp.Service;

import OnBoardApp.Model.ChecklistData;
import OnBoardApp.Repository.ChecklistDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChecklistDataService {

    @Autowired
    ChecklistDataRepository checklistDataRepository;
    public void save_checklist(ChecklistData checklistData) {
        checklistDataRepository.save(checklistData);
    }
}
