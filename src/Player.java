 class Player {
    String name;



    public Player (String name){
        this.name = name;
    }

   public String hands (){

   String[] hands = {"rock", "paper", "scissors"};

    int finalHand = (int)(Math.random()*3);


    return hands[finalHand];


    }












}
