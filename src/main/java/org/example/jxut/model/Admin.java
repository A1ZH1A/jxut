package org.example.jxut.model;

public class Admin {
private int AID;
private String AName;
private String APwd;

    public Admin(int AID, String AName, String APwd) {
        this.AID = AID;
        this.AName = AName;
        this.APwd = APwd;
    }

    public int getAID() {
        return AID;
    }

    public void setAID(int AID) {
        this.AID = AID;
    }

    public String getAName() {
        return AName;
    }

    public void setAName(String AName) {
        this.AName = AName;
    }

    public String getAPwd() {
        return APwd;
    }

    public void setAPwd(String APwd) {
        this.APwd = APwd;
    }
}
