
using System;
using System.Text;
using System.Linq;
using System.Collections.Generic;
using System.Threading.Tasks;


namespace App
{
    class listasimple
    {
        static void Main(string[] args)
        {
            List<int> listanumeros = new List<int>();

            listanumeros.Add(2);
            listanumeros.Add(4);
            listanumeros.Add(6);
            listanumeros.Add(8);
            listanumeros.Add(10);
            listanumeros.Add(12);

            foreach (int numero in listanumeros)
            {
                Console.WriteLine(numero);
                Console.WriteLine(listanumeros.IndexOf(numero));
                
            }

            Console.ReadKey();
                  
           
        }
    }
}