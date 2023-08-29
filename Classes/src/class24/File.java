package class24;

public abstract class File {

        abstract void open();
        void edit(){
            System.out.println("editing the file");
        }
        void close(){
            System.out.println("closing the file");
        }

}
class javafile extends File{
    @Override
    void open() {
        System.out.println("");
    }

    @Override
    void edit() {
        System.out.println("");
    }

    @Override
    void close() {
        System.out.println("");
    }
}
class WordFile extends File{
    @Override
    void open() {
        System.out.println("");
    }

    @Override
    void edit() {
        System.out.println("");
    }

    @Override
    void close() {
        System.out.println("");
    }
}




