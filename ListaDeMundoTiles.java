/**
 * Write a description of class ListaDeMundoTiles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaDeMundoTiles  
{
    // instance variables - replace the example below with your own
    private int x;
    public static boolean DesactivaLamusicaActual=false;
    private static final String Tiles0[][] = {  {"A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02"},    
                                                {"A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02"},    
                                                {"A02","A02","g04","g04","g04","g04","g04","g04","g04","g04","M00","M00","M00","M00","g04","g04","g04","g04","g04","g04","g04","g04","A02","A02"},    
                                                {"A02","A02","g04","g04","g04","g04","g04","g04","g04","g04","M00","M00","M00","M00","g04","g04","g04","g04","g04","g04","g04","g04","A02","A02"},    
                                                {"A02","A02","g04","g04","g04","g04","g04","g04","g04","g04","M00","M00","M00","M00","g04","g04","g04","g04","g04","g04","g04","g04","A02","A02"},    
                                                {"A02","A02","g04","g04","g04","g04","g03","g04","g04","g04","M00","M00","M00","M00","g04","g04","g04","g04","g04","g04","g04","g04","A02","A02"},    
                                                {"A02","A02","g04","g04","g04","g04","g04","g04","g04","g04","M00","M00","M00","M00","g04","g04","g04","g03","g04","g04","g04","g04","A02","A02"},    
                                                {"A02","A02","g04","g04","g04","g04","g04","g04","g04","g04","M00","M00","M00","M00","g04","g04","g04","g04","g04","g04","g04","g04","A02","A02"},    
                                                {"A02","A02","g04","g04","g04","g04","g04","g04","g04","g04","g04","p05","p07","g04","g04","g04","g04","g04","g04","g04","g04","g04","A02","A02"},    
                                                {"A02","A02","g04","g04","g04","g04","g04","g04","g04","g04","g04","p01","p02","g03","g04","g04","g04","g04","g04","g04","g04","g04","A02","A02"},    
                                                {"A02","A02","g04","g04","g04","g04","g02","g04","g04","g04","g04","p01","p02","g04","g04","g04","g04","g04","g04","g04","g04","g04","A02","A02"},    
                                                {"A02","A02","g04","g04","g04","g04","g04","g04","g04","g04","g04","p01","p02","g04","g04","g04","g04","g04","g04","g04","g04","g04","A02","A02"},    
                                                {"A02","A02","g04","g04","g04","g04","g04","g04","g04","g04","g04","p01","p02","g04","g04","g04","g04","g04","g04","g04","g04","g01","A02","A02"},    
                                                {"A02","A02","A03","A03","A03","A03","A03","A03","A03","A03","A03","p01","p02","A03","A03","A03","A03","A03","A03","A03","A03","A03","A02","A02"},    
                                                {"A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","p01","p02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02"},    
                                                {"A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","p01","p02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02"}};
    
    private static final String Tiles1[][] = {  {"A02","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","p01","p02","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A02"},    
                                                {"A02","g04","g02","g04","g04","g04","g04","g02","g04","g04","g04","p01","p02","g03","g04","g04","g04","g03","g02","g04","g04","g04","g04","A02"},    
                                                {"A02","g04","g04","G01","G01","G01","G01","G01","G01","G01","G01","p01","p02","G01","G01","G01","G01","G01","G01","G01","G01","g01","g04","A02"},    
                                                {"A02","g01","g04","p05","p03","p03","p03","p03","p03","p03","p03","p09","p12","p03","p03","p03","p03","p03","p03","p03","p07","g04","g04","A02"},    
                                                {"A01","g04","g04","p01","p06","p04","p04","p04","p04","p04","p04","p04","p04","p04","p04","p04","p04","p04","p04","p08","p02","g04","g02","A02"},    
                                                {"p03","p03","p03","p09","p02","g04","g03","g04","g04","g04","g04","g04","g04","g04","g04","g04","g04","g04","g04","p01","p02","g04","g01","A02"},    
                                                {"A04","p04","p04","p08","p02","g04","g04","M03","M03","M03","M03","M03","M03","M03","M03","M03","M03","g03","g04","p01","p02","g04","g04","A01"},    
                                                {"A02","g04","g01","p01","p02","g03","g04","M02","M02","M01","M01","M01","M01","M01","M01","M02","M02","g04","g04","p01","p12","p03","p03","p03"},    
                                                {"A02","g04","g04","p01","p02","g04","g04","M02","M02","g04","g04","g01","g04","g04","g04","M01","M01","g04","g04","p01","p06","p04","p04","A04"},    
                                                {"A02","g01","g02","p01","p02","g04","g04","M02","M02","g04","g02","p05","p07","g03","g04","g04","g01","g04","g04","p01","p02","g04","g03","A02"},    
                                                {"A02","g04","g04","p01","p02","g04","g02","M02","M02","g04","g04","p01","p02","g04","g04","g04","g04","g04","g02","p01","p02","g04","g01","A02"},    
                                                {"A02","g02","g04","p01","p02","g04","g04","M02","M02","g04","g04","p01","p12","p03","p03","p03","p03","p03","p03","p09","p02","g04","g04","A02"},    
                                                {"A02","g04","g01","p01","p02","g03","g04","M02","M02","g02","g04","p11","p04","p04","p04","p04","p04","p04","p04","p04","p10","g01","g04","A02"},    
                                                {"A02","g04","g02","p11","p10","g01","g04","M02","M02","g04","g04","g04","g02","g01","g04","g04","g04","g04","g03","g04","g04","g02","g04","A02"},    
                                                {"A02","A03","A03","A03","A03","A03","A03","M04","M04","A03","A03","A03","A03","A03","A03","A03","A03","A03","A03","A03","A03","A03","A03","A02"},    
                                                {"A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01"}};
   
    private static final String Tiles2[][] = {  {"A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01"},    
                                                {"A02","g04","g02","g04","g04","g04","g04","g02","g04","g04","g04","g04","g01","g03","g04","g04","g04","g03","g02","g04","g04","g04","g04","A02"},    
                                                {"A02","g04","g04","G01","G01","G01","G01","G01","G01","G01","G01","G01","G01","G01","G01","G01","G01","G01","G01","G01","G01","g01","g04","A02"},    
                                                {"A02","g01","g04","p05","p03","p03","p03","p03","p03","p03","p03","p03","p03","p03","p03","p03","p03","p03","p03","p03","p07","g04","g04","A02"},    
                                                {"A01","g04","g04","p01","p06","p04","p04","p04","p04","p04","p04","p04","p04","p04","p04","p04","p04","p04","p04","p08","p02","g04","g02","A02"},    
                                                {"p03","p03","p03","p09","p02","g04","g03","g04","g04","g04","g02","g04","g04","g03","g04","g03","g04","g04","g04","p01","p02","g04","g01","A02"},    
                                                {"A04","p04","p04","p08","p02","g04","g04","M03","M03","M03","M03","M03","M03","M03","M03","M03","M03","g04","g04","p01","p02","g04","g04","A01"},    
                                                {"A02","g04","g01","p01","p02","g03","g04","M02","M02","M01","M01","M01","M01","M01","M01","M02","M02","g04","g04","p01","p02","g04","g04","p03"},    
                                                {"A02","g04","g04","p01","p02","G01","G01","M02","M02","G01","G01","G01","G01","G01","G01","M02","M02","g01","g04","p01","p02","g01","g04","A03"},    
                                                {"A02","g04","g04","p01","p02","G01","G01","M02","M02","G01","G01","G01","G01","G01","G01","M02","M02","g04","g04","p01","p02","g01","g04","A02"},    
                                                {"A02","g04","g04","p01","p02","G01","G01","M01","M01","G01","G01","p01","p02","G01","G01","M02","M02","g04","g02","p01","p02","g04","g01","A02"},    
                                                {"A02","g02","g04","p01","p12","G01","G01","G01","G01","G01","G01","p01","p02","G01","G01","M01","M01","g04","g04","p01","p02","g04","g04","A02"},    
                                                {"A02","g04","g02","p11","p04","G01","G01","G01","G01","G01","G01","p01","p02","G01","G01","g04","g04","g03","g04","p01","p02","g01","g04","A02"},    
                                                {"A02","g03","g04","g04","g04","g04","g04","M02","M02","g04","g04","p01","p12","p03","p03","p03","p03","p03","p03","p09","p02","g01","g04","A02"},    
                                                {"A02","A03","A03","A03","A03","A03","A03","M04","M04","A03","A03","A05","A04","A04","A04","A04","A04","A04","A04","A04","A06","A03","A03","A02"},    
                                                {"A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01"}};   
    private static final String Tiles3[][] = {  {"A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A02","A01","A01","A01","A02"},    
                                                {"A02","A02","A02","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","g04","g01","g01","A01"},    
                                                {"A02","A02","A01","g01","g01","g01","g01","g01","g01","g01","g01","g01","g01","g01","g01","g01","g01","g01","g01","g01","g01","g01","g02","A02"},    
                                                {"A02","A01","g04","g02","g04","g04","g03","g03","g02","G02","g04","g01","g03","g02","g02","g02","g04","g03","g03","g03","g02","g01","g02","A02"},    
                                                {"A01","g04","g04","g01","A03","J00","J00","J00","J00","A03","g04","g04","g04","g04","G02","G02","G02","G02","G02","G02","G02","G02","G02","A02"},    
                                                {"p03","g03","g03","A03","A01","g04","g03","g04","g01","A02","g04","g02","g04","g04","G02","G02","G02","G02","G02","G02","G02","G02","G02","A02"},    
                                                {"A04","g04","g04","A02","g04","g04","g04","g04","g02","A01","g03","g04","g03","g04","G02","G02","p05","p03","p03","p03","p07","G02","G02","A01"},    
                                                {"A02","g04","g01","A01","g04","g03","g04","g01","g02","g01","g01","g03","g04","g04","G02","G02","p01","p06","p09","p08","p02","G02","G02","p03"},    
                                                {"A02","g04","g04","M02","M01","M01","p12","p12","M01","M01","M02","A03","A03","g04","G02","G02","p01","p12","p08","p08","p02","G02","G02","A04"},    
                                                {"A02","g01","g02","M02","p12","p12","p12","p12","p12","p12","M02","A02","A02","g03","G02","G02","p01","p12","p12","p09","p02","G02","G02","A02"},    
                                                {"A02","g04","g04","M02","p12","p12","p12","p12","p12","p12","M02","A01","A01","g04","G02","G02","p11","p04","p04","p04","p10","G02","G02","A02"},    
                                                {"A02","g02","g04","M02","p12","p12","p12","p12","p12","p12","M02","g04","g04","g03","G02","G02","G02","G02","G02","G02","G02","G02","G02","A02"},    
                                                {"A02","A03","g01","M02","p12","p12","p12","p12","p12","p12","M02","g01","g04","g02","G02","G02","G02","G02","G02","G02","G02","G02","G02","A02"},    
                                                {"A02","A02","A03","M02","p12","p12","p12","p12","p12","p12","M02","g04","g02","g01","g04","g04","g04","g04","g03","g04","g04","g02","g04","A02"},    
                                                {"A02","A02","A02","M02","p12","p12","p12","p12","p12","p12","M02","A03","A03","A03","A03","A03","A03","A03","A03","A03","A03","A03","A03","A02"},    
                                                {"A01","A01","A01","M04","M04","M04","M04","M04","M04","M04","M04","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01","A01"}};
       private static final String Tiles4[][] = {  {"M01","M01","M01","M01","M01","M01","M01","M01","M01","M01","M01","M01","M01","M01","M01","M01","M01","M01","M01","M01","M01","M01","M01","M01"},    
                                                {"J01","g02","g02","g01","g01","g01","g01","g01","g01","g01","g01","g01","g02","p12","p12","p12","p12","p12","p12","p12","M02","p12","p12","M01"},    
                                                {"J01","g02","g02","g01","g01","g01","g01","g01","g01","g01","g01","g01","g02","p12","p12","p12","p12","p12","p12","p12","M02","p12","p12","M02"},    
                                                {"M01","g01","M01","M02","M02","M02","M02","M02","M02","M02","M02","M02","M02","M02","M02","M02","M02","M02","p12","p12","M02","p12","p12","M02"},    
                                                {"M01","g04","M02","p12","J00","J00","J00","J00","J00","J00","p12","M02","p12","p12","M02","p12","p12","p12","p12","p12","M02","p12","p12","M02"},    
                                                {"M01","g03","M01","p12","M01","M04","M01","M01","M01","M02","M01","M02","p12","p12","M02","p12","p12","p12","p12","p12","M02","p12","p12","M02"},    
                                                {"M01","g04","M01","p12","p12","p12","p12","p12","p12","p12","p12","M02","p12","p12","M02","p12","p12","M02","p12","p12","M02","p12","p12","p03"},    
                                                {"M01","g04","M01","M01","M02","M01","M01","M01","M02","M01","p12","M02","p12","p12","p12","p12","p12","M02","p12","p12","M02","p12","p12","p03"},    
                                                {"M01","g04","M04","p12","p12","p12","p12","p12","p12","p12","p12","M02","p12","p12","p12","p12","p12","M02","p12","p12","M02","p12","p12","p03"},    
                                                {"M01","g01","M02","p12","M01","M01","M01","M01","M02","M02","M02","M02","p12","p12","M02","p12","p12","M02","p12","p12","M02","p12","p12","M02"},    
                                                {"M01","g04","M02","p12","p12","p12","p12","p12","M02","p12","p12","p12","p12","p12","M02","p12","p12","M02","p12","p12","M02","p12","p12","M02"},    
                                                {"M01","g04","M02","M02","M02","M02","p12","p12","M02","p12","p12","p12","p12","p12","M02","p12","p12","M02","p12","p12","M02","p12","p12","M02"},    
                                                {"M01","g04","g02","g01","g02","M02","p12","p12","M02","p12","p12","M02","M02","M02","M02","p12","p12","M02","M02","M02","M02","p12","p12","M02"},    
                                                {"M01","g04","g01","p12","g01","M02","p12","p12","p12","p12","p12","M02","p12","p12","p12","p12","p12","p12","p12","p12","p12","p12","p12","M02"},    
                                                {"M01","g04","g02","g01","g02","M02","p12","p12","p12","p12","p12","M02","p12","p12","p12","p12","p12","p12","p12","p12","p12","p12","p12","M02"},    
                                                {"M01","M04","M04","M04","M04","M04","M04","M04","M04","M04","M04","M01","M01","M01","M01","M01","M01","M01","M01","M01","M01","M01","M01","M01"}};
   
                                                /**
     * Constructor for objects of class ListaDeMundoTiles
     */
    public ListaDeMundoTiles()
    {
    }

    public static String[][] TilesMundo0()
    {
        return Tiles0;    
    }
    
    public static String[][] TilesMundo1()
    {
        return Tiles1;
    }
    
    public static String[][] TilesMundo2()
    {
        return Tiles2;
    }
    
    public static String[][] TilesMundo3()
    {
        return Tiles3;
    }
    
    public static String[][] TilesMundo4()
    {
        return Tiles4;
    }
}