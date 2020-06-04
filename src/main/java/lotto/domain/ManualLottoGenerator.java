package lotto.domain;

import java.util.List;

public class ManualLottoGenerator implements LottoGenerator{

    private ManualLottoMemo manualLottoMemo;

    public ManualLottoGenerator(ManualLottoMemo manualLottoMemo) {
        this.manualLottoMemo = manualLottoMemo;
    }

    @Override
    public List<Lotto> generator() {

        return null;
    }
}
