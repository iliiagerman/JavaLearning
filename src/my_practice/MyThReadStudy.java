package my_practice;

public class MyThReadStudy {
    public static void main(String[] args) {
        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Не, ну тут все понятно");
            }
        });
        a.start();
    }
}
