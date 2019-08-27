package flywight;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BoxFactory {

    static List<Box> boxList = new ArrayList<>();

    public static Box createBox(int width, int lenght, int height) {

        return boxList.stream()
                .filter(e -> e.getHeight() == height && e.getWidth() == width && e.getHeight() == height)
                .findAny()
                .orElseGet(() -> {
                    Box box = new Box(width, lenght, height);
                    boxList.add(box);
                    return box;
                });
    }
}



//        Box box1 = any.orElseGet(() ->{
////            Box box = new Box(width, lenght, height);
////
////            boxList.add(box);
////
////            return box;
////        }
////            return box1;
////        }
//////        for (Box box : boxList) {
//////            if ( box.getWidth() == width && box.getLenght() == lenght && box.getHeight() == height) {
//////                return box;
//////            }
////
////
////
////        }
////



