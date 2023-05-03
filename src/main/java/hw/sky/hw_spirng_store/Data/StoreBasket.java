package hw.sky.hw_spirng_store.Data;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Configuration
@SessionScope
public class StoreBasket {
    private List<Product> storage = new ArrayList<>();

    public void add(Product product) {
        storage.add(product);
    }

    public List<Long> get() {
        return storage.stream().map(e -> e.getId()).collect(Collectors.toList());
    }

}
