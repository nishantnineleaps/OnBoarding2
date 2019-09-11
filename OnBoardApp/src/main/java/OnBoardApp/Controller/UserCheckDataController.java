package OnBoardApp.Controller;

import OnBoardApp.Model.UserCheckData;
import OnBoardApp.Service.UserCheckDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")

public class UserCheckDataController {

    @Autowired
    UserCheckDataService userCheckDataService;

    @PostMapping("/save")
    public String save_data(@RequestBody UserCheckData userCheckData){
        userCheckDataService.save_data(userCheckData);
        return "Saved";
    }
}
