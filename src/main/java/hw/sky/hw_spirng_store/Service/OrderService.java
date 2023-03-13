package hw.sky.hw_spirng_store.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import hw.sky.hw_spirng_store.Data.StoreBasket;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
   private StoreBasket storeBasket;
   private ObjectMapper objectMapper;

    public OrderService(StoreBasket storeBasket, ObjectMapper objectMapper) {
        this.storeBasket = storeBasket;
        this.objectMapper = objectMapper;
    }

    public String addNewItem(String itemId) throws NumberFormatException
    {Long id =  Long.parseLong(itemId);
        storeBasket.add(id);
        return "Предмет под id:" + id + " добавлен";
    }

    public String getAllBasket() throws JsonProcessingException
    {
        return objectMapper.writeValueAsString(storeBasket.get());
    }

}
