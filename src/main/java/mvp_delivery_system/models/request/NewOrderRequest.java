package mvp_delivery_system.models.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class NewOrderRequest {

    private List<NewOrderItemRequest> orderItems;

    private NewUserRequest client;

}
