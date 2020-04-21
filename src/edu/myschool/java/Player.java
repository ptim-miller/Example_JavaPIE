package edu.myschool.java;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

// super simple audio player
public class Player {
    public static void play(String fileName)  {
        File projectDir = new File(System.getProperty("user.dir"));
        File audioFile = new File(projectDir + "/" + fileName);
        AudioInputStream audioStream = null;
        try {
            audioStream = AudioSystem.getAudioInputStream(audioFile);
        } catch (UnsupportedAudioFileException | IOException e) {
            e.printStackTrace();
        }
        AudioFormat format = null;
        if (audioStream != null) {
            format = audioStream.getFormat();
        }
        DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
        SourceDataLine audioLine = null;
        try {
            audioLine = (SourceDataLine) AudioSystem.getLine(info);
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
        try {
            if (audioLine != null) {
                audioLine.open(format);
            }
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
        if (audioLine != null) {
            audioLine.start();
        }
        int BUFFER_SIZE = 1024;
        byte[] bytesBuffer = new byte[BUFFER_SIZE];
        int bytesRead = -1;
        while (true) {
            try {
                if (audioStream != null && (bytesRead = audioStream.read(bytesBuffer)) == -1) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (audioLine != null) {
                audioLine.write(bytesBuffer, 0, bytesRead);
            }
        }
        if (audioLine != null) {
            audioLine.drain();
        }
        if (audioLine != null) {
            audioLine.close();
        }
        try {
            audioStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}