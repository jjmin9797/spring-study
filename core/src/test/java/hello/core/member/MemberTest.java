package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberTest {
    private AppConfig appConfig;

    @Test
    void join() {
        MemberService memberService = appConfig.memberService();
        //given
        Member member = new Member(1L,"member1",Grade.VIP);
        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
