package Exception;

public class InvalidPlayerException extends Exception{
    public InvalidPlayerException()
    {
        System.err.println("InvalidPlayerException: Le joueur n'est pas présent dans la partie");
    }
}

