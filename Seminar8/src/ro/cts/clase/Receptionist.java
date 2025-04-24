package ro.cts.clase;

public class Receptionist {
    public String poateLuaLocLaMasa(Masa masa1) {
        Ospatar ospatar = new Ospatar();
        Picolo picolo = new Picolo();

        if(masa1.isEsteLibera()) {
            if(picolo.esteDebarasata(masa1)) {
                if(ospatar.esteAranjataMasa(masa1)) {
                    return "Va rugam, luati loc la masa " + masa1.getNumarMasa();
                } else {
                    return "Asteptati putin sa aranjam masa";
                }
            } else {
                return "Asteptati, tocmai s-a ridicat cineva";
            }
        } else {
            return "Masa nu este disponibila";
        }
    }
}
