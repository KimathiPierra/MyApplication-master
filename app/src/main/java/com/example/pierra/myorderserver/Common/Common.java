package com.example.pierra.myorderserver.Common;



import com.example.pierra.myorderserver.Model.Request;
import com.example.pierra.myorderserver.Model.User;

/**
 * Created by Pierra on 19/11/2017.
 */

public class Common {
    public static User currentUser;
    public static Request currentRequest;

    public static final String UPDATE = "Update";
    public static final String DELETE = "Delete";
    public static final int PICK_IMAGE_REQUEST = 71;

    public static String convertCodeToStatus(String code)
    {
        if (code.equals("0"))
            return "Placed";
        else if (code.equals("1"))
            return "Coming...";
        else
            return "Order served";
    }



}