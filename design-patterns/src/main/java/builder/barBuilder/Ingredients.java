package builder.barBuilder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Data

public final class Ingredients {

    private final int fat;
    private final int protein;
    private final int carbohydrates;

    private final int salt;
    private final int simpleSugar;
    private final int saturatedFat;
    private final int roughage;

    public int countKalories() {
        int sumKal = fat + protein + carbohydrates;

        return sumKal;
    }

}
