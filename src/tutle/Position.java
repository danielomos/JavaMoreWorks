package tutle;

import java.util.Objects;

public class Position {
    private int row;
    private  int column;
    public Position(int row, int column){
        this.row =row;
        this.column = column;

    }
    @Override
    public boolean equals(Object input){
        Position compared = (Position) input;
        if (row == compared.getRow() && column == compared.getColumn()) return true;
        return false;
    }

    @Override
    public String toString() {
        return "Position{" +
                "row=" + row +
                ", column=" + column +
                '}';
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
