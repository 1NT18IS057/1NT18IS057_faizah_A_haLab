package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int starttime = 0;
    int stoptime = 0;
    int forwardtime = 5000;
    int backwardtime = 5000;
    MediaPlayer mediaPlayer,mediaPlayernew;
    
    MediaPlayer createMedia(){
        mediaPlayernew = MediaPlayer.create(this, R.raw.song);
        return  mediaPlayernew;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = createMedia();
        
        
        mediaPlayer = MediaPlayer.create(this,R.raw.song);
        mediaPlayernew = MediaPlayer.create(this,R.raw.song);
        TextView songtitle = findViewById(R.id.songname);
        songtitle.setText("Radio");

        Button play=findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Toast.makeText(getApplicationContext(), "Playing Song", Toast.LENGTH_SHORT).show();
                mediaPlayer.start();
            }
        });

        Button pause=findViewById(R.id.pause);
        pause.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Toast.makeText(getApplicationContext(), "Pausing Song", Toast.LENGTH_SHORT).show();
                mediaPlayer.pause();
            }
        });

        Button forward=findViewById(R.id.forward);
        forward.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int currentpos = mediaPlayer.getCurrentPosition();
                if((currentpos+forwardtime) <= (stoptime = mediaPlayer.getDuration())){
                    mediaPlayer.seekTo(currentpos+forwardtime);
                }
            }
        });

        Button rewind=findViewById(R.id.rewind);
        rewind.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int currentpos = mediaPlayer.getCurrentPosition();
                if((currentpos-backwardtime)>=0){
                    mediaPlayer.seekTo(currentpos-backwardtime);
                }
            }
        });

        Button stop=findViewById(R.id.stop);
        stop.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Toast.makeText(getApplicationContext(), "Stopping Song", Toast.LENGTH_SHORT).show();
                mediaPlayer.stop();
                mediaPlayer=createMedia();
            }
        });

        Button restart=findViewById(R.id.restart);
        restart.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                Toast.makeText(getApplicationContext(), "Restarting Song", Toast.LENGTH_SHORT).show();
                mediaPlayer.reset();
                mediaPlayer=createMedia();
                mediaPlayer.start();
            }
        });

    }
}
