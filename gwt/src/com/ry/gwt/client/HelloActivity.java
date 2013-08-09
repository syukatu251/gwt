package com.ry.gwt.client;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class HelloActivity extends AbstractActivity {
    // Name that will be appended to "Hello,"
    private String name;

    public HelloActivity(HelloPlace place) {
        this.name = place.getHelloName();
    }

    @Override
    public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
    	HelloViewImpl helloView = new HelloViewImpl(eventBus);
        helloView.setName(name);
        containerWidget.setWidget(helloView.asWidget());
    }
}
