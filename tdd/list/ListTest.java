package list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

class ListTest {
    List list;

    @BeforeEach
    void setUp() {
        list = new ArrayList();

    }
    @Test
    public void newListIsEmptyTest(){
        assertTrue(list.isEmpty());
    }
    @Test
    public void additem_listIsNotEmptyTEst(){
        list.add("G,String");
        assertFalse(list.isEmpty());
    }
    @Test
    public void addItem_RemoveItem_ListIEmptyTest(){
        list.add("E-String");
        list.remove("E-String");
        assertTrue(list.isEmpty());
    }
    @Test
    public void addItem_sizeIncreasesTest(){
        list.add("A-String");
        assertEquals(1,list.size());
    }
    @Test
    public void addX_addY_sizeIsTwoTest(){
        list.add("G-String");
        list.add("A-String");

    }
    @Test
    public  void addX_addY_removeX_sizeIsOneTest(){
        list.add("G-String");
        list.add("A-String");
        list.remove("A-String");
        assertEquals(1,list.size());
    }
    @Test
    public void addX_addY_removeX_listIsNotEmptyTest(){
        list.add("G-String");
        list.add("A-String");
        list.remove("A-String");
        assertFalse(list.isEmpty());
    }
    @Test
    public void  addXandY_retrieveYTest(){
        list.add("G-String");
        list.add("A-String");
        String gotten = list.get(0);
        assertEquals("G-String",gotten);

    }
    @Test
    public void addX_YandZ_removeX_getX_shoouldreturnYTest(){
        list.add("G-String");
        list.add("A-String");
        list.add("E-String");
        list.remove("G-String");

        String gotten = list.get(0);
        assertEquals("A-String",gotten);
    }

}