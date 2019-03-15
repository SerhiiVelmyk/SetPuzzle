package utils;

import consts.CardInit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class Utils {
    private static List<int[]> sets = new ArrayList<>();
    private static int count = 1;
    private static Map<Integer, String> winningCombinations = new HashMap<>();

    public static Consumer<Integer> printWinningCombination = key -> System.out.println(winningCombinations.get(key));

    public static List<int[]> getSetsCombinations(List<Integer> pngIndexes) {
        int[] data = new int[3];
        generateAllPossibleSets(pngIndexes, data, 0, pngIndexes.size() - 1, 0, 3);

        return sets;
    }

    private static void generateAllPossibleSets(List<Integer> pngIndexes, int[] data, int start,
                                                int end, int index, int r) {
        if (index == r) {
            if (isSetValid(data)) {
                int[] validArray = data.clone();
                sets.add(validArray);
            }

            return;
        }

        for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
            data[index] = pngIndexes.get(i);
            generateAllPossibleSets(pngIndexes, data, i + 1, end, index + 1, r);
        }
    }

    private static boolean isSetValid(int[] data) {
        List<String> firstCard = CardInit.cardMap.get(data[0]);
        List<String> secondCard = CardInit.cardMap.get(data[1]);
        List<String> thirdCard = CardInit.cardMap.get(data[2]);

        if (firstCard == null || secondCard == null || thirdCard == null) {
            return false;
        }

        boolean isShapeValid = (firstCard.get(0).equals(secondCard.get(0))
                && secondCard.get(0).equals(thirdCard.get(0))) || (!firstCard.get(0).equals(secondCard.get(0))
                && !secondCard.get(0).equals(thirdCard.get(0)) && !firstCard.get(0).equals(thirdCard.get(0)));

        boolean isColorValid = (firstCard.get(1).equals(secondCard.get(1))
                && secondCard.get(1).equals(thirdCard.get(1))) || (!firstCard.get(1).equals(secondCard.get(1))
                && !secondCard.get(1).equals(thirdCard.get(1)) && !firstCard.get(1).equals(thirdCard.get(1)));

        boolean isNumberValid = (firstCard.get(2).equals(secondCard.get(2))
                && secondCard.get(2).equals(thirdCard.get(2))) || (!firstCard.get(2).equals(secondCard.get(2))
                && !secondCard.get(2).equals(thirdCard.get(2)) && !firstCard.get(2).equals(thirdCard.get(2)));

        boolean isShadingValid = (firstCard.get(3).equals(secondCard.get(3))
                && secondCard.get(3).equals(thirdCard.get(3))) || (!firstCard.get(3).equals(secondCard.get(3))
                && !secondCard.get(3).equals(thirdCard.get(3)) && !firstCard.get(3).equals(thirdCard.get(3)));

        if (isShapeValid && isColorValid && isNumberValid && isShadingValid) {
            winningCombinations.put(count, "Winning set #" + count++ + ": "
                    + splitList(firstCard) + " & " + splitList(secondCard) + " & " + splitList(thirdCard));

            return true;
        }

        return false;
    }

    private static String splitList(List<String> list) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));

            if (i != list.size() - 1) {
                sb.append(" ");
            }
        }

        return String.valueOf(sb);
    }
}
