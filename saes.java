import javax.swing.JOptionPane;

public class saes {
    public static void main(String[] args) {
    //boolean p[][]={{true,true,false,false,true,true,true,true},{false,false,false,false,true,true,true,true}};
    //int [][]sbox={{6,11,0,4},{7,14,2,15},{9,8,10,12},{3,1,5,13}};
    //int[]x={1,0,0,1};
    //int[]y={1,0,0,1};
    boolean[][]test={{true,false,true,false,false,false,true,false},{true,true,true,false,false,true,false,false}};
    boolean [][]key={{true,true,false,false,true,true,true,true},{true,false,true,false,false,false,false,true}};
    boolean[][]xor=new boolean[2][8];
    int [][]xor1=new int[2][8];
    for(int i=0;i<8;i++){
        xor[0][i]=test[0][i]^key[0][i];
        xor[1][i]=test[1][i]^key[1][i];
        if(xor[0][i]){
            xor1[0][i]=1;
        }
        if(xor[1][i]){
            xor1[1][i]=1;
        }
        //System.out.println(xor1[0][i]+" xor1 "+" xor2 "+ xor1[1][i]+" ");
    }
    //ShiftRows(Sbox(xor));
    //ShiftRows(p);
    //boolean []tst={false,true,true,false};
    //g(tst);
    key1(key);
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
    for(int g=0;g<2;g++){
        for(int j=0;j<8;j++){
            System.out.print(p[g][j]+" ");
        } 
    }
    
    return p;
}
public static boolean [][] MixColumms(boolean [][]p){
    //boolean mds [][]={{false,false,false,true,false,false,false,true},{false,false,false,true,false,false,true,false}};
    p=ShiftRows(p);
    for(int i=0;i<4;i++){
        p[0][i]=(p[0][i]);
    }
    for(int g=0;g<2;g++){
        for(int j=0;j<8;j++){
            System.out.print(p[g][j]+" ");
                }
            }
    return p;
    }
public static boolean []g(boolean k[]){
    boolean k0=k[0];
    int shtylla=0;
    int rreshti=0;    
    int [][]sbox={{6,11,0,4},{7,14,2,15},{9,8,10,12},{3,1,5,13}};
    for (int i=1;i<k.length;i++){
        k[i-1]=k[i];
          }
        k[3]=k0;
    int []b=new int[4];
    for(int j=0;j<k.length;j++){
        if(k[j]){
            b[j]=1;}
        //System.out.println(k[j]+" K ");
        }
    double b1[]={b[3],b[2]};
    double b2[]={b[1],b[0]};
    for(int l=0;l<2;l++){
        rreshti=(int)(rreshti+(b2[l]*Math.pow(2,l)));
    }
    for(int p=0;p<2;p++){
        shtylla=(int)(shtylla+(b1[p]*Math.pow(2,p)));
    }
    int x=sbox[shtylla][rreshti];
        //System.out.println(shtylla+" "+rreshti+" "+ x);
    
    int []b3=new int[4];
    boolean b4[]=new boolean[4];
        for(int j=b3.length-1;j>=0;j--){
               b3[j]=x%2;
               x=x/2;        
               }
        for(int f=0;f<b.length;f++){
          if(b3[f]==1){
            b4[f]=true;}        
           //System.out.println(b4[f]+" F ");     }
          }
        return b4;    
    }
    
         
public static boolean [][]key1(boolean k[][]){
    boolean[] k0={k[0][0],k[0][1],k[0][2],k[0][3]};
    boolean[] k1={k[0][4],k[0][5],k[0][6],k[0][7]};
    boolean[] k2={k[1][0],k[1][1],k[1][2],k[1][3]};
    boolean[] k3={k[1][4],k[1][5],k[1][6],k[1][7]};
    boolean[]k4=new boolean[4];
    boolean[]k5=new boolean[4];
    boolean[]k6=new boolean[4];
    boolean[]k7=new boolean[4];
    boolean fg[]=g(k3);
    boolean[] r1={false,false,false,true};
    for(int l=0;l<4;l++){
        fg[l]=fg[l]^r1[l];}
    for(int j=0;j<k0.length;j++){
        k4[j]=k0[j]^fg[j];
        //System.out.println(k4[j]);    
    }
    for(int j=0;j<k0.length;j++){
        k5[j]=k1[j]^k4[j];
    }
    for(int j=0;j<k0.length;j++){
        k6[j]=k2[j]^k5[j];
    }
    for(int j=0;j<k0.length;j++){
        k7[j]=k3[j]^k6[j];
    }
    boolean finalK1[][]={{k4[0],k4[1],k4[2],k4[3],k5[0],k5[1],k5[2],k5[3]},{k6[0],k6[1],k6[2],k6[3],k7[0],k7[1],k7[2],k7[3]}};
    for(int i=0;i<8;i++){
        System.out.println(finalK1[0][i]+" final0 "+finalK1[1][i]+" ");
    }
    return finalK1;}
    public static boolean [][]key2(boolean k[][]){
        boolean[] k4={k[0][0],k[0][1],k[0][2],k[0][3]};
        boolean[] k5={k[0][4],k[0][5],k[0][6],k[0][7]};
        boolean[] k6={k[1][0],k[1][1],k[1][2],k[1][3]};
        boolean[] k7={k[1][4],k[1][5],k[1][6],k[1][7]};
        boolean[]k8=new boolean[4];
        boolean[]k9=new boolean[4];
        boolean[]k10=new boolean[4];
        boolean[]k11=new boolean[4];
        boolean[] r2={false,false,true,false};
        boolean fg1[]=g(k7);
        for(int l=0;l<4;l++){
            fg1[l]=fg1[l]^r2[l];}
        for(int j=0;j<4;j++){
                k8[j]=k4[j]^fg1[j];}
        for(int j=0;j<4;j++){
                k9[ j]=k5[j]^k8[j];}
        for(int j=0;j<4;j++){
                k10[j]=k6[j]^k9[j];}
        for(int j=0;j<4;j++){
                k11[j]=k7[j]^k10[j];}
        boolean finalK2[][]={{k8[0],k8[1],k8[2],k8[3],k9[0],k9[1],k9[2],k9[3]},{k10[0],k10[1],k10[2],k10[3],k11[0],k11[1],k11[2],k11[3]}};
        return finalK2;}
public static boolean [][]key3(boolean k[][]){
    boolean[] k8={k[0][0],k[0][1],k[0][2],k[0][3]};
    boolean[] k9={k[0][4],k[0][5],k[0][6],k[0][7]};
    boolean[] k10={k[1][0],k[1][1],k[1][2],k[1][3]};
    boolean[] k11={k[1][4],k[1][5],k[1][6],k[1][7]};
    boolean[]k12=new boolean[4];
    boolean[]k13=new boolean[4];
    boolean[]k14=new boolean[4];
    boolean[]k15=new boolean[4];
    boolean r3[]={false,true,false,false};    
    boolean fg2[]=g(k11);
    for(int l=0;l<4;l++){
        fg2[l]=fg2[l]^r3[l];}        
    for(int j=0;j<4;j++){
            k12[j]=k8[j]^fg2[j];}
    for(int j=0;j<4;j++){
            k13[j]=k9[j]^k12[j];}
    for(int j=0;j<4;j++){
            k14[j]=k10[j]^k13[j];}
    for(int j=0;j<4;j++){
            k15[j]=k11[j]^k14[j];}
    boolean finalK3[][]={{k12[0],k12[1],k12[2],k12[3],k13[0],k13[1],k13[2],k13[3]},{k14[0],k14[1],k14[2],k14[3],k15[0],k15[1],k15[2],k15[3]}}; 
    return finalK3;
}
        
           
public static boolean [][]Sbox(boolean p[][]){
    int [][]sbox={{6,11,0,4},{7,14,2,15},{9,8,10,12},{3,1,5,13}};
    int shtylla=0;
    int rreshti=0;
    int shtylla1=0;
    int rreshti1=0;
    int shtylla2=0;
    int rreshti2=0;
    int shtylla3=0;
    int rreshti3=0;
    double b[][]=new double[2][8];
    for(int d=0;d<8;d++){
        if(p[0][d]){
            b[0][d]=1;
        }
        if(p[1][d]){
            b[1][d]=1;
        }}
    double []p2 ={b[0][7],b[0][6]};
    double []p3 ={b[0][5],b[0][4]};
    double []p0 ={b[0][3],b[0][2]};
    double []p1 ={b[0][1],b[0][0]};
    double []p6 ={b[1][7],b[1][6]};
    double []p7 ={b[1][5],b[1][4]};
    double []p4 ={b[1][3],b[1][2]};    
    double []p5 ={b[1][1],b[1][0]};
    for(int i=0;i<2;i++){
    rreshti=(int)(rreshti+(p0[i]*Math.pow(2,i)));
    }
    for(int j=0;j<2;j++){
    shtylla=(int)(shtylla+(p1[j]*Math.pow(2,j)));
    }
    int x=sbox[shtylla][rreshti];

    for(int i=0;i<2;i++){
        rreshti1=(int)(rreshti1+(p2[i]*Math.pow(2,i)));
    }
    for(int j=0;j<2;j++){
        shtylla1=(int)(shtylla1+(p3[j]*Math.pow(2,j)));
    }
    int x1=sbox[shtylla1][rreshti1];

    for(int i=0;i<2;i++){
        rreshti2=(int)(rreshti2+(p4[i]*Math.pow(2,i)));
    }
        for(int j=0;j<2;j++){
        shtylla2=(int)(shtylla2+(p5[j]*Math.pow(2,j)));
    }
    int x2=sbox[shtylla2][rreshti2];
    for(int i=0;i<2;i++){
        rreshti3=(int)(rreshti3+(p6[i]*Math.pow(2,i)));
    }
    for(int j=0;j<2;j++){
        shtylla3=(int)(shtylla3+(p7[j]*Math.pow(2,j)));
    }
    int x3=sbox[shtylla3][rreshti3];
    System.out.println(x+" "+x1+" "+x2+" "+x3);
    boolean p11[]=new boolean[4];
    boolean p12[]=new boolean[4];
    boolean p13[]=new boolean[4];
    boolean p14[]=new boolean[4];
    int y[]=new int[4];
    int y1[]=new int[4];
    int y2[]=new int[4];
    int y3[]=new int[4];    
        
    for(int j=y.length-1;j>=0;j--){
        y[j]=x%2;
        x=x/2;}
    for(int k=0;k<y.length;k++){
        if(y[k]==1){
        p11[k]=true;}
        } 
    for(int j=y.length-1;j>=0;j--){
            y1[j]=x1%2;
            x1=x1/2;}
    for(int k=0;k<y.length;k++){
        if(y1[k]==1){
        p12[k]=true;}
        }
    for(int j=y.length-1;j>=0;j--){
        y2[j]=x2%2;
        x2=x2/2;}
    for(int k=0;k<y.length;k++){
        if(y2[k]==1){
        p13[k]=true;}
        }
    for(int j=y.length-1;j>=0;j--){
        y3[j]=x3%2;
        x3=x3/2;}
    for(int k=0;k<y.length;k++){
        if(y3[k]==1){
        p14[k]=true;}
        }
    boolean [][] finalp={{p11[0],p11[1],p11[2],p11[3],p12[0],p12[1],p12[2],p12[3]},{p13[0],p13[1],p13[2],p13[3],p14[0],p14[1],p14[2],p14[3]}};   
    return finalp;}
}/*boolean[]k8=new boolean[4];
boolean[]k9=new boolean[4];
boolean[]k10=new boolean[4];
boolean[]k11=new boolean[4];
boolean[]k12=new boolean[4];
boolean[]k13=new boolean[4];
boolean[]k14=new boolean[4];
boolean[]k15=new boolean[4];*/