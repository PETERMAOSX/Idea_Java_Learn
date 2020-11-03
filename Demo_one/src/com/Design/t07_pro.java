//package com.Design;
//
//
//public class t07_pro {
//    public static void main(String[] args) {
//        ProMedia media = new ProMedia();
//        media.Play("mp3","Here comes the sun.mp3");
//        media.Play("vlc","A Dog.vlc");
//        media.Play("mp4","Spider-Man.mp4");
//        media.Play("avi","Teacher Video.avi");
//    }
//}
//interface ExMediaPlayer{
//    void Play(String audioType,String FileName);
//}
//interface ANMediaPlayer{
//    void PlayMp4(String fileName);
//    void PlayVlc(String fileName);
//}
//class PlayMp4 implements ANMediaPlayer{
//
//    @Override
//    public void PlayMp4(String fileName) {
//        System.out.println("Playing a Mp4. Filename: "+fileName);
//    }
//
//    @Override
//    public void PlayVlc(String fileName) {
//
//    }
//}
//class PlayVlc implements ANMediaPlayer{
//
//    @Override
//    public void PlayMp4(String fileName) {
//
//    }
//
//    @Override
//    public void PlayVlc(String fileName) {
//        System.out.println("Playing a Vlc. Filename: "+fileName);
//    }
//}
//class MediaAdapter implements ExMediaPlayer{
//    private ANMediaPlayer anMediaPlayer;
//    public MediaAdapter(String audioType){
//        if(audioType.equalsIgnoreCase("vlc")){
//            this.anMediaPlayer = new PlayVlc();
//        }
//        else if(audioType.equalsIgnoreCase("mp4")){
//            this.anMediaPlayer = new PlayMp4();
//        }
//    }
//    @Override
//    public void Play(String audioType, String FileName) {
//        if (audioType.equalsIgnoreCase("vlc")) {
//            this.anMediaPlayer.PlayVlc(FileName);
//        } else if (audioType.equalsIgnoreCase("mp4")) {
//            this.anMediaPlayer.PlayMp4(FileName);
//        }
//    }
//}
//class ProMedia implements ExMediaPlayer{
//    MediaAdapter adapter;
//    @Override
//    public void Play(String audioType, String FileName) {
//        if(audioType.equalsIgnoreCase("mp3")){
//            System.out.println("Playing a Mp3. Filename: "+FileName);
//        }
//        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
//            this.adapter = new MediaAdapter(audioType);
//            adapter.Play(audioType,FileName);
//        }
//        else{
//            System.out.println("Error Type. Please Try again");
//        }
//    }
//}
//
