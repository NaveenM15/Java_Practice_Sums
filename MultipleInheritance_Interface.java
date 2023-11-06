
//MULTIPLE INHERITANCE CAN BE ACHIVED BY MULTIPLE INTERFACE
//

class Phone{
    void voiceCall(){
        System.out.println("Make VoiceCall.");
    }
    void Sms(){
        System.out.println("Send SMS.");
    }
}
interface Camera{
    void selfie();
    void record();
}
interface Player{
    void play();
    void pause();
    void stop();
}
class SmartPhone extends Phone implements Camera,Player
{
    @Override
    public void selfie(){
            System.out.println("Take Selfie.");
    }
    @Override
    public void record(){
        System.out.println("Record Video.");
    }
    @Override
    public void play(){
        System.out.println("Play Carrom.");
    }
    @Override
    public void pause(){
        System.out.println("Pause Game.");
    }
    @Override
    public void stop(){
        System.out.println("Stop Car.");
    }

}

public class MultipleInheritance_Interface {
    public static void main(String[] args){
         SmartPhone in=new SmartPhone();
         in.voiceCall();
         in.Sms();
         in.selfie();
         in.record();
         in.play();
         in.pause();
         in.stop();
    }
}
