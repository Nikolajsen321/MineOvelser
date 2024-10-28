public class ChainedException {
    /*
    Throwing en exception sammen med en anden exception former en kæde
    Når man skal kaste en exception med ekstra info sammen med den orginale exception

     */
    public static void main(String[] args) {
        //EX
        try {
            method1();
        }catch (Exception e){
            e.printStackTrace();

        }
    }
    public static void method1() throws Exception {
        try {
            method2();
        }catch (Exception e){
            throw new Exception("New info from method1",e);
        }
    }

    private static void method2() throws Exception {
        throw new Exception("New info form method2");
    }

    // for at fatte hvad der sker
    /*
    main metode kalder metode1  og metode1 kalder metode2 og metode2 throws en exception
    exception er fanges i  catch - blok i metode1 og wrapped i en ny exception
    den nye exception throws og caught i catch - blok  i main metode sample output
    viser output fra the printStackTrace() metode  den nye exception thrown fra metode1
    vises først efterfuglt af original exception thrown i metode2

       */
}
