import movableObj.Shorties;
import movableObj.Znaika;
import places.*;
import subject.Things;

public class Story {
    public static void main(String[] args) {

        Place p = new Planet(null, "Планета");
        Place f = new Fantomas("Фантомас", p);
        Rocket R = new Rocket(f, "ракета");
        Znaika Z = new Znaika(R, "Знайка");
        Street s = new Street(f, "улица");
        Place h = new House(s, "домов");
        Place pv = new Pavement(s, "мостовая");
        Shorties S = new Shorties(s, "коротышки");
        Place sw = new Sidewalk(f, "тротуар");
        Things binocular = new Things("бинокль", true);

        R.goToPlace(f);
        Z.goToPlace(R);
        S.goToPlace(s, h);
        Z.takeBinocular(binocular);
        R.goToPlace(s);
        Z.look(S, binocular, R, Z);
        Z.Seems(S);
        S.goToPlace(pv, sw, S);
        Z.Seems(s);


    }
}
