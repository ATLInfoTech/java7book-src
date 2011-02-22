package ch09;

public abstract class BaseClass {
    private int value;
    public BaseClass(int value) {
        this.value = value;
    }
    public String getValue() {
        return Integer.toString(value);
    }
    
    public static void main(String[] args) throws Exception {
        BaseClass k = new BaseClass(11) {
            @Override
            public String getValue() {
                return super.getValue() + " added";
            }
        };
        System.out.println(k.getValue());
    }
}
