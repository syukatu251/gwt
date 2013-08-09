package com.ry.gwt.client;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;

public class GoodbyeViewImpl extends Composite implements GoodbyeView {
	SimplePanel viewPanel = new SimplePanel();
    Element nameSpan = DOM.createSpan();
    
    @SuppressWarnings("unused")
	private Presenter presenter;

    public GoodbyeViewImpl() {
        viewPanel.getElement().appendChild(nameSpan);
        initWidget(viewPanel);
    }

    @Override
    public void setName(String name) {
        nameSpan.setInnerText("Good-bye, " + name);
    }

	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}

}
