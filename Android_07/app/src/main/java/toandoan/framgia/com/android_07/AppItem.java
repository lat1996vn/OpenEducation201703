package toandoan.framgia.com.android_07;

/**
 * Created by framgia on 21/03/2017.
 */
public class AppItem {
    private int mImageResource;
    private String mTitle1;
    private String mTitle2;
    ;

    public AppItem(int imageResource, String title1, String title2) {
        mImageResource = imageResource;
        mTitle1 = title1;
        mTitle2 = title2;
    }

    public int getImageResource() {
        return mImageResource;
    }

    public void setImageResource(int imageResource) {
        mImageResource = imageResource;
    }

    public String getTitle1() {
        return mTitle1;
    }

    public void setTitle1(String title1) {
        mTitle1 = title1;
    }

    public String getTitle2() { return mTitle2; }

    public void setTitle2(String title2) { mTitle2 = title2; }
}
