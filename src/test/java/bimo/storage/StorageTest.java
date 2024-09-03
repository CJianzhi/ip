package bimo.storage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import bimo.Storage;
import bimo.tasks.Event;
import bimo.tasks.Task;


public class StorageTest {
    @Test
    void convertTextToTask_eventInput() {
        Storage storage = new Storage("data/Bimo.txt");
        Task task = new Event("Buy books", LocalDate.parse("2024-08-30"),
                LocalDate.parse("2024-08-31"));
        assertEquals("E|0|Buy books|2024-08-30/2024-08-31", storage.convertTaskToText(task));
    }
}
