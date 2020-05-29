using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class generator : MonoBehaviour
{
    // Start is called before the first frame update

    public GameObject[] temp;
    void Start()
    {
        InvokeRepeating("generuj", 1f,3f);
    }

    // Update is called once per frame
    void Update()
    {
        if (Input.GetButtonDown("Submit"))
        {
            CancelInvoke("generuj");
        }
        if (Input.GetKeyDown(KeyCode.Space))
        {
            generuj();
        }
        if (Input.GetKeyDown(KeyCode.Alpha1))
        {
            generujkonkret(0);
        }
        if (Input.GetKeyDown(KeyCode.Alpha2))
        {
            generujkonkret(1);
        }
        if (Input.GetKeyDown(KeyCode.Alpha3))
        {
            generujkonkret(2);
        }
        if (Input.GetKeyDown(KeyCode.Alpha4))
        {
            generujkonkret(3);
        }
        if (Input.GetKeyDown(KeyCode.Alpha5))
        {
            generujkonkret(4);
        }
    }

    void generuj()
    {
        int los = Random.Range(0, temp.Length);
        Instantiate(temp[los], transform.position, Quaternion.identity);
    }
    void generujkonkret(int k)
    {
        Instantiate(temp[k], transform.position, Quaternion.identity);

    }
    
}

