package ch09;

public class AccessRule {

    public static class Allow {

        private String from;
        private String to;

        public Allow(String from, String to) {
            this.from = from;
            this.to = to;
        }
    }
    private Allow[] rules = new Allow[5];
    private int count = 0;

    public void add(Allow rule) {
        rules[count++] = rule;
    }

    public boolean checkAllow(String from, String to) {
        for (Allow rule : rules) {
            if (rule == null) { continue; }
            if (rule.from.equals(from) && rule.to.equals(to)) {
                return true;
            }
        }
        return false;
    }
}
