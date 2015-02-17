package com.android.service.internal.remote.models;

/**
 * Created by issuser on 15/2/16.
 */
public class LoginRegistReturnModel {

    private String result;
    private String message;
    private String userCoverFigure;
    private String headPortrait;

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }

    public String getUserCoverFigure() {
        return userCoverFigure;
    }

    public void setUserCoverFigure(String userCoverFigure) {
        this.userCoverFigure = userCoverFigure;
    }

    private User user;
    private String newEventFlag;

    public String getNewEventFlag() {
        return newEventFlag;
    }

    public void setNewEventFlag(String newEventFlag) {
        this.newEventFlag = newEventFlag;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "LoginRegistReturnModel [result=" + result + ", message=" + message + ", user=" + user + "]";
    }
}
