import exceptions.NonZeroAngleException;
import movableObj.Shorties;
import movableObj.Znaika;
import places.*;
import subject.Things;

public class Story {
    public static void main(String[] args) throws NonZeroAngleException, NegativeArraySizeException {

        Place p = new Planet(null, "Планета");
        Place f = new Fantomas("Фантомас", p);
        Rocket R = new Rocket(f, "ракета");
        Znaika Z = new Znaika(R, "Знайка", 20);
        Street s = new Street(f, "улица");
        Place h = new House(s, "домов");
        Place pv = new Pavement(s, "мостовая");
        Rocket.Mechanism mechanism = R.new Mechanism();
        Rocket.Engine engine = R.new Engine();

        Shorties S = new Shorties(s, "коротышки", 21);
        Place sw = new Sidewalk(f, "тротуар");
        Things binocular = new Things("бинокль", true);


        try {
            Z.turnOnEngine(engine);
            Z.turnOnMechanism(mechanism);
            Z.turnRocket(mechanism, R);
            Z.takeCourse(f, R, engine);
        } catch (NonZeroAngleException e) {
            System.out.println("ошибка! Угол должен быть равен 0");
        }
            R.flyAround(R, f);
            Z.goToPlace(R);
            S.goToPlace(s, h);
            Z.takeBinocular(binocular);
            R.goToPlace(s);
            Z.look(S, binocular, R, Z);
            Z.Seems(S);

            S.goToPlace(s, h);

            S.goToPlace(pv, sw, S);

            Z.Seems(s);



    }
}