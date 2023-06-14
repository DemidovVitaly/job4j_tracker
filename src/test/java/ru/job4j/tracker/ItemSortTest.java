package ru.job4j.tracker;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ItemSortTest {

    @Test
    public void whenSortByName() {
        Item item1 = new Item("1.First");
        Item item2 = new Item("2.Second");
        Item item3 = new Item("3.Third");
        List<Item> items = Arrays.asList(item2, item3, item1);
        List<Item> expected = Arrays.asList(item1, item2, item3);
        items.sort(new ItemAscByName());
        assertThat(expected, is(items));
    }

    @Test
    public void whenSortDescByName() {
        Item item1 = new Item("1.First");
        Item item2 = new Item("2.Second");
        Item item3 = new Item("3.Third");
        List<Item> items = Arrays.asList(item2, item3, item1);
        List<Item> expected = Arrays.asList(item3, item2, item1);
        items.sort(new ItemDescByName());
        assertThat(expected, is(items));
    }
}