package Sponsor;

import java.util.HashSet;
import java.util.Set;

public class SetSponsors {
    private Set<Sponsor> sponsors = new HashSet<>();

    public SetSponsors() {
    }

    public void addSponsor(Sponsor sponsor){
        sponsors.add(sponsor);
    }

    public void getInfoSetSponsor(){
        for (Sponsor sponsor:
                sponsors) {
            System.out.println(sponsor);
        }
    }
    public Set<Sponsor> getSponsors() {
        return sponsors;
    }
}

