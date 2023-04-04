public class Main {
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.name = "summer";
        System.out.println(weather.name);

        Wednesday wednesday=new Wednesday();
        wednesday.levelHumidity="40%";
        System.out.println(wednesday.levelHumidity);


        Temperature temp=new Temperature();
        temp.temper=75.3;
        System.out.println(temp.temper);

    }
}