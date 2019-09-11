package OnBoardApp.Controller;

import OnBoardApp.Model.UserCheckData;
import OnBoardApp.Service.UserCheckDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

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
    @GetMapping("/profile")
    public HashMap profiles(){
        return userCheckDataService.ProfileComplete();
    }
}
