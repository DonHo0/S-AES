public class key{
    public static void main(String[] args) {
        int k[]={1,4,2,4,5};
        int k1[]={k[0],k[4]};
        for(int i=0;i<k1.length;i++){
            System.out.println(k1[i]+" "+i);
        }
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

}