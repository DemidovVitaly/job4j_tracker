package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class StartUITest {

    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName()).isEqualTo(expected.getName());
    }

    @Test
    void createItem() {
        String[] answers = {"first", "second", "third", "foгrth"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        for (int i = 0; i < answers.length; i++) {
            StartUI.createItem(input, tracker);
            Item created = tracker.findAll()[i];
            Item expected = new Item(answers[i]);
            assertThat(created.getName()).isEqualTo(expected.getName());
        }
    }

    @Test
    void showItem() {
    }

    @Test
    void editItem() {
    }

    @Test
    void deteleItem() {
    }

    @Test
    void findById() {
    }

    @Test
    void findByName() {
    }

    @Test
    void init() {
    }
}