package id.apuse.list;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import id.apuse.list.adapter.ListNationAdapter;
import id.apuse.list.model.Nation;
import id.apuse.list.model.NationData;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvNation;
    private ArrayList<Nation> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvNation = findViewById(R.id.rv_nation);
        rvNation.setHasFixedSize(true);

        list.addAll(NationData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvNation.setLayoutManager(new LinearLayoutManager(this));
        ListNationAdapter listNationAdapter = new ListNationAdapter(list);
        rvNation.setAdapter(listNationAdapter);

        listNationAdapter.setOnItemClickCallback(new ListNationAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Nation data) {
                showSelectedNation(data);
            }
        });
    }

    private void showSelectedNation(Nation nation) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("NEGARA", nation.getName());
        intent.putExtra("FOTO", nation.getPhoto());
        intent.putExtra("DETAIL", nation.getDetail());
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_profile, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_profile:
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
                break;
        }
    }
}
