package mvp_delivery_system.models.request;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewDishRequest {
    private String name;
    private String description;
    private Double price;
    private String image;
}
