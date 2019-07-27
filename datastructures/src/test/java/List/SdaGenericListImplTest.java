package List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SdaGenericListImplTest {

    @Test
    void shouldAddValueToEmptyList() {
        //given
        SdaGenericList sdaList = new SdaGenericListImpl();

        //when
        sdaList.add(2);
        sdaList.add("Dom");

        //then
        assertThat(sdaList.isEmpty()).isFalse();
    }

    @Test
    void shouldAddValueToList() {
        //given
        SdaGenericList sdaList = new SdaGenericListImpl();

        //when
        sdaList.add(2);
        sdaList.add(3);

        //then
        assertThat(sdaList.size()).isEqualTo(2);
    }

    @Test
    void shouldAddValueAtTheEndOfTheList() {
        //given
        SdaGenericList sdaList = new SdaGenericListImpl();
        sdaList.add(2);
        sdaList.add(3);
        sdaList.add(6);

        //when & then
        assertThat(sdaList.get(2)).isEqualTo(6);
    }

    @Test
    void shouldReturnFirstElement() {
        //given
        SdaGenericList sdaList = new SdaGenericListImpl();
        sdaList.add(2);
        sdaList.add(3);
        sdaList.add(6);

        //when & then
        assertThat(sdaList.get(0)).isEqualTo(2);
    }

    @Test
    void shouldReturnElement() {
        //given
        SdaGenericList sdaList = new SdaGenericListImpl();
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
        SdaGenericList sdaList = new SdaGenericListImpl();
        sdaList.add(2);
        sdaList.add(3);
        sdaList.add(6);

        //when & then
        assertThat(sdaList.get(2)).isEqualTo(6);
    }

    @Test
    void shouldThrowIndexOutOfBoundException() {
        //given
        SdaGenericList sdaList = new SdaGenericListImpl();
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
        SdaGenericList sdaList = new SdaGenericListImpl();
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
        SdaGenericList sdaList = new SdaGenericListImpl();
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
        SdaGenericList sdaList = new SdaGenericListImpl();
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
        SdaGenericList sdaList = new SdaGenericListImpl();
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
        SdaGenericList sdaList = new SdaGenericListImpl();
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
        SdaGenericList sdaList = new SdaGenericListImpl();;

        //when
        sdaList.clear();

        //then
        assertThat(sdaList.size()).isEqualTo(0);
    }

    @Test
    void shouldReturnSizeForEmptyList() {
        //given
        SdaGenericList sdaList = new SdaGenericListImpl();

        //when & then
        assertThat(sdaList.size()).isEqualTo(0);
    }

    @Test
    void shouldReturnSize() {
        //given
        SdaGenericList sdaList = new SdaGenericListImpl();
        sdaList.add(5);
        sdaList.add(2);
        sdaList.add(15);

        //when & then
        assertThat(sdaList.size()).isEqualTo(3);
    }

    @Test
    void shouldFindElementInList() {
        //given
        SdaGenericList sdaList = new SdaGenericListImpl();
        sdaList.add(5);
        sdaList.add(2);
        sdaList.add(1);

        //when & then
        assertThat(sdaList.contains(5)).isTrue();
    }

    @Test
    void shouldNotFindElementInList() {
        //given
        SdaGenericList sdaList = new SdaGenericListImpl();
        sdaList.add(5);

        //when & then
        assertThat(sdaList.contains(12)).isFalse();
    }

    @Test
    void shouldReturnTrueIfListIsEmpty() {
        //given
        SdaGenericList sdaList = new SdaGenericListImpl();

        //when & then
        assertThat(sdaList.isEmpty()).isTrue();
    }

    @Test
    void shouldReturnFalseIfListIsNotEmpty() {
        //given
        SdaGenericList sdaList = new SdaGenericListImpl();
        sdaList.add(2);
        sdaList.add(4);

        //when & then
        assertThat(sdaList.isEmpty()).isFalse();
    }


}