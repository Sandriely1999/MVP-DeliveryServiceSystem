package mvp_delivery_system.models.response;

import lombok.Getter;
import lombok.Setter;
import mvp_delivery_system.entites.Order;
import mvp_delivery_system.entites.OrderItem;
import mvp_delivery_system.entites.User;
import mvp_delivery_system.enums.OrderStatus;
import mvp_delivery_system.enums.Pagamentos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class OrderResponse {

    private Long orderId;
    private LocalDateTime dataHora;
    private OrderStatus orderStatus;
    private Long userId;
    private List<Long> orderItemsId;
    private Double totalPrice;
    private Pagamentos pagamento;

    public OrderResponse(Order order) {
        this.orderId = order.getId();
        this.dataHora = order.getDataHora();
        this.userId = order.getClient().getId();
        this.totalPrice = order.getTotalPrice();
        this.orderStatus = order.getOrderstatus();
        this.orderItemsId = order.getOrderItems().stream().map(OrderItem::getId).toList();
        this.pagamento = order.getPagamento();
    }

    public static List<OrderResponse> listaOrderParaOrderResponse (List<Order> listOrder) {
        List<OrderResponse> orderResponses = new ArrayList<>();
        for (Order order: listOrder) {
            orderResponses.add(new OrderResponse(order));
        }
        return orderResponses;
    }


}
