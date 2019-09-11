package OnBoardApp.Service;

import OnBoardApp.Model.Item;
import OnBoardApp.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;
    public void save_item(Item item) {
        itemRepository.save(item);
    }
}
