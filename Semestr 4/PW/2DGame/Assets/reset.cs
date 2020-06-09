using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class reset : MonoBehaviour
{
    public void ResetGame()
    {
        SceneManager.LoadScene(0);
        Debug.Log("Button");
    }

}