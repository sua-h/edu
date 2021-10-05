package other;

public class NumberBox {
    private int val;

    public NumberBox(int val) {
        this.val = val;
    }

    public int getVal() {
        return this.val;
    }

    @Override
    public boolean equals(Object obj) {
        NumberBox temp = (NumberBox)obj;
        return temp.val == this.val;
    }

    @Override
    public String toString() {
        // 셋 다 가능
        // return this.val + "";
        // return Integer.toString(this.val);   // 정수만 가능
        return String.valueOf(this.val);        // 모든 타입 가능
    }


}
