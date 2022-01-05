
public class sbox{

public static void main (String[]args)
{
//int [][]sbox={{6,11,0,4},{7,14,2,15},{9,8,10,12},{3,1,5,13}};
//boolean[] r1={false,false,false,true};
//boolean[] r2={false,false,true,false};
//boolean[] r3={false,true,false,false};
boolean []p={false,false,true,true};
boolean p0=p[0];
//boolean []g=new boolean[4];
//int[]b=new int[4];
for (int i=1;i<p.length;i++){
     p[i-1]=p[i];
}
p[3]=p0;

/*int shtylla=p[0]+p[1];
int rreshti=2*p[2]+p[3];
int numri=sbox[shtylla][rreshti];
System.out.println(numri);
for(int j=0;j<b.length;j++){
   if(numri%2==1){
      b[j]=1;
      numri=numri/2;}
      else if(numri%2==0){
      b[j]=0;
      numri=numri/2;}
      System.out.println(b[j]);}
int b0=b[0]; int b1=b[1];int b2=b[2]; int b3=b[3];
b[0]=b3;b[1]=b2;b[2]=b1;b[3]=b0;
for (int k=0;k<b.length;k++){
      if(b[k]==1){
         g[k]=true;}
      else if(b[k]==0){
         g[k]=false;}
      System.out.print(g[k]);   
}
boolean[]key=new boolean[4]; 
for(int l=0;l<key.length;l++){
   key[l]=g[l]^r1[l];
   System.out.print(key[l]);
}*/

}}
