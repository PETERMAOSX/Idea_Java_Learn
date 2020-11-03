//package com.Design;
//
//public class t07 {
//    public static void main(String[] args) {
//        AudioPlayer player = new AudioPlayer();
//        player.Play("mp3","beyond the horizon.mp3");
//        player.Play("mp4","alone.mp4");
//        player.Play("vlc","far far away.vlc");
//        player.Play("avi","mind me.avi");
//    }
//}
//interface MediaPlayer{
//    public void Play(String audioType,String flieName);
//}
//interface AdvanceMediaPlayer{
//    public void PlayVic(String fileName);
//    public void PlayMp4(String fileName);
//}
//class VlcPlayer implements AdvanceMediaPlayer{
//
//    @Override
//    public void PlayVic(String fileName) {
//        System.out.println("Playing vlc file.Name: "+fileName);
//    }
//
//    @Override
//    public void PlayMp4(String fileName) {
//
//    }
//}
//class Mp4Player implements AdvanceMediaPlayer{
//
//    @Override
//    public void PlayVic(String fileName) {
//
//    }
//
//    @Override
//    public void PlayMp4(String fileName) {
//        System.out.println("Playing mp4 file. Name: "+fileName);
//    }
//}
//class MediaAdapter implements MediaPlayer{
//
//    AdvanceMediaPlayer advanceMediaPlayer;
//    public MediaAdapter(String audioType){
//        if(audioType.equalsIgnoreCase("vlc")){
//            advanceMediaPlayer = new VlcPlayer();
//        }
//        else if(audioType.equalsIgnoreCase("mp4")){
//            advanceMediaPlayer = new Mp4Player();
//        }
//    }
//    @Override
//    public void Play(String audioType, String flieName) {
//        if(audioType.equalsIgnoreCase("vlc")){
//           this.advanceMediaPlayer.PlayVic(flieName);
//        }
//        else if(audioType.equalsIgnoreCase("mp4")){
//            advanceMediaPlayer.PlayMp4(flieName);
//        }
//    }
//}
//class AudioPlayer implements MediaPlayer{
//    MediaAdapter adapter;
//    @Override
//    public void Play(String audioType, String flieName) {
//        if(audioType.equalsIgnoreCase("mp3")){
//            System.out.println("Playing mp3 file.Name: "+flieName);
//        }
//        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
//            adapter = new MediaAdapter(audioType);
//            adapter.Play(audioType,flieName);
//        }
//        else{
//            System.out.println("Invalid media "+audioType+" format not supported.");
//        }
//    }
//}