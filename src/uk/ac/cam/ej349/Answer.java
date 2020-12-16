package uk.ac.cam.ej349;

public class Answer extends Exception {
    private int mAns;
    public Answer(int a) { mAns=a; }
    public int getAns() {return mAns;}
}
