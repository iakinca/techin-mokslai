import org.junit.jupiter.api.Test;

public class ToDoListTest extends BaseTest {
    @Test
    void TestToDoList() {

        ToDoListPage toDoListPage = new ToDoListPage(driver);
        toDoListPage.inputList("Mano tekstas");
        toDoListPage.getNewInputFieldText();
    }

}
