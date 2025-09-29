package org.example.kyu7;

//https://www.codewars.com/kata/5deeb1cc0d5bc9000f70aa74
public class WillYouSurvivetheZombieOnslaught {
    public static String zombieShootout(int zombies, int range, int ammo) {
        if(ammo < zombies || range * 2 < zombies){
            if(ammo < range * 2){
                return "You shot " + ammo + " zombies before being eaten: ran out of ammo.";
            }else {
                return "You shot " + range * 2 + " zombies before being eaten: overwhelmed.";
            }
        }
        return "You shot all " + zombies + " zombies.";
    }
}
