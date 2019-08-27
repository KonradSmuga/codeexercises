package strategy;

public interface Sort {
    void execute (int[] tab);

    default void swap(int index1, int index2, int[] tab){
        int e = tab[index2];
        tab[index2] = tab[index1];
        tab[index1] = tab[index2];
    }

}
