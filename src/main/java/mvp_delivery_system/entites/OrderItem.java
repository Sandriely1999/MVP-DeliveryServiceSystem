package mvp_delivery_system.entites;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItem {
    private Long id;
    private Product product;
    private int quantity;


}
