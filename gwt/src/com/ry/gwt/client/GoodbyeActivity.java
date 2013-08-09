package com.ry.gwt.client;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class GoodbyeActivity extends AbstractActivity {
    private String name;

    public GoodbyeActivity(GoodbyePlace place) {
        this.name = place.getGoodbyeName();
    }

    /**
     * Invoked by the ActivityManager to start a new Activity
     */
    @Override
    public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
    	GoodbyeViewImpl goodbyeView = new GoodbyeViewImpl();
    	goodbyeView.setName(name);
        containerWidget.setWidget(goodbyeView.asWidget());
    }
}
