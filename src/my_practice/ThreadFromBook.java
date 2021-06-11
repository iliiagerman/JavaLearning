package my_practice;

class ThreadFromBook implements Runnable {
    String name;

    public ThreadFromBook(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("я тут для того чтоб выводить наэкран то что хочется"+i);
        }

    }
}

class MyClassThread {
    public static void main(String[] args) {

        ThreadFromBook threadFromBook = new ThreadFromBook("Поток1");
        Thread a = new Thread(threadFromBook);
        a.start();
    }
}