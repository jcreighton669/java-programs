class Box {
    double height;
    double width;
    double length;

    public double getVolume(){
        double volume = this.height * this.width * this.length;
        return volume;
    }
}
