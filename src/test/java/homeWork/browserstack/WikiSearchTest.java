package homeWork.browserstack;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class WikiSearchTest extends TestBase {
    @Test
    void searchArticleTest() {
        back();
        step("Кликаем по строке поиска", () -> {
            $(AppiumBy.accessibilityId("Search Wikipedia")).click();
        });
        step("Вводим Selenide", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Selenide");
            $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(sizeGreaterThan(0));
        });
        step("Открываем статью Selenide", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).click();
            $(AppiumBy.className("android.widget.TextView")).shouldHave(text("Selenide"));
        });
    }
}
