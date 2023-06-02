class Test{
    private final int max=10;
    private int data[];
    private int F,R;

    public void init(){
        data=new int[max];
        F=R=-1;
    }

    void insert(int n){
        if((F==0 && R==max-1) || (R+1==F)){
            System.out.println("Circular Queue is overflow ");
        }
        else {
            if(R==max-1){
                R=0;
            }
            else{

                R++;
            }
            data[R]=n;
            if(F==-1){
                F=0;
            }
        }
    }

    public void display(){
        int i;
        if(F<=R){
            for(i=F;i<=R;i++){
                System.out.print(data[i]+" ");
            }
        }
        else{
            for(i=F;i<=max-1;i++){
                System.out.print(data[i]+" ");
            }
            for(i=0;i<=R;i++){
                System.out.print(data[i]+" ");
            }
        }
    }
    int deleteQ(){
        int c;
    }
}
class CircularQueue1{
    public static void main(String args[]){
        Test x=new Test();
        x.init();
        x.insert(42);
        x.insert(53);
        x.insert(72);
        x.insert(41);
        x.insert(92);
        x.insert(15);

        x.display();
    }
}