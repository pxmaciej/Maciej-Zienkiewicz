using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class movement : MonoBehaviour
{

    float speed;                //Floating point variable to store the player's movement speed.
    public GameObject  obiekt;
    public Material[] materials;
    // Start is called before the first frame update
    void Start()
    {
        speed = 10;
        
    }

    // Update is called once per frame
    void Update()
    {
        
        float x = Input.GetAxis("Horizontal") * Time.deltaTime * speed;

     
        float y = Input.GetAxis("Vertical") * Time.deltaTime * speed;

        transform.Translate(x, y, 0);



        if (Input.GetMouseButtonDown(0))
        {
            Generuj();
        }
           
    }
    void Generuj()
    {
        int los = Random.Range(0, materials.Length);
        Vector3 pozycja = Input.mousePosition;
        pozycja.z = 15f;
        pozycja = Camera.main.ScreenToViewportPoint(pozycja);

        Instantiate(obiekt,pozycja, Quaternion.identity);
      
        obiekt.gameObject.GetComponent<Renderer>().material = materials[los];
        obiekt.SetActive(true);


    }
}
