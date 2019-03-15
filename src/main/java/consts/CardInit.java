package consts;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CardInit {

    public static Map<Integer, List<String>> cardMap = new HashMap<>();

    private static final String SQUIGGLE = "squiggle";
    private static final String DIAMOND = "diamond";
    private static final String OVAL = "oval";

    private static final String RED = "red";
    private static final String PURPLE = "purple";
    private static final String GREEN = "green";

    private static final String ONE = "one";
    private static final String TWO = "two";
    private static final String THREE = "three";

    private static final String SOLID = "solid";
    private static final String STRIPED = "striped";
    private static final String OUTLINED = "outlined";

    static {
        cardMap.put(1, Arrays.asList(SQUIGGLE, RED, ONE, SOLID));
        cardMap.put(2, Arrays.asList(SQUIGGLE, RED, TWO, SOLID));
        cardMap.put(3, Arrays.asList(SQUIGGLE, RED, THREE, SOLID));

        cardMap.put(4, Arrays.asList(SQUIGGLE, PURPLE, ONE, SOLID));
        cardMap.put(5, Arrays.asList(SQUIGGLE, PURPLE, TWO, SOLID));
        cardMap.put(6, Arrays.asList(SQUIGGLE, PURPLE, THREE, SOLID));

        cardMap.put(7, Arrays.asList(SQUIGGLE, GREEN, ONE, SOLID));
        cardMap.put(8, Arrays.asList(SQUIGGLE, GREEN, TWO, SOLID));
        cardMap.put(9, Arrays.asList(SQUIGGLE, GREEN, THREE, SOLID));

        cardMap.put(10, Arrays.asList(DIAMOND, RED, ONE, SOLID));
        cardMap.put(11, Arrays.asList(DIAMOND, RED, TWO, SOLID));
        cardMap.put(12, Arrays.asList(DIAMOND, RED, THREE, SOLID));

        cardMap.put(13, Arrays.asList(DIAMOND, PURPLE, ONE, SOLID));
        cardMap.put(14, Arrays.asList(DIAMOND, PURPLE, TWO, SOLID));
        cardMap.put(15, Arrays.asList(DIAMOND, PURPLE, THREE, SOLID));

        cardMap.put(16, Arrays.asList(DIAMOND, GREEN, ONE, SOLID));
        cardMap.put(17, Arrays.asList(DIAMOND, GREEN, TWO, SOLID));
        cardMap.put(18, Arrays.asList(DIAMOND, GREEN, THREE, SOLID));

        cardMap.put(19, Arrays.asList(OVAL, RED, ONE, SOLID));
        cardMap.put(20, Arrays.asList(OVAL, RED, TWO, SOLID));
        cardMap.put(21, Arrays.asList(OVAL, RED, THREE, SOLID));

        cardMap.put(22, Arrays.asList(OVAL, PURPLE, ONE, SOLID));
        cardMap.put(23, Arrays.asList(OVAL, PURPLE, TWO, SOLID));
        cardMap.put(24, Arrays.asList(OVAL, PURPLE, THREE, SOLID));

        cardMap.put(25, Arrays.asList(OVAL, GREEN, ONE, SOLID));
        cardMap.put(26, Arrays.asList(OVAL, GREEN, TWO, SOLID));
        cardMap.put(27, Arrays.asList(OVAL, GREEN, THREE, SOLID));


        cardMap.put(28, Arrays.asList(SQUIGGLE, RED, ONE, STRIPED));
        cardMap.put(29, Arrays.asList(SQUIGGLE, RED, TWO, STRIPED));
        cardMap.put(30, Arrays.asList(SQUIGGLE, RED, THREE, STRIPED));

        cardMap.put(31, Arrays.asList(SQUIGGLE, PURPLE, ONE, STRIPED));
        cardMap.put(32, Arrays.asList(SQUIGGLE, PURPLE, TWO, STRIPED));
        cardMap.put(33, Arrays.asList(SQUIGGLE, PURPLE, THREE, STRIPED));

        cardMap.put(34, Arrays.asList(SQUIGGLE, GREEN, ONE, STRIPED));
        cardMap.put(35, Arrays.asList(SQUIGGLE, GREEN, TWO, STRIPED));
        cardMap.put(36, Arrays.asList(SQUIGGLE, GREEN, THREE, STRIPED));

        cardMap.put(37, Arrays.asList(DIAMOND, RED, ONE, STRIPED));
        cardMap.put(38, Arrays.asList(DIAMOND, RED, TWO, STRIPED));
        cardMap.put(39, Arrays.asList(DIAMOND, RED, THREE, STRIPED));

        cardMap.put(40, Arrays.asList(DIAMOND, PURPLE, ONE, STRIPED));
        cardMap.put(41, Arrays.asList(DIAMOND, PURPLE, TWO, STRIPED));
        cardMap.put(42, Arrays.asList(DIAMOND, PURPLE, THREE, STRIPED));

        cardMap.put(43, Arrays.asList(DIAMOND, GREEN, ONE, STRIPED));
        cardMap.put(44, Arrays.asList(DIAMOND, GREEN, TWO, STRIPED));
        cardMap.put(45, Arrays.asList(DIAMOND, GREEN, THREE, STRIPED));

        cardMap.put(46, Arrays.asList(OVAL, RED, ONE, STRIPED));
        cardMap.put(47, Arrays.asList(OVAL, RED, TWO, STRIPED));
        cardMap.put(48, Arrays.asList(OVAL, RED, THREE, STRIPED));

        cardMap.put(49, Arrays.asList(OVAL, PURPLE, ONE, STRIPED));
        cardMap.put(50, Arrays.asList(OVAL, PURPLE, TWO, STRIPED));
        cardMap.put(51, Arrays.asList(OVAL, PURPLE, THREE, STRIPED));

        cardMap.put(52, Arrays.asList(OVAL, GREEN, ONE, STRIPED));
        cardMap.put(53, Arrays.asList(OVAL, GREEN, TWO, STRIPED));
        cardMap.put(54, Arrays.asList(OVAL, GREEN, THREE, STRIPED));


        cardMap.put(55, Arrays.asList(SQUIGGLE, RED, ONE, OUTLINED));
        cardMap.put(56, Arrays.asList(SQUIGGLE, RED, TWO, OUTLINED));
        cardMap.put(57, Arrays.asList(SQUIGGLE, RED, THREE, OUTLINED));

        cardMap.put(58, Arrays.asList(SQUIGGLE, PURPLE, ONE, OUTLINED));
        cardMap.put(59, Arrays.asList(SQUIGGLE, PURPLE, TWO, OUTLINED));
        cardMap.put(60, Arrays.asList(SQUIGGLE, PURPLE, THREE, OUTLINED));

        cardMap.put(61, Arrays.asList(SQUIGGLE, GREEN, ONE, OUTLINED));
        cardMap.put(62, Arrays.asList(SQUIGGLE, GREEN, TWO, OUTLINED));
        cardMap.put(63, Arrays.asList(SQUIGGLE, GREEN, THREE, OUTLINED));

        cardMap.put(64, Arrays.asList(DIAMOND, RED, ONE, OUTLINED));
        cardMap.put(65, Arrays.asList(DIAMOND, RED, TWO, OUTLINED));
        cardMap.put(66, Arrays.asList(DIAMOND, RED, THREE, OUTLINED));

        cardMap.put(67, Arrays.asList(DIAMOND, PURPLE, ONE, OUTLINED));
        cardMap.put(68, Arrays.asList(DIAMOND, PURPLE, TWO, OUTLINED));
        cardMap.put(69, Arrays.asList(DIAMOND, PURPLE, THREE, OUTLINED));

        cardMap.put(70, Arrays.asList(DIAMOND, GREEN, ONE, OUTLINED));
        cardMap.put(71, Arrays.asList(DIAMOND, GREEN, TWO, OUTLINED));
        cardMap.put(72, Arrays.asList(DIAMOND, GREEN, THREE, OUTLINED));

        cardMap.put(73, Arrays.asList(OVAL, RED, ONE, OUTLINED));
        cardMap.put(74, Arrays.asList(OVAL, RED, TWO, OUTLINED));
        cardMap.put(75, Arrays.asList(OVAL, RED, THREE, OUTLINED));

        cardMap.put(76, Arrays.asList(OVAL, PURPLE, ONE, OUTLINED));
        cardMap.put(77, Arrays.asList(OVAL, PURPLE, TWO, OUTLINED));
        cardMap.put(78, Arrays.asList(OVAL, PURPLE, THREE, OUTLINED));

        cardMap.put(79, Arrays.asList(OVAL, GREEN, ONE, OUTLINED));
        cardMap.put(80, Arrays.asList(OVAL, GREEN, TWO, OUTLINED));
        cardMap.put(81, Arrays.asList(OVAL, GREEN, THREE, OUTLINED));
    }
}
