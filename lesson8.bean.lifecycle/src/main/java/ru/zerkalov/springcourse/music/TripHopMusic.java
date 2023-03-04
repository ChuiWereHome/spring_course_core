package ru.zerkalov.springcourse.music;


public class TripHopMusic implements Music {
    private TripHopMusic() {
    }

    public static TripHopMusic createTripHopMusic() {
        return new TripHopMusic();
    }

    public void beanInit() {
        System.out.println("Do TripHopMusic initialization ");
    }

    public void beanDestroy() {
        System.out.println("Do TripHopMusic destroy ");
    }

    @Override
    public String getSong() {
        return "Gorillaz ::: Clint Eastwood";
    }
}
