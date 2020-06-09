using JetBrains.Annotations;
using System.Collections;
using System.Collections.Generic;
using System.Drawing;
using System.Numerics;
using System.Runtime.InteropServices.ComTypes;
using TMPro;
using UnityEngine;
using UnityEngine.SceneManagement;
using UnityEngine.UI;

public class playermovment : MonoBehaviour
{
    // Start is called before the first frame update
    public CharacterController2D controller;
    public Collision2D col;
    float horizontalMove = 0f;
    public float runSpeed = 40f;
    bool jump = false;
    int tmplife;
    int points;
    public GameObject resetbutton, endgametext, win;
    public Text pointtext;
    public Text life;
    public GameObject player, blood;
    void Start()
    {
       
        tmplife = 10;
        points = 0;
        win.SetActive(false);
        resetbutton.SetActive(false);
        endgametext.SetActive(false);
       
       

    }

    // Update is called once per frame
    void Update()
    {
       
        horizontalMove = Input.GetAxisRaw("Horizontal") * runSpeed;

        if (Input.GetButtonDown("Jump"))
        {
            jump = true;
          
        }

        if (transform.position.y < -32)
        {
            resetbutton.SetActive(true);
            endgametext.SetActive(true);
            SceneManager.LoadScene(0);
            
        }


    }
    private void FixedUpdate()
    {
        controller.Move(horizontalMove * Time.fixedDeltaTime, false, jump);
        jump = false;
      


    }
    void OnCollisionEnter2D(Collision2D other)
    {
        if (other.gameObject.tag == "Enemy")
        {
            --tmplife;
            var magnitude = 20000;
            var force = player.transform.position - other.transform.position;
            force.Normalize();
            GetComponent<Rigidbody2D>().AddForce(force * magnitude);
         
            
            life.text = tmplife.ToString();
                

            if (tmplife <= 0)
                {
                    resetbutton.SetActive(true);
                    endgametext.SetActive(true);
                }
            blood.SetActive(true);


        }
        if (other.gameObject.tag == "Mace")
        {
            --tmplife;
            var magnitude = 1100;
            var force = player.transform.position - other.transform.position;
            force.Normalize();
            GetComponent<Rigidbody2D>().AddForce(force * magnitude);
           
            life.text = tmplife.ToString();
            
            if (tmplife <= 0)
            {
                resetbutton.SetActive(true);
                endgametext.SetActive(true);
            }
            blood.SetActive(true);

        }
        if (other.gameObject.tag == "Points")
        {
           var tmp2 = ++points;
           pointtext.text = tmp2.ToString();
            var tmp = other.gameObject;
            Destroy(tmp);
            if(points == 25)
            {
                win.SetActive(true);
               
            }




        }


    }
}
