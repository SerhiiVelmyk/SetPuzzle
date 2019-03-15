package tests;

import org.junit.jupiter.api.Test;
import pages.CompletionPage;
import pages.PuzzlePage;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static utils.Utils.getSetsCombinations;
import static utils.Utils.printWinningCombination;

class PuzzleTest extends BaseTest {

    @Test
    void puzzleSetTest() {
        int countSetsFound = 1;
        PuzzlePage puzzlePage = new PuzzlePage(driver);
        puzzlePage.openPuzzlePage();
        puzzlePage.acceptCookies();
        List<Integer> listOfImageIdsFromUI = puzzlePage.getListOfImageIdsFromUI();

        for (int[] setCombination : getSetsCombinations(listOfImageIdsFromUI)) {
            printWinningCombination.accept(countSetsFound);
            puzzlePage.inputSetCombination(setCombination);
            if (countSetsFound < 6)
                assertThat(puzzlePage.getSetMessageText(),
                        allOf(startsWith("GREAT! " + countSetsFound++ + " SET"), endsWith("found.")));
        }

        CompletionPage completionPage = new CompletionPage(driver);
        assertThat(completionPage.getCompletionTimeValue(),
                containsString("You completed today's puzzle in 0 hours 00 minutes"));
    }
}
