package spring.principal.core.discount;

import org.springframework.stereotype.Component;
import spring.principal.core.discount.interfaces.DiscountPolicy;
import spring.principal.core.member.Grade;
import spring.principal.core.member.Member;

@Component
public class FixDiscountPolicy implements DiscountPolicy {
    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
