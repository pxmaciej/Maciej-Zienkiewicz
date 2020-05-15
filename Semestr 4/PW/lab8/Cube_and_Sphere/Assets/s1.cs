using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class s1 : MonoBehaviour
{
   
    GameObject[] find;

    // Start is called before the first frame update
    void Start()
    {
        find = GameObject.FindGameObjectsWithTag("kula");
        foreach(GameObject temp in find)
        {
            Destroy(temp);
        }
    }

    // Update is called once per frame
    void Update()
    {
        
    }
}
