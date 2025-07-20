class Square{
    
    public double areaOfSquare(int side){
        return Math.pow(side, 2);
    }
    public static void main(String[] args){
        Square square = new Square();
        System.out.println(square.areaOfSquare(5));
    }
}