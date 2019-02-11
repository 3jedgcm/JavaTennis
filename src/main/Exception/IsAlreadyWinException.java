package Exception;


public class IsAlreadyWinException extends Exception {
    public IsAlreadyWinException()
    {
        System.out.println("Impossible d'inserer un nouveau point car la partie est gagnée");
    }
}