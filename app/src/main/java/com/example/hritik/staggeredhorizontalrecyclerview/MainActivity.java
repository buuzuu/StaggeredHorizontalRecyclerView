package com.example.hritik.staggeredhorizontalrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerViewAdapter recyclerViewAdapter;
    private RecyclerView recyclerView, recyclerView2;
    public static final int NUM_COLUMNS = 2;
    ArrayList<String> mNames = new ArrayList<>();
    ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getImages();


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView2 = findViewById(R.id.recyclerView2);


        StaggeredRecyclerViewAdapter staggeredRecyclerViewAdapter = new StaggeredRecyclerViewAdapter(this, mNames, mImageUrls);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(NUM_COLUMNS, LinearLayoutManager.VERTICAL);
        recyclerView2.setLayoutManager(staggeredGridLayoutManager);
        recyclerView2.setAdapter(staggeredRecyclerViewAdapter);


        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerViewAdapter = new RecyclerViewAdapter(mNames, mImageUrls, this);


        recyclerView.setAdapter(recyclerViewAdapter);

    }

    private void getImages() {

        mImageUrls.add("https://vignette.wikia.nocookie.net/terminator/images/1/17/936full-emilia-clarke.jpg/revision/latest?cb=20150208140852");
        mNames.add("Emilia Clarke");

        mImageUrls.add("https://media1.popsugar-assets.com/files/thumbor/tJyBkf33DSLGOA5Dfc0zZkudcIc/fit-in/1024x1024/filters:format_auto-!!-:strip_icc-!!-/2017/08/15/732/n/2589278/856cb096599322c95f7811.66369148_edit_img_cover_file_43883586_1502814126/i/Kit-Harington-Looking-Sad-Photos.jpg");
        mNames.add("Kit Harington");

        mImageUrls.add("https://media.vanityfair.com/photos/5706ad417ba5c8311697b07e/master/w_768,c_limit/sophie-turner-vanities-matthew-brookes.jpg");
        mNames.add("Sophie Turner");

        mImageUrls.add("https://static.toiimg.com/thumb/62981209/Peter-Dinklage-aka-Tyrion-Lannister-is-in-Kashmir-and-we-cannot-keep-calm.jpg?width=748&height=499");
        mNames.add("Peter Dinklage");

        mImageUrls.add("https://imagesvc.timeincapp.com/v3/mm/image?url=https%3A%2F%2Fcdn-img.instyle.com%2Fsites%2Fdefault%2Ffiles%2Fstyles%2F684xflex%2Fpublic%2Fimages%2F2016%2F05%2F050516-maisie-williams.jpg%3Fitok%3DGiVwsNkW&w=700&q=85");
        mNames.add("Maisie Williams");

        mImageUrls.add("https://vignette.wikia.nocookie.net/headhuntershorrorhouse/images/0/01/Lena_Headey_002.jpg/revision/latest?cb=20180620000228");
        mNames.add("Lena Headey");

        mImageUrls.add("https://static1.squarespace.com/static/56c346b607eaa09d9189a870/596c745f59cc68c9110d636b/596c7465579fb3415cb9369d/1500280689115/NIKOLAJ_COSTER_WALDAU_4_7209.jpg?format=500w");
        mNames.add("Nikolaj Coster-Waldau");

        mImageUrls.add("https://www.interviewmagazine.com/wp-content/uploads/2015/12/img-gwendoline-christie_205334692782.jpg");
        mNames.add("Gwendoline Christie");

        mImageUrls.add("https://st.kp.yandex.net/im/kadr/2/5/5/kinopoisk.ru-Alfie-Allen-2556992.jpg");
        mNames.add("Alfie Allen");


        mImageUrls.add("http://iv1.lisimg.com/image/11711954/740full-indira-varma.jpg");
        mNames.add("Indira Varma");

        mImageUrls.add("https://pbs.twimg.com/profile_images/990234677888905218/FuJhFvG4_400x400.jpg");
        mNames.add("Rose Leslie");

        mImageUrls.add("https://imagesvc.timeincapp.com/v3/mm/image?url=https%3A%2F%2Fcdn-img.instyle.com%2Fsites%2Fdefault%2Ffiles%2Fstyles%2F684xflex%2Fpublic%2Fimages%2F2017%2F02%2F020917-natalie-dormer-embed.jpg%3Fitok%3D30nqIiRK&w=700&q=85");
        mNames.add("Natalie Dormer");


        mImageUrls.add("https://i.pinimg.com/originals/87/bc/dc/87bcdcb07bc8b69793ac4e1163c0056c.jpg");
        mNames.add("Nathalie Emmanuel");


        mImageUrls.add("https://vignette.wikia.nocookie.net/gameofthrones/images/8/8c/Iain_Glen_Game_Thrones_DVDpremiere.jpg/revision/latest?cb=20160707221818");
        mNames.add("Iain Glen");




    }
}
