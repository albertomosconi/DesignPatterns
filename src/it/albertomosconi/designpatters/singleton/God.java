package it.albertomosconi.designpatters.singleton;

import java.util.ArrayList;
import java.util.List;

public class God {

    private static God instance;
    private final List<String> commandments;

    private God() {
        commandments = new ArrayList<>();
        commandments.add("1. Thou shalt run lint frequently and study its pronouncements with care, for verily its perception and judgement oft exceed thine.");
        commandments.add("2. Thou shalt not follow the NULL pointer, for chaos and madness await thee at its end.");
        commandments.add("3. Thou shalt cast all function arguments to the expected type if they are not of that type already, even when thou art convinced that this is unnecessary, lest they take cruel vengeance upon thee when thou least expect it.");
        commandments.add("4. If thy header files fail to declare the return types of thy library functions, thou shalt declare them thyself with the most meticulous care, lest grievous harm befall thy program.");
        commandments.add("5. Thou shalt check the array bounds of all strings (indeed, all arrays), for surely where thou typest ``foo'' someone someday shall type ``supercalifragilisticexpialidocious''.");
        commandments.add("6. If a function be advertised to return an error code in the event of difficulties, thou shalt check for that code, yea, even though the checks triple the size of thy code and produce aches in thy typing fingers, for if thou thinkest ``it cannot happen to me'', the gods shall surely punish thee for thy arrogance.");
        commandments.add("7. Thou shalt study thy libraries and strive not to re-invent them without cause, that thy code may be short and readable and thy days pleasant and productive.");
        commandments.add("8. Thou shalt make thy program's purpose and structure clear to thy fellow man by using the One True Brace Style, even if thou likest it not, for thy creativity is better used in solving problems than in creating beautiful new impediments to understanding.");
        commandments.add("9. Thy external identifiers shall be unique in the first six characters, though this harsh discipline be irksome and the years of its necessity stretch before thee seemingly without end, lest thou tear thy hair out and go mad on that fateful day when thou desirest to make thy program run on an old system.");
        commandments.add("10. Thou shalt foreswear, renounce, and abjure the vile heresy which claimeth that ``All the world's a VAX'', and have no commerce with the benighted heathens who cling to this barbarous belief, that the days of thy program may be long even though the days of thy current machine be short.");
    }

    public static God getInstance() {
        if (instance == null) {
            instance = new God();
        }
        return instance;
    }

    public String getCommandment() {
        return commandments.get((int)(Math.random()*commandments.size()));
    }
}
