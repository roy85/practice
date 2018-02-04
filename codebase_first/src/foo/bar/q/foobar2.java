package foo.bar.q;

public class foobar2 {
    static int[][] pop;

    public static int[][] getPop(){
        return pop;
    }

    public static int getPosPop(int x,int y){
        return pop[x][y];
    }

    public static void setPop(int x,int y,int z){
        pop[x][y]=z;
    }


    public static int[][] answer(int[][] population, int x, int y, int strength) {
        pop=population;
        if(getPosPop(x,y)<=strength&&getPosPop(x,y)!=-1){
            setPop(x,y,-1);
        }
            if(x>0){
                if(getPosPop(x-1,y)<=strength&&getPosPop(x-1,y)!=-1){
                    setPop(x-1,y,-1);
                    answer(pop,x-1,y,strength);
                }

            }
            if(x<pop.length-1){
                if(getPosPop(x+1,y)<=strength&&getPosPop(x+1,y)!=-1){
                    setPop(x+1,y,-1);
                    answer(pop,x+1,y,strength);
                }
            }
            if(y<pop[x].length-1){
                if(getPosPop(x,y+1)<=strength&&getPosPop(x,y+1)!=-1){
                    setPop(x,y+1,-1);
                    answer(pop,x,y+1,strength);
                }

            }
            if(y>0){
                if(getPosPop(x,y-1)<=strength&&getPosPop(x,y-1)!=-1){
                    setPop(x,y-1,-1);
                    answer(pop,x,y-1,strength);
                }

            }
       return pop;
    }


    public static void main(String[] args) {
        int[][] pop={{6, 7, 2, 7, 6}, {6, 3, 1, 4, 7}, {0, 2, 4, 1, 10}, {8, 1, 1, 4, 9}, {8, 7, 4, 9, 9}};
        int[][] Out=answer(pop,2,1,5);
        for(int x=0;x<Out.length;x++){
            for(int y=0;y<Out[0].length;y++){
                System.out.printf(" %s ", Out[x][y]);
            }System.out.print("\n");

        }
        // TODO Auto-generated method stub

    }
}