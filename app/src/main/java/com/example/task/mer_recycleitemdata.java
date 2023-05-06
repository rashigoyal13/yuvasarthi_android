package com.example.task;

public class mer_recycleitemdata {
    int image;
    String Name,Rating,Address,Fees;


    public mer_recycleitemdata(int img,String Name, String Rating, String Address,String Fees) {
        this.image = img;
        this.Name = Name;
        this.Rating = Rating;
        this.Address=Address;
        this.Fees=Fees;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String Rating) {
        this.Rating = Rating;
    }

    public String getAddress() { return Address; }

    public void setAddress(String Address) { this.Address = Address; }


    public String getFees() { return Fees; }

    public void setFees(String Fees) { this.Fees = Fees; }




}
