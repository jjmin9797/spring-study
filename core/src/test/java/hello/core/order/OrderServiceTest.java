package hello.core.order;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {
    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        Member member = createDummyMember();
        memberService.join(member);
        Order order = orderService.createOrder(member.getId(), "아이폰", 1750000);
        Assertions.assertThat(order.calculatePrice()).isEqualTo(1749000);
    }


    public Member createDummyMember() {
        return new Member(1L, "member1", Grade.VIP);
    }
}
