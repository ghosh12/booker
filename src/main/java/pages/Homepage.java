package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

/**
 * Created by dipak on 9/26/2018.
 */
public class Homepage {
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[2]/div[1]/nav[1]")
    List<WebElement> toplink;

    public void Bookerlink() {
        for (int i = 0; i < toplink.size(); i++) {
            System.out.println(toplink.get(i).getText());

        }
        for (WebElement link : toplink) {

            System.out.println(link.getText());


        }
    }
}