import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SdaListImplTest {


    @Test
    public void isAddingObjectToList() {

        //given
        SdaList sdaList = new SdaListImpl();
        //wjen
        sdaList.add(2);
        sdaList.add(3);

        //then
        Assert.assertEquals(2, sdaList.size());
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
        //when
        sdaList.add(2);
        sdaList.add(3);
        //then
        Assert.assertEquals(true, sdaList.contains(3));
    }

    @Test
    public void isReturningTrueIfSizeIsEmpty() {

        //given
        SdaList sdaList = new SdaListImpl();
        //when
        sdaList.isEmpty();
        //then
        Assert.assertEquals(true, sdaList.isEmpty());

    }

    @Test
    public void isReturningFalseIfSizeIsNotEmpty() {

        //given
        SdaList sdaList = new SdaListImpl();
        sdaList.add(2);
        sdaList.add(4);
        //when
        sdaList.isEmpty();
        //then
        Assert.assertEquals(false, sdaList.isEmpty());

    }

}