package lotto.domain;

import java.util.ArrayList;
import java.util.List;

public class LottoStore {

    private final static int LOTTO_PRICE_PER_ONE = 1000;
    private final List<LottoGenerator> lottoGenerators = new ArrayList<>();

    public LottoStore(LottoGenerator lottoGenerator) {

    }

    public List<Lotto> buy(int price, ManualLottoMemo memo) {
        validatePrice(price);

    }

    private int getPossibleBuyCount(int price) {

    }

    private static void validatePrice(int price) {
        if(price < LOTTO_PRICE_PER_ONE) {
            throw new IllegalArgumentException("입력된 금액이 로또구매 최소금액보다 작습니다.");
        }
    }
}
