import java.util.ArrayList;

public class Simulation
{
    private Terrain t;
    private ArrayList<Agent> lA = new ArrayList<Agent>();
    private ArrayList<Ressource> lR = new ArrayList<Ressource>();
    private int nbA;

    public Simulation(int n, int m)
    {
        this.nbA = n;
        this.nbR = m;
        
        //Ajout de m agents.
        for (int i = 0; i < m; i++)
        {
            int x = (int) (Math.random() * (t.nbLignes - 0));
            int y = (int) (Math.random() * (t.nbColonnes - 0));
            if t.caseEstVide(x, y)
                lA.add(new Agent());
        }

        //Ajout de n ressources.
        for (int i = 0; i < n; i++)
        {
            int x = (int) (Math.random() * (t.nbLignes - 0));
            int y = (int) (Math.random() * (t.nbColonnes - 0));
            if t.caseEstVide(x, y)
            {
                lR.add(new Ressource());
                t.setCase();
            }
        }
    }

    public void rafraichir()
    {
        for (Agent x : lA)
        {
            x.bouger();
            x.manger();
            x.recolter();
        }
    }
}
