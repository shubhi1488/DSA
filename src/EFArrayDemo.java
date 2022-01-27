public class EFArrayDemo {
    int arr[];
    public EFArrayDemo(){
        arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.MIN_VALUE;
        }
    }
    // method-1:to traverse the array
    public void traverse(){
        for (int res:arr) {
            System.out.println(res);

        }
    }
    //method-2:to insert the value in array
    public void insert(int index,int value){
        try {
            if(arr[index]==Integer.MIN_VALUE){
                arr[index]=value;
            }
            else{
                System.out.println("already filled");
            }
        }catch(ArrayIndexOutOfBoundsException obj){
            System.out.println("invalid index");
        }
    }
    //method-3:to print the specific value from the array
    public void getValue(int index){
        try{
            System.out.println(arr[index]);
        }catch(ArrayIndexOutOfBoundsException obj){
            System.out.println("invalid index");
        }
    }
    //method-4:search a value in the array
    public void search(int value){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==value){
                System.out.println("value found");
                return;
            }

        }
        System.out.println("value not found");
    }
    //method-5:to delete the value from the array
    public void delete(int index){
        try{
            arr[index]=Integer.MIN_VALUE;
        }catch(ArrayIndexOutOfBoundsException obj){
            System.out.println("invalid index");
        }
    }
    //method-6:method to delete the array
    public void deleteArray(){
        arr=null;//bcz array is considered as reference type
    }
}
class EFTest{
    public static void main(String[] args) {
        EFArrayDemo obj1=new EFArrayDemo();
        obj1.insert(1,50);
        obj1.insert(2,60);
        obj1.insert(0,40);
        obj1.insert(3,70);
        obj1.insert(4,80);
        //obj1.traverse();
        //obj1.getValue(1);
       // obj1.search(90);
       // obj1.getValue(0);
       // obj1.deleteArray();
    }
}
