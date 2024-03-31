package FirstPackage;

public class SecondClass<SECONDCLASS>{

    private SECONDCLASS i;
    private SECONDCLASS j;

    public String toString(){
        return "at start i = " + i + "\nat start j = "+j;
    }

    public SecondClass(SECONDCLASS i, SECONDCLASS j){
        this.i = i;
        this.j = j;
    }

    public SECONDCLASS GetI(){
        return i;
    }

    public SECONDCLASS GetJ(){
        return j;
    }

    public void Metod1(int i, int j){
        int newi = i + 20;
        int newj = j + 100;
        SecondClass<Integer> h2 = new SecondClass<>(newi, newj);

        System.out.println("new i = " + newi + "\n" + "new j = " + newj);
        h2.Metod2(newi, newj);
    }

    public int Metod2(int i, int j){

        int summ = i + j;
        float mult = i * j;
        System.out.println("sum (i, j) = " + summ + "\n" + "multiply (i,j) = " + mult);
        return 0;
    }
}

