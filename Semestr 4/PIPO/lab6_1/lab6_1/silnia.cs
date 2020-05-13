using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab6_1
{
   public class Silnia
    {
        public int n;

        public int oblicz()
        {
           int temp = 1;
            for (int i = n; i > 1; i--)
            {
                temp *= i; 
            }
               

            return temp;
        }
    }
}
