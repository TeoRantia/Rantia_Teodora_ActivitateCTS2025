package ro.cts.main;

import ro.cts.clase.FabricaSupa.FabricaSupe;
import ro.cts.clase.FabricaSupa.TipSupa;
import ro.cts.clase.Supa;
import ro.cts.clase.SupaLegume;

import static ro.cts.clase.FabricaSupa.TipSupa.LEGUME;

public class Main {
    public static  void main(String[] args){
        FabricaSupe fabricaSupe = new FabricaSupe(15.99f, 50.99f);

        Supa supaLegume = fabricaSupe.getSupa(TipSupa.LEGUME, 300);
        Supa supaVita = fabricaSupe.getSupa(TipSupa.VITA, 300);
        Supa supaDeCocos = fabricaSupe.getSupa(TipSupa.COCOS, 300);

        supaLegume.afiseazaDescriere();
        supaVita.afiseazaDescriere();
        supaDeCocos.afiseazaDescriere();
    }
}
