package flywight;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Box {
    private final int width;
    private final int lenght;
    private final int height;



    private static int ilosc  =0;

    public Box(int width, int lenght, int height) {
        ilosc++;
        System.out.println("tworze pudełko o nr " + ilosc +" o wymiarach "+width +" "+ lenght +" "+ height);

        this.width = width;
        this.lenght = lenght;
        this.height = height;
    }
}
