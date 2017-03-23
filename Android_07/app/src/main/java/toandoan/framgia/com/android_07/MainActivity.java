package toandoan.framgia.com.android_07;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerStore;
    private StoreAdapter mAdapter;
    private List<AppItem> mAppItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerStore = (RecyclerView) findViewById(R.id.recycler_store);
        // 1. Set Layout manager
        mRecyclerStore.setLayoutManager(new LinearLayoutManager(this));


        // 2. Khoi tao adapter
        mAppItems = new ArrayList<>();
        mAppItems.add(new AppItem(R.drawable.ic_messenger, "1. Messenger","Facebook"));
        mAppItems.add(new AppItem(R.drawable.ic_zalo, "2. Zalo - Nhắn gửi yêu thương", "Zalo Group"));
        mAppItems.add(new AppItem(R.drawable.ic_zingmp3, "3. Zing MP3", "Zalo Group"));
        mAppItems.add(new AppItem(R.drawable.ic_facebook, "4. Facebook", "Facebook"));
        mAppItems.add(new AppItem(R.drawable.ic_facebook_lite, "5. Facebook Lite", "Facebook"));
        mAppItems.add(new AppItem(R.drawable.ic_camera360, "6. Camera360 - chụp ảnh đẹp", "PinGou Inc"));
        mAppItems.add(new AppItem(R.drawable.ic_nhac_cua_tui, "7. NhacCuaTui", "NCT Corporation"));
        mAppItems.add(new AppItem(R.drawable.ic_b612, "8. B612 - Selfiegenic Camera", "LINE Corporation"));
        mAppItems.add(new AppItem(R.drawable.ic_turbo_cleaner, "9. Turbo Cleaner - Boost, Clean", "Turboc Dev"));
        mAppItems.add(new AppItem(R.drawable.ic_snow, "10. SNOW - Tự sướng, nhãn dán", "SNOW team"));
        mAppItems.add(new AppItem(R.drawable.ic_grab, "11. Grab", "Grab Holding"));
        mAdapter = new StoreAdapter(mAppItems);

        // 3. set adapter cho recycler view
        mRecyclerStore.setAdapter(mAdapter);

    }
}
