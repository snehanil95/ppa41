interface Circle
{

    float PI=3.14f;

    float Area(float Radius);
    float Ciecumference(float Radius);
}

class Mrav implements Circle
{
   public float Area(float Radius)
    {
        return PI*Radius*Radius;
    }
   public float Ciecumference(float Radius)
    {
        return 2*PI*Radius;
    }
}




class interfaceDemo
{


    public static void main(String a[])
    {


    }
}