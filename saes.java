public class saes {
    public static void main(String[] args) {
    boolean p[][]={{true,true,false,false,true,true,true,true},{false,false,false,false,true,true,true,true}};
    int [][]sbox={{6,11,0,4},{7,14,2,15},{9,8,10,12},{3,1,5,13}};
    int[]x={1,0,0,1};
    int[]y={1,0,0,1};
    boolean[]test={false,true,false,true};
    ShiftRows(p);
    g(test);
    
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
/*public static int dtb(int x){
    int []b=new int[4];
    boolean b1[]=new boolean[4];
    for(int j=b.length-1;j>=0;j--){
           b[j]=x%2;
           x=x/2;        
           }
    for(int k=0;k<b.length;k++){
      if(b[k]==1){
        b1[k]=true;
      }
    }
    return x;
    }
public static int[] binadd(int x[],int y[]){
    int []z=new int[5];
    for(int i=3;i>=0;i--){
        z[i]=y[i]+x[i];
        if(z[i]==2){
            z[i]=0;
            z[i-1]=z[i-1] +1;   }   
            int z1[]=new int[5];
                    z1[1]=z[0];
                    z1[2]=z[1];
                    z1[3]=z[2];
                    z1[4]=z[3];
                        z1[0]=1;
                        for(int k=0;k<z1.length;k++){
                        System.out.println(z1[k]);
                      }
                
                }
                return x;    }*/
public static boolean []g(boolean k[]){
    boolean k0=k[0];
    int shtylla=0;
    int rreshti=0;
    boolean[] r1={false,false,false,true};
    boolean[] r2={false,false,true,false};
    boolean[] r3={false,true,false,false};

    int [][]sbox={{6,11,0,4},{7,14,2,15},{9,8,10,12},{3,1,5,13}};
    for(int a=0;a<3;a++){
    for (int i=1;i<k.length;i++){
            k[i-1]=k[i];
            }
        k[3]=k0;
    int []b=new int[4];
    for(int j=0;j<k.length;j++){
        if(k[j]){
            b[j]=1;}
        //System.out.print(b[j]);
        }
    double b1[]={b[3],b[2]};
    double b2[]={b[1],b[0]};
    for(int l=0;l<2;l++){
        shtylla=(int)(shtylla+(b1[l]*Math.pow(2,l)));
    }
    for(int p=0;p<2;p++){
        rreshti=(int)(rreshti+(b2[p]*Math.pow(2,p)));
    }
    int x=sbox[shtylla][rreshti];
        System.out.println(shtylla+"  "+rreshti+" "+ x);
    
    int []b3=new int[4];
    boolean b4[]=new boolean[4];
        for(int j=b3.length-1;j>=0;j--){
               b3[j]=x%2;
               x=x/2;        
               }
        for(int f=0;f<b.length;f++){
          if(b3[f]==1){
            b4[f]=true;}        
                }
        if(a==0){
            for(int c=0;c<b4.length;c++){
                b4[c]=b4[c]^r1[c];
            }
        }else if(a==1){
            for(int c=0;c<b4.length;c++){
            b4[c]=b4[c]^r2[c];}
        }else if(a==3){
            for(int c=0;c<b4.length;c++){
            b4[c]=b4[c]^r3[c];}
        }
    }
        return k;    
    }
    
         
public static boolean []key(boolean k[]){
    boolean[] k0={k[0],k[1],k[2],k[3]};
    boolean[] k1={k[4],k[5],k[6],k[7]};
    boolean[] k2={k[8],k[9],k[10],k[11]};
    boolean[] k3={k[12],k[13],k[14],k[15]};
    
    
    return k;
}           
    
    

}

