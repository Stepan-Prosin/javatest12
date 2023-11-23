public class Radio {
    private int currentRadNubmer;
    private int currentVolume;
    private final int quantityofRads;

    public Radio() {
        quantityofRads = 10;
    }

    public Radio(int newcurrentRadNubmer) {
        quantityofRads = newcurrentRadNubmer;
    }

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
        if (newcurrentRadNubmer > quantityofRads - 1) {
            return;
        }
        currentRadNubmer = newcurrentRadNubmer;
    }

    public void next() {
        if (currentRadNubmer < quantityofRads - 1) {
            currentRadNubmer = currentRadNubmer + 1;
        } else {
            currentRadNubmer = 0;
        }
    }

    public void prev() {
        if (currentRadNubmer > 0) {
            currentRadNubmer = currentRadNubmer - 1;
        } else {
            currentRadNubmer = quantityofRads - 1;
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
