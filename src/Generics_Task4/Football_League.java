package Generics_Task4;

public class Football_League<T> {
    private T league;

    public Football_League(T league) {
            this.league = league;
    }

    public T getLeague() {
        return league;
    }
}


