package com.bort.vidplayer1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.longtailvideo.jwplayer.JWPlayerView;
import com.longtailvideo.jwplayer.configuration.PlayerConfig;
import com.longtailvideo.jwplayer.media.playlists.PlaylistItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    JWPlayerView mPlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mPlayerView = findViewById(R.id.jwplayer);

        /*
        PlaylistItem playlistItem = new PlaylistItem.Builder()
                .file("https://cdn.jwplayer.com/manifests/{MEDIA_ID}.m3u8")
                .build();

         */
        /*
        PlaylistItem playlistItem = new PlaylistItem.Builder()
                .file("https://cdn.jwplayer.com/manifests/{MEDIA_ID}.m3u8")
                .image("https://www.mydomain.com/poster.jpg")
                .title("Playlist-Item Title")
                .description("Some really great content")
                .build();

*/

        PlaylistItem pi = new PlaylistItem.Builder()
                .file("https://playertest.longtailvideo.com/adaptive/bipbop/gear4/prog_index.m3u8")
                .title("BipBop")
                .description("A video player testing video.")
                .build();



        List<PlaylistItem> playlist = new ArrayList<>();
        playlist.add(pi);
        PlayerConfig config = new PlayerConfig.Builder()
                .playlist(playlist)
                .build();
        mPlayerView.setup(config);

    }
    @Override
    protected void onStart() {
        super.onStart();
        mPlayerView.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPlayerView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mPlayerView.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mPlayerView.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPlayerView.onDestroy();
    }
}