package lotto.domain;

import java.util.Objects;

public class LottoNumber {
    public static final int LOTTO_START_NUMBER = 1;
    public static final int LOTTO_LAST_NUMBER = 45;

    private final int number;

    private LottoNumber(int number) {
        validateOutOfRange(number);
        this.number = number;
    }

    public static LottoNumber of(int number) {
        return new LottoNumber(number);
    }

    private void validateOutOfRange(int number) {
        if(number < LOTTO_START_NUMBER || number > LOTTO_LAST_NUMBER) {
            throw new IllegalArgumentException("로또 번호는 1~45 사이만 올 수 있습니다.");
        }
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LottoNumber that = (LottoNumber) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}
