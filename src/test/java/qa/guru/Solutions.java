package qa.guru;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class Solutions {
    @Test
    public void test(){

        open("https://github.com/");

        $x("//button[contains(.,'Solutions')]").hover();
        $x("//a[contains(.,'Enterprise')]").click();

        $x("//h1[contains(.,'Build like the best')]").shouldBe(visible);
    }
}
