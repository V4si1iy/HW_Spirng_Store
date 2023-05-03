package hw.sky.hw_spirng_store.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import hw.sky.hw_spirng_store.Data.Product;
import hw.sky.hw_spirng_store.Data.StoreBasket;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private StoreBasket storeBasket;
    private ObjectMapper objectMapper;

    public OrderService(StoreBasket storeBasket, ObjectMapper objectMapper) {
        this.storeBasket = storeBasket;
        this.objectMapper = objectMapper;
    }

    public String addNewItem(List<Product> products) {
        for (Product product : products) {
            storeBasket.add(product);
        }
        if (products.size() == 1)
            return "Предмет под id:" + products.stream().map(e -> e.getId().toString()) + " добавлен";
        else
            return "Предметы под id:" + products.stream().map(e -> e.getId().toString()) + " добавлены";
    }

    public String getAllBasket() throws JsonProcessingException {
        return objectMapper.writeValueAsString(storeBasket.get());
    }

}
