package com.ry.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;

public class HelloViewImpl extends Composite {

	private static HelloViewImplUiBinder uiBinder = GWT
			.create(HelloViewImplUiBinder.class);

	interface HelloViewImplUiBinder extends UiBinder<Widget, HelloViewImpl> {
	}
	
	@UiField
	SpanElement nameSpan;
	@UiField
	Anchor goodbyeLink;
	private String name;
	private PlaceController placeController;

	public HelloViewImpl(EventBus eventBus) {
		initWidget(uiBinder.createAndBindUi(this));
		this.placeController = new PlaceController(eventBus);
	}

	public void setName(String name) {
		this.name = name;
		nameSpan.setInnerText(name);
	}
	
	@UiHandler("goodbyeLink")
	void onClickGoodbye(ClickEvent e) {
		placeController.goTo(new GoodbyePlace(name));
	}

}
