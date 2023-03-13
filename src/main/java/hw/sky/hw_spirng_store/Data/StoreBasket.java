package hw.sky.hw_spirng_store.Data;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Configuration
@SessionScope
public class StoreBasket {
    private List<Long> storage = new ArrayList<>();

    public void add(Long id) {
        storage.add(id);
    }

    public List<Long> get() {
        return storage;
    }

}
