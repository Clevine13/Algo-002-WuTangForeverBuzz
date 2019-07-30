package hbcu.stay.ready.algorithms;

public class WuTangForeverBuzz {

    public String wuTangClan(){
        int count = 0;
        String Wutang = "";
        while(count < 15){
            count++;
            if((count %3==0) && (count%5==0)){
                System.out.println(Wutang += "WuTang Forever");
            }
            else if( count%3==0){
                System.out.println(Wutang += "Wu\n");
            }
            else if(count %5==0){
                System.out.println(Wutang += "Tang\n");
            }
            else{
                System.out.println(Wutang += (count)+"\n");
            }
        }
        return Wutang;
    }
}
