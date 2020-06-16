using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class camerafollow : MonoBehaviour
{ 
    public Transform Player;
    public Vector3 _camera;

    public float smooth = 0.5f;


    // Start is called before the first frame update
    void Start()
    {
        _camera = transform.position - Player.position;
    }

    private void LateUpdate()
    {
        Vector3 pos = Player.position + _camera;
        transform.position = Vector3.Slerp(transform.position, pos, smooth);
    }

    // Update is called once per frame
    void Update()
    {
        
    }
}
