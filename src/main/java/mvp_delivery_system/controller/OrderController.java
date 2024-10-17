package mvp_delivery_system.controller;

import mvp_delivery_system.entites.Order;
import mvp_delivery_system.models.request.NewOrderRequest;
import mvp_delivery_system.models.response.OrderResponse;
import mvp_delivery_system.services.OrderItemService;
import mvp_delivery_system.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderItemService orderItemService;

    @GetMapping
    public ResponseEntity<List<Order>> findAllOrders() {
        List<Order> list = orderService.findAllOrders();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findOrderById(@PathVariable Long id) {
        Order obj = orderService.findOrderById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        Order newOrder = orderService.saveOrder(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(newOrder);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Order> updateOrder(@PathVariable Long id, @RequestBody Order orderDetails) {
        Order updateOrder = orderService.updateOrder(id, orderDetails);
        return ResponseEntity.ok().body(updateOrder);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Long id) {
        orderService.deleteOrderById(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping(value = "/criarPedido")
    public ResponseEntity<OrderResponse> criarPedido(@RequestBody NewOrderRequest newOrderRequest) {
        Order objOrder = orderService.createNewOrder(newOrderRequest);
        OrderResponse orderResponse = new OrderResponse(objOrder);
        return ResponseEntity.ok().body(orderResponse);
    }

}
