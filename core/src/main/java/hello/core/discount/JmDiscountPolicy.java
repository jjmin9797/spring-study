package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class JmDiscountPolicy implements DiscountPolicy{

    private static double COMMON_DISCOUNT_PERCENT = 0.05;
    private static double VIP_DISCOUNT_PERCENT = 0.1;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade()== Grade.VIP) {
            return (int) Math.round(VIP_DISCOUNT_PERCENT * price);
        }else {
            return (int) Math.round(COMMON_DISCOUNT_PERCENT * price);
        }
    }
}
