import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest {
    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen=true;
    }

    @Test
    void fillFormTest() {
        open("/text-box");
        $("#userName").setValue("Maxim Kazakov");
        $("#userEmail").setValue("kazakov.java@icloud.com");
        $("#currentAddress").setValue("Some address 1");
        $("#permanentAddress").setValue("Another address");
        $("#submit").click();
        $("#output").shouldHave(text("Maxim Kazakov"), text("kazakov.java@icloud.com"),
                text("Some address 1"), text("Another address"));


    }
}
