public class Main {
    public static void main(String[] args) {
        int vasyaAge = 120;
        int katyaAge = 5;
        int mishaAge = 4;

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст

        boolean a = (vasyaAge >= katyaAge);
        boolean b = (katyaAge >= mishaAge);
        boolean c = (vasyaAge >= mishaAge);

        if      (vasyaAge < 0 || vasyaAge>120){System.out.println("Указан неверный возраст Васи");}
        else if (katyaAge < 0 || katyaAge>120){System.out.println("Указан неверный возраст Кати");}
        else if (mishaAge < 0 || mishaAge>120){System.out.println("Указан неверный возраст Миши");}
        else

        if (a && b && c){
            max = vasyaAge;
            middle = katyaAge;
            min = mishaAge;
        } else if (a && !b && c) {
            max = vasyaAge;
            middle = mishaAge;
            min = katyaAge;
        } else if (!a && !b && !c){
            max = mishaAge;
            middle = katyaAge;
            min = vasyaAge;
        } else if (a && !b && !c){
            max = mishaAge;
            middle = vasyaAge;
            min = katyaAge;
        } else if (!a && b && c){
            max = katyaAge;
            middle = vasyaAge;
            min = mishaAge;
        } else if (b && !a && !c){
            max = katyaAge;
            middle = mishaAge;
            min = vasyaAge;}

        System.out.println("Minimal age:" + min);
        System.out.println("Middle age:" + middle);
        System.out.println("Maximal age:" + max);
    }
}