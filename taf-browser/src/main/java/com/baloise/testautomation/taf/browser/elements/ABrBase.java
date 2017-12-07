package com.baloise.testautomation.taf.browser.elements;

import com.baloise.testautomation.taf.base._base.ABase;
import com.baloise.testautomation.taf.browser.elements.BrElementFinder.*;
import com.baloise.testautomation.taf.common.interfaces.IFinder;
import org.openqa.selenium.WebDriver;

import java.util.Collections;
import java.util.List;

public abstract class ABrBase extends ABase<WebElementFinder> {
    @Override
    protected WebElementFinder getByIdFinder() {
        return new ByIdFinder();
    }

    @Override
    protected WebElementFinder getByTextFinder() {
        return new ByTextFinder();
    }

    @Override
    protected WebElementFinder getByNameFinder() {
        return new ByNameFinder();
    }

    @Override
    protected WebElementFinder getByXpathFinder() {
        return new ByXpathFinder();
    }

    @Override
    protected WebElementFinder getByCssSelectorFinder() {
        return  new ByCssSelectorFinder();
    }

    @Override
    protected WebElementFinder getByCustomFinder() {
        return new ByIdFinder();
    }

    @Override
    protected WebElementFinder getByLeftLabelFinder() {
        return new ByLeftlabelFinder();
    }

    @Override
    protected List<WebElementFinder> getAdditionalSupportedBys() {
        return Collections.emptyList();
    }

    abstract public WebDriver getWebDriver();

    @Override
    public IFinder<?> getBrowserFinder() {
        return new BrFinder(getSupportedBys(), getWebDriver());
    }
}
