package inheritance;

public class InterfaceClass{
    public static void main(String[] args){

    }
}

//making interface is similar to class,replace class with "interface"
// interface is automatically abstract
interface AnimalDo{
    public void move();
    public boolean eat(String food);
    //function of an interface is automatically abstract and public
}
// interface can extends interface with new function
interface MammalDo extends AnimalDo{
    public int legs();
}
// can be nested in multiple interface
interface DogDo extends MammalDo{
    public void barks();
}
interface DomesticAnimalDo{
    pubic void pet();
}

//class can implement multiple interfacess\
//when doing so, both the interface function must be overriden

class Husky implements DogDo, DomesticAnimalDo{
    // when implementing nested interface all the function on top of interface needs to be overriden
    @override
    public void barks(){
        System.out.println("Bow Wou");
    
    }
    @override
    public int legs(){
        return 4;
    }
    @override
    public boolean eat(String food){
        return true;
    }
    @override
    public void move(){
        System.out.println("Husky runs fast");
    }
}

 //we cannot make object of interface
 // interface is implemented in class using "implements"
 class wolf implements AnimalDo{
    // whenn implementing interface, all the function should be overriden
    @override
    public void move(){
        System.out.println("wolf walks fast");
    }
    @override
    public boolean eat(String food){
        System.out.println("Wolf eat meat");
        return true;
    }

 }
 class cow implements AnimalDo {
    @override
    public void move(){
        System.out.println("cow walks slow");
    }
    @override
    public boolean eat(String food){
        System.out.println("cow eat grass");
        return true;
    }

}
/*
 
Task
Make an interface Media
make the following functions
void play()
void pause()
void next()
void previous()
String nowPlaying()
Make an interface DigitalMedia extending Media
make the following functions
double size()
double remaining(double current)
Make an interface OnlineAsset
make the following functions
void download()
Make a class Spotify and implement DigitalMedia and OnlineAsset
*/
interface Media{
    void play();
    void pause();
    void next();
    void previous();
    String nowPlaying();
}
interface DigitalMedia extends Media{
    double size();
    double remaining(double current);
}
interface OnlineAsset{
    void download();
}
class Spotify implements DigitalMedia, OnlineAsset{
    @override
    public void play(){
        System.out.println("Playing");
    }
    @override
    public void pause(){
        System.out.println("Paused");
    }
    @override
    public void next(){
        System.out.println("Next");
    }
    @override
    public void previous(){
        System.out.println("Previous");
    }
    @override
    public String nowPlaying(){
        return "Now Playing";
    }
    @override
    public double size(){
        return 0.0;
    }
    @override
    public double remaining(double current){
        return 0.0;
    }
    @override
    public void download(){
        System.out.println("Downloading");
    }
}

 