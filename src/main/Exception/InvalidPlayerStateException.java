package Exception;

public class InvalidPlayerStateException extends Exception {
    public InvalidPlayerStateException()
    {
        System.out.println("L'état du point d'un joueur est invalide");
    }
}
