package ladder.v2.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ladder {
    private List<LadderLine> ladderLines;

    private Ladder(List<LadderLine> lines) {
        this.ladderLines = lines;
    }

    public static Ladder of(int countOfPerson, int length) {
        List<LadderLine> lines = new ArrayList<>();

        for(int i = 0; i < length; i++) {
            lines.add(LadderLine.init(countOfPerson));
        }
        return new Ladder(lines);
    }

    public static Ladder of(List<LadderLine> lines) {
        return new Ladder(lines);
    }

    public List<LadderLine> getLadderLines() {
        return ladderLines;
    }

    public int size() {
        return ladderLines.size();
    }

    public void move(int position) {
        ladderLines.stream().forEach(line -> {
        });
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ladder ladder = (Ladder) o;
        return Objects.equals(ladderLines, ladder.ladderLines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ladderLines);
    }

    @Override
    public String toString() {
        return "Ladder{" +
                "ladderLines=" + ladderLines +
                '}';
    }
}

