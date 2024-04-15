package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberSeriviceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        //given
        Member memberA = new Member(1L, "memberA", Grade.VIP);

        //when
        memberService.join(memberA);
        Member findMemeber = memberService.findMember(1L);

        //then
        Assertions.assertThat(memberA).isEqualTo(findMemeber);
    }
}
