package hw.sky.hw_spirng_store.Contoller;

import com.fasterxml.jackson.core.JsonProcessingException;
import hw.sky.hw_spirng_store.Data.Product;
import hw.sky.hw_spirng_store.Service.OrderService;
import lombok.AllArgsConstructor;
import org.apache.catalina.LifecycleState;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/add")
    public ResponseEntity add(@RequestBody List<Product> products) {

        return ResponseEntity.ok(orderService.addNewItem(products));
    }

    @GetMapping("/get")
    public String get() throws JsonProcessingException {
        return orderService.getAllBasket();
    }
}
