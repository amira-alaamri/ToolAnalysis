public class OpenCGAToolAnalysis {

    public static void main(String[] args) {
        System.out.println("Hello World!");

       KhalifaTool kt = new KhalifaTool();

        try{
            System.out.println("try start()");

            kt.check();
            kt.start();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
