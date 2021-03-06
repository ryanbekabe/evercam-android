package io.evercam.androidapp.feedback;

import android.content.Context;

import java.util.HashMap;

import io.evercam.androidapp.utils.Constants;


public class NewUserFeedbackItem extends FeedbackItem {
    private String email;

    public NewUserFeedbackItem(Context context, String username, String email) {
        super(context, username);
        this.email = email;
    }

    @Override
    public HashMap<String, Object> toHashMap() {
        HashMap<String, Object> map = super.toHashMap();
        map.put("from", FROM_ANDROID);
        map.put("email", email);

        return map;
    }

}
