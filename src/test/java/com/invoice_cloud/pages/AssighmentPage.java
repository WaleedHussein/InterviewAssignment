package com.invoice_cloud.pages;

import com.invoice_cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AssighmentPage {

    public AssighmentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "button[onclick='addElement()']")
    public WebElement button;

    @FindBy(xpath = "//div[@id=\"elements\"]/button")
    public List<WebElement> elements;

}
