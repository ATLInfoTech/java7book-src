package ch09;

public class AccessRuleTest {
    public static void main(String[] args) {
        AccessRule rule = new AccessRule();
        rule.add(new AccessRule.Allow("localhost", "www.jusic.site"));
        if (rule.checkAllow("localhost", "www.jusic.site")) {
            System.out.println("���");
        } else {
            System.out.println("����");
        }
    }
}
