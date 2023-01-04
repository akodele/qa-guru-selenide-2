package qa.guru;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {
    @Test
    public void test1() {

        open("https://the-internet.herokuapp.com/drag_and_drop");

        actions().moveToElement($x("//*[@id='column-a']")).clickAndHold().moveByOffset(300, 200).release().perform();
        $x("//*[@id='column-a']").shouldHave(text("B"));
        $x("//*[@id='column-b']").shouldHave(text("A"));
    }

    @Test
    public void test2() {

        open("https://the-internet.herokuapp.com/drag_and_drop");

        $x("//*[@id='column-a']").dragAndDropTo($x("//*[@id='column-b']"));

        $x("//*[@id='column-a']").shouldHave(text("B"));
        $x("//*[@id='column-b']").shouldHave(text("A"));
    }
}
