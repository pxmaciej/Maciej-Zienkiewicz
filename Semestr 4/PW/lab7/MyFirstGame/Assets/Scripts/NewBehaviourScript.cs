using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class NewBehaviourScript : MonoBehaviour
{
    // Start is called before the first frame update
    public int ilosc = 10;
    string myname = "Maciej Zienkiewicz";
    void Start()
    {
        for (int i = 0; i < ilosc; i++)
        {
            print(myname);
        }

    }

    // Update is called once per frame
    void Update()
    {
        
    }
}
