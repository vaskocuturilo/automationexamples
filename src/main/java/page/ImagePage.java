package page;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class ImagePage {

    public ImagePage selectAndHoverImage(final int numberImage) {

        $("div[id='content'] div:nth-child(" + numberImage + ") img").hover();

        return this;
    }

    public ImagePage selectAndHoverImage(final int numberImage, final String nameImage) {

        $("div[id='content'] div:nth-child(" + numberImage + ") [class='figcaption']")
                .waitUntil(Condition.visible, 5000)
                .shouldHave(Condition.text(nameImage));

        return this;
    }


}
