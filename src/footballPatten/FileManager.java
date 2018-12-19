package footballPatten;

import java.io.*;

public class FileManager {
    private File f;
    private FileReader reader;
    private BufferedReader buffer;

    private FileManager(String file) throws IOException {
        f = new File(file);
        reader = new FileReader(f);
        buffer = new BufferedReader(reader);
    }

    public static Team readFile(String file) throws IOException {
        Team team = new Team();
        FileManager obj = new FileManager(file);
        String line;
        int count = 1;
        while( (line = obj.buffer.readLine() ) != null){
            if (count != 1){
                String name = line.split(",")[0];
                int number = Integer.parseInt(line.split(",")[1]);

                if(line.split(",")[2].split("/")[0].equals("GK")){
                    String position = line.split(",")[2].split("/")[0];
                    FootballPlayer player = new FootballPlayer(name, number, position);
                    team.addPlayerToGKGroup(player);
                }

                if(line.split(",")[2].split("/")[0].equals("DF")){
                    String position = line.split(",")[2].split("/")[0];
                    FootballPlayer player = new FootballPlayer(name, number, position);
                    team.addPlayerToDFGroup(player);
                    if(line.split(",")[2].split("/").length == 2){
                        if(line.split(",")[2].split("/")[1].equals("FW")){
                            String position2 = line.split(",")[2].split("/")[1];
                            FootballPlayer player2 = new FootballPlayer(name, number, position2);
                            team.addPlayerToFWGroup(player2);
                        }
                        else if(line.split(",")[2].split("/")[1].equals("MF")){
                            String position2 = line.split(",")[2].split("/")[1];
                            FootballPlayer player2 = new FootballPlayer(name, number, position2);
                            team.addPlayerToMFGroup(player2);
                        }
                    }
                }
                if(line.split(",")[2].split("/")[0].equals("MF")){
                    String position = line.split(",")[2].split("/")[0];
                    FootballPlayer player = new FootballPlayer(name, number, position);
                    team.addPlayerToMFGroup(player);
                    if(line.split(",")[2].split("/").length == 2){
                        if(line.split(",")[2].split("/")[1].equals("FW")){
                            String position2 = line.split(",")[2].split("/")[1];
                            FootballPlayer player2 = new FootballPlayer(name, number, position2);
                            team.addPlayerToFWGroup(player2);
                        }
                    }
                }

                if(line.split(",")[2].split("/")[0].equals("FW")){
                    String position = line.split(",")[2].split("/")[0];
                    FootballPlayer player = new FootballPlayer(name, number, position);
                    team.addPlayerToFWGroup(player);
                    if(line.split(",")[2].split("/").length == 2){
                        if(line.split(",")[2].split("/")[1].equals("MF")){
                            String position2 = line.split(",")[2].split("/")[1];
                            FootballPlayer player2 = new FootballPlayer(name, number, position2);
                            team.addPlayerToMFGroup(player2);
                        }
                    }
                }

            }
            count ++;
        }
        return team;
    }
}
