import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SdaListImplTest {

    @Test
    public void isAddingObjectToList() {

        //given
        SdaList sdaList = new SdaListImpl();
        //when
        sdaList.add(2);
        sdaList.add(3);
        //then
        Assert.assertEquals(2, sdaList.size());
    }

    @Test
    public void isAddingObjectAtTheEndOfTheList() {

        //given
        SdaList sdaList = new SdaListImpl();
        sdaList.add(2);
        sdaList.add(3);
        sdaList.add(6);
        //when & then
        Assert.assertEquals(6,sdaList.get(3));
    }


    @Test
    public void isReturningSizeForEmptyList() {

        //given
        SdaList sdaList = new SdaListImpl();

        //when & then
        Assert.assertEquals(sdaList.size(), 0);
    }

    @Test
    public void isRemovingObjectFromList() {

        //given
        SdaList sdaList = new SdaListImpl();
        //when
        sdaList.add(2);
        sdaList.add(3);
        sdaList.remove(2);
        //then
        Assert.assertEquals(1, sdaList.size());
        Assert.assertEquals(false, sdaList.get(2));
    }

    @Test
    public void isReturningObjectFromList() {

        //given
        SdaList sdaList = new SdaListImpl();
        sdaList.add(2);
        sdaList.add(3);
        //when & then
        Assert.assertEquals(true, sdaList.contains(3));
    }

    @Test
    public void isReturningTrueIfListIsEmpty() {

        //given
        SdaList sdaList = new SdaListImpl();
        //when & then
        Assert.assertEquals(true, sdaList.isEmpty());

    }

    @Test
    public void isReturningFalseIfListIsNotEmpty() {

        //given
        SdaList sdaList = new SdaListImpl();
        sdaList.add(2);
        sdaList.add(4);
        //when
        boolean result = sdaList.isEmpty();
        //then
        Assert.assertEquals(false, result);

    }

}