package List;

import List.SdaList;
import List.SdaListImpl;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SdaListImplTest {


    @Test
    void shouldAddValueToEmptyList() {
        //given
        SdaList sdaList = new SdaListImpl();

        //when
        sdaList.add(2);


        //then
        assertThat(sdaList.isEmpty()).isFalse();
    }

    @Test
    void shouldAddValueToList() {
        //given
        SdaList sdaList = new SdaListImpl();

        //when
        sdaList.add(2);
        sdaList.add(3);

        //then
        assertThat(sdaList.size()).isEqualTo(2);
    }

    @Test
    void shouldAddValueAtTheEndOfTheList() {
        //given
        SdaList sdaList = new SdaListImpl();
        sdaList.add(2);
        sdaList.add(3);
        sdaList.add(6);

        //when & then
        assertThat(sdaList.get(2)).isEqualTo(6);
    }

    @Test
    void shouldReturnFirstElement() {
        //given
        SdaList sdaList = new SdaListImpl();
        sdaList.add(2);
        sdaList.add(3);
        sdaList.add(6);

        //when & then
        assertThat(sdaList.get(0)).isEqualTo(2);
    }

    @Test
    void shouldReturnElement() {
        //given
        SdaList sdaList = new SdaListImpl();
        sdaList.add(2);
        sdaList.add(3);
        sdaList.add(6);
        sdaList.add(2);

        //when & then
        assertThat(sdaList.get(1)).isEqualTo(3);
    }

    @Test
    void shouldReturnLastElement() {
        //given
        SdaList sdaList = new SdaListImpl();
        sdaList.add(2);
        sdaList.add(3);
        sdaList.add(6);

        //when & then
        assertThat(sdaList.get(2)).isEqualTo(6);
    }

    @Test
    void shouldThrowIndexOutOfBoundException() {
        //given
        SdaList sdaList = new SdaListImpl();
        sdaList.add(2);
        sdaList.add(3);

        //when & then
        assertThrows(IndexOutOfBoundsException.class, () -> {
            sdaList.get(7);
        });
    }

    @Test
    void shouldRemoveFirstElement() {
        //given
        SdaList sdaList = new SdaListImpl();
        sdaList.add(1);
        sdaList.add(3);
        sdaList.add(6);
        sdaList.add(4);

        //when
        sdaList.remove(0);

        //then
        assertThat(sdaList.get(0)).isEqualTo(3);
    }

    @Test
    void shouldRemoveValue() {
        //given
        SdaList sdaList = new SdaListImpl();
        sdaList.add(1);
        sdaList.add(3);
        sdaList.add(6);
        sdaList.add(4);

        //when
        sdaList.remove(2);

        //then
        assertThat(sdaList.get(2)).isEqualTo(4);
    }

    @Test
    void shouldReturnRemoveResult() {
        //given
        SdaList sdaList = new SdaListImpl();
        sdaList.add(1);
        sdaList.add(3);

        //when
        boolean result = sdaList.remove(1);

        //then
        assertThat(result).isTrue();
    }

    @Test
    void shouldReturnFalseWhenValueIsNotPresent() {
        //given
        SdaList sdaList = new SdaListImpl();
        sdaList.add(1);
        sdaList.add(3);

        //when
        boolean result = sdaList.remove(5);

        //then
        assertThat(result).isFalse();
    }

    @Test
    void shouldClearList() {
        //given
        SdaList sdaList = new SdaListImpl();
        sdaList.add(2);
        sdaList.add(4);

        //when
        sdaList.clear();

        //then
        assertThat(sdaList.size()).isEqualTo(0);
    }

    @Test
    void shouldClearEmptyList() {
        //given
        SdaList sdaList = new SdaListImpl();

        //when
        sdaList.clear();

        //then
        assertThat(sdaList.size()).isEqualTo(0);
    }

    @Test
    void shouldReturnSizeForEmptyList() {
        //given
        SdaList sdaList = new SdaListImpl();

        //when & then
        assertThat(sdaList.size()).isEqualTo(0);
    }

    @Test
    void shouldReturnSize() {
        //given
        SdaList sdaList = new SdaListImpl();
        sdaList.add(5);
        sdaList.add(2);
        sdaList.add(15);

        //when & then
        assertThat(sdaList.size()).isEqualTo(3);
    }

    @Test
    void shouldFindElementInList() {
        //given
        SdaList sdaList = new SdaListImpl();
        sdaList.add(5);
        sdaList.add(2);
        sdaList.add(1);

        //when & then
        assertThat(sdaList.contains(5)).isTrue();
    }

    @Test
    void shouldNotFindElementInList() {
        //given
        SdaList sdaList = new SdaListImpl();
        sdaList.add(5);

        //when & then
        assertThat(sdaList.contains(12)).isFalse();
    }

    @Test
    void shouldReturnTrueIfListIsEmpty() {
        //given
        SdaList sdaList = new SdaListImpl();

        //when & then
        assertThat(sdaList.isEmpty()).isTrue();
    }

    @Test
    void shouldReturnFalseIfListIsNotEmpty() {
        //given
        SdaList sdaList = new SdaListImpl();
        sdaList.add(2);
        sdaList.add(4);

        //when & then
        assertThat(sdaList.isEmpty()).isFalse();
    }

}

