package mvp_delivery_system.models.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewOrderItemRequest {

    private Long productId;
    private Integer quantity;
}
