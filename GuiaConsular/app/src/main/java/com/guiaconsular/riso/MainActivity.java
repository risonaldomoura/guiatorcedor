package com.guiaconsular.riso;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.icon_1) {
            final LinearLayout background_main = findViewById(R.id.background_main);
            PDFView pdfView = findViewById(R.id.pdfView);
            pdfView.fromAsset("part_1.pdf").load();
            background_main.setVisibility(View.GONE);
            pdfView.setVisibility(View.VISIBLE);

        } else if (id == R.id.icon_2) {
            final LinearLayout background_main = findViewById(R.id.background_main);
            PDFView pdfView = findViewById(R.id.pdfView);
            pdfView.fromAsset("part_2.pdf").load();
            background_main.setVisibility(View.GONE);
            pdfView.setVisibility(View.VISIBLE);

        } else if (id == R.id.icon_3) {
            final LinearLayout background_main = findViewById(R.id.background_main);
            PDFView pdfView = findViewById(R.id.pdfView);
            pdfView.fromAsset("part_3.pdf").load();
            background_main.setVisibility(View.GONE);
            pdfView.setVisibility(View.VISIBLE);

        } else if (id == R.id.icon_4) {
            final LinearLayout background_main = findViewById(R.id.background_main);
            PDFView pdfView = findViewById(R.id.pdfView);
            pdfView.fromAsset("part_4.pdf").load();
            background_main.setVisibility(View.GONE);
            pdfView.setVisibility(View.VISIBLE);

        } else if (id == R.id.icon_5) {
            final LinearLayout background_main = findViewById(R.id.background_main);
            PDFView pdfView = findViewById(R.id.pdfView);
            pdfView.fromAsset("part_5.pdf").load();
            background_main.setVisibility(View.GONE);
            pdfView.setVisibility(View.VISIBLE);

        } else if (id == R.id.icon_6) {
            final LinearLayout background_main = findViewById(R.id.background_main);
            PDFView pdfView = findViewById(R.id.pdfView);
            pdfView.fromAsset("part_6.pdf").load();
            background_main.setVisibility(View.GONE);
            pdfView.setVisibility(View.VISIBLE);

        } else if (id == R.id.icon_7_1) {
            final LinearLayout background_main = findViewById(R.id.background_main);
            PDFView pdfView = findViewById(R.id.pdfView);
            pdfView.fromAsset("part_7_1.pdf").load();
            background_main.setVisibility(View.GONE);
            pdfView.setVisibility(View.VISIBLE);

        }else if (id == R.id.icon_7_2) {
            final LinearLayout background_main = findViewById(R.id.background_main);
            PDFView pdfView = findViewById(R.id.pdfView);
            pdfView.fromAsset("part_7_2.pdf").load();
            background_main.setVisibility(View.GONE);
            pdfView.setVisibility(View.VISIBLE);

        }else if (id == R.id.icon_7_3) {
            final LinearLayout background_main = findViewById(R.id.background_main);
            PDFView pdfView = findViewById(R.id.pdfView);
            pdfView.fromAsset("part_7_3.pdf").load();
            background_main.setVisibility(View.GONE);
            pdfView.setVisibility(View.VISIBLE);

        } else if (id == R.id.icon_8) {
            final LinearLayout background_main = findViewById(R.id.background_main);
            PDFView pdfView = findViewById(R.id.pdfView);
            pdfView.fromAsset("part_8.pdf").load();
            background_main.setVisibility(View.GONE);
            pdfView.setVisibility(View.VISIBLE);

        } else if (id == R.id.icon_9) {
            PDFView pdfView = findViewById(R.id.pdfView);
            pdfView.fromAsset("part_9.pdf").load();

        } else if (id == R.id.icon_10) {
            final LinearLayout background_main = findViewById(R.id.background_main);
            PDFView pdfView = findViewById(R.id.pdfView);
            pdfView.fromAsset("part_10.pdf").load();
            background_main.setVisibility(View.GONE);
            pdfView.setVisibility(View.VISIBLE);

        } else if (id == R.id.icon_11){
            final LinearLayout background_main = findViewById(R.id.background_main);
            PDFView pdfView = findViewById(R.id.pdfView);
            pdfView.fromAsset("part_11.pdf").load();
            background_main.setVisibility(View.GONE);
            pdfView.setVisibility(View.VISIBLE);

        } else if (id == R.id.icon_12){
            final LinearLayout background_main = findViewById(R.id.background_main);
            PDFView pdfView = findViewById(R.id.pdfView);
            pdfView.fromAsset("part_12.pdf").load();
            background_main.setVisibility(View.GONE);
            pdfView.setVisibility(View.VISIBLE);

        } else if (id == R.id.icon_share){
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Compartilhe este guia com seus amigos!");
            shareIntent.putExtra(Intent.EXTRA_TEXT,"https://play.google.com/store/apps/details?id=com.guiaconsular.riso");
            startActivity(Intent.createChooser(shareIntent, "Compartilhar via"));

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
