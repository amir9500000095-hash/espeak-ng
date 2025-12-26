package com.reecedunn.espeak;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        TextView text = findViewById(R.id.about_text);
        text.setText(
                "درباره ما\n\n" +
                "تیم شاپرک یک تیم مستقل و خلاق است که برای نابینایان و کاربران فارسی‌زبان ابزارهای کاربردی می‌سازد.\n\n" +
                "ما روی توسعه موتورهای صوتی، ابزارهای دسترس‌پذیر و فناوری‌های کمکی تمرکز داریم.\n\n" +
                "Powered by Shaparak Team\n\n" +
                "کانال تلگرام:\n" +
                "https://t.me/shaparakteamapp"
        );
    }
}
