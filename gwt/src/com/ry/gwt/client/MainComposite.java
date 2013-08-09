package com.ry.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class MainComposite extends Composite {

	private static MainCompositeUiBinder uiBinder = GWT
			.create(MainCompositeUiBinder.class);
	@UiField VerticalPanel verticalPanel;

	interface MainCompositeUiBinder extends UiBinder<Widget, MainComposite> {
	}
	
	public interface MyStyle extends CssResource {
		String boxShadow();
        String boxShadowOff();
        String boxShadowOn();
    }

    @UiField
    protected MyStyle style;

	public MainComposite() {
		initWidget(uiBinder.createAndBindUi(this));
		Hyperlink link1 = new Hyperlink("link1", "link1Token");
		Hyperlink link2 = new Hyperlink("link2", "link2Token");
		link1.addStyleName(style.boxShadowOn());
		link1.addStyleName(style.boxShadow());
		link2.addStyleName(style.boxShadowOff());
		link2.addStyleName(style.boxShadow());
		verticalPanel.add(link1);
		verticalPanel.add(link2);
		
		
	}
}
