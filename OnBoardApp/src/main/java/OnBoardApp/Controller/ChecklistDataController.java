package OnBoardApp.Controller;

import OnBoardApp.Model.ChecklistData;
import OnBoardApp.Service.ChecklistDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/checklist")
public class ChecklistDataController {

    @Autowired
    ChecklistDataService checklistDataService;

    @PostMapping("/save")
    public String save_checklist(@RequestBody ChecklistData checklistData){
        checklistDataService.save_checklist(checklistData);
        return "Saved";
    }
}
