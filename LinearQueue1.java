class Test{
    private final int max=10;
    private int R,F;
    private int data[];

    void init(){

        data=new int[max];
        F=R=-1;
    }
    void insert(int n){
        if(R==max-1){
            System.out.println("Queue overflow");

        }
        else{
            R++;
            data[R]=n;
            if(F==-1){
                F=0;
            }
        }
    }
    int deleteQ(){
        if(F==-1){
            System.out.println("Queue is empty");
            return 0;
        }
        else{
            int c;
            c=data[F];
            data[F]=0;
            if(F==R){
                F=-1;
                R=-1;
            }
            else{
                F++;
            }
            return c;
        }
    }
    void Display(){
        int i;
        for(i=0;i<=R;i++){
            System.out.print(data[i]+" ");
        }
    }
}
class LinearQueue1{
    public static void main(String args[]){
        Test x=new Test();
        x.init();
        x.insert(32);
        x.insert(542);
        x.insert(53);
        x.insert(62);
        x.Display();

    }
}