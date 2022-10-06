public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            Movie randomMovie = randomMovie();
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Selected Movie : " + randomMovie.getName());
            System.out.println("Plot : " + randomMovie.plot());
            System.out.println("-------------------------------------------------------------------");
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 6 + 1);
        System.out.println("Random number generated : " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new Deadpool();
            case 3:
                return new Xmen();
            case 4:
                return new Hulk();
            case 5:
                return new MazeRunner();
            case 6:
                return new Forgettable();
            default:
                return null;
        }
    }
}

class Movie {
    String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot() {
        return "there is no plot";
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("jaws");
    }

    @Override
    public String plot() {
        return "A shark eats humans";
    }
}

class Deadpool extends Movie {
    public Deadpool() {
        super("deadpool");
    }

    @Override
    public String plot() {
        return "deadpool kills people";
    }
}

class Xmen extends Movie {
    public Xmen() {
        super("x-men");
    }

    @Override
    public String plot() {
        return "x-men saves the world";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("mazeRunner");
    }

    @Override
    public String plot() {
        return "kids try to escape a maze";
    }
}

class Hulk extends Movie {
    public Hulk() {
        super("hulk");
    }

    @Override
    public String plot() {
        return "hulk saves the world";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }
}