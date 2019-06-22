public class Color implements Comparable{
    private String colorName;

    public Color(String colorName) {
        this.colorName = colorName;
    }

    public String getName(){
        return colorName;
    }

    @Override
    public String toString() {
        return "Color{" +
                "colorName='" + colorName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
       int otherColor = ((Color) o).getName().length();
       int thisColor = getName().length();

     return   otherColor > thisColor ? -1 : otherColor < thisColor ?  1 :0;



    }
}
