package com.Here;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;

public class DockerSayHello {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
        WebDriver dr = new FirefoxDriver() ;
        Thread.sleep(10000);
        dr.get("http://www.amazon.in/");

    }

}
