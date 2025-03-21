package ro.cts.clase.FabricaSupa;

import ro.cts.clase.Supa;
import ro.cts.clase.SupaDeCocos;
import ro.cts.clase.SupaLegume;
import ro.cts.clase.SupaVita;

public class FabricaSupe {
    private float pret;
    private float calorii;

    public FabricaSupe(float pret, float calorii) {
        this.pret = pret;
        this.calorii = calorii;
    }

    public Supa getSupa(TipSupa tip, float cantitate){
        switch (tip){
            case LEGUME -> {
                SupaLegume supaLegume = new SupaLegume(pret, cantitate, calorii);
                return supaLegume;
            }
            case VITA -> {
                SupaVita supaVita = new SupaVita(pret, cantitate, calorii);
                return supaVita;
            }
            case COCOS -> {
                SupaDeCocos supaDeCocos = new SupaDeCocos(pret, cantitate,calorii);
                return supaDeCocos;
            }
        }
        return null;
    }
}
