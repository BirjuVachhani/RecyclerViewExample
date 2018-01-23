package com.birjuvachhani.recyclerviewexample;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by birju.vachhani on 22/01/18.
 */

public class DataHolder implements Parcelable {

    private int imageId;
    private String title;
    private String desc;
    private int thumbId;

    public DataHolder(int imageId, int thumbId, String title, String desc) {
        this.imageId = imageId;
        this.title = title;
        this.desc = desc;
        this.thumbId = thumbId;
    }

    public DataHolder(int imageId, String title, String desc) {
        this.imageId = imageId;
        this.title = title;
        this.desc = desc;
        this.thumbId = thumbId;
    }

    protected DataHolder(Parcel in) {
        imageId = in.readInt();
        title = in.readString();
        desc = in.readString();
        thumbId = in.readInt();
    }

    public static final Creator<DataHolder> CREATOR = new Creator<DataHolder>() {
        @Override
        public DataHolder createFromParcel(Parcel in) {
            return new DataHolder(in);
        }

        @Override
        public DataHolder[] newArray(int size) {
            return new DataHolder[size];
        }
    };

    public int getImageId() {
        return imageId;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getThumbId() {
        return thumbId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(imageId);
        dest.writeString(title);
        dest.writeString(desc);
        dest.writeInt(thumbId);
    }
}
