package com.company;

import java.util.HashMap;

public class ThirdPartyYoutube implements ThirdPartyYoutubeLib {

    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer("https://www.youtube.com");
        return getRandomVideos();
    }

    private HashMap<String, Video> getRandomVideos() {
        System.out.print("Downloading populars...");

        experienceNetworkLatency();
        HashMap<String, Video> videoMap = new HashMap<String, Video>();
        videoMap.put("catzzz", new Video("catzzz", "Catzzzz.avi"));
        videoMap.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
        videoMap.put("dancesvideoo", new Video("dancesvideoo", "Dancing video.mpq"));
        videoMap.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
        videoMap.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));

        System.out.println("Done!");
        return videoMap;
    }

    @Override
    public Video getVideo(String videoId) {
        connectToServer("https://www.youtube.com" + videoId);
        return getSomeVideo(videoId);
    }

    private Video getSomeVideo(String videoId) {
        System.out.print("Downloading video...");

        experienceNetworkLatency();
        Video video = new Video(videoId, "Some video title");

        System.out.println("Done!");
        return video;
    }

    private void connectToServer(String url) {
        System.out.print("Connecting to " + url + "...");
        experienceNetworkLatency();
        System.out.print("Connected!" + "\n");
    }

    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private void experienceNetworkLatency() {
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }


}
