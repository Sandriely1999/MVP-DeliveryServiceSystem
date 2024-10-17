package mvp_delivery_system.controller;


import mvp_delivery_system.entites.Order;
import mvp_delivery_system.entites.OrderItem;
import mvp_delivery_system.services.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/orderItems")
public class OrderItemController {

    @Autowired
    public OrderItemService orderItemService;

    @GetMapping
    public ResponseEntity<List<OrderItem>> findAllOrderItems() {
        List<OrderItem> orderItems = orderItemService.findAllOrderItems();
        return ResponseEntity.ok().body(orderItems);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<OrderItem> findOrderItemById(@PathVariable Long id) {
        OrderItem obj = orderItemService.findOrderItemById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<OrderItem> addOrderItem(@RequestBody OrderItem orderItem) {
        OrderItem newOrderItem = orderItemService.saveOrderItem(orderItem);
        return ResponseEntity.status(HttpStatus.CREATED).body(newOrderItem);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<OrderItem> updateOrderItem(@PathVariable Long id, @RequestBody OrderItem orderItem) {
        OrderItem updateOrderItem = orderItemService.updateOrderItem(id, orderItem);
        return ResponseEntity.ok().body(updateOrderItem);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<OrderItem> deleteOrderItem(@PathVariable Long id) {
        orderItemService.deleteOrderItem(id);
        return ResponseEntity.noContent().build();
    }



}
