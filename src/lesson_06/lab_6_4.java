package lesson_06;

public class lab_6_4 {
    public static void main(String[] args) {
        String url = "https://google.com";
        String [] urlFind = url.split("://");
        if(urlFind[0].equals("https")){
            System.out.println("https");
        }else
            System.out.println("http");
        if (urlFind[1].contains(".com")){
            System.out.println("domain name contain .com");
        }else
            System.out.println("domain name contain .net");
    }
}
