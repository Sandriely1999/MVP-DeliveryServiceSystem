package mvp_delivery_system.entites;

import lombok.Getter;
import lombok.Setter;
import mvp_delivery_system.services.Payment;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Order {

    private Long id;
    private Date orderDate;
    private OrderStatus status;
    private List<OrderItem> orderItems;
    private String deliveryAddress;
    private Payment payment;

    public void updateStatus(OrderStatus newStatus) {
        this.status = newStatus;
    }
}
