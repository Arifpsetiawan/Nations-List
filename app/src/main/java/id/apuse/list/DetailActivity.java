package id.apuse.list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView tvNationName;
    ImageView ivNationPhoto;
    TextView tvNationDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvNationName = findViewById(R.id.tvNationName);
        ivNationPhoto = findViewById(R.id.ivNationPhoto);
        tvNationDetail = findViewById(R.id.tvNationDetail);

        Intent intent = getIntent();
        tvNationName.setText(intent.getStringExtra("NEGARA"));
        ivNationPhoto.setImageResource(intent.getIntExtra("FOTO", 0));
        tvNationDetail.setText(intent.getStringExtra("DETAIL"));
        getSupportActionBar().setTitle(intent.getStringExtra("NEGARA"));
    }
}
