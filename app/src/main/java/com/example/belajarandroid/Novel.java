package com.example.belajarandroid;


import android.os.Parcel;
import android.os.Parcelable;

public class Novel implements Parcelable {
    private String name;
    private String sinopsis;
    private int photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }





    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.sinopsis);
        dest.writeInt(this.photo);
    }

    public Novel() {
    }

    protected Novel(Parcel in) {
        this.name = in.readString();
        this.sinopsis = in.readString();
        this.photo = in.readInt();
    }

    public static final Parcelable.Creator<Novel> CREATOR = new Parcelable.Creator<Novel>() {
        @Override
        public Novel createFromParcel(Parcel source) {
            return new Novel(source);
        }

        @Override
        public Novel[] newArray(int size) {
            return new Novel[size];
        }
    };
}