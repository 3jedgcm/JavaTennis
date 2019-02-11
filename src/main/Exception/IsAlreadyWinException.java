package Exception;


public class IsAlreadyWinException extends Exception {
    public IsAlreadyWinException()
    {
        System.err.println("IsAlreadyWinException: Impossible d'inserer un nouveau point car la partie est gagnée");
    }
}