package di.vending.coffee.coffee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Created by nischal.k on 02/06/17.
 */
@ToString
@Getter
@AllArgsConstructor
public class Ingeredient {
    private final IngerdientType ingerdientType;
    private final int quantity; //in ml
}
