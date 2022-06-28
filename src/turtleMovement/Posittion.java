package turtleMovement;

public class Posittion {
    private int column;
    private int row;
    public Posittion( int row, int column){
        this.row = row;
        this.column = column;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public String toString() {
        return "Posittion{" +
                "column=" + column +
                ", row=" + row +
                '}';
    }
    @Override
    public boolean equals(Object o){
        Posittion obejectToCompared = (Posittion) o;
        if (row == obejectToCompared.getRow() && column == obejectToCompared.getColumn()) return  true;
        else {
            return false;
        }
    }
}
