package streams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class BasicStreams
{
    public static void main(String[] args) {
        //Intialization the driver
      int a[] ={1,3,2,10};
    int b =  Arrays.stream(a).max().getAsInt();
        System.out.println(b);


    }
}
