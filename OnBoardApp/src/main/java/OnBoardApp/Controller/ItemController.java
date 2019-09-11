package OnBoardApp.Controller;

import OnBoardApp.Model.Item;
import OnBoardApp.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")

public class ItemController {

    @Autowired
    ItemService itemService;

    @PostMapping("/save")
    public String save_item(@RequestBody Item item){
        itemService.save_item(item);
        return "Saved";
    }
}
