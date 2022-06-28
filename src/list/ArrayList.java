package list;

import list.List;

public class ArrayList implements List {
    private boolean isEmpty = true;
    private int size;
    private String[] element = new String[8];


    @Override
    public boolean isEmpty() {
   return  size == 0;
    }

    @Override
    public void add(String item) {
        element[size++] = item;

    }

    @Override
    public void remove(String item) {

        --size;
        for (String j : element){
            element[size-1] = j;
    }
        }



    @Override
    public int size() {
        return size;
    }
    @Override
    public  String get(int index){
        return element[index];
}

}
