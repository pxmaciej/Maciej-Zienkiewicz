using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab3_1
{
    class Liczby
    {
        private int _a, _b, _c;
        public int a
        {
            get
            {
                return _a;

            }
            set
            {
                _a = value;
            }
        }
        public int b
        {
            get
            {
                return _b;

            }
            set
            {
                _b = value;
            }
        }
        public int c
        {
            get
            {
                return _c;

            }
            set
            {
                _c = value;
            }
        }

public Liczby()
        {

        }
 
public Liczby (int a, int b,int c)
        {
            
            a = 0;
            b = 0;
            c = 0;
        }
    }
   

}
