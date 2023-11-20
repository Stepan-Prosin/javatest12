public class Radio {
    private int currentRadNubmer;
    private int currentVolume;

    public int getCurrentRadNubmer() {
        return currentRadNubmer;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newcurrentVolume) {
        if (newcurrentVolume < 0) {
            return;
        }
        if (newcurrentVolume > 100) {
            return;
        }
        currentVolume = newcurrentVolume;
    }

    public void setcurrentRadNubmer(int newcurrentRadNubmer) {
        if (newcurrentRadNubmer < 0) {
            return;
        }
        if (newcurrentRadNubmer > 9) {
            return;
        }
        currentRadNubmer = newcurrentRadNubmer;
    }

    public void next() {
        if (currentRadNubmer < 9) {
            currentRadNubmer = currentRadNubmer + 1;
        } else {
            currentRadNubmer = 0;
        }
    }

    public void prev() {
        if (currentRadNubmer > 0) {
            currentRadNubmer = currentRadNubmer - 1;
        } else {
            currentRadNubmer = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
