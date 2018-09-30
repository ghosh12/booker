package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by dipak on 9/29/2018.
 */
public class GrowMyBusiness {
    @FindBy(how = How.CLASS_NAME, using = "col-sm-3 first grow") private WebElement growbusiness;
    public void verifyGrowhaddertext(){
        String hadder = growbusiness.getText();
        Assert.assertEquals("GROW MY BUSINESS", hadder);
    }
    }

