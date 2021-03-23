package questao6;

public class Pokemon {
    protected int HP;
    protected int ATK;
    protected int DEF;
    protected int SPAtk;
    protected int SPDef;
    protected int speed;
    protected int xp;
    protected int transformacao;//1/2/3
    
    public void xp(){
        this.xp += 10;
    }
    public void evoluir(){
        if(xp < 1000){
            this.transformacao=1;
            this.HP++;
            this.DEF++;
            this.SPAtk++;
            this.SPDef++;
            this.speed++;
        }else if(xp < 3000){
            this.transformacao=2;
            this.HP+= 5;
            this.DEF+= 5;
            this.SPAtk+= 5;
            this.SPDef+= 5;
            this.speed+= 5;
        }else{
            this.transformacao=3;
            this.HP+= 10;
            this.DEF+= 10;
            this.SPAtk+= 10;
            this.SPDef+= 10;
            this.speed+= 10;
        }
        
        
    }
    
}
