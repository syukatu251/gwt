package com.ry.gwt.client;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

public class AppActivityMapper implements ActivityMapper {
    @Override
    public Activity getActivity(Place place) {
        if (place instanceof HelloPlace)
            return new HelloActivity((HelloPlace) place);
        else if (place instanceof GoodbyePlace)
            return new GoodbyeActivity((GoodbyePlace) place);
        return null;
    }
}
