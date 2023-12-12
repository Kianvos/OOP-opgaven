public class NumberDisplay {
    private int number;
    private int limit;

    public NumberDisplay(int number) {
        this.limit = 24;
        if (number < 0) {
            this.number = 0;
        } else if (number >= this.limit) {
            this.number = 0;
        } else {
            this.number = number;
        }
    }

    public NumberDisplay(int limit, int number) {
        this.limit = limit;
        if (number < 0) {
            this.number = 0;
        } else if (number >= limit) {
            this.number = 0;
        } else {
            this.number = number;
        }
    }

    public void setValue(int number) {
        if (number < 0) {
            return;
        } else if (number > this.limit) {
            return;
        } else {
            this.number = number;
        }
    }

    public int getValue() {
        return this.number;
    }

    public int getLimit() {
        return this.limit;
    }

    public boolean increment() {
        if (this.number+1 < this.limit){
            return false;
        }
        return  true;
    }

    public String toString(){
        return String.format("%02d", this.number);
    }
}
