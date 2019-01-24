package Exception;

public class InvalidPlayerException extends Exception{
    public InvalidPlayerException()
    {
        System.out.println("Le joueur n'est pas présent dans la partie");
    }
}

