using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class shoot : MonoBehaviour
{
    public GameObject block;
 
    // Start is called before the first frame update
    void Start()
    {
       
    }
    void OnCollisionEnter(Collision other)
    {
        if (other.gameObject.tag == "Enemy")
        {
            Destroy(block);
        }
    }
    // Update is called once per frame
    void Update()
    {
        
    }
}
