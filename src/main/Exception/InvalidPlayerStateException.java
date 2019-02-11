package Exception;

public class InvalidPlayerStateException extends Exception {
    public InvalidPlayerStateException()
    {
        System.err.println("InvalidPlayerStateException: L'état du point d'un joueur est invalide");
    }
}
