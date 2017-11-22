package kz.kaznitu.lessons.start;


import kz.kaznitu.lessons.interfaces.Model;
import kz.kaznitu.lessons.interfaces.Ozu;
import kz.kaznitu.lessons.interfaces.VideoKarta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ModelT1000")
public class ModelT1000 extends BaseModel {
    private Model model;
    private Ozu ozu;
    private VideoKarta videoKarta;

    public ModelT1000() {

    }
    @Autowired
    public ModelT1000(@Qualifier("iphoneModel") Model model,
                      @Qualifier("iphoneOzu") Ozu ozu,
                      @Qualifier("iphoneVideoKarta")VideoKarta videoKarta){
        super(model, ozu, videoKarta);
    }
    public void action(){
        model.model();
        ozu.memory();
        videoKarta.videokart();

    }

    public void game() {
        System.out.println("T1000 is games!");
    }
}


