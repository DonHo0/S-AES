public class saes {
    public static void main(String[] args) {
    boolean p[][]={{true,true,false,false,true,true,true,true},{false,false,false,false,true,true,true,true}};
    
    ShiftRows(p);    
    }
public static boolean [][] ShiftRows (boolean [][]p){
    boolean p8=p[1][0];
    boolean p9=p[1][1];
    boolean p10=p[1][2];
    boolean p11=p[1][3];
    for(int i=4;i<8;i++){
        p[1][i-4]=p[1][i];
    }
    p[1][4]=p8;
    p[1][5]=p9;
    p[1][6]=p10;
    p[1][7]=p11;
    //for(int g=0;g<2;g++){
      //  for(int j=0;j<8;j++){
         //   System.out.print(p[g][j]+" ");
        //}
    //}
    return p;
}
public static boolean [][] MixColumms(boolean [][]p){
    boolean mds [][]={{false,false,false,true,false,false,false,true},{false,false,false,true,false,false,true,false}};
    p=ShiftRows(p);
    for(int i=0;i<2;i++){
        for(int j=i;j<8;j++){
            p[i][j]=mds[i][j]&p[i][j];
        }
    }
    for(int g=0;g<2;g++){
        for(int j=0;j<8;j++){
            System.out.print(p[g][j]+" ");
                }
            }
    return p;
    }
}
