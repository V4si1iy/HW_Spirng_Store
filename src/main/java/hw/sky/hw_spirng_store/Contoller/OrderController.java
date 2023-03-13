package hw.sky.hw_spirng_store.Contoller;

import com.fasterxml.jackson.core.JsonProcessingException;
import hw.sky.hw_spirng_store.Service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/order")
public class OrderController {
   private final OrderService orderService;
    @GetMapping("/add/{itemId}")
    public String add(@PathVariable String itemId) {
        return orderService.addNewItem(itemId);
    }

    @GetMapping("/get")
    public String get() throws JsonProcessingException  {
        return orderService.getAllBasket();
    }
}
