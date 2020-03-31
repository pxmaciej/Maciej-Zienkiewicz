using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab3_1
{
    class Program
    {
        static void Main(string[] args)
        {
           Liczby L1 = new Liczby();
           Liczby L2 = new Liczby();
           
            L1.a = 1;
            L1.b = 2;
            L1.c = 3;

            L2.a = 1;
            L2.b = 2;
            L2.c = 3;
            Lepsze_liczby LL1 = new Lepsze_liczby(L1.a, L1.b, L1.c);

          
            Console.WriteLine(L1.a);
            Console.WriteLine(L1.b);
            Console.WriteLine(L1.c);
            Console.WriteLine(L2.a);
            Console.WriteLine(L2.b);
            Console.WriteLine(L2.c);
            Console.WriteLine(LL1.d);
            Console.ReadKey();
        }
    }
}
