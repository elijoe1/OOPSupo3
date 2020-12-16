package uk.ac.cam.ej349;

public class ExceptionTest {
    private static void powaux(int x, int v, int n) throws Answer {
        if (n==0) throw new Answer(v);
        else powaux(x,v*x,n-1);
    }
    public static int pow(int x, int n) {
        try { powaux(x,1,n); }
        catch(Answer a) { return a.getAns(); }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(ExceptionTest.pow(3, -1));
    }
}