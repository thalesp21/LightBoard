public class Main
{
    public static void main(String[] args)
    {
        LightBoard l1 = new LightBoard(7, 5);
        System.out.println(l1);
        boolean[][] lights = {{true, true, false,true, true },
                              {true, false,false,true, false},
                              {true, false,false,true, true },
                              {true, false,false,false,true },
                              {true, false,false,false,true },
                              {true, true, false,true, true },
                              {false,false,false,false,false}};
        LightBoard l2 = new LightBoard(lights);
        System.out.println(l2);
        System.out.println(l2.evaluateLight(0,3));
        System.out.println(l2.evaluateLight(6,0));
        System.out.println(l2.evaluateLight(4,1));
        System.out.println(l2.evaluateLight(5,4));
    }
}