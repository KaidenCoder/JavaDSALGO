package OOPBonus.Average;

public class Player{
    String p_name;
    int jnumber, t_runs, innings, notouts;
    int avg;
    // complete the functions below to print the output in desired format
    void set(String name,int number,int runs,int inn,int nos){
        p_name = name;
        jnumber = number;
        t_runs = runs;
        innings = inn;
        notouts = nos;
//        findavg();

    }
    void findavg(){
        avg =  t_runs/(innings-notouts);
        System.out.print(avg);
    }

    void print(){
        avg =  jnumber;
        System.out.print(p_name+" " + jnumber+" "+t_runs+" " +innings+" "+ notouts+" ");
        findavg();
    }


}
