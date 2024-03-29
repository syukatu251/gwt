package com.ry.gwt.client;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;

public class GoodbyeViewImpl extends Composite {
	SimplePanel viewPanel = new SimplePanel();
    Element nameSpan = DOM.createSpan();

    public GoodbyeViewImpl() {
        viewPanel.getElement().appendChild(nameSpan);
        initWidget(viewPanel);
    }

    public void setName(String name) {
        nameSpan.setInnerText("Good-bye, " + name);
    }

}
