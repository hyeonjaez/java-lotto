package lotto.console.PurchaseAmountInput;

import camp.nextstep.edu.missionutils.Console;
import lotto.domain.chart.NumberChart;

public class InputMoney {

    public int getAndVerifyMoney() {
        int purchaseMoney = getPurchaseMoney();
        verifyCommonMultipleOf1000(purchaseMoney);
        verifyEmptyMoney(purchaseMoney);

        return purchaseMoney;
    }

    private int getPurchaseMoney() {
        return Integer.parseInt(Console.readLine());
    }

    private void verifyCommonMultipleOf1000(int purchaseNumber) {
        if (purchaseNumber % NumberChart.LOTTO_MONEY.getValue() != 0) {
            throw new RuntimeException("[ERROR] 1000원 단위로 입력해야 합니다.");
        }
    }

    private void verifyEmptyMoney(int purchaseNumber) {
        if (purchaseNumber == NumberChart.EMPTY_MONEY.getValue()) {
            throw new RuntimeException("[ERROR] 돈을 내세요");
        }
    }
}
