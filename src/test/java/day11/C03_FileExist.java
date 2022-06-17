package day11;

import org.junit.Test;

import java.awt.*;

public class C03_FileExist {
    @Test

    public void test01() {

        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));
        String dosyaYolu= System.getProperty("user.home")+"\\Desktop\\tex.txt";

        System.out.println(dosyaYolu);
        String farklikisim=System.getProperty("user.home");
        String ortakKisim="\\Desktop\\tex.txt";

    }
}
