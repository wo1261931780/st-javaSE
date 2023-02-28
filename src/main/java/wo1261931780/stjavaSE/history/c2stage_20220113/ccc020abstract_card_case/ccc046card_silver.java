package wo1261931780.stjavaSE.history.c2stage_20220113.ccc020abstract_card_case;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ccc046card_silver extends ccc044card {
    @Override
    public void pay(double prices) {
        log.info(getName() + "的银卡，当前余额" + getBalance() + "消费" + prices*0.85 + "剩余：" + (getBalance() - prices*0.85));
    }
}
