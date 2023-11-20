import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void getCurrentRadNubmerTest() {
        Radio radtest = new Radio();

        int expected = 4;
        radtest.setcurrentRadNubmer(4);
        int actual = radtest.getCurrentRadNubmer();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNotCurrentRadNubmerTest() {
        Radio radtest = new Radio();

        int expected = 0;
        radtest.setcurrentRadNubmer(-1);
        int actual = radtest.getCurrentRadNubmer();
        Assertions.assertEquals(expected, actual);

        radtest.setcurrentRadNubmer(11);
        actual = radtest.getCurrentRadNubmer();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextTest() {
        Radio radtest = new Radio();

        int expected = 9;
        radtest.setcurrentRadNubmer(8);
        radtest.next();
        int actual = radtest.getCurrentRadNubmer();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNewCountTest() {
        Radio radTest = new Radio();

        int expected = 0;
        radTest.setcurrentRadNubmer(9);
        radTest.next();
        int actual = radTest.getCurrentRadNubmer();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevTest() {
        Radio radTest = new Radio();

        int expected = 2;
        radTest.setcurrentRadNubmer(3);
        radTest.prev();
        int actual = radTest.getCurrentRadNubmer();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNewCountTest() {
        Radio radTest = new Radio();

        int expected = 9;
        radTest.setcurrentRadNubmer(0);
        radTest.prev();
        int actual = radTest.getCurrentRadNubmer();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest() {
        Radio radTest = new Radio();

        int expected = 100;
        radTest.setCurrentVolume(99);
        radTest.increaseVolume();
        int actual = radTest.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeNoChangeTest() {
        Radio radTest = new Radio();

        int expected = 100;
        radTest.setCurrentVolume(100);
        radTest.increaseVolume();
        int actual = radTest.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeTest() {
        Radio radTest = new Radio();

        int expected = 0;
        radTest.setCurrentVolume(1);
        radTest.decreaseVolume();
        int actual = radTest.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeNoChangeTest() {
        Radio radTest = new Radio();

        int expected = 0;
        radTest.setCurrentVolume(0);
        radTest.decreaseVolume();
        int actual = radTest.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNotCurrentVolumeTest() {
        Radio radTest = new Radio();

        int expected = 0;
        radTest.setCurrentVolume(-1);
        int actual = radTest.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

        radTest.setCurrentVolume(101);
        actual = radTest.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
