package mvp_delivery_system.entites;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Product {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Categories category;


}
