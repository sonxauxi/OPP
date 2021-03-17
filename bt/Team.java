import java.util.ArrayList;
import java.util.Random;

public class Team {
    public static void main(String[] args) throws Exception {
        ArrayList<Player> Team = new ArrayList<Player>();
        ArrayList<String> Name = new ArrayList<String>();
        Name.add("Marc-André ter Stegen");
        Name.add("Sergiño Dest ");
        Name.add("Gerard Piqué");
        Name.add("Ronald Araújo");
        Name.add("Sergio Busquets");
        Name.add("Antoine Griezmann");
        Name.add("Miralem Pjanić");
        Name.add("Martin Braithwaite");
        Name.add("Lionel Messi");
        Name.add("Ousmane Dembélé");
        Name.add("Riqui Puig");
        Name.add("Neto");
        Name.add("Clément Lenglet");
        Name.add("Pedri");
        Name.add("Francisco Trincão");
        Name.add("Jordi Alba");
        Name.add("Matheus Fernandes");
        Name.add("Sergi Roberto");
        Name.add("Frenkie de Jong");
        Name.add("Ansu Fati");
        Name.add("Samuel Umtiti");
        Name.add("Junior Firpo");
        System.out.println(Name);
        ArrayList<Integer> soAo = new ArrayList<Integer>();
        for (int i = 0; i < 22; i++) {
            soAo.add(i + 1);

        }
        System.out.println(soAo);

        for (int i = 0; i < 22; i++) {
            Player player = new Player();
            player.fullName = Name.get(i);
            player.soAoo = soAo.get(i);
            if (soAo.get(i) == 1 || soAo.get(i) == 12) {
                player.Postition = POSITION.GK;
            } else if (soAo.get(i) == 2 || soAo.get(i) == 3 || soAo.get(i) == 4 || soAo.get(i) == 13
                    || soAo.get(i) == 16 || soAo.get(i) == 18 || soAo.get(i) == 21 || soAo.get(i) == 22) {
                player.Postition = POSITION.DF;
            } else if (soAo.get(i) == 5 || soAo.get(i) == 7 || soAo.get(i) == 11 || soAo.get(i) == 14
                    || soAo.get(i) == 17 || soAo.get(i) == 19) {
                player.Postition = POSITION.MF;
            } else {
                player.Postition = POSITION.FW;
            }

            Team.add(player);

        }

        ArrayList<Player> Team2 = new ArrayList<Player>();
        for (int j = 0; j < 22; j++) {
            Random addteam = new Random();
            int number = addteam.nextInt(22);

            if (Team.get(number).Postition.equals(POSITION.GK)) {
                Team2.add(Team.get(number));
                break;
            }
        }
        for (int i = 0; i < 22; i++) {
            Random addteam = new Random();
            int number = addteam.nextInt(22);

            
            while () {
                if (Team.get(number).Postition.equals(POSITION.DF).equals(Team)) {
                    Team2.add(Team.get(number));
    
                }
            }

        }q

        System.out.println(Team2);

    }

}
