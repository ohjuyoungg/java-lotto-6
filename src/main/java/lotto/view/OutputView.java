package lotto.view;

import java.util.List;
import lotto.domain.Lotto;
import lotto.service.LottoService;
import lotto.service.LottoWinningCalculator;
import lotto.utils.constants.Comment;
import lotto.utils.constants.LottoWinning;

public class OutputView {

    public static void printGameStartMessage() {
        System.out.println(Comment.INPUT_PURCHASE_AMOUNT.getComment());
    }

    public static void printLottoPurchaseAmount(int purchaseAmount) {
        LottoService.amountPurchaseDivide(purchaseAmount);
        System.out.println();
        System.out.println(purchaseAmount + Comment.OUTPUT_PURCHASE_AMOUNT.getComment());
    }

    public static void printLottoNumber(List<Lotto> lottoAllNumbers) {
        System.out.println(lottoAllNumbers);

        System.out.println();
        System.out.println(Comment.INPUT_WINNING_NUMBER.getComment());
    }

    public static void printLottoBonusNumber() {
        System.out.println();
        System.out.println(Comment.INPUT_BONUS_NUMBER.getComment());
    }

    public static void printLottoWinningStatistics() {
        System.out.println();
        System.out.println(Comment.INPUT_THREE_DASH.getComment());
        System.out.println(Comment.INPUT_WINNING_STATISTICS.getComment());
    }
}
