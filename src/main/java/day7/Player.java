package day7;

public class Player {
    static final int MAX_STAMINA = 100;
    static final int MIN_STAMINA = 0;
    static int countPlayers = 0;
    private int stamina;

    private boolean active = true;

    private static final int MAX_ALLOWED_NUMBER_OF_PLAYERS_PER_TEAM = 6;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < MAX_ALLOWED_NUMBER_OF_PLAYERS_PER_TEAM) {
            countPlayers++;
        }
    }

    public void run() {

        if (stamina > 0) {
            stamina--;
        }

        if (active && stamina <= 0) {
            System.out.println("Игрок устал");
            countPlayers--;
            active = false;
        }

    }

    public static void info(){
        if (countPlayers == MAX_ALLOWED_NUMBER_OF_PLAYERS_PER_TEAM) {
            System.out.println("На поле нет свободных мест");
        }else if (countPlayers < MAX_ALLOWED_NUMBER_OF_PLAYERS_PER_TEAM) { //если меньше 6 игроков
            int numberOfAvailablePlaces = MAX_ALLOWED_NUMBER_OF_PLAYERS_PER_TEAM - countPlayers; //разность
            System.out.println("Команды неполные. На поле есть еще " + numberOfAvailablePlaces + " свободных мест.");
        } else {
           System.out.println("Количество игроков на поле: " + countPlayers);
        }

    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int getStamina() {
        return stamina;
    }
}
