public class StringTest {
    public static void main(String[] args) {
        String[][] football = {
                                {"Manchester United", "Chelsea FC", "FC Barcelona"},
                                {"Manchester City", "CSKA 1948", "PSG"},
                                {"Real Madrid","AC Milan","AC ROMA"}
                              };

        for (int i = 0; i < football.length;i++){
            System.out.println();
            for (int j = 0;j<football[i].length;j++){
                System.out.println(football[i][j]);
            }
        }
    }
}
