package com.hitwe.frontend.automation.tests;

import org.apache.commons.lang3.RandomStringUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Given {

    public static String HITWE_LANDING_PAGE_URL = "https://m.hitwe.com/landing/inter?p=15276";

    public static void generateAndSaveLocallyRandomPhoto() {
        // Generate image
        int width = 640, height = 320;
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        File generatedFile = null;
        for (int y = 0; y < height; y++)
        {
            for (int x = 0; x < width; x++)
            {
                int a = (int)(Math.random()*256);
                int r = (int)(Math.random()*256);
                int g = (int)(Math.random()*256);
                int b = (int)(Math.random()*256);
                int p = (a<<24) | (r<<16) | (g<<8) | b;
                img.setRGB(x, y, p);
            }
        }
        // Save image on Linux computer
        try
        {
            String home = System.getProperty("user.home");
            generatedFile = new File(home + "/generated_photo.jpg");
            ImageIO.write(img, "jpg", generatedFile);
        }
        catch(IOException e)
        {
            System.out.println("Error: " + e);
        }
    }

    // Delete generated image stored on computer
    public static void deleteGeneratedPhotoFromComputer() {
        String home = System.getProperty("user.home");
        File savedFile = new File(home + "/generated_photo.jpg");
        savedFile.deleteOnExit();
    }

    // This method executes uploading file procedure via Linux system interactive window (I have laptop with Ubuntu OS)
    public static void uploadGeneratedPhotoFromComputer() throws AWTException {
        StringSelection ss = new StringSelection("generated_photo.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        Robot robot = new Robot();
        robot.delay(3000);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_HOME);
        robot.keyRelease(KeyEvent.VK_HOME);
        robot.keyPress(KeyEvent.VK_HOME);
        robot.keyRelease(KeyEvent.VK_HOME);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_F);
        robot.keyRelease(KeyEvent.VK_F);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

}
