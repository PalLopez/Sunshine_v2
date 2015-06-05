package mx.edu.utcancun.plopez.sunshine_v2;

public class Weather {

    private String day;
    private String weather;
    private String grades;

    public Weather(String day, String weather, String grades) {
        this.day = day;
        this.weather = weather;
        this.grades = grades;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

}
