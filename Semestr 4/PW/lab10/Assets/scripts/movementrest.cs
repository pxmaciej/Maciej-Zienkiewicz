using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class movementrest : MonoBehaviour
{
    float speed;
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
    }
}
