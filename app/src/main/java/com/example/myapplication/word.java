package com.example.myapplication;

public class word {
    private int mE;
    private int mM;
    private int mI = NO_IMAGE_PROVIDED;
    private final static int NO_IMAGE_PROVIDED = -1;
    private int AudioResourceId;

    public word(int English,int Miwok, int AudioId){
        mE = English;
        mM = Miwok;
        AudioResourceId = AudioId;
    }

    public word(int English, int Miwok, int ImageId, int AudioId){
        mE = English;
        mM = Miwok;
        mI = ImageId;
        AudioResourceId = AudioId;
    }

    public int getmE(){
        return mE;
    }

    public int getmM(){
        return mM;
    }

    public int getmI(){
        return mI;
    }

    public int getAudioResourceId(){
        return AudioResourceId;
    }

    public boolean hasImage(){
        return mI != NO_IMAGE_PROVIDED;
    }

}
