package com.xubao.server.base;

import org.junit.Test;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author xubao
 * @Date 2018/2/5
 */
public class ScreenShotTest {

    @Test
    public void screenShotTest(){
        BufferedImage bufferedImage = ScreenShot.screenShot(500, 500);

        try (ImageOutputStream imageOutputStream = ImageIO.createImageOutputStream(new FileOutputStream("z://x.jpg"))) {
            ImageIO.write(bufferedImage,"jpg",imageOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void screenShotSpeedTest(){
        int times = 500;

        long interval = 0;
        long time = 0;

        for(int i = 0;i<times;i++){
            time = System.currentTimeMillis();
            interval-=time;
            System.out.println("startTime="+time);
            ScreenShot.screenShot(1000,500);
            time = System.currentTimeMillis();
            interval+=time;
            System.out.println("endTime="+time);
        }

        System.out.println(String.format("平均间隔 %d ms",interval/times));
    }

}
