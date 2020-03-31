using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab3_1
{
    class Lepsze_liczby :Liczby
    {
        protected int _d=5;
        public int d
        {
            get
            {
                return _d;

            }
            set
            {
                _d = value;
            }
        }

        public Lepsze_liczby(int a, int b, int c)
            : base(a, b, c){
            d = 0;
        }
    }
    
}
