package footballPatten;

import java.util.ArrayList;

public class Team {
    private ArrayList<FootballPlayer> GKGroup;
    private ArrayList<FootballPlayer> DFGroup;
    private ArrayList<FootballPlayer> FWGroup;
    private ArrayList<FootballPlayer> MFGroup;

    public Team() {
        GKGroup = new ArrayList<FootballPlayer>();
        DFGroup = new ArrayList<FootballPlayer>();
        FWGroup = new ArrayList<FootballPlayer>();
        MFGroup = new ArrayList<FootballPlayer>();
    }

    public void addPlayerToGKGroup(FootballPlayer player){
        GKGroup.add(player);
    }

    public void addPlayerToDFGroup(FootballPlayer player){
        DFGroup.add(player);
    }

    public void addPlayerToFWGroup(FootballPlayer player){
        FWGroup.add(player);
    }

    public void addPlayerToMFGroup(FootballPlayer player){
        MFGroup.add(player);
    }


    public ArrayList<FootballPlayer> getGKGroup() {
        return GKGroup;
    }

    public ArrayList<FootballPlayer> getDFGroup() {
        return DFGroup;
    }

    public ArrayList<FootballPlayer> getFWGroup() {
        return FWGroup;
    }

    public ArrayList<FootballPlayer> getMFGroup() {
        return MFGroup;
    }

    public void showPatten(TeamPatten patten) {
        patten.manage(this.DFGroup, this.FWGroup, this.GKGroup, this.MFGroup);
    }
}
