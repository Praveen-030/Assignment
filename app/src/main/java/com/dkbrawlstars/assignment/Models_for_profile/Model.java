package com.dkbrawlstars.assignment.Models_for_profile;

public class Model {
    String name,purpose,status,pic;


    public Model(String pic,String name,String purpose,String status)
    {
        this.name = name;
        this.purpose = purpose;
        this.status = status;
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}
