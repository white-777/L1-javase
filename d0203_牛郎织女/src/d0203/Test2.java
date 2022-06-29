package d0203;

public class Test2 {
    public static void main(String[] args) {
        long gn=29999999*60*60*24*365;
        double gl=16.4*gn;
        double z=gl/0.46;
        long n=(long)Math.ceil(z);
    }
}
