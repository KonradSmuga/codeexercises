package sort;

import com.sda.sort.BubbleSort;
import com.sda.sort.SortAlgorithm;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class BubbleSortTest {

    private SortAlgorithm sortAlgorithm = new BubbleSort();

     @Test
     public void shouldSortArray() {
         //given
         int[] tab = {6, 3, 8, 1, 0, 2};
         //when
         sortAlgorithm.sort(tab);
         //then
         assertThat(tab).containsExactly(0, 1, 2, 3, 6, 8);
     }

     @Test
     public void shouldReturnAlreadySortedArray() {
         //given
         int[] tab = {1, 2, 3, 4, 5, 6};
         //when
         sortAlgorithm.sort(tab);
         //then
         assertThat(tab).containsExactly(1, 2, 3, 4, 5, 6);
     }

}
