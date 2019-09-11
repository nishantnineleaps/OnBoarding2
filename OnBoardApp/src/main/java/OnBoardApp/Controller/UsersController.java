package OnBoardApp.Controller;

import OnBoardApp.Interfaces.Profiles;
import OnBoardApp.Model.Users;
import OnBoardApp.Repository.UsersRepository;
import OnBoardApp.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UsersController {

    @Autowired
    UsersService usersService;

    @PostMapping("/save")
    public String save_user(@RequestBody Users users){
        System.out.println(users);
        usersService.save_user(users);
        return "Saved";

    }
    @GetMapping("/CompleteProfile")
    public List<Profiles> complete_profile(){
        return usersService.ProfileComplete();
    }
    @GetMapping("/IncompleteProfile")
    public List<Profiles> incomplete_profile(){
        return usersService.ProfileInComplete();
    }
}
