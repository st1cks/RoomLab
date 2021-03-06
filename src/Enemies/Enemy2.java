package Enemies;

public class Enemy2 {

    private int HP;
  private int ATK;
    public String getName(){
        return "Funky Hand Cat";
    }

    //Constructor allows the new enemy to be created in the battleroom.
    public Enemy2(int HP, int ATK){
        this.HP = HP;
        this.ATK = ATK;
    }

    //Battle stats.
    public int getATK(){
        return ATK;
    }
    public int getHP(){
        return HP;
    }

    public void printEnemy(){
        System.out.println("            .               ,.\n" +
                "           T.\"-._..---.._,-\"/|\n" +
                "           l|\"-.  _.v._   (\" |\n" +
                "           [l /.'_ \\; _~\"-.`-t\n" +
                "           Y \" _(o} _{o)._ ^.|\n" +
                "           j  T  ,-<v>-.  T  ]\n" +
                "           \\  l ( /-^-\\ ) !  !\n" +
                "            \\. \\.  \"~\"  ./  /c-..,__\n" +
                "              ^r- .._ .- .-\"  `- .  ~\"--.\n" +
                "               > \\.                      \\\n" +
                "               ]   ^.                     \\\n" +
                "               3  .  \">            .       Y  -Row\n" +
                "  ,.__.--._   _j   \\ ~   .         ;       |\n" +
                " (    ~\"-._~\"^._\\   ^.    ^._      I     . l\n" +
                "  \"-._ ___ ~\"-,_7    .Z-._   7\"   Y      ;  \\        _\n" +
                "     /\"   \"~-(r r  _/_--._~-/    /      /,.--^-._   / Y\n" +
                "     \"-._    '\"~~~>-._~]>--^---./____,.^~        ^.^  !\n" +
                "         ~--._    '   Y---.                        \\./\n" +
                "              ~~--._  l_   )                        \\\n" +
                "                    ~-._~~~---._,____..---           \\\n" +
                "                        ~----\"~       \\\n" +
                "                                       \\\n" +
                "\n" +
                "------------------------------------------------\n" +
                "Thank you for visiting https://asciiart.website/\n" +
                "This ASCII pic can be found at\n" +
                "https://asciiart.website/index.php?art=animals/cats\n");
    }

    public int getGoldDrop(){
        return 20;
    }
}
