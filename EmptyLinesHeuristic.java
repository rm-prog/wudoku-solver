public class EmptyLinesHeuristic implements Heuristic {
    @Override
    public int evaluate(Field field) {
        int score = 0;

        // Empty rows
        for (int i = 0; i < 9; i++) {
            boolean empty = true;
            for (int j = 0; j < 9; j++) {
                if (field.getCell(i, j) == 1) {
                    empty = false;
                    break;
                }
            }
            if (empty) score++;
        }

        // Empty columns
        for (int j = 0; j < 9; j++) {
            boolean empty = true;
            for (int i = 0; i < 9; i++) {
                if (field.getCell(i, j) == 1) {
                    empty = false;
                    break;
                }
            }
            if (empty) score++;
        }

        // Empty 3x3 blocks
        for (int br = 0; br < 9; br += 3) {
            for (int bc = 0; bc < 9; bc += 3) {
                boolean empty = true;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (field.getCell(br + i, bc + j) == 1) {
                            empty = false;
                            break;
                        }
                    }
                    if (!empty) break;
                }
                if (empty) score++;
            }
        }

        return score; 
    }
}

