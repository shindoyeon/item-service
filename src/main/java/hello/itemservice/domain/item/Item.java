package hello.itemservice.domain.item;

import lombok.Data;

////@Data는 내가 모르게 동작할 수도 있기 때문에 사용할 때 주의를 해야한다. @Getter @Setter를 많이 씀 .
@Data
public class Item {
    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
