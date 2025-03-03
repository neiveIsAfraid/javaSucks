package Modul1;

public class hitung {
    public static void main(String[] args) {
        LuasIsiTabung tabung = new LuasIsiTabung(10, 5);
        LuasPersegiPanjang persegiPanjang = new LuasPersegiPanjang(10,10);
        LuasTrapesium trapesium = new LuasTrapesium(5,5,10);
    }
}

class LuasIsiTabung {
    double pi = Math.PI;
    double height;
    double range;

    public LuasIsiTabung(double height, double range) {
        this.height = height;
        this.range = range;
    }

    double hitungLuas(){
        return pi * height * range;
    }
}

class LuasPersegiPanjang{
    double length;
    double width;

    public  LuasPersegiPanjang(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double hitungLuas(){
        return length * width;
    }
}

class LuasTrapesium{
    double height;
    double bottomBase;
    double upperBase;

    public LuasTrapesium(double height, double bottomBase, double upperBase) {
        this.height = height;
        this.bottomBase = bottomBase;
        this.upperBase = upperBase;
    }

    double hitungLuas(){
        return (bottomBase + upperBase) * 0.5 * height;
    }
}
