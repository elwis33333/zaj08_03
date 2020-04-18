package strategy;

import strategy.domain.Arena;
import strategy.domain.Knight;
import strategy.domain.Weapons;
import strategy.option.ArchValidator;
import strategy.option.KnightValidator;
import strategy.option.MaleKnightsValidator;
import strategy.option.OldKnightsValidator;

public class StrategyRunner {


    public static void main(String[] args) {

        Knight anna = new Knight(20, "Anna");
        Knight zbyszko = new Knight(40, "Zbyszko");
        Knight dobromil = new Knight(70, "Dobromil");

        anna.addWeaponToEquipment(Weapons.BOW);
        anna.addWeaponToEquipment(Weapons.SWORD);

        zbyszko.addWeaponToEquipment(Weapons.LANCE);
        zbyszko.addWeaponToEquipment(Weapons.CROSSBOW);

        dobromil.addWeaponToEquipment(Weapons.AXE);
        dobromil.addWeaponToEquipment(Weapons.SWORD);
        dobromil.addWeaponToEquipment(Weapons.HAMMER);

        KnightValidator oldValid = new OldKnightsValidator();
        KnightValidator nameValid = new MaleKnightsValidator();
        KnightValidator archValid = new ArchValidator();

        Arena eldersArena = new Arena(oldValid);
        Arena malesArena = new Arena(nameValid);
        Arena archArena = new Arena(archValid);

        eldersArena.addKnight(anna);
        eldersArena.addKnight(zbyszko);
        eldersArena.addKnight(dobromil);

        malesArena.addKnight(anna);
        malesArena.addKnight(zbyszko);
        malesArena.addKnight(dobromil);

        archArena.addKnight(anna);
        archArena.addKnight(zbyszko);
        archArena.addKnight(dobromil);

        System.out.println("=== Arena seniorow ===");
        System.out.println(eldersArena);

        System.out.println("=== Arena bez rownoupranienia ===");
        System.out.println(malesArena);

        System.out.println("=== Arena dla strzelców ===");
        System.out.println(archArena);


    }

}
// TODO
/**
 * Twoim zadaniem jest dodać ryczerzy walczących białą bronią (ang. cold steel), stworzyć im odpowiednią instację
 * strategii i wykorzystać analogicznie jak w powyższych przykładach.
 * Możesz oczywiście dodać dodatkowe pola, jeśli jest to konieczne.
 */