import java.util.ArrayList;

public class Agent extends Terrain
{
    private int x;
    private int y;
    //private int id;

    public Agent(int x, int y)
    {
        //this.id = ;

        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y)
    {   
        return Math.sqrt((Math.pow(x-this.x,2))+(Math.pow(y-this.y,2)));
    }

    public void seDeplacer(int xnew, int ynew)
    {
        if (super.caseEstVide(xnew, ynew))
        {
            this.x = xnew;
            this.y = ynew;
        }
        else
            System.out.println("La case est deja occupee.");
    }

    public void ajouteAgent()
    {
        
    }
}