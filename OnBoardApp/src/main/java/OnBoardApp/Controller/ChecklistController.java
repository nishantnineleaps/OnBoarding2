package OnBoardApp.Controller;

import OnBoardApp.Model.Checklist;
import OnBoardApp.Service.ChecklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/checklist")
public class ChecklistController {

    @Autowired
    ChecklistService checklistService;

    @PostMapping("/save")
    public String save_checklist(@RequestBody Checklist checklist){
        checklistService.save_checklist(checklist);
        return "Saved";
    }
}
