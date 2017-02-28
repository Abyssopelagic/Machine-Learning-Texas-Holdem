package com.mygdx.project;

import com.badlogic.gdx.Gdx;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by ksbay on 2/14/2017.
 */
public class gettingData {

    //cards
    String cards = "Qd Jc\n" +
            "9s 8s\n" +
            "8h Ah\n" +
            "Jd 7d\n" +
            "Jc Ac\n" +
            "Qd As\n" +
            "Kd Kh\n" +
            "Qc As\n" +
            "Ts As\n" +
            "Ah 4s\n" +
            "6d 7c\n" +
            "Kc Qc\n" +
            "Qs Ah\n" +
            "7d Qd\n" +
            "Ad 9s\n" +
            "Ac 2d\n" +
            "6s Ah\n" +
            "4h Ac\n" +
            "Js 9d\n" +
            "Qs Ac\n" +
            "Tc 9d\n" +
            "Kd Jd\n" +
            "6s 7s\n" +
            "As Jc\n" +
            "8s 7c\n" +
            "Ts Td\n" +
            "4c Ac\n" +
            "2d 2c\n" +
            "9h Jh\n" +
            "8d 8c\n" +
            "3c As\n" +
            "Jh Kc\n" +
            "5s Js\n" +
            "Ad Ac\n" +
            "4d Js\n" +
            "6d Kd\n" +
            "Jh Jc\n" +
            "Jh 8c\n" +
            "7h 6h\n" +
            "Tc As\n" +
            "6c 6h\n" +
            "7d 6s\n" +
            "8c 9c\n" +
            "Qs 7h\n" +
            "8s Qh\n" +
            "As Qd\n" +
            "5s Qd\n" +
            "Qd Ah\n" +
            "8s As\n" +
            "Jc Ad\n" +
            "Qh 9h\n" +
            "8s 8c\n" +
            "Qd Tc\n" +
            "Ks As\n" +
            "Qd Qc\n" +
            "Jh Qh\n" +
            "4d Qh\n" +
            "9h Ad\n" +
            "9d Qs\n" +
            "Jc As\n" +
            "Ad 9c\n" +
            "7c 7s\n" +
            "Ad Ac\n" +
            "4d Ah\n" +
            "Qh Jd\n" +
            "8d 2s\n" +
            "Th 9h\n" +
            "Ts Jc\n" +
            "8h Kh\n" +
            "Td Jc\n" +
            "Kd Jc\n" +
            "Kc Qh\n" +
            "Js 2h\n" +
            "6d 7d\n" +
            "8s 7s\n" +
            "Ks 5d\n" +
            "7c 7s\n" +
            "Ad 8d\n" +
            "7d Td\n" +
            "9c 5c\n" +
            "Td 8s\n" +
            "Td 3d\n" +
            "7h 2c\n" +
            "Qs Ah\n" +
            "8d Ac\n" +
            "4c Ac\n" +
            "Ah 2h\n" +
            "9c Kh\n" +
            "8h 8d\n" +
            "Th Js\n" +
            "Kh Js\n" +
            "Kh Tc\n" +
            "7c 6c\n" +
            "Ah Qh\n" +
            "7s Ah\n" +
            "9h 7h\n" +
            "7c 7s\n" +
            "3h Ks\n" +
            "Ad Kh\n" +
            "Qc 7c\n" +
            "Ac Ah\n" +
            "Qc Ah\n" +
            "6h 5s\n" +
            "Ad 8d\n" +
            "Jd Kd\n" +
            "9d 8h\n" +
            "Ks Ts\n" +
            "Ks 9h\n" +
            "Jh Jc\n" +
            "Td Ad\n" +
            "Ah As\n" +
            "Jh Js\n" +
            "8c 3s\n" +
            "4s 5h\n" +
            "Ad Qd\n" +
            "Ad 2d\n" +
            "Kh 6h\n" +
            "9s As\n" +
            "Qh Js\n" +
            "9d Jd\n" +
            "Th 9d\n" +
            "Kh 7h\n" +
            "Kh 9h\n" +
            "2c 2s\n" +
            "5s Ks\n" +
            "8c Ac\n" +
            "Js Qc\n" +
            "As 6c\n" +
            "8d Ad\n" +
            "9h Kh\n" +
            "Js Ac\n" +
            "Ad 8d\n" +
            "4s Ks\n" +
            "Kd Jd\n" +
            "Kc Js\n" +
            "2d Ad\n" +
            "Ad Ks\n" +
            "2c 2s\n" +
            "8h 8s\n" +
            "4s 4c\n" +
            "8h Jh\n" +
            "Ac Jh\n" +
            "9c Kc\n" +
            "Td Ac\n" +
            "7s Ks\n" +
            "9c Ah\n" +
            "Js Jc\n" +
            "Ks Kc\n" +
            "Td Kh\n" +
            "3h As\n" +
            "Jc Js\n" +
            "Ts 8c\n" +
            "Js Qs\n" +
            "Ah Jd\n" +
            "Qd Kd\n" +
            "Kh Qs\n" +
            "Ah Ts\n" +
            "4h 4s\n" +
            "Js Td\n" +
            "9s 5h\n" +
            "4h 7c\n" +
            "9s Ah\n" +
            "Ah Kc\n" +
            "Ts Jc\n" +
            "Ah 4d\n" +
            "Jd As\n" +
            "Qc Jh\n" +
            "Qs Js\n" +
            "5d 5c\n" +
            "9s Ts\n" +
            "Qd 4d\n" +
            "7h 9h\n" +
            "As Td\n" +
            "As 4s\n" +
            "Ks Kd\n" +
            "3h 3s\n" +
            "9c Kc\n" +
            "8h Jc\n" +
            "Ts 9h\n" +
            "Js 8c\n" +
            "7c 7s\n" +
            "Jh Jd\n" +
            "8c As\n" +
            "2s Jc\n" +
            "4d 6h\n" +
            "Th 2c\n" +
            "Qc Kc\n" +
            "7d 7h\n" +
            "4d Ad\n" +
            "Td As\n" +
            "Ks 4s\n" +
            "9h 9s\n" +
            "7h 3h\n" +
            "Tc Ac\n" +
            "Ks 8s\n" +
            "Jd Tc\n" +
            "Th Kc\n" +
            "Ks Kc\n" +
            "Kd 8d\n" +
            "Ts Kd\n" +
            "Ts Kh\n" +
            "Td 5c\n" +
            "Qd Ah\n" +
            "Ks 3s\n" +
            "As 6d\n" +
            "3d 2d\n" +
            "4h Ah\n" +
            "Kh As\n" +
            "Ah Kc\n" +
            "Kh Ad\n" +
            "Ah 9c\n" +
            "Kd Ts\n" +
            "Th Td\n" +
            "6s Th\n" +
            "Td 4h\n" +
            "9h Ts\n" +
            "9h Jc\n" +
            "2s Kc\n" +
            "Jh Qh\n" +
            "Kh Js\n" +
            "Ah Ks\n" +
            "Ac 2d\n" +
            "Ac Qd\n" +
            "Td As\n" +
            "8s Th\n" +
            "Tc Js\n" +
            "Jc Ah\n" +
            "Qd As\n" +
            "8h Ad\n" +
            "9d Th\n" +
            "Ah 2d\n" +
            "4d Ad\n" +
            "9c 9s\n" +
            "3h Kh\n" +
            "As Ad\n" +
            "3c Ac\n" +
            "Ad 8d\n" +
            "9h 9s\n" +
            "Th Ad\n" +
            "Th 7h\n" +
            "Qh 9h\n" +
            "Ad 7d\n" +
            "Ah 6s\n" +
            "Kc Ts\n" +
            "Ac Ah\n" +
            "Ac Kc\n" +
            "Js Tc\n" +
            "Ah Qc\n" +
            "Qd Qs\n" +
            "Jc 8c\n" +
            "Ah 9c\n" +
            "Qh Ks\n" +
            "Jh Js\n" +
            "Js Ts\n" +
            "Ac 6c\n" +
            "9c 6c\n" +
            "9h Qc\n" +
            "Kd Jd\n" +
            "Qh Ts\n" +
            "6c Ad\n" +
            "Jh As\n" +
            "6s Kd\n" +
            "Qh Ad\n" +
            "9s 9h\n" +
            "Tc 9d\n" +
            "Jh 5d\n" +
            "5c 9s\n" +
            "7d 9d\n" +
            "Jd Qs\n" +
            "Qd 8d\n" +
            "Kc 2d\n" +
            "6d 7c\n" +
            "Ks 5s\n" +
            "Kh 2h\n" +
            "3s Ac\n" +
            "5c Ac\n" +
            "Jd Ad\n" +
            "9c 9d\n" +
            "Kc Td\n" +
            "3d Kd\n" +
            "8c Qd\n" +
            "Ks Js\n" +
            "Ac Tc\n" +
            "6h Jd\n" +
            "Ac Tc\n" +
            "5h 5s\n" +
            "Ad 9c\n" +
            "8h 9d\n" +
            "As 8c\n" +
            "Kd 5d\n" +
            "2h 2s\n" +
            "Tc Kd\n" +
            "Qc 2c\n" +
            "9h Kd\n" +
            "Kd 4d\n" +
            "8c Ac\n" +
            "Jc As\n" +
            "Js Qc\n" +
            "8c Kd\n" +
            "Kh Tc\n" +
            "Ad 7d\n" +
            "2s As\n" +
            "8h Kh\n" +
            "7c 3c\n" +
            "2s As\n" +
            "Kd 7s\n" +
            "Jd Kh\n" +
            "4s 8c\n" +
            "Ks Kh\n" +
            "Qc Qh\n" +
            "Qh Qs\n" +
            "Qd Tc\n" +
            "9h Ah\n" +
            "Qs Js\n" +
            "Th 8h\n" +
            "3s Ad\n" +
            "Td Qc\n" +
            "Ks 7s\n" +
            "Ks 9s\n" +
            "Qs Jd\n" +
            "6s As\n" +
            "Ks Qc\n" +
            "9d Ad\n" +
            "9h 6h\n" +
            "8c As\n" +
            "Td Qd\n" +
            "Ah Js\n" +
            "9s 9d\n" +
            "Kc Tc\n" +
            "Qs Jh\n" +
            "Ac Jc\n" +
            "Td Qs\n" +
            "2c 2d\n" +
            "Ad 8c\n" +
            "2h Ts\n" +
            "4c 6c\n" +
            "4h 9h\n" +
            "8c Kd\n" +
            "6d 3c\n" +
            "Th Jc\n" +
            "6d Qs\n" +
            "4s Ah\n" +
            "8s Kh\n" +
            "3h Qs\n" +
            "Qh Qc\n" +
            "Qs 6d\n" +
            "7s 8h\n" +
            "9h 7s\n" +
            "Ks 6h\n" +
            "Qd 7d\n" +
            "8s 6c\n" +
            "Ah 5h\n" +
            "Ks 6d\n" +
            "Td Qc\n" +
            "3c 4h\n" +
            "2d Qd\n" +
            "Qc 9d\n" +
            "2d 5d\n" +
            "9c 8d\n" +
            "5h 4c\n" +
            "8d 3c\n" +
            "9c 8d\n" +
            "Ad 2s\n" +
            "Kh 9h\n" +
            "8s Ks\n" +
            "4c 6h\n" +
            "Jc 4h\n" +
            "6c 7h\n" +
            "Ah 5d\n" +
            "Ad 9h\n" +
            "Qc Ks\n" +
            "As 3c\n" +
            "Ah Js\n" +
            "Ah Qs\n" +
            "Ac 8h\n" +
            "8c Ks\n" +
            "As 4h\n" +
            "Tc 9s\n" +
            "6h 3d\n" +
            "Qh As\n" +
            "Ad 9d\n" +
            "Qs Ks\n" +
            "Kh Jc\n" +
            "Qd Qc\n" +
            "7h As\n" +
            "Ks 7h\n" +
            "6c Ac\n" +
            "Qd Qc\n" +
            "Td Th\n" +
            "Ad Tc\n" +
            "Ad Qd\n" +
            "6h 6d\n" +
            "As Js\n" +
            "9h 9s\n" +
            "Kh 5h\n" +
            "Ad 3h\n" +
            "8s 8d\n" +
            "Ah As\n" +
            "Td Ah\n" +
            "6s Ah\n" +
            "Tc Ts\n" +
            "6s 6c\n" +
            "6h Ah\n" +
            "9h 8c\n" +
            "As Js\n" +
            "4d 4c\n" +
            "4c Kc\n" +
            "Qd Kc\n" +
            "7h 8d\n" +
            "7h 7c\n" +
            "Jd Js\n" +
            "Qc Kh\n" +
            "Qh 9h\n" +
            "Ts Kh\n" +
            "Qc 9s\n" +
            "Qd Tc\n" +
            "4d Jc\n" +
            "Ks 7d\n" +
            "6s 9s\n" +
            "8d 8c\n" +
            "8c Ac\n" +
            "6s 8d\n" +
            "9c 8c\n" +
            "Ks 9s\n" +
            "4c 3s\n" +
            "9c Qc\n" +
            "Qs Jh\n" +
            "Th Qd\n" +
            "5d Ac\n" +
            "4h 7h\n" +
            "Kd Kc\n" +
            "9h Ts\n" +
            "Qd Jd\n" +
            "Kd Jd\n" +
            "9s Js\n" +
            "9s Ks\n" +
            "4s 2c\n" +
            "As Ac\n" +
            "9d Qc\n" +
            "9h 9d\n" +
            "Kh Qc\n" +
            "2h Ts\n" +
            "As Ks\n" +
            "7d 7c\n" +
            "Kh 8d\n" +
            "Ah Ks\n" +
            "Kd Th\n" +
            "Tc Kc\n" +
            "Kc 7c\n" +
            "Kc Js\n" +
            "Qs As\n" +
            "4d 6d\n" +
            "Kd 9d\n" +
            "4c 3d\n" +
            "Th 7h\n" +
            "8d Ac\n" +
            "7h Ac\n" +
            "8c Kc\n" +
            "Qd Kd\n" +
            "Kc Jd\n" +
            "Ah Qh\n" +
            "Kd Js\n" +
            "Ks Kd\n" +
            "Jh Ts\n" +
            "Kd Kh\n" +
            "6h Jc\n" +
            "3s Ks\n" +
            "9s Qh\n" +
            "8s As\n" +
            "9c Jc\n" +
            "9c 8s\n" +
            "Ah 3d\n" +
            "Ad As\n" +
            "7h Ah\n" +
            "7c 8h\n" +
            "Ac Ks\n" +
            "Ah 3h\n" +
            "9c Ad\n" +
            "Jc 8c\n" +
            "As Th\n" +
            "8c 9s\n" +
            "Jc Ac\n" +
            "Td Js\n" +
            "8s Ts\n" +
            "Kh As\n" +
            "6d 8d\n" +
            "4d Kd\n" +
            "Th Jc\n" +
            "Jh 9h\n" +
            "Jc Qc\n" +
            "Qs Td\n" +
            "6s 7h\n" +
            "2s 7h\n" +
            "2c As\n" +
            "8c 4s\n" +
            "Ac 9h\n" +
            "Jc Js\n" +
            "As 5c\n" +
            "6d 5c\n" +
            "Kd Kc\n" +
            "3d 4d\n" +
            "As Jd\n" +
            "Ah Ad\n" +
            "Qh Kd\n" +
            "As Qd\n" +
            "3h 3d\n" +
            "Kh 3h\n" +
            "Jc Kd\n" +
            "Qc Th\n" +
            "7c 7h\n" +
            "Ad 7d\n" +
            "Ks 5h\n" +
            "6d 3d\n" +
            "8d 6d\n" +
            "Jc 5d\n" +
            "2s 5s\n" +
            "Jc Qs\n" +
            "Tc Ts\n" +
            "8s Td\n" +
            "Td Ts\n" +
            "Ad Qc\n" +
            "Ts Ks\n" +
            "8d Ah\n" +
            "8c 6c\n" +
            "8c 6c\n" +
            "9s Js\n" +
            "Td Kh\n" +
            "Ts 8s\n" +
            "Qd Qh\n" +
            "Ks Kh\n" +
            "Kc Qd\n" +
            "Qs Jh\n" +
            "Kc Js\n" +
            "3d 7c\n" +
            "Jc Ks\n" +
            "Qh As\n" +
            "Td Ts\n" +
            "Ah Js\n" +
            "Qc Jh\n" +
            "3d As\n" +
            "Td Kd\n" +
            "6c 5c\n" +
            "Qh 9h\n" +
            "Ah As\n" +
            "Tc Kd\n" +
            "Js Jc\n" +
            "Kd 6d\n" +
            "9c Qc\n" +
            "Qd Kh\n" +
            "Qs Js\n" +
            "Kh Qs\n" +
            "Ad Jd\n" +
            "Jh Kh\n" +
            "Kh 5h\n" +
            "3d 3c\n" +
            "7s Ts\n" +
            "Qc Qh\n" +
            "Qh Ac\n" +
            "5c Ac\n" +
            "4d As\n" +
            "3h 3s\n" +
            "3h 4h\n" +
            "Js Jc\n" +
            "Jd Qd\n" +
            "8s 9c\n" +
            "Ts 8d\n" +
            "Qh 2c\n" +
            "Qh Qd\n" +
            "Kc Kd\n" +
            "Qd Qc\n" +
            "Qc Jc\n" +
            "As Kh\n" +
            "3d Kd\n" +
            "Qc Qs\n" +
            "4h Kh\n" +
            "4d 7d\n" +
            "Jd Js\n" +
            "8h Ks\n" +
            "2c 8s\n" +
            "2c 4c\n" +
            "Qd Ad\n" +
            "3h As\n" +
            "Qs 9d\n" +
            "2c 2h\n" +
            "Kd Ks\n" +
            "Kc 9h\n" +
            "As Th\n" +
            "7h 6h\n" +
            "Ac Kd\n" +
            "Ks Ah\n" +
            "7c 8c\n" +
            "6h Th\n" +
            "7s Kc\n" +
            "9c 7s\n" +
            "9h Kh\n" +
            "Js Qc\n" +
            "Kd Js\n" +
            "Jd 8c\n" +
            "Th Js\n" +
            "Kd 3h\n" +
            "Qc Ac\n" +
            "4c 3c\n" +
            "Jd Js\n" +
            "Ac Kd\n" +
            "8d Ac\n" +
            "Ad As\n" +
            "4s Ad\n" +
            "4h 2h\n" +
            "Td Ks\n" +
            "6h Js\n" +
            "7h 8s\n" +
            "As 2d\n" +
            "Kh 3h\n" +
            "6c Qd\n" +
            "6h 7h\n" +
            "Kc Ad\n" +
            "9s Ad\n" +
            "Qh 4c\n" +
            "Js Ts\n" +
            "5s 5d\n" +
            "3d 4c\n" +
            "4c 5c\n" +
            "Qd Qc\n" +
            "Kc 7s\n" +
            "6s 6d\n" +
            "3h Th\n" +
            "3d Ah\n" +
            "Kd Ks\n" +
            "Qh Jc\n" +
            "5s 6s\n" +
            "Kc 6c\n" +
            "Ks Kh\n" +
            "Jh Qh\n" +
            "6c Kh\n" +
            "Ks Ts\n" +
            "4h 5h\n" +
            "7d 8c\n" +
            "2c 5c\n" +
            "Qc 8s\n" +
            "5c 7h\n" +
            "Qd 6d\n" +
            "3d 9s\n" +
            "4s 3d\n" +
            "6h 7s\n" +
            "Kd 5c\n" +
            "8d Td\n" +
            "Qd Ts\n" +
            "9h 4d\n" +
            "Qc Kd\n" +
            "Kc Ks\n" +
            "Ah 7h\n" +
            "8d 9s\n" +
            "9s Kd\n" +
            "Kc Qd\n" +
            "Jd 8d\n" +
            "Ad Ah\n" +
            "8h 9h\n" +
            "Jh Td\n" +
            "Ts 8d\n" +
            "Ts 9c\n" +
            "Jc 6c\n" +
            "2h Th\n" +
            "Kd Ks\n" +
            "Ah 7s\n" +
            "2h Ks\n" +
            "Kc Ks\n" +
            "Ah 9h\n" +
            "5c 5d\n" +
            "9s Ts\n" +
            "Td Qd\n" +
            "8d 9s\n" +
            "Ac Qd\n" +
            "Td Ad\n" +
            "Kh 5h\n" +
            "Jd 7c\n" +
            "4h 5h\n" +
            "6d As\n" +
            "7h 6s\n" +
            "Jc Kh\n" +
            "6h Kd\n" +
            "9h Qd\n" +
            "8d Jd\n" +
            "Th Kh\n" +
            "9h Ts\n" +
            "8c Tc\n" +
            "5d 8c\n" +
            "Js 9h\n" +
            "4s 7s\n" +
            "Kh As\n" +
            "Ac 6h\n" +
            "Td Tc\n" +
            "8h 2h\n" +
            "Kh Ks\n" +
            "4s 4d\n" +
            "Jd Ah\n" +
            "Tc Td\n" +
            "Ts Qh\n" +
            "3s Jd\n" +
            "7c Jh\n" +
            "Ks Td\n" +
            "5d Ac\n" +
            "Ah 2c\n" +
            "4c Ac\n" +
            "Ac 6s\n" +
            "4c Ks\n" +
            "8s 7c\n" +
            "6s Qc\n" +
            "Ad Ts\n" +
            "6d Ac\n" +
            "6c Qh\n" +
            "7d 9s\n" +
            "Ac 8h\n" +
            "Ks 6s\n" +
            "8d 8h\n" +
            "Kh 9d\n" +
            "2c 2s\n" +
            "Ts 9c\n" +
            "6s 7d\n" +
            "Th Kc\n" +
            "As Js\n" +
            "Kd Kc\n" +
            "Ks Td\n" +
            "Ks Kh\n" +
            "Qd Jd\n" +
            "9c Ah\n" +
            "5d Qh\n" +
            "Ac 6c\n" +
            "9c 5h\n" +
            "Ac Kd\n" +
            "Ac Qs\n" +
            "Kh Js\n" +
            "Jc 9s\n" +
            "4s 4c\n" +
            "9h 9c\n" +
            "Ts 8s\n" +
            "7s 9c\n" +
            "2h Kd\n" +
            "Kd 8s\n" +
            "4h Ks\n" +
            "Qc Qh\n" +
            "0 Kh Kd\n" +
            "Qd 2d\n" +
            "Qc Qh\n" +
            "Ad 3h\n" +
            "8h 9h\n" +
            "7h 5h\n" +
            "Ah Qh\n" +
            "Th Tc\n" +
            "Ts Qs\n" +
            "7h 7s\n" +
            "3d 7h\n" +
            "9c 8h\n" +
            "Kh Kc\n" +
            "Kh Kc\n" +
            "Th As\n" +
            "Jd Qh\n" +
            "Ks 5c\n" +
            "Kc 2d\n" +
            "9s 8c\n" +
            "6d Ad\n" +
            "Ks Qd\n" +
            "Jc 8h\n" +
            "2s 4d\n" +
            "8d Ad\n" +
            "2d 4s\n" +
            "6c 7d\n" +
            "Js As\n" +
            "Ac Ad\n" +
            "5c 5h\n" +
            "8h Td\n" +
            "8s Js\n" +
            "Jh Qs\n" +
            "8s Js\n" +
            "7s 7h\n" +
            "9c Js\n" +
            "Jh Tc\n" +
            "5c 6c\n" +
            "7c Tc\n" +
            "9h Ks\n" +
            "9d Kc\n" +
            "2d Qd\n" +
            "8h 5h\n" +
            "Jd 6d\n" +
            "4h Ts\n" +
            "5d Ac\n" +
            "Ac 6c\n" +
            "8s 4s\n" +
            "7d 7h\n" +
            "7h 3d\n" +
            "2s Qh\n" +
            "Qs 9d\n" +
            "5s 6c\n" +
            "Ad Jd\n" +
            "5s Jc\n" +
            "2s 2c\n" +
            "Ts 5c\n" +
            "3h 2c\n" +
            "7h Kc\n" +
            "9h 7s\n" +
            "7h Ts\n" +
            "Ks 6s\n" +
            "6c As\n" +
            "9h Td\n" +
            "6c Jd\n" +
            "6h 8c\n" +
            "8h 9c\n" +
            "Qs Td\n" +
            "Ac 6c\n" +
            "Kc Jc\n" +
            "7c 7s\n" +
            "Qd Qh\n" +
            "7d 2s\n" +
            "Ad Jd\n" +
            "Ac 9c\n" +
            "9h Jc\n" +
            "9c Qh\n" +
            "6s 6h\n" +
            "Ks 8s\n" +
            "Qh 2c\n" +
            "9h 7c\n" +
            "4h 9s\n" +
            "9s Td\n" +
            "9c 3d\n" +
            "9s 5s\n" +
            "6c Jh\n" +
            "4s 7s\n" +
            "Jd Kh\n" +
            "Qc 6d\n" +
            "9d 7s\n" +
            "Ac 4s\n" +
            "8h 8d\n" +
            "7h 4c\n" +
            "3d 6c\n" +
            "5d Ks\n" +
            "5s 4d\n" +
            "6c As\n" +
            "6c 8d\n" +
            "Ad 4d\n" +
            "9s 7d\n" +
            "8c 8d\n" +
            "9s Ks\n" +
            "Qh 4h\n" +
            "7h 7s\n" +
            "7s 7d\n" +
            "Qd Qc\n" +
            "6s 6c\n" +
            "4d 4h\n" +
            "Jh 2d\n" +
            "6s Js\n" +
            "7h 3h\n" +
            "Qc 7d\n" +
            "8s 2s\n" +
            "Kd 9c\n" +
            "5s 7s\n" +
            "8s Js\n" +
            "7h Td\n" +
            "Qs Ks\n" +
            "8d Ac\n" +
            "Th Kh\n" +
            "5h Qs\n" +
            "8c 8h\n" +
            "5c Ad\n" +
            "Jc Jd\n" +
            "Qc 7d\n" +
            "9c Td\n" +
            "Ad Ks\n" +
            "8d Td\n" +
            "Ah Kc\n" +
            "As 3h\n" +
            "7d 2d\n" +
            "8s 7c\n" +
            "Ac 2c\n" +
            "6h 9h\n" +
            "2d Kd\n" +
            "7d 6d\n" +
            "8h 7s\n" +
            "7c Kh\n" +
            "8d Td\n" +
            "9c 7d\n" +
            "4h 9h\n" +
            "7s 6d\n" +
            "6c 6h\n" +
            "5c 9c\n" +
            "4c 5h\n" +
            "6d 5c\n" +
            "7c 6d\n" +
            "2h Ac\n" +
            "3c Kd\n" +
            "Ks 7d\n" +
            "Qs 4h\n" +
            "5h 5d\n" +
            "6s 6h\n" +
            "6c As\n" +
            "Qd Qs\n" +
            "Qh 6d\n" +
            "5d Kd\n" +
            "8c Td\n" +
            "Qd As\n" +
            "Jd 9d\n" +
            "Js Ts\n" +
            "5c 7d\n" +
            "Qd As\n" +
            "Kc Jd\n" +
            "6s 8c\n" +
            "Ad Js\n" +
            "4s Qs\n" +
            "Kc Th\n" +
            "Ad Kc\n" +
            "5d 6d\n" +
            "As Kc\n" +
            "Kh Td\n" +
            "8s 8d\n" +
            "2s 5s\n" +
            "8d 8c\n" +
            "Kd 6h\n" +
            "As 2s\n" +
            "7h Jh\n" +
            "Ah 8h\n" +
            "Kh 2h\n" +
            "Ac 5c\n" +
            "Qd 9s\n" +
            "Jh 4h\n" +
            "Kh 8h\n" +
            "Js 9s\n" +
            "Ts Jc\n" +
            "8c Ts\n" +
            "Kc 3s\n" +
            "5d 3s\n" +
            "4c Js\n" +
            "Ac 6c\n" +
            "Ah 3h\n" +
            "7c Ac\n" +
            "Kc 5s\n" +
            "3h 6h\n" +
            "9s Td\n" +
            "3s 8s\n" +
            "4d Ac\n" +
            "9s 6c\n" +
            "6d 9d\n" +
            "5h 8c\n" +
            "5s Jh\n" +
            "Ac 5d\n" +
            "Ks 2d\n" +
            "As 8d\n" +
            "Qh 2d\n" +
            "4c Ks\n" +
            "7d 8h\n" +
            "Ad Kd\n" +
            "7h Qc\n" +
            "3s Jh\n" +
            "Tc 7c\n" +
            "8s 7c\n" +
            "8s Jc\n" +
            "Qh Qc\n" +
            "3c Qs\n" +
            "3d Js\n" +
            "2s 9d\n" +
            "5s 9d\n" +
            "6s 2s\n" +
            "Th Jd\n" +
            "9d Ts\n" +
            "4c Qd\n" +
            "9c As\n" +
            "2c Ad\n" +
            "9c 3s\n" +
            "3c As\n" +
            "9h Ac\n" +
            "4h 5d\n" +
            "6h 9d\n" +
            "Td As\n" +
            "Js Th\n" +
            "9h Ah\n" +
            "Qh 3c\n" +
            "6s 8h\n" +
            "2c Jd\n" +
            "Jc 8d\n" +
            "5c 3d\n" +
            "2h Ts\n" +
            "8c Qd\n" +
            "3c 4s\n" +
            "8c Kc\n" +
            "Tc 5d\n" +
            "Th As\n" +
            "9h 6c\n" +
            "Kc Ts\n" +
            "7c 9s\n" +
            "8s Jh\n" +
            "2s 6h\n" +
            "Ts Ks\n" +
            "Jh Jd\n" +
            "5h Kd\n" +
            "7d 2h\n" +
            "Js Jh\n" +
            "Tc 3c\n" +
            "Qc 5c\n" +
            "8d Ac\n" +
            "6h 4c\n" +
            "5s 6d\n" +
            "4c 2c\n" +
            "8h Jc\n" +
            "2h 9h\n" +
            "Kd 5s\n" +
            "7s 2h\n" +
            "8h Qc\n" +
            "Ad 7h\n" +
            "7d Qc\n" +
            "8c 2h\n" +
            "8c Qd\n" +
            "7c 6d\n" +
            "Ah Qc\n" +
            "9c 9d\n" +
            "Kd Ad\n" +
            "Jc 6c\n" +
            "As Kh\n" +
            "2s Ad\n" +
            "Ks Td\n" +
            "9d Td\n" +
            "4s Jc\n" +
            "Ts Tc\n" +
            "3s 3c\n" +
            "3d Qd\n" +
            "Kd Qd\n" +
            "8c 7h\n" +
            "Td Ad\n" +
            "Kd As\n" +
            "Qc 2c\n" +
            "7s Kc\n" +
            "Kh 8c\n" +
            "Ad 4s\n" +
            "Ac 6s\n" +
            "Ac Th\n" +
            "Jc 3c\n" +
            "6h Jh\n" +
            "Jd Qs\n" +
            "Kc 6d\n" +
            "Ah Tc\n" +
            "8h Th\n" +
            "3d 2d\n" +
            "Ad Ah\n" +
            "Qh 2h\n" +
            "Qd Jh\n" +
            "Ts 9d\n" +
            "Ks Kc\n" +
            "5c Qd\n" +
            "Qd 5h\n" +
            "5d Qc\n" +
            "5s 3c\n" +
            "8s 9h\n" +
            "Ac Ad\n" +
            "Jc 2c\n" +
            "Jc 8c\n" +
            "7h As\n" +
            "Jh 6h\n" +
            "4c Jh\n" +
            "Kc 9d\n" +
            "Ts Qh\n" +
            "Ts Th\n" +
            "8c 9s\n" +
            "Qc Kd\n" +
            "9h 7c\n" +
            "8h Jh\n" +
            "Ad 3d\n" +
            "Ah Ac\n" +
            "Kh 8c\n" +
            "Qs Kc\n" +
            "Js Qs\n" +
            "6h 6d\n" +
            "Ad Kd\n" +
            "5h 4s\n" +
            "Ad 3s\n" +
            "4h 3h\n" +
            "Td 5s\n" +
            "5c 6c\n" +
            "5h 4c\n" +
            "Jd Ad\n" +
            "4d 3h\n" +
            "Ah Qc\n" +
            "Qh 4s\n" +
            "Ad Tc\n" +
            "7h 7c\n" +
            "5d 6d\n" +
            "7h Th\n" +
            "Kc Ks\n" +
            "9c Kc\n" +
            "Jd 7c\n" +
            "Qh Jh\n" +
            "3d Ac\n" +
            "Ah Ad\n" +
            "Ac Qd\n" +
            "Td Tc\n" +
            "Qh Qs\n" +
            "Tc Kc\n" +
            "5c 5d\n" +
            "Kh 8h\n" +
            "Ah Ac\n" +
            "5s 8s\n" +
            "Ah Qs\n" +
            "5h 6s\n" +
            "5c Ac\n" +
            "Qs Ac\n" +
            "Jh Ah\n" +
            "8c 8d\n" +
            "8s Jc\n" +
            "Kd Kc\n" +
            "Qs Qc\n" +
            "6h 6c\n" +
            "Jc Th\n" +
            "3h 7c\n" +
            "Ad Td\n" +
            "Ts Ks\n" +
            "Ah 9h\n" +
            "2d Qd\n" +
            "Qd 9d\n" +
            "Ts As\n" +
            "Kh Ts\n" +
            "3d Ah\n" +
            "7d 4h\n" +
            "8c Ac\n" +
            "Th 4s\n" +
            "Ah 4d\n" +
            "8h 7c\n" +
            "Kc 9c\n" +
            "2d 5d\n" +
            "As Kd\n" +
            "9h 6s\n" +
            "6s 5d\n" +
            "Ah Jh\n" +
            "6d 8h\n" +
            "Jd Ah\n" +
            "8c 2h\n" +
            "3s 6d\n" +
            "Ks 8d\n" +
            "Ah Ac\n" +
            "5d 2d\n" +
            "Qh As\n" +
            "6c Ad\n" +
            "As Qd\n" +
            "Jd Kd\n" +
            "Ad Qd\n" +
            "6s As\n" +
            "Jh Ad\n" +
            "Kc Ah\n" +
            "4d Ad\n" +
            "Kd As\n" +
            "Js Ks\n" +
            "7d Kd\n" +
            "Kh Jc\n" +
            "As 4s\n" +
            "9c Ah\n" +
            "Kd Ts\n" +
            "5h 8h\n" +
            "Tc 7c\n" +
            "Kh 6s\n" +
            "4c Td\n" +
            "9h 8d\n" +
            "Kc As\n" +
            "6d Ad\n" +
            "Tc Ac\n" +
            "5d 8s\n" +
            "9d Kd\n" +
            "9h Ad\n" +
            "Qd 7h\n" +
            "6h 6d\n" +
            "6s 4h\n" +
            "7d 3s\n" +
            "Qd 5c\n" +
            "Ah Jc\n" +
            "Ac 4c\n" +
            "As 7s\n" +
            "Th Qc\n" +
            "6d 5d\n" +
            "Jc Kh\n" +
            "2s 5s\n" +
            "9h Th\n" +
            "Ts Td\n" +
            "5s 6h\n" +
            "7c Qd\n" +
            "Ad As\n" +
            "Th Ac\n" +
            "7d Td\n" +
            "Qs 9s\n" +
            "Qh Kc\n" +
            "6h 2c\n" +
            "6s Ks\n" +
            "Ad 4d\n" +
            "4c Jc\n" +
            "Th Ah\n" +
            "Jd 8d\n" +
            "9h Jh\n" +
            "9s Ah\n" +
            "Kh Kc\n" +
            "Kh Qs\n" +
            "Ks 5c\n" +
            "Kd 9d\n" +
            "4h Ac\n" +
            "6c 6d\n" +
            "Qd 5c\n" +
            "2h Qd\n" +
            "As 7h\n" +
            "6s 2h\n" +
            "9s 6s\n" +
            "9s Th\n" +
            "2s 2c\n" +
            "9h Kc\n" +
            "Qc 9s\n" +
            "7d As\n" +
            "9s 2s\n" +
            "Kd Jh\n" +
            "8c 8s\n" +
            "Kh Qs\n" +
            "Kh Tc\n" +
            "Ac Qc\n" +
            "Ac 4c\n" +
            "Td 2s\n" +
            "Kd Qc\n" +
            "Th Td\n" +
            "Qs Tc\n" +
            "Jh As\n" +
            "Js Jh\n" +
            "Ts Ks\n" +
            "Td 7c\n" +
            "9d Ts\n" +
            "7h Ks\n" +
            "Ah 8c\n" +
            "Jc 6s\n" +
            "6c Ks\n" +
            "6s 6d\n" +
            "Ts 9d\n" +
            "Jc 7d\n" +
            "3s 3c\n" +
            "5c Qs\n" +
            "Tc 6c\n" +
            "6c Qc\n" +
            "4d Js\n" +
            "Jc 9c\n" +
            "2s 2h\n" +
            "9s Jc\n" +
            "Th 8s\n" +
            "Kd 9d\n" +
            "Ks Kd\n" +
            "Th 9c\n" +
            "Kh As\n" +
            "2s Ks\n" +
            "Kd 9h\n" +
            "7h 7c\n" +
            "Ad Ac\n" +
            "Kh 8c\n" +
            "5h Ac\n" +
            "7s Qs\n" +
            "4h 4s\n" +
            "Ad Ac\n" +
            "9s 9c\n" +
            "6s 3c\n" +
            "As Ts\n" +
            "Th Ad\n" +
            "6h 6s\n" +
            "Td Qc\n" +
            "Ad 5c\n" +
            "4d 7s\n" +
            "Js Ts\n" +
            "Kh Qs\n" +
            "Tc 9h\n" +
            "Jh Th\n" +
            "Ts Ad\n" +
            "4d Ad\n" +
            "8d Jc\n" +
            "9d Ad\n" +
            "5d 5c\n" +
            "9d Qh\n" +
            "4h 9h\n" +
            "As Jc\n" +
            "Js 9d\n" +
            "Js Jh\n" +
            "Ah Ts\n" +
            "Js Qs\n" +
            "Ac 5c\n" +
            "Qs Kh\n" +
            "Qs Qd\n" +
            "Ts Qs\n" +
            "Jh Kh\n" +
            "Qs Ad\n" +
            "7s 7c\n" +
            "5c Qs\n" +
            "9h 9d\n" +
            "As Td\n" +
            "9s Ad\n" +
            "8d Ac\n" +
            "Jc Jd\n" +
            "6h Kc\n" +
            "Td Kd\n" +
            "Jd Jc\n" +
            "Ah Kh\n" +
            "As 2s\n" +
            "Js Jh\n" +
            "Kd Jc\n" +
            "Qh Ad\n" +
            "Qs Ks\n" +
            "Th Td\n" +
            "As Tc\n" +
            "Tc 2s\n" +
            "6h Kd\n" +
            "Ah 4c\n" +
            "7d 3c\n" +
            "Js Ah\n" +
            "Ad 7c\n" +
            "Kh 9s\n" +
            "9s Js\n" +
            "6s 6h\n" +
            "Kc Kh\n" +
            "Kh 6s\n" +
            "Ts Qh\n" +
            "7c 9c\n" +
            "4c Jc\n" +
            "9d 9c\n" +
            "Kh As\n" +
            "Td Jc\n" +
            "7c 7s\n" +
            "Ad As\n" +
            "4s As\n" +
            "Tc 9c\n" +
            "Kc 9c\n" +
            "Th Ks\n" +
            "Qc Kd\n" +
            "Ac 9c\n" +
            "4h 4s\n" +
            "Qd As\n" +
            "8s 8c\n" +
            "8s 3s\n" +
            "Ac Kc\n" +
            "Ad Qd\n" +
            "3c As\n" +
            "Ac 9c\n" +
            "4h 4s\n" +
            "6d Qc\n" +
            "Tc Jh\n" +
            "Kd 4d\n" +
            "4c 7d\n" +
            "Tc 9c\n" +
            "5h As\n" +
            "4h Ah\n" +
            "Qd Qh\n" +
            "7h 7d\n" +
            "Ah Td\n" +
            "4s 4h\n" +
            "7d Ad\n" +
            "8d 8c\n" +
            "5h 5c\n" +
            "4d 4s\n" +
            "Qc 6h\n" +
            "Js Kh\n" +
            "8c 3h\n" +
            "As 8s\n" +
            "6c 2h\n" +
            "9h 9c\n" +
            "As Ac\n" +
            "8s 8h\n" +
            "6c 6s\n" +
            "5s 8d\n" +
            "Ac 7h\n" +
            "Kd Qh\n" +
            "6h 6c\n" +
            "Ac 9d\n" +
            "4d 8h\n" +
            "Jc Jh\n" +
            "Jd Th\n" +
            "Jc Jd\n" +
            "Jc 5c\n" +
            "As 7s\n" +
            "As Ac\n" +
            "2c 8c\n" +
            "7h As\n" +
            "As Qd\n" +
            "Ac As\n" +
            "Kh Ah\n" +
            "3c Jc\n" +
            "Ad 7h\n" +
            "Ad 2d\n" +
            "Ks Kh\n" +
            "2h 8s\n" +
            "Th 8c\n" +
            "Qc 2h\n" +
            "Jh As\n" +
            "9c Qc\n" +
            "Ah 9h\n" +
            "Ac Qd\n" +
            "7d Kd\n" +
            "Jc Kh\n" +
            "Kd Ks\n" +
            "7d 7c\n" +
            "Th Tc\n" +
            "Qh As\n" +
            "Kh As\n" +
            "Ks Tc\n" +
            "Ad Qd\n" +
            "4h Qd\n" +
            "6s 6d\n" +
            "6d Ah\n" +
            "3d 2s\n" +
            "Jc 8d\n" +
            "2c Ad\n" +
            "5s Ad\n" +
            "9c Qc\n" +
            "Ad 4h\n" +
            "Qd Qs\n" +
            "Jh Ts\n" +
            "Ts 9c\n" +
            "Ah Kc\n" +
            "5d 5c\n" +
            "Qh Td\n" +
            "4h Ks\n" +
            "Kd 6c\n" +
            "As 5c\n" +
            "Qh Ks\n" +
            "Kc Qc\n" +
            "2s Kd\n" +
            "Qh 4h\n" +
            "2d 2h\n" +
            "Kh Jh\n" +
            "As 6s\n" +
            "8h 8s\n" +
            "Ad 4h\n" +
            "As 7d\n" +
            "Kh 2d\n" +
            "6d Qh\n" +
            "9d Qs\n" +
            "5h 6s\n" +
            "Js 8d\n" +
            "Kd Kc\n" +
            "Qs Qh\n" +
            "7c 7s\n" +
            "Kh 6s\n" +
            "9s 3s\n" +
            "Qd Js\n" +
            "Kd 8c\n" +
            "Kd Ts\n" +
            "3h 7s\n" +
            "7h 7c\n" +
            "Ad 5s\n" +
            "Qc Qd\n" +
            "Qc 9d\n" +
            "Jh Jc\n" +
            "As 3c\n" +
            "4d Qh\n" +
            "9c 6d\n" +
            "3s 3d\n" +
            "5d 7c\n" +
            "3h 3d\n" +
            "8c Ts\n" +
            "4h 4d\n" +
            "4s Kd\n" +
            "9h 9s\n" +
            "Qs Qd\n" +
            "Kd Ah\n" +
            "8d As\n" +
            "8h 9h\n" +
            "4d Ad\n" +
            "2s Qs\n" +
            "6h 4c\n" +
            "Jc 9c\n" +
            "2d Ac\n" +
            "6s Ks\n" +
            "5c Ah\n" +
            "As Jd\n" +
            "Kh 9c\n" +
            "Td 8d\n" +
            "Jd Td\n" +
            "Ad 7s\n" +
            "Jh Ah\n" +
            "5s 9d\n" +
            "6d 6c\n" +
            "Ac 8c\n" +
            "Ts Qs\n" +
            "Tc Kd\n" +
            "7h 6c\n" +
            "8h 8d\n" +
            "Js Ac\n" +
            "9d Ts\n" +
            "4h 9c\n" +
            "7c 6h\n" +
            "Kh Ac\n" +
            "Qs Kd\n" +
            "Qh Kh\n" +
            "9c Qd\n" +
            "8h Ah\n" +
            "Js 9c\n" +
            "Kh Jc\n" +
            "Kd Ac\n" +
            "Kh 5s\n" +
            "Jd Jc\n" +
            "Jh 7h\n" +
            "7c Kh\n" +
            "9c 9s\n" +
            "Jd 8d\n" +
            "5c Qh\n" +
            "6h Kc\n" +
            "Qh 4c\n" +
            "7c 7d\n" +
            "As 5c\n" +
            "Kc 3h\n" +
            "Kh Td\n" +
            "Kh Qc\n" +
            "Kh 8s\n" +
            "Ac Js\n" +
            "5s 5d\n" +
            "Td Qd\n" +
            "Kh Ts\n" +
            "Jd Kc\n" +
            "9d Qc\n" +
            "3d 3c\n" +
            "7c 7d\n" +
            "3s As\n" +
            "Ks 4s\n" +
            "5d As\n" +
            "Qh Kh\n" +
            "Kc 9d\n" +
            "Ad 6s\n" +
            "As 2s\n" +
            "Ks Ad\n" +
            "3h As\n" +
            "Kc Ts\n" +
            "7h 7s\n" +
            "Qc 5d\n" +
            "5h Qd\n" +
            "As Kd\n" +
            "Kd Th\n" +
            "Ah 4h\n" +
            "8s Qs\n" +
            "Ac Kc\n" +
            "Th As\n" +
            "Qh Kh\n" +
            "Qs 7c\n" +
            "8s Jc\n" +
            "Ad 7d\n" +
            "4h Ad\n" +
            "Ah 3c\n" +
            "5d 7c\n" +
            "Kd 6d\n" +
            "Js 9c\n" +
            "Ks As\n" +
            "5c Ad\n" +
            "Jh Qs\n" +
            "Kd Ah\n" +
            "7s Qh\n" +
            "Tc Kc\n" +
            "Kd 9h\n" +
            "9d 9s\n" +
            "Kc Jc\n" +
            "Ts Kd\n" +
            "As Ah\n" +
            "Td 9h\n" +
            "5c Ac\n" +
            "9h Qd\n" +
            "7c Td\n" +
            "Kh Ah\n" +
            "Qc 9c\n" +
            "Td 4d\n" +
            "As 7c\n" +
            "Kh 5h\n" +
            "3h 8c\n" +
            "Kc 4s\n" +
            "7c 9h\n" +
            "Qc Ts\n" +
            "5c Tc\n" +
            "2h Qs\n" +
            "Kc Ah\n" +
            "7c Qc\n" +
            "Ac 7d\n" +
            "7c As\n" +
            "6h 4h\n" +
            "5s 2d\n" +
            "6d Kc\n" +
            "Td 9d\n" +
            "9s 9d\n" +
            "8h 2s\n" +
            "4d Qs\n" +
            "Ad 9h\n" +
            "9s Qd\n" +
            "Qh Jh\n" +
            "3s Ad\n" +
            "Ah Ad\n" +
            "Ad Td\n" +
            "Qc Ks\n" +
            "6h 6s\n" +
            "As Qc\n" +
            "As Kc\n" +
            "8d 5c\n" +
            "Jd Ac\n" +
            "8d 2s\n" +
            "5s Js\n" +
            "9d Qd\n" +
            "Kh As\n" +
            "7c 7s\n" +
            "5h Ah\n" +
            "Qd Td\n" +
            "As 2s\n" +
            "9s Qd\n" +
            "9s Kd\n" +
            "5s 3d\n" +
            "Jd Tc\n" +
            "2c 5c\n" +
            "5c 9h\n" +
            "Ad 4s\n" +
            "Ac 7d\n" +
            "As 4d\n" +
            "5d Td\n" +
            "5s Qh\n" +
            "6c Td\n" +
            "8h Ts\n" +
            "Qc Ks\n" +
            "9d 8c\n" +
            "6s 9d\n" +
            "Td 4s\n" +
            "Ts 4s\n" +
            "Th 7c\n" +
            "8d 6s\n" +
            "Jc 7d\n" +
            "6h 2d\n" +
            "Td 7h\n" +
            "8h Jd\n" +
            "Js Td\n" +
            "Kd 7h\n" +
            "Ac Jh\n" +
            "4h 6h\n" +
            "Qh 9d\n" +
            "Ac 8s\n" +
            "Qh 3c\n" +
            "Qs 7s\n" +
            "Qd 9s\n" +
            "3d Js\n" +
            "9s Qc\n" +
            "9s Ah\n" +
            "5s 2h\n" +
            "6s Js\n" +
            "5c 9c\n" +
            "Ts 3h\n" +
            "Ad 9h\n" +
            "Kh 6d\n" +
            "As Jd\n" +
            "6d 6s\n" +
            "Kc 5c\n" +
            "8h Qs\n" +
            "7c Qh\n" +
            "Ah Js\n" +
            "9c 5s\n" +
            "Ah Th\n" +
            "Kh Ah\n" +
            "Ks Qs\n" +
            "Jc 9h\n" +
            "8c Ah\n" +
            "Kc Kh\n" +
            "Qc Qh\n" +
            "7c As\n" +
            "Th Ks\n" +
            "2d Ks\n" +
            "As 4h\n" +
            "Jh Kd\n" +
            "Kh 6c\n" +
            "Ad 2d\n" +
            "Js Kd\n" +
            "As Jc\n" +
            "Qc Qd\n" +
            "8s Js\n" +
            "Ts Td\n" +
            "Kd Jd\n" +
            "Qc Ks\n" +
            "Kh Ac\n" +
            "5c 9h\n" +
            "Jd Kc\n" +
            "8d 8h\n" +
            "Td Qs\n" +
            "Js Jd\n" +
            "Ac Th\n" +
            "Ah As\n" +
            "Kc Ks\n" +
            "As Ks\n" +
            "Ad Kh\n" +
            "4d Js\n" +
            "Kd 9h\n" +
            "Ac 9d\n" +
            "9h 9c\n" +
            "Kc Tc\n" +
            "Qd Qs\n" +
            "As 9s\n" +
            "Ah Kc\n" +
            "Ah 9s\n" +
            "Jc As\n" +
            "7s 7c\n" +
            "Qc Qs\n" +
            "2d Ad\n" +
            "Kc Qd\n" +
            "Tc Qd\n" +
            "2s As\n" +
            "8c As\n" +
            "9h Td\n" +
            "8s 8h\n" +
            "Qd Ac\n" +
            "Jc Td\n" +
            "Kd Qs\n" +
            "As Ad\n" +
            "Ad Qs\n" +
            "6s Ks\n" +
            "6c 6s\n" +
            "Ah 3h\n" +
            "7h Ac\n" +
            "Qd 9s\n" +
            "Ad Ks\n" +
            "Ac Qh\n" +
            "9h Qd\n" +
            "Qs 4s\n" +
            "Qd Qc\n" +
            "Qc Ad\n" +
            "Jc 7c\n" +
            "5h Js\n" +
            "Ks As\n" +
            "Qs Ac\n" +
            "Kc Ts\n" +
            "Js 9c\n" +
            "Kc Jc\n" +
            "Qd Ah\n" +
            "Ks Jd\n" +
            "As Js\n" +
            "Qc Ac\n" +
            "5s As\n" +
            "Ah 6h\n" +
            "Ts 4s\n" +
            "4d Ad\n" +
            "9h 3c\n" +
            "Kc 9h\n" +
            "6c 6d\n" +
            "Qs Ac\n" +
            "Qd Kc\n" +
            "Jh 9h\n" +
            "7c 8d\n" +
            "7h 7s\n" +
            "8s 8d\n" +
            "Th Qs\n" +
            "Th Jh\n" +
            "7s As\n" +
            "Ad Jd\n" +
            "Qc Kd\n" +
            "9h 9s\n" +
            "Qc Ad\n" +
            "Qs Kc\n" +
            "8h 7s\n" +
            "4h Ah\n" +
            "Ad 8h\n" +
            "5s Ac\n" +
            "Kh Qh\n" +
            "Td 6d\n" +
            "Td Qh\n" +
            "6d 6c\n" +
            "Kc 7s\n" +
            "As 2c\n" +
            "Ts Js\n" +
            "Js Tc\n" +
            "7c 7s\n" +
            "Ts Tc\n" +
            "Ah 8h\n" +
            "Th Ah\n" +
            "Kd Th\n" +
            "As Ac\n" +
            "9h Qd\n" +
            "Kh Qs\n" +
            "Jd Kc\n" +
            "7h Qh\n" +
            "Ad Ac\n" +
            "Js Jd\n" +
            "Kh 2h\n" +
            "Ah 9s\n" +
            "Ac 8c\n" +
            "Ac Th\n" +
            "Th Tc\n" +
            "Kc 6c\n" +
            "Js Tc\n" +
            "3d Ah\n" +
            "Tc Td\n" +
            "Kh Ad\n" +
            "Jh Kd\n" +
            "Kh Qh\n" +
            "Ah Kc\n" +
            "Th As\n" +
            "Kd Ac\n" +
            "Js Qs\n" +
            "Ts As\n" +
            "Ad Jc\n" +
            "Kh Kc\n" +
            "6c 3s\n" +
            "Qs Qh\n" +
            "Qd Qh\n" +
            "Ad Ts\n" +
            "Ks Ts\n" +
            "Ad Ks\n" +
            "Ts Td\n" +
            "Ah Kh\n" +
            "As Jd\n" +
            "Jh Qd\n" +
            "Js Jc\n" +
            "Kc 9h\n" +
            "7s Ks\n" +
            "Tc Qd\n" +
            "8s Ac\n" +
            "Jc Th\n" +
            "7d 2d\n" +
            "8h Ac\n" +
            "Qd Qc\n" +
            "Ac 7s\n" +
            "Ac 5c\n" +
            "7c 6c\n" +
            "9s Ks\n" +
            "Qc Jh\n" +
            "5h 5c\n" +
            "4d 2s\n" +
            "Ac Jd\n" +
            "9s 6s\n" +
            "As Td\n" +
            "4s Qs\n" +
            "Ac 9d\n" +
            "Th 8s\n" +
            "6s 3s\n" +
            "Js Qh\n" +
            "8c Ah\n" +
            "8h Ks\n" +
            "Kh Qd\n" +
            "Qd Ts\n" +
            "Ac Kc\n" +
            "Kh Ks\n" +
            "8h 3c\n" +
            "Ad Jc\n" +
            "Kd As\n" +
            "Qc Kd\n" +
            "Th Ah\n" +
            "7c Ac\n" +
            "6h Qh\n" +
            "Qs Jh\n" +
            "7s 3d\n" +
            "Ah Kd\n" +
            "Qh Ad\n" +
            "9c Qh\n" +
            "9s 6s\n" +
            "Qd Jh\n" +
            "3c Ad\n" +
            "Kc 3c\n" +
            "Kc Kh\n" +
            "9c 3c\n" +
            "Ah Js\n" +
            "Qs Qc\n" +
            "Js 8d\n" +
            "Kc Ks\n" +
            "Th Jd\n" +
            "Kc Td\n" +
            "Kc Qd\n" +
            "Qc Tc\n" +
            "Qh Jh\n" +
            "Jc Ks\n" +
            "8d Ad\n" +
            "Kd Ah\n" +
            "Ah Jd\n" +
            "Ad Qc\n" +
            "5h Jh\n" +
            "Js Qh\n" +
            "8h Td\n" +
            "Ac As\n" +
            "Kc Ks\n" +
            "9d Jh\n" +
            "Qs Td\n" +
            "Kd Td\n" +
            "Jd Js\n" +
            "As 9d\n" +
            "2s Qh\n" +
            "8h Kh\n" +
            "Kd Tc\n" +
            "3h Kd\n" +
            "Ad Ks\n" +
            "Ts Js\n" +
            "8d Th\n" +
            "Ac Qc\n" +
            "Qc Kh\n" +
            "Qd Qh\n" +
            "Js Kh\n" +
            "Jd 7s\n" +
            "Ah 7c\n" +
            "Kc 7h\n" +
            "7s Qs\n" +
            "8d 6d\n" +
            "Qc Th\n" +
            "8h Kd\n" +
            "9d 5d\n" +
            "Ks Ts\n" +
            "Qc Ah\n" +
            "6d 6c\n" +
            "Ah 4c\n" +
            "Kd 6s\n" +
            "2d Ac\n" +
            "Qc Ks\n" +
            "Ad Ts\n" +
            "Td Ts\n" +
            "Qc Jh\n" +
            "2s Ks\n" +
            "Th Js\n" +
            "Kh Ad\n" +
            "7h 6c\n" +
            "Ah 9s\n" +
            "2c 8c\n" +
            "6s Ts\n" +
            "Ah Ks\n" +
            "Kh Ks\n" +
            "5c 2c\n" +
            "7s Ad\n" +
            "Jh Tc\n" +
            "Js Jd\n" +
            "Th 9s\n" +
            "9h 8h\n" +
            "Tc Kc\n" +
            "Qd Qc\n" +
            "Th Kd\n" +
            "Qd Qs\n" +
            "Ac 2c\n" +
            "Ah 9s\n" +
            "Ad Qc\n" +
            "Ad Jd\n" +
            "Kd Ac\n" +
            "Td Ad\n" +
            "Th 7d\n" +
            "7h Ah\n" +
            "8h Kh\n" +
            "Ac Ks\n" +
            "As 3s\n" +
            "Ah 5c\n" +
            "Qc Js\n" +
            "6d Qc\n" +
            "Ad Kc\n" +
            "8d 7c\n" +
            "6d As\n" +
            "Kc Ts\n" +
            "Th 2s\n" +
            "Tc Ah\n" +
            "Kc Ac\n" +
            "Qh Ah\n" +
            "As 3s\n" +
            "4c Ad\n" +
            "Kd Th\n" +
            "Ad Qd\n" +
            "8d Ac\n" +
            "Ac Tc\n" +
            "Td 9d\n" +
            "Ad Qh\n" +
            "Qc Qd\n" +
            "Th Ac\n" +
            "Ts As\n" +
            "5c 9h\n" +
            "9d 9h\n" +
            "8s Ah\n" +
            "As Ks\n" +
            "Kc Jc\n" +
            "Qh Th\n" +
            "Kh Th\n" +
            "Qh Kc\n" +
            "Jd Ks\n" +
            "Kh Kc\n" +
            "Js Ad\n" +
            "Ts Js\n" +
            "8c As\n" +
            "5c Ad\n" +
            "Ac 6c\n" +
            "4s Tc\n" +
            "Ad Ks\n" +
            "Jh 4s\n" +
            "Kh Kd\n" +
            "Js Qc\n" +
            "9c Ad\n" +
            "Jh Ah\n" +
            "Jd Kd\n" +
            "8h 8c\n" +
            "Jh Jd\n" +
            "Qd Ad\n" +
            "Kh 9h\n" +
            "Qs Jh\n" +
            "9h Kh\n" +
            "Td Jh\n" +
            "Ac Td\n" +
            "Kh Ac\n" +
            "Kh Ah\n" +
            "Qh 3h\n" +
            "Qd Kd\n" +
            "Ah Td\n" +
            "Kc Qh\n" +
            "Ah Kc\n" +
            "Td As\n" +
            "Ts Qd\n" +
            "Ks Jh\n" +
            "6d As\n" +
            "As Ks\n" +
            "Ks Js\n" +
            "Qd Tc\n" +
            "As Js\n" +
            "Qd Ks\n" +
            "Ts 6s\n" +
            "5d Ah\n" +
            "Kc Td\n" +
            "Ac Qd\n" +
            "Kc Kd\n" +
            "6c 4h\n" +
            "Ad Qs\n" +
            "Kc 8c\n" +
            "Kh Js\n" +
            "Ac 5s\n" +
            "Td As\n" +
            "Ac Th\n" +
            "Ts As\n" +
            "8h Js\n" +
            "Qh Th\n" +
            "Kd Qd\n" +
            "Ah 5h\n" +
            "Kc Qs\n" +
            "Qc Ac\n" +
            "Th Ts\n" +
            "Qc Qs\n" +
            "Kd 4d\n" +
            "9d Th\n" +
            "Th Qs\n" +
            "Jd Js\n" +
            "Kc 4c\n" +
            "Jh 8c\n" +
            "Ah 4c\n" +
            "Qd Jd\n" +
            "9c Td\n" +
            "Qd Ks\n" +
            "Ks Ad\n" +
            "8c 9c\n" +
            "Tc 2h\n" +
            "Kd Ac\n" +
            "8h 8d\n" +
            "8s 8h\n" +
            "Td Kh\n" +
            "Qd Tc\n" +
            "Jd Kd\n" +
            "Ks 6s\n" +
            "Js Qs\n" +
            "Ad 8d\n" +
            "Jh Jc\n" +
            "8c Ac\n" +
            "Ks 4s\n" +
            "As Qc\n" +
            "8d 4s\n" +
            "8h Qh\n" +
            "9h Ts\n" +
            "6s Qc\n" +
            "Kh 6h\n" +
            "Qh 6c\n" +
            "Kh Ks\n" +
            "Ac Td\n" +
            "Td 9c\n" +
            "7d 8d\n" +
            "Tc Ac\n" +
            "Th Tc\n" +
            "9s Qc\n" +
            "Qs Tc\n" +
            "Qh Td\n" +
            "6s As\n" +
            "Kh Qc\n" +
            "Qh Th\n" +
            "Ad Jc\n" +
            "Ac 5c\n" +
            "Js Jd\n" +
            "9h 9s\n" +
            "9c 9s\n" +
            "5c Kc\n" +
            "Jh Js\n" +
            "9d 9s\n" +
            "Qh 9c\n" +
            "6s 6c\n" +
            "Td Jd\n" +
            "Ts Th\n" +
            "Ad Js\n" +
            "9c Ks\n" +
            "Qd Kh\n" +
            "Kd 4s\n" +
            "Jh Jc\n" +
            "9d Ad\n" +
            "Kd Kh\n" +
            "Ac Kh\n" +
            "3h Ts\n" +
            "Th 8h\n" +
            "Jd 5c\n" +
            "6d 6s\n" +
            "7c Jc\n" +
            "Js Kd\n" +
            "2h 4h\n" +
            "4h Ah\n" +
            "Ah 4h\n" +
            "Kc Kd\n" +
            "Ks Qc\n" +
            "As Kh\n" +
            "Jc 9c\n" +
            "9s 4d\n" +
            "Qd Kd\n" +
            "2d Js\n" +
            "5h Ad\n" +
            "Qc 8s\n" +
            "Kc Jh\n" +
            "As Js\n" +
            "3s 4h\n" +
            "4c 4h\n" +
            "7c Kc\n" +
            "8d Ah\n" +
            "4h As\n" +
            "Qd Kd\n" +
            "Jd 4d\n" +
            "8c 9d\n" +
            "Jd Ts\n" +
            "8c Kc\n" +
            "Ad Th\n" +
            "Ad Qd\n" +
            "Kh 4h\n" +
            "Kc Ts\n" +
            "Kh 9s\n" +
            "2s 3s\n" +
            "5c Ad\n" +
            "Ah Qh\n" +
            "2h 7c\n" +
            "Qd Jc\n" +
            "3d 3s\n" +
            "Ts Jh\n" +
            "Ks 6s\n" +
            "Th Ah\n" +
            "Kc Ac\n" +
            "7h 7c\n" +
            "Ah 4d\n" +
            "Ac 5c\n" +
            "6d 6h\n" +
            "Ad Jd\n" +
            "Jh Ac\n" +
            "Ah Tc\n" +
            "As 5s\n" +
            "Ks Kc\n" +
            "Jc Ac\n" +
            "9d Td\n" +
            "Ac 7d\n" +
            "7c 7h\n" +
            "4h Ah\n" +
            "Ad Kh\n" +
            "4s Ac\n" +
            "Ad Ks\n" +
            "Ts Kh\n" +
            "Ks Jh\n" +
            "Td Tc\n" +
            "Kc 9h\n" +
            "Kh Ad\n" +
            "Jc Qc\n" +
            "Jc Jh\n" +
            "Qh 9c\n" +
            "9c Td\n" +
            "Ks Ad\n" +
            "8h 8d\n" +
            "7d 7c\n" +
            "Qc 2c\n" +
            "Ad Jc\n" +
            "Td Jd\n" +
            "Kh As\n" +
            "Ac Th\n" +
            "9c Jh\n" +
            "3s As\n" +
            "7h 2c\n" +
            "4s 4d\n" +
            "Qc Qs\n" +
            "Ad 7d\n" +
            "Qd Qc\n" +
            "As 9d\n" +
            "Kd Kh\n" +
            "Jc Ad\n" +
            "Jc Qs\n" +
            "9c 9s\n" +
            "As Kd\n" +
            "5s Ks\n" +
            "Th Js\n" +
            "7c 6d\n" +
            "As Qc\n" +
            "Tc Ac\n" +
            "Ac Tc\n" +
            "9h Kc\n" +
            "9h Jd\n" +
            "8c Ah\n" +
            "Ad Qs\n" +
            "Qc Ah\n" +
            "Th Qc\n" +
            "8c Jc\n" +
            "Ah Kc\n" +
            "Th Td\n" +
            "5c Kc\n" +
            "9c 9d\n" +
            "8s 8c\n" +
            "7s Qs\n" +
            "9d Qc\n" +
            "Ac 5h\n" +
            "4c Ac\n" +
            "Ad 4c\n" +
            "Th Ac\n" +
            "Jc Ks\n" +
            "Ac 8h\n" +
            "Qc 8c\n" +
            "Kc Ks\n" +
            "Kd 3d\n" +
            "Qs 4s\n" +
            "Qh Jd\n" +
            "Jd 6d\n" +
            "6c 6d\n" +
            "Jd Jc\n" +
            "Ks Ac\n" +
            "9d 8d\n" +
            "Jc Td\n" +
            "8h 5h\n" +
            "Qc Th\n" +
            "As 5c\n" +
            "8c Th\n" +
            "As 5c\n" +
            "8s 8c\n" +
            "Td Ad\n" +
            "Qh Kc\n" +
            "Ac Jd\n" +
            "5s 6s\n" +
            "Ac Jh\n" +
            "Ad Kd\n" +
            "Td Qd\n" +
            "Kc Ad\n" +
            "Kd 6d\n" +
            "Kd Kc\n" +
            "7h 7c\n" +
            "9d 8s\n" +
            "Ks 5c\n" +
            "6c 6s\n" +
            "Jd Jc\n" +
            "6s 6c\n" +
            "Qd Jd\n" +
            "Qh Jd\n" +
            "Qh 9c\n" +
            "7d 7h\n" +
            "Qd 2h\n" +
            "9s Tc\n" +
            "3h Ah\n" +
            "8d Ac\n" +
            "5c Kc\n" +
            "As 6s\n" +
            "Qh 6c\n" +
            "9d 6c\n" +
            "Kh Ah\n" +
            "7d Th\n" +
            "9h Ad\n" +
            "7c Ad\n" +
            "Qd As\n" +
            "8c 9h\n" +
            "2d Ad\n" +
            "Ts As\n" +
            "Qc Kh\n" +
            "8h Th\n" +
            "7c 7s\n" +
            "Ks As\n" +
            "Js Qs\n" +
            "Qc Jh\n" +
            "Kc 8s\n" +
            "Jc Qh\n" +
            "Jc Js\n" +
            "Ah 8d\n" +
            "Js Jc\n" +
            "8s Kd\n" +
            "Kd 9c\n" +
            "Ks Kd\n" +
            "Jd Jc\n" +
            "7s As\n" +
            "Th As\n" +
            "9s As\n" +
            "Ac 5c\n" +
            "7h 3h\n" +
            "Ts 8h\n" +
            "4h 7c\n" +
            "Qd 9d\n" +
            "Qc Qh\n" +
            "Ac 8c\n" +
            "9d 9c\n" +
            "Kc 3c\n" +
            "8c Qc\n" +
            "Qd Kd\n" +
            "Ah Qd\n" +
            "Jd Qc\n" +
            "Ad Ac\n" +
            "Th Qh\n" +
            "5c 5h\n" +
            "8d Ad\n" +
            "Tc As\n" +
            "Kd Kc\n" +
            "Ac 4h\n" +
            "Jh Tc\n" +
            "9d Ac\n" +
            "Kc Ad\n" +
            "8s 8h\n" +
            "Ac 9c\n" +
            "Qd Ah\n" +
            "Jh 9h\n" +
            "8s Ks\n" +
            "Kd Jh\n" +
            "8c Tc\n" +
            "Ac 7d\n" +
            "9h Kh\n" +
            "Kc 3c\n" +
            "Tc Th\n" +
            "Ac Jd\n" +
            "Jh Qh\n" +
            "Jh Kd\n" +
            "Qs Qh\n" +
            "Qc Kd\n" +
            "Ts Qc\n" +
            "8h Ah\n" +
            "Qd Qs\n" +
            "Ts 9s\n" +
            "9c Td\n" +
            "5h As\n" +
            "Qd As\n" +
            "7h Qh\n" +
            "Ad Kd\n" +
            "8c Jc\n" +
            "Ks Qc\n" +
            "Ad 7h\n" +
            "Js 8s\n" +
            "Ad Kc\n" +
            "Kd 7d\n" +
            "Qs Kd\n" +
            "Ac Kd\n" +
            "5d 7c\n" +
            "9d 9h\n" +
            "As Tc\n" +
            "Ad Tc\n" +
            "9s 9h\n" +
            "Jd As\n" +
            "Kc Jc\n" +
            "Qs 9d\n" +
            "Ah 5c\n" +
            "4s 4c\n" +
            "9d 9s\n" +
            "Kd Jh\n" +
            "Ad 8d\n" +
            "Ac 6d\n" +
            "5d 5h\n" +
            "Ad 4s\n" +
            "5s 5h\n" +
            "Ks 5s\n" +
            "Jd Qd\n" +
            "Qs Qc\n" +
            "Ac Qs\n" +
            "Ad 6d\n" +
            "6s 2c\n" +
            "Jc 9s\n" +
            "Ks 9d\n" +
            "Kh As\n" +
            "5c Kc\n" +
            "Ad Qh\n" +
            "Qc Ks\n" +
            "Ts Th\n" +
            "Ah 8h\n" +
            "As 5h\n" +
            "Ac Qc\n" +
            "Ah 7d\n" +
            "9d Ts\n" +
            "Jd Tc\n" +
            "Qd 8d\n" +
            "Ac 9c\n" +
            "Jc Jh\n" +
            "6c Ah\n" +
            "As 4s\n" +
            "3s 5h\n" +
            "Td Ah\n" +
            "Th 9d\n" +
            "9c Kd\n" +
            "Th Qh\n" +
            "Js Kh\n" +
            "Td 9h\n" +
            "Ac Js\n" +
            "5s Ad\n" +
            "Ks Jc\n" +
            "Ac Tc\n" +
            "Ts Ac\n" +
            "Tc Td\n" +
            "Th Qs\n" +
            "4h Ah\n" +
            "6s 7s\n" +
            "Qc As\n" +
            "7d 7s\n" +
            "Jh Ts\n" +
            "Js Jd\n" +
            "Ah 7c\n" +
            "Kd Jd\n" +
            "4h Ad\n" +
            "As Kc\n" +
            "9c 7c\n" +
            "Kh Js\n" +
            "2d Tc\n" +
            "6h Ah\n" +
            "Ks As\n" +
            "Jh Jd\n" +
            "Js Ad\n" +
            "7s 7c\n" +
            "Kc Tc\n" +
            "Jh 8h\n" +
            "8s 9s\n" +
            "7d Ad\n" +
            "8d 9d\n" +
            "Ah Ac\n" +
            "Qs Ad\n" +
            "Jh Jd\n" +
            "Th Qs\n" +
            "Ac 7c\n" +
            "6d 4h\n" +
            "8d 7c\n" +
            "Ts Qh\n" +
            "Ad Td\n" +
            "7d Td\n" +
            "9d Jc\n" +
            "9s 9d\n" +
            "Qc Jc\n" +
            "9h 9d\n" +
            "Kh Kd\n" +
            "8c Qc\n" +
            "6s Jh\n" +
            "2s Ac\n" +
            "Jd Qd\n" +
            "Kh 5h\n" +
            "Ah Qs\n" +
            "3h 3s\n" +
            "8s 8h\n" +
            "Td 9d\n" +
            "Kc 4c\n" +
            "2c Js\n" +
            "Ad 9c\n" +
            "Ad 8h\n" +
            "Kc 5h\n" +
            "8h Ad\n" +
            "Ad Ah\n" +
            "9c Ad\n" +
            "9c Ts\n" +
            "Tc 9c\n" +
            "5h Ac\n" +
            "Th 9s\n" +
            "Ah 5d\n" +
            "Ad 8h\n" +
            "4h Ah\n" +
            "Th 8h\n" +
            "Qs 5s\n" +
            "Td Th\n" +
            "Ks Qc\n" +
            "9d 8d\n" +
            "Js 9c\n" +
            "Kh Kd\n" +
            "4s Ks\n" +
            "Ks Ts\n" +
            "Ac 8s\n" +
            "9h 3s\n" +
            "Th Kh\n" +
            "6s Ks\n" +
            "8c 8h\n" +
            "Td Jd\n" +
            "Ac Qh\n" +
            "8s Ah\n" +
            "Qh Kh\n" +
            "7s Ks\n" +
            "Ad 4s\n" +
            "Th Jh\n" +
            "9h 9c\n" +
            "7d Ah\n" +
            "7h 9h\n" +
            "Ac 6d\n" +
            "9h 5d\n" +
            "Ks Qd\n" +
            "Jc Kc\n" +
            "5s Jd\n" +
            "Ac Th\n" +
            "Kc Kd\n" +
            "Ad As\n" +
            "Qd Kd\n" +
            "Ks Kc\n" +
            "Ad Jh\n" +
            "Kc Qc\n" +
            "Js Ad\n" +
            "Js Ah\n" +
            "5s Ks\n" +
            "Jh 7s\n" +
            "9h Ah\n" +
            "8d Ah\n" +
            "Kd Js\n" +
            "6h 6c\n" +
            "Kh Th\n" +
            "Ks 3s\n" +
            "Th Qh\n" +
            "8h 8d\n" +
            "3c 3d\n" +
            "Qh Th\n" +
            "9s Ad\n" +
            "As Tc\n" +
            "Kd Ad\n" +
            "7d Ad\n" +
            "9s Qh\n" +
            "Kc Qh\n" +
            "Kd 8d\n" +
            "Tc Th\n" +
            "9c 9d\n" +
            "Td Ad\n" +
            "Jd Jh\n" +
            "4h 4c\n" +
            "8s 8h\n" +
            "Th 5s\n" +
            "Td Kd\n" +
            "Qc Kc\n" +
            "Th Kc\n" +
            "Kh 8h\n" +
            "Ac Jd\n" +
            "9h 9d\n" +
            "Jc Ac\n" +
            "Ts Kd\n" +
            "4c 4s\n" +
            "Jd Ah\n" +
            "Ts 2c\n" +
            "As 8d\n" +
            "Jc Jh\n" +
            "Th Ts\n" +
            "Qd Jc\n" +
            "8h Qc\n" +
            "7c 9c\n" +
            "Kc Tc\n" +
            "As Qc\n" +
            "Tc Jh\n" +
            "5d Ad\n" +
            "Jc 9c\n" +
            "Th Tc\n" +
            "9d 9h\n" +
            "Qh As\n" +
            "Kh Td\n" +
            "Ad 7d\n" +
            "Ac 5c\n" +
            "8h As\n" +
            "Ad 5s\n" +
            "Jd Jc\n" +
            "Ah 8d\n" +
            "7h Ad\n" +
            "Ah 4s\n" +
            "Ts Js\n" +
            "Td Kc\n" +
            "Ts 3s\n" +
            "5c Ah\n" +
            "Ks Qd\n" +
            "Jh Js\n" +
            "7c 7h\n" +
            "Td Ah\n" +
            "Jc 7h\n" +
            "Ac Ks\n" +
            "Ts Ac\n" +
            "5s As\n" +
            "5c Kc\n" +
            "Kh 9s\n" +
            "Jc Qh\n" +
            "Qd 9h\n" +
            "Kh 5d\n" +
            "Qc Kc\n" +
            "As Jd\n" +
            "Ah 7c\n" +
            "9c 7c\n" +
            "9s Kd\n" +
            "9c Th\n" +
            "Ks As\n" +
            "Js Jh\n" +
            "4d Ah\n" +
            "5d Qd\n" +
            "3h Ah\n" +
            "7c 7d\n" +
            "Qc Qs\n" +
            "7c Ad\n" +
            "9c 9s\n" +
            "Kh Ks\n" +
            "Qs Kd\n" +
            "Tc 9c\n" +
            "5h 9s\n" +
            "8s 9s\n" +
            "Jc Js\n" +
            "Jd Js\n" +
            "Ad Td\n" +
            "Qh Ah\n" +
            "7h 9h\n" +
            "Ah 7h\n" +
            "Kh 5h\n" +
            "5h Ac\n" +
            "4s Ks\n" +
            "Kh Ah\n" +
            "9h Th\n" +
            "Qd 9c\n" +
            "7c Tc\n" +
            "As Qs\n" +
            "Qs As\n" +
            "Th Qs\n" +
            "9h 8h\n" +
            "Qc Jd\n" +
            "Qc 6c\n" +
            "9s Qc\n" +
            "Qc Ac\n" +
            "Jd Td\n" +
            "Qc Kh\n" +
            "Qd As\n" +
            "Qh Qs\n" +
            "Ad Qd\n" +
            "6c 6h\n" +
            "9c Js\n" +
            "Qc Qh\n" +
            "Qc Jd\n" +
            "6d Ac\n" +
            "Qc Qs\n" +
            "Ad Js\n" +
            "Qh 9h\n" +
            "Td Tc\n" +
            "9h Ad\n" +
            "Th Ad\n" +
            "8h 8s\n" +
            "Ah 2h\n" +
            "Kh Ac\n" +
            "Ts Jc\n" +
            "Ah 9s\n" +
            "5c 9h\n" +
            "9d Tc\n" +
            "Qc 6h\n" +
            "Ad Jh\n" +
            "As Qc\n" +
            "7s 4d\n" +
            "4h 7s\n" +
            "Th Td\n" +
            "Kd 9h\n" +
            "Qd Qs\n" +
            "Ks Ad\n" +
            "Ad Qc\n" +
            "9c Ac\n" +
            "Th Kd\n" +
            "Kc Tc\n" +
            "8s Jh\n" +
            "Ts Ac\n" +
            "Ac 4s\n" +
            "Kc Td\n" +
            "Ah 3h\n" +
            "5d 5c\n" +
            "Jc Qs\n" +
            "Jd 6s\n" +
            "Qh 6h\n" +
            "Jc Ah\n" +
            "8h 6h\n" +
            "Qc Ks\n" +
            "9h Jd\n" +
            "As Qh\n" +
            "Ac 4c\n" +
            "7s Ah\n" +
            "Ac 4c\n" +
            "8d Td\n" +
            "Ad Td\n" +
            "Ts 9s\n" +
            "8s Ks\n" +
            "Jc 9h\n" +
            "Ts Td\n" +
            "Ac 5h\n" +
            "Qc Jc\n" +
            "Ah Js\n" +
            "Qd Qh\n" +
            "Ah 3c\n" +
            "Tc Ah\n" +
            "9c Ah\n" +
            "Kd 8d\n" +
            "4h As\n" +
            "Ks Jh\n" +
            "9h Qd\n" +
            "9d Js\n" +
            "Ac 5h\n" +
            "Kc Ad\n" +
            "Qs 9s\n" +
            "6c Kc\n" +
            "Qc Jd\n" +
            "8c 8s\n" +
            "9s Qh\n" +
            "2c Qc\n" +
            "9d Jd\n" +
            "Js Ah\n" +
            "9h 5c\n" +
            "Ad 5d\n" +
            "Jc 9d\n" +
            "3h As\n" +
            "9c Kd\n" +
            "9h Qh\n" +
            "Jh Qs\n" +
            "Kc Qc\n" +
            "Jd Ah\n" +
            "Ad 7h\n" +
            "Ac 6s\n" +
            "9h Kc\n" +
            "6c 5s\n" +
            "Th Ac\n" +
            "Kh Kd\n" +
            "Jh Td\n" +
            "3c 8d\n" +
            "4h Ah\n" +
            "Kc Qh\n" +
            "9h 9c\n" +
            "As 9d\n" +
            "7s 9s\n" +
            "7c 7s\n" +
            "3d Jc\n" +
            "Ts Ah\n" +
            "Qd 8s\n" +
            "Qs Ac\n" +
            "Kc Qh\n" +
            "As 6h\n" +
            "Jc Th\n" +
            "Js 3c\n" +
            "Ah 5h\n" +
            "3c Kd\n" +
            "Js 9s\n" +
            "7c 2s\n" +
            "4c As\n" +
            "8c As\n" +
            "9h 9c\n" +
            "6s Ah\n" +
            "5d 9d\n" +
            "9d Kd\n" +
            "Kc Td\n" +
            "6h Ah\n" +
            "4h Ah\n" +
            "8c 8h\n" +
            "4c 3d\n" +
            "Kd 5d\n" +
            "9c Qd\n" +
            "7h 7s\n" +
            "Tc Th\n" +
            "Qd Qh\n" +
            "Ad Ah\n" +
            "Th Ah\n" +
            "8h As\n" +
            "Qh 6s\n" +
            "Ks Js\n" +
            "8d 7h\n" +
            "Qh 7c\n" +
            "Ah Jd\n" +
            "8s Ah\n" +
            "Ts 7d\n" +
            "9c Jc\n" +
            "Js Jh\n" +
            "Ac Jc\n" +
            "Ks Th\n" +
            "Qh Kh\n" +
            "Ac Qd\n" +
            "Ac 6s\n" +
            "Jh Qc\n" +
            "Td Kh\n" +
            "3d 2s\n" +
            "Kh 9d\n" +
            "Ks Kh\n" +
            "8s Ts\n" +
            "7d As\n" +
            "Jh Ts\n" +
            "4c Ac\n" +
            "8h As\n" +
            "Tc Ah\n" +
            "Ac 4c\n" +
            "6d Kc\n" +
            "Tc Kc\n" +
            "Jh Kc\n" +
            "Qs Ad\n" +
            "7h Jh\n" +
            "Td Qd\n" +
            "Tc Qc\n" +
            "Kc 8s\n" +
            "9h Ah\n" +
            "Qd Ks\n" +
            "Jc Ah\n" +
            "As Kh\n" +
            "8c 8h\n" +
            "Qd Ac\n" +
            "Tc Ts\n" +
            "Js Kh\n" +
            "7c 9c\n" +
            "Ac Td\n" +
            "Kd Qh\n" +
            "Qc As\n" +
            "Kd 5d\n" +
            "9h 9d\n" +
            "5d As\n" +
            "Th As\n" +
            "Jd Js\n" +
            "Jh Qd\n" +
            "Jd Ad\n" +
            "Qd 6c\n" +
            "Qd Js\n" +
            "Jc Js\n" +
            "Kh Ah\n" +
            "Ts 9s\n" +
            "4s Ac\n" +
            "Qd 8s\n" +
            "Jh Js\n" +
            "Qs Tc\n" +
            "Ah Ts\n" +
            "As 2h\n" +
            "Jc 9d\n" +
            "5d Kd\n" +
            "5s 8h\n" +
            "3h Ad\n" +
            "5c Jc\n" +
            "2h Ah\n" +
            "Ts Kh\n" +
            "6c Ks\n" +
            "5c Ad\n" +
            "Ac Ad\n" +
            "Kh Jd\n" +
            "Th Qc\n" +
            "Jh Td\n" +
            "2s Kc\n" +
            "Qs 5s\n" +
            "7d 7h\n" +
            "4h 4s\n" +
            "Qh As\n" +
            "Jd Qs\n" +
            "Jc Tc\n" +
            "Jc Kc\n" +
            "7c 2c\n" +
            "Kc Jc\n" +
            "As Jh\n" +
            "As Ac\n" +
            "5d 8s\n" +
            "As Ks\n" +
            "Ts Tc\n" +
            "5s Ad\n" +
            "Kh Jh\n" +
            "Th Td\n" +
            "8d Kh\n" +
            "Qd Qh\n" +
            "9h As\n" +
            "Ac 9d\n" +
            "As Ts\n" +
            "9h 4c\n" +
            "9s 9h\n" +
            "Qh 5h\n" +
            "8h Qh\n" +
            "Ac 4d\n" +
            "Jc Ah\n" +
            "As Kd\n" +
            "8c 9s\n" +
            "8h Ad\n" +
            "9c Kc\n" +
            "Ac Qs\n" +
            "9h Js\n" +
            "9d 9c\n" +
            "4h 5c\n" +
            "Jh 9s\n" +
            "Qh 6h\n" +
            "Ac Ts\n" +
            "5h Kh\n" +
            "Kh 3h\n" +
            "Qd Th\n" +
            "Ah 5h\n" +
            "Tc Td\n" +
            "Ks Tc\n" +
            "7c 9s\n" +
            "7c Tc\n" +
            "Jc Ks\n" +
            "5c 5s\n" +
            "As 3s\n" +
            "3h Ah\n" +
            "Ah 2s\n" +
            "Qc 9c\n" +
            "9c Qs\n" +
            "6d 8c\n" +
            "6d Qs\n" +
            "Js 5s\n" +
            "Qs 9s\n" +
            "Tc Qh\n" +
            "Th Td\n" +
            "Ks Jh\n" +
            "Ad 4d\n" +
            "Jd Kh\n" +
            "Kh Qh\n" +
            "6s As\n" +
            "9h 4d\n" +
            "7c Qc\n" +
            "4h 4c\n" +
            "Qs 6s\n" +
            "Th Qc\n" +
            "Ah Td\n" +
            "As Ac\n" +
            "Jc Kh\n" +
            "Ac Ad\n" +
            "9d Ad\n" +
            "Js 9c\n" +
            "Jc Kc\n" +
            "Ac 7c\n" +
            "9c Qd\n" +
            "9h Jd\n" +
            "Ad 8d\n" +
            "Kh Ah\n" +
            "6c 6h\n" +
            "As 7c\n" +
            "Tc Qd\n" +
            "6s 6d\n" +
            "9c 8c\n" +
            "Qc Js\n" +
            "3d Ks\n" +
            "7s Ts\n" +
            "Ad 8s\n" +
            "9s Jd\n" +
            "Ks Kd\n" +
            "Ad Tc\n" +
            "5h 5d\n" +
            "9d Jd\n" +
            "Js 5s\n" +
            "Jh 8d\n" +
            "Kh Jh\n" +
            "9h Th\n" +
            "Kh 9d\n" +
            "Tc 8d\n" +
            "Qc 8c\n" +
            "9s Qs\n" +
            "Js Jd\n" +
            "3d Qd\n" +
            "Qs Kc\n" +
            "Jc As\n" +
            "Jd Kh\n" +
            "As Th\n" +
            "Td Ah\n" +
            "Jc 7c\n" +
            "Th Jd\n" +
            "Ad Qh\n" +
            "6c Ac\n" +
            "Jh 9c\n" +
            "Ad Kc\n" +
            "Td 7c\n" +
            "Ks 8s\n" +
            "7d Qs\n" +
            "Qs Td\n" +
            "Kc Td\n" +
            "9s 9d\n" +
            "Qc 7c\n" +
            "9s 9h\n" +
            "Tc Ah\n" +
            "Ah As\n" +
            "Kh Qh\n" +
            "Jc Tc\n" +
            "9h Ah\n" +
            "Td Kh\n" +
            "9s 9d\n" +
            "Ad As\n" +
            "As Kc\n" +
            "7h 9h\n" +
            "Ah Kh\n" +
            "Kd 3h\n" +
            "Ah 7h\n" +
            "6s 6d\n" +
            "Kh 6s\n" +
            "Qs Js\n" +
            "Ts 7c\n" +
            "Jc Ah\n" +
            "Qc Td\n" +
            "Ah 7s\n" +
            "Qs Ac\n" +
            "Kc Qs\n" +
            "8c 8d\n" +
            "Qc Qh\n" +
            "As Ks\n" +
            "Jd Kh\n" +
            "2s 8s\n" +
            "Kd Tc\n" +
            "Jd Qs\n" +
            "Ad As\n" +
            "Qs Tc\n" +
            "7s As\n" +
            "Kc Qc\n" +
            "9c Qc\n" +
            "Qh Ah\n" +
            "5c As\n" +
            "Ah Kd\n" +
            "2s 6h\n" +
            "As 6d\n" +
            "Ad Qc\n" +
            "Ad Tc\n" +
            "Kc Tc\n" +
            "Js 7s\n" +
            "Ah Qh\n" +
            "Jd 8d\n" +
            "6s Ah\n" +
            "Kh 8s\n" +
            "Jh 9d\n" +
            "Jd Qd\n" +
            "Ad Qc\n" +
            "9s Kd\n" +
            "As Qc\n" +
            "Jh Kd\n" +
            "Qd 4d\n" +
            "Kc Kd\n" +
            "Jc Qs\n" +
            "Ac As\n" +
            "Kd Jc\n" +
            "Jd Qc\n" +
            "As 5s\n" +
            "Kd Qh\n" +
            "Kh Th\n" +
            "Ks Jh\n" +
            "6d Th\n" +
            "Qd 7d\n" +
            "Jc Kc\n" +
            "Ts As\n" +
            "Ks Qs\n" +
            "9h Kh\n" +
            "Ks Qs\n" +
            "Td Ts\n" +
            "Ah Ad\n" +
            "Td Js\n" +
            "9c Kc\n" +
            "Jd Ks\n" +
            "As 9h\n" +
            "Jd Js\n" +
            "9c Jc\n" +
            "As Qc\n" +
            "3s 4d\n" +
            "7h Jh\n" +
            "7s 2c\n" +
            "Ac Ah\n" +
            "Ts Qd\n" +
            "Qd As\n" +
            "Ah Ac\n" +
            "9c 9s\n" +
            "Tc 9h\n" +
            "Ah 5h\n" +
            "Kc 2d\n" +
            "Jh Qc\n" +
            "Ah Ac\n" +
            "Ks 4h\n" +
            "As Jd\n" +
            "6c As\n" +
            "9c Td\n" +
            "Kc Jh\n" +
            "Qh Th\n" +
            "6h Ah\n" +
            "Qd Jd\n" +
            "7h 7d\n" +
            "Ks Jd\n" +
            "Ts As\n" +
            "Ah Jc\n" +
            "6h 6d\n" +
            "Kh Jh\n" +
            "Qc Ad\n" +
            "Qd 9s\n" +
            "6s 5h\n" +
            "9s Kd\n" +
            "Td Ks\n" +
            "As Ks\n" +
            "Kd Kh\n" +
            "Kc Qd\n" +
            "Js Ad\n" +
            "9h Td\n" +
            "Ts Ac\n" +
            "5h Ah\n" +
            "As Kh\n" +
            "9c 9s\n" +
            "Ks Th\n" +
            "4d Ac\n" +
            "Ks Jd\n" +
            "Ah Qd\n" +
            "Kd Ks\n" +
            "9c Ts\n" +
            "Jh 9s\n" +
            "Qs Ts\n" +
            "Ah As\n" +
            "As 9d\n" +
            "Kc Jd\n" +
            "Js Tc\n" +
            "Jd Ad\n" +
            "9h 9d\n" +
            "2c Ac\n" +
            "6s Qd\n" +
            "As Jc\n" +
            "7h 7d\n" +
            "Jd Jh\n" +
            "Ts Td\n" +
            "Ad Kd\n" +
            "Qs Qd\n" +
            "Js Jd\n" +
            "Qs Th\n" +
            "Tc Qc\n" +
            "9h Qd\n" +
            "Qs Qh\n" +
            "Ah 4d\n" +
            "6d Kh\n" +
            "Th Jc\n" +
            "6d 6c\n" +
            "Ts As\n" +
            "As 4h\n" +
            "Th Td\n" +
            "2h Ah\n" +
            "Jc Th\n" +
            "5d 5h\n" +
            "Ts Td\n" +
            "3c Ac\n" +
            "8c Ah\n" +
            "Kc 9h\n" +
            "8s 7s\n" +
            "Qd Kd\n" +
            "2c 5c\n" +
            "Qd Td\n" +
            "6c 6s\n" +
            "4c Kc\n" +
            "8s As\n" +
            "Jh Kd\n" +
            "2d 4h\n" +
            "9s Jc\n" +
            "As 9d\n" +
            "Kh Jd\n" +
            "Th Td\n" +
            "Ts Jd\n" +
            "Ad 7d\n" +
            "Qd As\n" +
            "Qs 9s\n" +
            "4d Ac\n" +
            "Kd Qd\n" +
            "Kh Kc\n" +
            "As 9h\n" +
            "Td Kh\n" +
            "Td Kc\n" +
            "9s Kc\n" +
            "7s Ks\n" +
            "Ts Ad\n" +
            "Kh Kc\n" +
            "7s 9s\n" +
            "9d Th\n" +
            "Tc Qs\n" +
            "3s Td\n" +
            "As Js\n" +
            "Js Kh\n" +
            "Qs Ad\n" +
            "7s Th\n" +
            "Kc 8c\n" +
            "9s 9d\n" +
            "Ks Jc\n" +
            "Kd Js\n" +
            "Qh Tc\n" +
            "9s Kh\n" +
            "Kh 5c\n" +
            "Ah As\n" +
            "Ks Kh\n" +
            "9d 6h\n" +
            "8c 8s\n" +
            "9h Ah\n" +
            "9s As\n" +
            "Ah Qs\n" +
            "Qh Qd\n" +
            "As 9s\n" +
            "As Jh\n" +
            "Ts 9s\n" +
            "As Js\n" +
            "8c Jc\n" +
            "Ad 2d\n" +
            "4h Jh\n" +
            "Jc Kc\n" +
            "6h Th\n" +
            "Kh Ah\n" +
            "Jc Js\n" +
            "7s 7d\n" +
            "Qd Qs\n" +
            "Qc As\n" +
            "Jc Qc\n" +
            "7h 7s\n" +
            "Ts Th\n" +
            "Kd 8h\n" +
            "7s Js\n" +
            "Ts Ks\n" +
            "3d Kd\n" +
            "8s Ks\n" +
            "3c Qc\n" +
            "Jd 4d\n" +
            "Kd Qc\n" +
            "Kd Kc\n" +
            "Tc Ad\n" +
            "3d Ks\n" +
            "Jh 7s\n" +
            "4h Ac\n" +
            "9s Ac\n" +
            "Td Jh\n" +
            "Ks Kh\n" +
            "Ah Kh\n" +
            "Kc Tc\n" +
            "2s As\n" +
            "Js Jh\n" +
            "9h 8h\n" +
            "Tc Js\n" +
            "Ad Ac\n" +
            "8c Ad\n" +
            "Ah 8c\n" +
            "Kc Qh\n" +
            "8c Kd\n" +
            "Ad 3h\n" +
            "Js Td\n" +
            "Th Td\n" +
            "Td Qc\n" +
            "Qc Kd\n" +
            "Ad Qs\n" +
            "9h 9c\n" +
            "8c 8d\n" +
            "9s Ts\n" +
            "Kc Kh\n" +
            "Qd 9d\n" +
            "Qd Ac\n" +
            "4h As\n" +
            "6c Jc\n" +
            "Jh Kh\n" +
            "9s 9h\n" +
            "Kc As\n" +
            "Kd Ks\n" +
            "Jc Td\n" +
            "Ah Kh\n" +
            "Qh Qs\n" +
            "Jc Kd\n" +
            "Ks Tc\n" +
            "9h Ac\n" +
            "Ts Jh\n" +
            "6d Kd\n" +
            "Qs Kh\n" +
            "Jc 4c\n" +
            "Kh 8h\n" +
            "Jc Qs\n" +
            "8d Kh\n" +
            "4d Kd\n" +
            "Qc Ad\n" +
            "9c 9h\n" +
            "Kc 9c\n" +
            "Kc 5s\n" +
            "7c Ac\n" +
            "Qc 7d\n" +
            "Qh Ah\n" +
            "9d 7d\n" +
            "Qh Kd\n" +
            "9h Th\n" +
            "9s 8s\n" +
            "Ah Ac\n" +
            "9h Th\n" +
            "Tc 9c\n" +
            "Ks 8h\n" +
            "Jd 6d\n" +
            "Jh As\n" +
            "Ah 3h\n" +
            "Jh Ac\n" +
            "Kd 2s\n" +
            "Ah 7h\n" +
            "Qc Jh\n" +
            "9h Jd\n" +
            "5d Jd\n" +
            "Kc Qd\n" +
            "7c Tc\n" +
            "Ah Qh\n" +
            "Jd Jc\n" +
            "8d Kd\n" +
            "8s Ks\n" +
            "Qc Js\n" +
            "Qh As\n" +
            "Td Jd\n" +
            "6h 7h\n" +
            "Ah Jh\n" +
            "As Qc\n" +
            "Tc Th\n" +
            "Qc Ac\n" +
            "Td Tc\n" +
            "Kc 9d\n" +
            "Qc 4c\n" +
            "Ad Qc\n" +
            "Ks 8s\n" +
            "Kc 8d\n" +
            "Kd Qc\n" +
            "As Tc\n" +
            "Qd Ad\n" +
            "Js As\n" +
            "Jc Ah\n" +
            "Qh Kc\n" +
            "9h As\n" +
            "Qs Ad\n" +
            "Qd Ks\n" +
            "Jh 9d\n" +
            "Kh 6h\n" +
            "Jd 9c\n" +
            "Qh Ks\n" +
            "7s Td\n" +
            "9d Ad\n" +
            "Kc 2c\n" +
            "5h Kh\n" +
            "Ks Tc\n" +
            "Ts Kh\n" +
            "Qs 8h\n" +
            "Kc 8s\n" +
            "6h Kh\n" +
            "Kd Td\n" +
            "Ah 6c\n" +
            "Qd Kc\n" +
            "Qd Kh\n" +
            "9d 9c\n" +
            "9h 9c\n" +
            "Ad 5s\n" +
            "8c Qc\n" +
            "Jh Qc\n" +
            "Qh Ah\n" +
            "9d Qd\n" +
            "Js Qc\n" +
            "Th Ac\n" +
            "9s 9d\n" +
            "Ad 8s\n" +
            "9c Ad\n" +
            "Ad 6h\n" +
            "5h 2d\n" +
            "Jc Js\n" +
            "Kd Th\n" +
            "Ac Kh\n" +
            "7d Kd\n" +
            "Ad 4d\n" +
            "Ad Qh\n" +
            "Th Jd\n" +
            "2c Ac\n" +
            "Ac Td\n" +
            "Jc 7c\n" +
            "Ac Kc\n" +
            "Qd Qc\n" +
            "9s As\n" +
            "Qs 8c\n" +
            "3s Ks\n" +
            "Qs 5s\n" +
            "6s Kc\n" +
            "Qh 8c\n" +
            "6c Ks\n" +
            "9d 9c\n" +
            "Ah 2h\n" +
            "Ks 9h\n" +
            "3d As\n" +
            "5h 5d\n" +
            "9s Jh\n" +
            "Ts 8d\n" +
            "Jc 7c\n" +
            "Jh Ac\n" +
            "7c Qs\n" +
            "Jc Ah\n" +
            "Tc 9s\n" +
            "7h Ks\n" +
            "7d Qd\n" +
            "9c 3s\n" +
            "Kh Th\n" +
            "9h 9d\n" +
            "Jc Qh\n" +
            "Js 9s\n" +
            "Qc 4s\n" +
            "6s Ts\n" +
            "Tc Ks\n" +
            "Ac As\n" +
            "Kh Tc\n" +
            "Ah Kd\n" +
            "Ah Qd\n" +
            "Kd 4s\n" +
            "Kh Ah\n" +
            "Ac 6c\n" +
            "9h 9c\n" +
            "3h Ac\n" +
            "Jd Kc\n" +
            "7h 7c\n" +
            "Ah 3s\n" +
            "3c 8c\n" +
            "Ah 5c\n" +
            "8c Ks\n" +
            "Ts Qd\n" +
            "8s 8h\n" +
            "3s 9s\n" +
            "9h 9d\n" +
            "Jd 9c\n" +
            "Qs Ts\n" +
            "9s Ks\n" +
            "Qd Tc\n" +
            "Td Qc\n" +
            "9s Ac\n" +
            "Jh Qs\n" +
            "Ts Kd\n" +
            "Ac 9s\n" +
            "Ah Td\n" +
            "Ad 3d\n" +
            "5s 7s\n" +
            "As 4s\n" +
            "Ks As\n" +
            "Jc 5c\n" +
            "8h Jh\n" +
            "8d 8c\n" +
            "As Qd\n" +
            "Ks 8h\n" +
            "Ac Jh\n" +
            "Qc Kh\n" +
            "9c 9d\n" +
            "Td Jc\n" +
            "Qc Ks\n" +
            "5c 2h\n" +
            "Jd 8d\n" +
            "Ac Jh\n" +
            "Jd Td\n" +
            "Qd Ah\n" +
            "Ac 6s\n" +
            "Ts Qh\n" +
            "8h Qh\n" +
            "Jh Tc\n" +
            "Qd Kh\n" +
            "Js Ac\n" +
            "Qc Th\n" +
            "Qs Kh\n" +
            "Kd Qs\n" +
            "Qd Ah\n" +
            "8h As\n" +
            "Ts 9s\n" +
            "Qc Kh\n" +
            "Ah Kc\n" +
            "Jh Ad\n" +
            "Kh Ks\n" +
            "8h 6h\n" +
            "9s 4d\n" +
            "Qd Kd\n" +
            "Ac Th\n" +
            "Ac Kd\n" +
            "Qs 7s\n" +
            "Th Qh\n" +
            "Js Jd\n" +
            "Qd 7d\n" +
            "Ad Ks\n" +
            "Ah 3d\n" +
            "Th Kd\n" +
            "6h Ah\n" +
            "Qh Js\n" +
            "Ah 5c\n" +
            "8s 8d\n" +
            "Qd Jh\n" +
            "7h 9c\n" +
            "6c Kc\n" +
            "Ks As\n" +
            "9d Kh\n" +
            "Ac Tc\n" +
            "5d Ad\n" +
            "Tc Qc\n" +
            "Qc Ac\n" +
            "Qh Th\n" +
            "Js Qs\n" +
            "Kd 7d\n" +
            "Ah Qh\n" +
            "6c Kc\n" +
            "As 7d\n" +
            "Ks Ad\n" +
            "8c Qd\n" +
            "Kh Jh\n" +
            "Ad As\n" +
            "8c 8h\n" +
            "Ts 7s\n" +
            "Qc Th\n" +
            "9h Th\n" +
            "8c Jc\n" +
            "8c Jc\n" +
            "Kd 9h\n" +
            "Qs Ad\n" +
            "9h As\n" +
            "Ad 8d\n" +
            "9c 8c\n" +
            "Qc 8c\n" +
            "Kh Tc\n" +
            "Kc Ad\n" +
            "2h Ah\n" +
            "Jc Kh\n" +
            "8s Qc\n" +
            "9s Td\n" +
            "Th Jc\n" +
            "Tc Jh\n" +
            "Qh 6s\n" +
            "Qs Ah\n" +
            "9d 9c\n" +
            "8h Qs\n" +
            "Kc Tc\n" +
            "Ac Th\n" +
            "Th As\n" +
            "6h 9h\n" +
            "Qh Ts\n" +
            "Ah As\n" +
            "Tc Ks\n" +
            "Js 7h\n" +
            "Jd Th\n" +
            "9c Kh\n" +
            "3d 3h\n" +
            "Ad Ks\n" +
            "8s 8h\n" +
            "8d 6c\n" +
            "Ks Jd\n" +
            "6c Ad\n" +
            "Js 9c\n" +
            "7h 7s\n" +
            "Kc Qc\n" +
            "Jh Js\n" +
            "As Qd\n" +
            "7s 7c\n" +
            "Ad 6s\n" +
            "Qh 5h\n" +
            "7c Tc\n" +
            "Qs 5s\n" +
            "8s Qs\n" +
            "8d Kh\n" +
            "Tc Qc\n" +
            "Kc Qc\n" +
            "6d As\n" +
            "8h Ks\n" +
            "Kc Jc\n" +
            "Tc Kc\n" +
            "Qh Jd\n" +
            "Ad Td\n" +
            "9c Ts\n" +
            "8c Td\n" +
            "Jd Ac\n" +
            "7s 7h\n" +
            "Ah 9h\n" +
            "Qs Ts\n" +
            "8s 8d\n" +
            "Qc Tc\n" +
            "Qs Ah\n" +
            "Ac 6c\n" +
            "Jd 9c\n" +
            "As Ks\n" +
            "9d Td\n" +
            "Ah Ks\n" +
            "Jc 3s\n" +
            "6c Kc\n" +
            "Ad 6d\n" +
            "Ah As\n" +
            "2d 2h\n" +
            "8d 7d\n" +
            "Tc 9h\n" +
            "Ac 4c\n" +
            "7d Ah\n" +
            "Qh 8h\n" +
            "Ah 3h\n" +
            "Jc Jh\n" +
            "Ad Ts\n" +
            "Jh Jc\n" +
            "6c 6d\n" +
            "Ts Jh\n" +
            "Js Jc\n" +
            "Kc Ts\n" +
            "Ad Ts\n" +
            "3c 2c\n" +
            "Kc Qs\n" +
            "7c Ac\n" +
            "Jd As\n" +
            "6s As\n" +
            "5d 4c\n" +
            "Jc 4c\n" +
            "7c Tc\n" +
            "Ks Js\n" +
            "9h Jc\n" +
            "Kh Jh\n" +
            "Ad As\n" +
            "Ad 9h\n" +
            "Js As\n" +
            "7d 8c\n" +
            "6c 8d\n" +
            "Kd 8s\n" +
            "5c As\n" +
            "Ac 4d\n" +
            "5s Ac\n" +
            "5c Qc\n" +
            "8s 9s\n" +
            "3h 8s\n" +
            "8s Kh\n" +
            "Ac 3c\n" +
            "Ks 7h\n" +
            "Js Qs\n" +
            "Jh Jc\n" +
            "Qs 5c\n" +
            "Kc Kh\n" +
            "Ad Jh\n" +
            "As Qs\n" +
            "6c Tc\n" +
            "2d Ad\n" +
            "Js As\n" +
            "9h Ac\n" +
            "2s 3d\n" +
            "Qh Th\n" +
            "Td 5d\n" +
            "Qh 2h\n" +
            "Ah Kd\n" +
            "Ad Ks\n" +
            "Ac 9s\n" +
            "As 9h\n" +
            "Td Ad\n" +
            "8c Tc\n" +
            "8c Ac\n" +
            "8c As\n" +
            "Jh 6h\n" +
            "3c Qs\n" +
            "5c 7h\n" +
            "Js Jd\n" +
            "Ad 9d\n" +
            "Jc 7c\n" +
            "Ad Kc\n" +
            "Qh 9s\n" +
            "5c Ac\n" +
            "Td Jc\n" +
            "Ts Jd\n" +
            "Tc Jc\n" +
            "6d 6s\n" +
            "4d As\n" +
            "8s 6s\n" +
            "Qh Tc\n" +
            "9h Qd\n" +
            "8c Ac\n" +
            "Qc Td\n" +
            "7h Ah\n" +
            "5h Ah\n" +
            "As Kc\n" +
            "Ks Js\n" +
            "Ts 3d\n" +
            "As 5h\n" +
            "As 3s\n" +
            "Th Js\n" +
            "Kh 9c\n" +
            "3d 9d\n" +
            "9c 9d\n" +
            "8d Qd\n" +
            "9d 9h\n" +
            "Tc 9h\n" +
            "9h 9d\n" +
            "7c Ad\n" +
            "Kh Th\n" +
            "Qs 9s\n" +
            "Jd Ad\n" +
            "2s Ad\n" +
            "2h 9d\n" +
            "Ad 4h\n" +
            "Ah Td\n" +
            "4h Jh\n" +
            "5s 8d\n" +
            "3c 6c\n" +
            "Ks As\n" +
            "Kd Tc\n" +
            "9h 9d\n" +
            "As Ks\n" +
            "8d Ah\n" +
            "As Qh\n" +
            "6s 9h\n" +
            "Ks Jh\n" +
            "Jc Ts\n" +
            "9d Jh\n" +
            "7s 7c\n" +
            "Jc Td\n" +
            "Ks Qh\n" +
            "Th Qd\n" +
            "Qd Ad\n" +
            "Qs Ks\n" +
            "5h Jc\n" +
            "Jd Ks\n" +
            "4s Ad\n" +
            "Ac Jh\n" +
            "Js 3h\n" +
            "Ac 7s\n" +
            "Qd Ah\n" +
            "As Jd\n" +
            "7h Ad\n" +
            "5h 5s\n" +
            "9c Kd\n" +
            "Ad Qh\n" +
            "Ks As\n" +
            "9s 9d\n" +
            "Ad 5s\n" +
            "8s Kc\n" +
            "Qs As\n" +
            "Ts As\n" +
            "Jd Qh\n" +
            "Ac 4s\n" +
            "Th Ad\n" +
            "Th Ac\n" +
            "Kd Jd\n" +
            "3s As\n" +
            "As Jc\n" +
            "Kc Jh\n" +
            "7h 7c\n" +
            "8c As\n" +
            "Jh 2s\n" +
            "5h 5s\n" +
            "8h 8s\n" +
            "4d 5d\n" +
            "Ts Qs\n" +
            "4h Kh\n" +
            "Ad Qd\n" +
            "6c Kh\n" +
            "9d Qd\n" +
            "Ks Jh\n" +
            "7d Kd\n" +
            "Kc Jd\n" +
            "3d 4d\n" +
            "Ac Ad\n" +
            "Qd Ks\n" +
            "7d Kd\n" +
            "5c 2s\n" +
            "7c 7s\n" +
            "Jc 9c\n" +
            "2c 9c\n" +
            "8c Th\n" +
            "7d As\n" +
            "Ac Th\n" +
            "As 9s\n" +
            "Tc Js\n" +
            "Th Ts\n" +
            "Ks As\n" +
            "Ts Td\n" +
            "8h Th\n" +
            "9s Jc\n" +
            "Ks Ac\n" +
            "2s Ac\n" +
            "6d Qs\n" +
            "9d Ks\n" +
            "Ah Jc\n" +
            "Ad Kd\n" +
            "Ah 7h\n" +
            "4d 4c\n" +
            "Th 9c\n" +
            "9c 9h\n" +
            "8c 8d\n" +
            "5d Kc\n" +
            "Kd Ah\n" +
            "Td 8s\n" +
            "Th Jh\n" +
            "Qh Ts\n" +
            "Ks Kh\n" +
            "Ac Tc\n" +
            "Td 7d\n" +
            "3d Ah\n" +
            "5h 6h\n" +
            "Qs 4h\n" +
            "Ah Qs\n" +
            "6h Ac\n" +
            "2d 9d\n" +
            "Qh 3s\n" +
            "3h 9d\n" +
            "As Kh\n" +
            "Ad Jd\n" +
            "5h 3d\n" +
            "2h Ah\n" +
            "Ts Td\n" +
            "Tc 7d\n" +
            "Ac Qc\n" +
            "Ac 5d\n" +
            "Qd 4h\n" +
            "5s 5h\n" +
            "5s As\n" +
            "Ad Kh\n" +
            "Td 4h\n" +
            "Ah 4h\n" +
            "Jh Jd\n" +
            "4s As\n" +
            "3d 2d\n" +
            "Ks Qc\n" +
            "Kh Ad\n" +
            "Th Ts\n" +
            "As Kh\n" +
            "Ac 9d\n" +
            "Ad 8h\n" +
            "As 7s\n" +
            "Kc Ks\n" +
            "Ts 6s\n" +
            "9h Ad\n" +
            "Qc 9c\n" +
            "8s 8c\n" +
            "4c Ac\n" +
            "5c 3h\n" +
            "4h Qh\n" +
            "8h 9c\n" +
            "Qd Ah\n" +
            "5h Kc\n" +
            "9s Qd\n" +
            "Jc 4d\n" +
            "8s Kc\n" +
            "Tc 6h\n" +
            "Kd Tc\n" +
            "7s Ad\n" +
            "Ts Td\n" +
            "Ad Kc\n" +
            "9s Qs\n" +
            "Kd 7d\n" +
            "As 4h\n" +
            "Kd Jd\n" +
            "Kh Jd\n" +
            "6d Ac\n" +
            "9h 2c\n" +
            "9c Jd\n" +
            "7c Qc\n" +
            "Th 6d\n" +
            "Ad 2c\n" +
            "8d 8c\n" +
            "As Ah\n" +
            "As 9s\n" +
            "7c Jc\n" +
            "9h Ad\n" +
            "Qs 5h\n" +
            "9d Ks\n" +
            "Kc 9s\n" +
            "9s Ts\n" +
            "Ah 4h\n" +
            "Qc 9d\n" +
            "4s 6d\n" +
            "Kc Th\n" +
            "Qh Ah\n" +
            "Jh Kh\n" +
            "2s As\n" +
            "Ks 6s\n" +
            "Ac Kh\n" +
            "Ac Qs\n" +
            "Ad Qh\n" +
            "Qd Th\n" +
            "8c Jc\n" +
            "4d Ac\n" +
            "7d 9h\n" +
            "Ks As\n" +
            "8d 2d\n" +
            "Qc 9c\n" +
            "Kh Kc\n" +
            "As Qs\n" +
            "9c 4s\n" +
            "Kd 5s\n" +
            "8s 8c\n" +
            "7s Qd\n" +
            "Qh Kc\n" +
            "4d Kd\n" +
            "6d 9c\n" +
            "Tc 5d\n" +
            "9s 9c\n" +
            "As 8c\n" +
            "9c Kc\n" +
            "8d As\n" +
            "5d 5s\n" +
            "As Kh\n" +
            "9h Ah\n" +
            "8d Ad\n" +
            "Th Qh\n" +
            "2c Ac\n" +
            "3c 6s\n" +
            "Kh Qd\n" +
            "Ah Ac\n" +
            "9s 9c\n" +
            "Jc Qc\n" +
            "Jh Qs\n" +
            "Ad Jh\n" +
            "Qs Ts\n" +
            "8h Qd\n" +
            "Th Td\n" +
            "3c Kd\n" +
            "Qh Jc\n" +
            "Jc Jd\n" +
            "Ad 3h\n" +
            "Kh 8h\n" +
            "Js 4d\n" +
            "Ac Js\n" +
            "9h 3c\n" +
            "Jc Qs\n" +
            "Kc Qd\n" +
            "Jc Td\n" +
            "Ks 9s\n" +
            "Qd Ac\n" +
            "9h 3c\n" +
            "Jh Ah\n" +
            "8s Ks\n" +
            "Ac 7d\n" +
            "8d 8h\n" +
            "Jc Jd\n" +
            "Ad 8c\n" +
            "Tc As\n" +
            "3d Ad\n" +
            "Ah As\n" +
            "7c Ad\n" +
            "Ac Kc\n" +
            "Qh Ac\n" +
            "5s Ad\n" +
            "Tc Ah\n" +
            "Kc As\n" +
            "Qs Kc\n" +
            "Ks 9c\n" +
            "Jh Qh\n" +
            "Jc Qc\n" +
            "Ks 3d\n" +
            "Qd 9d\n" +
            "Qh Th\n" +
            "Jh 8c\n" +
            "9h Ks\n" +
            "Ah 7h\n" +
            "Qh Qs\n" +
            "Qd 9c\n" +
            "Kd 4s\n" +
            "Ts As\n" +
            "Kc Jd\n" +
            "5d 4h\n" +
            "Ah 5c\n" +
            "Ad 4d\n" +
            "9s Ks\n" +
            "7d Ah\n" +
            "Qd Qh\n" +
            "Ks Qd\n" +
            "Jc Tc\n" +
            "Ac 9s\n" +
            "Qd 7d\n" +
            "Tc 3c\n" +
            "Td Qd\n" +
            "Qh Qd\n" +
            "9s Ac\n" +
            "Th Td\n" +
            "As 7c\n" +
            "7c 8h\n" +
            "Ts Ah\n" +
            "Js Jh\n" +
            "Ah 5s\n" +
            "Qd 8d\n" +
            "Kd Qs\n" +
            "Th Ts\n" +
            "6c Ad\n" +
            "Qc Kh\n" +
            "Ac 6c\n" +
            "2c Ac\n" +
            "Ad Ks\n" +
            "4c Kc\n" +
            "Qh Kh\n" +
            "Jd 9c\n" +
            "Ah 8c\n" +
            "Ac 7d\n" +
            "6c Ah\n" +
            "5c 8c\n" +
            "Ah Jh\n" +
            "Qh Ts\n" +
            "4s 4c\n" +
            "2d 2s\n" +
            "6c 8c\n" +
            "Qc 9s\n" +
            "Tc Ah\n" +
            "Ts 8d\n" +
            "Ad 9s\n" +
            "Jd Qc\n" +
            "6s 6h\n" +
            "9d Qd\n" +
            "8h 2h\n" +
            "Kh Ah\n" +
            "Ad Td\n" +
            "Qc Th\n" +
            "Jd Qh\n" +
            "Kd Kc\n" +
            "6d 6h\n" +
            "8s Ah\n" +
            "Kh 5h\n" +
            "Tc 8d\n" +
            "Ah Qc\n" +
            "Ac 2c\n" +
            "8d Qd\n" +
            "Jh Kh\n" +
            "Tc Ah\n" +
            "Qs Kd\n" +
            "9s As\n" +
            "4s Js\n" +
            "As Ts\n" +
            "Js Jc\n" +
            "Ts Js\n" +
            "8d 4c\n" +
            "4c Ac\n" +
            "Th Kc\n" +
            "Qd Td\n" +
            "Qh Th\n" +
            "Jh Ks\n" +
            "Qh 8h\n" +
            "Qh Qs\n" +
            "9d Js\n" +
            "Tc 8c\n" +
            "3c 7c\n" +
            "Jd Qh\n" +
            "4c 8c\n" +
            "Ah Td\n" +
            "Th Td\n" +
            "Qc 6c\n" +
            "Qd As\n" +
            "9c Qd\n" +
            "Ah 4c\n" +
            "Th Ah\n" +
            "Kd 6d\n" +
            "Ad 6d\n" +
            "5c 8c\n" +
            "5h 8s\n" +
            "5h 5d\n" +
            "Jc Kc\n" +
            "Jc Kc\n" +
            "Th Jd\n" +
            "4c Ad\n" +
            "7s As\n" +
            "Jh 9h\n" +
            "Ac 2c\n" +
            "Jd As\n" +
            "Ts As\n" +
            "Jc Ts\n" +
            "Jh 9h\n" +
            "6d 2d\n" +
            "Qc Qd\n" +
            "Ah 5h\n" +
            "5c Ad\n" +
            "Ks Qd\n" +
            "Qs Ad\n" +
            "6h 5c\n" +
            "7d 9s\n" +
            "6d 5c\n" +
            "Qs Jh\n" +
            "5c 7d\n" +
            "Js 8c\n" +
            "Ah Th\n" +
            "7d 3c\n" +
            "Kd Jh\n" +
            "7s 8s\n" +
            "9d Tc\n" +
            "6c Qs\n" +
            "Qd 8s\n" +
            "Jc Js\n" +
            "Ts Kc\n" +
            "Jd 4c\n" +
            "Th 7s\n" +
            "5c 9c\n" +
            "3s 9c\n" +
            "9d Jh\n" +
            "Qs Ah\n" +
            "Ac Jh\n" +
            "Ad Ac\n" +
            "Qs Qh\n" +
            "Ad 5c\n" +
            "Jh Jd\n" +
            "Jd Th\n" +
            "9h 9d\n" +
            "9d 9c\n" +
            "Kh Kd\n" +
            "Ad Js\n" +
            "Kd 7h\n" +
            "Tc Qs\n" +
            "Jd 7d\n" +
            "Ah Jd\n" +
            "9d Qd\n" +
            "7h 7d\n" +
            "4c 4h\n" +
            "4d 2h\n" +
            "2d 5s\n" +
            "Js 9c\n" +
            "9c 9d\n" +
            "7d Kd\n" +
            "Kc 4d\n" +
            "8s Ad\n" +
            "Tc Jd\n" +
            "9s As\n" +
            "9c Jd\n" +
            "4c Jd\n" +
            "Qc Ac\n" +
            "Th 9s\n" +
            "7d Td\n" +
            "8h 9h\n" +
            "Jc 9h\n" +
            "Ad 3s\n" +
            "Jd Tc\n" +
            "Kh 4h\n" +
            "3h Ah\n" +
            "8d 7d\n" +
            "7c 8c\n" +
            "Jh Tc\n" +
            "Ac Qd\n" +
            "Qc Ad\n" +
            "5h 2h\n" +
            "9h 8h\n" +
            "Td 5s\n" +
            "Qh 9c\n" +
            "As Ks\n" +
            "Jd Ac\n" +
            "As 8d\n" +
            "Jd 9d\n" +
            "Ts Kc\n" +
            "Kd Qd\n" +
            "Jc 8c\n" +
            "Tc 9h\n" +
            "Ad Ks\n" +
            "Js Td\n" +
            "Jd Jh\n" +
            "4d 4s\n" +
            "4d Qd\n" +
            "Ks Kd\n" +
            "Qs Js\n" +
            "As 5s\n" +
            "Tc Qs\n" +
            "Ac Ah\n" +
            "Jc Th\n" +
            "Qs Qc\n" +
            "Kd Kc\n" +
            "Qd Jc\n" +
            "Ah Kc\n" +
            "Jh Th\n" +
            "9c 8c\n" +
            "Kd Kc\n" +
            "Ad Qh\n" +
            "9c 9d\n" +
            "Ac 9d\n" +
            "9h Qd\n" +
            "Kh 7d\n" +
            "Js Ah\n" +
            "9h Qc\n" +
            "Ts Ad\n" +
            "Kd Qc\n" +
            "Qh Ac\n" +
            "Ac 9d\n" +
            "Kd As\n" +
            "Qd Qs\n" +
            "Kc Jh\n" +
            "Qh Jh\n" +
            "Ks 5c\n" +
            "Tc Ac\n" +
            "Kd Kc\n" +
            "Tc 7d\n" +
            "Ks Td\n" +
            "Ks Ac\n" +
            "Qs 6s\n" +
            "Tc 9h\n" +
            "Ac 4d\n" +
            "Ks Kh\n" +
            "As 9s\n" +
            "3h 3s\n" +
            "Td 4c\n" +
            "Ks 7d\n" +
            "Ks Kh\n" +
            "Jc 3d\n" +
            "Ac 4h\n" +
            "Ks Js\n" +
            "Kh Ts\n" +
            "2s 6d\n" +
            "3h Ad\n" +
            "Jc 8c\n" +
            "5d 5h\n" +
            "7h As\n" +
            "Ts Tc\n" +
            "6s Qh\n" +
            "3d 8c\n" +
            "Jc Qc\n" +
            "Qd 5s\n" +
            "Ks Jc\n" +
            "Tc 7h\n" +
            "Kd As\n" +
            "Kc Qh\n" +
            "Ac 8c\n" +
            "Ad 5h\n" +
            "Td As\n" +
            "Jd Kd\n" +
            "As 6s\n" +
            "Qd Jc\n" +
            "As 3s\n" +
            "Kd Qh\n" +
            "7h Jh\n" +
            "9d Ks\n" +
            "Jc As\n" +
            "Ac Td\n" +
            "Kc Th\n" +
            "Tc 2c\n" +
            "Td Qh\n" +
            "Kc 5c\n" +
            "Td Jc\n" +
            "Kd Kh\n" +
            "Qh Tc\n" +
            "Ks Jh\n" +
            "Js As\n" +
            "Ks Ah\n" +
            "Th Ad\n" +
            "Jc Jd\n" +
            "Kh Jh\n" +
            "Ah Kd\n" +
            "7s 6s\n" +
            "Ac Ks\n" +
            "9h Kc\n" +
            "4d Js\n" +
            "Ks Qd\n" +
            "6c Qh\n" +
            "Ks 4s\n" +
            "Ah Kd\n" +
            "Qc As\n" +
            "Ah 9h\n" +
            "6h 8h\n" +
            "Ad 2c\n" +
            "Jd 9h\n" +
            "Js 9s\n" +
            "As Jd\n" +
            "7h Kh\n" +
            "Ad Qs\n" +
            "2s Kh\n" +
            "5s 5d\n" +
            "Kd 9s\n" +
            "Ad Jh\n" +
            "Kh Qs\n" +
            "Kc Ah\n" +
            "Ac 4c\n" +
            "Kh 8c\n" +
            "7c 5s\n" +
            "7c As\n" +
            "5h 9h\n" +
            "8c Qs\n" +
            "Ts 9c\n" +
            "Kd 4d\n" +
            "8d 3s\n" +
            "5d Qh\n" +
            "Ks 5d\n" +
            "9h Kh\n" +
            "Js 6h\n" +
            "Ks Jh\n" +
            "9d Jc\n" +
            "As Th\n" +
            "Kh 9c\n" +
            "Ks Qs\n" +
            "Ac 2s\n" +
            "Qc Ac\n" +
            "6s Kc\n" +
            "Qd 4d\n" +
            "7h 8d\n" +
            "7c Kc\n" +
            "Ah Qc\n" +
            "Ks 3d\n" +
            "Tc Kc\n" +
            "Th Tc\n" +
            "Th 4c\n" +
            "Jd As\n" +
            "Ts Jd\n" +
            "5d 9d\n" +
            "7h 7c\n" +
            "As 5h\n" +
            "8d Kd\n" +
            "8c 8h\n" +
            "Qd Qs\n" +
            "Kh 7h\n" +
            "Kd Ts\n" +
            "9c Tc\n" +
            "Ah 9c\n" +
            "Kd Qs\n" +
            "Kc Ad\n" +
            "9h 7h\n" +
            "Jh Qs\n" +
            "6s Qs\n" +
            "6h Ac\n" +
            "8s Ts\n" +
            "9c As\n" +
            "Ad Qs\n" +
            "Kc Js\n" +
            "Jc Kh\n" +
            "9c Tc\n" +
            "Kd 6c\n" +
            "As Qc\n" +
            "Js Jd\n" +
            "Ts Kd\n" +
            "As 4s\n" +
            "8h Ah\n" +
            "Th Qh\n" +
            "Ks Kc\n" +
            "Jc Tc\n" +
            "6s Ah\n" +
            "9h Js\n" +
            "9c Ts\n" +
            "Ah 3d\n" +
            "Jd 2d\n" +
            "5d 4c\n" +
            "Ah Jd\n" +
            "Ah 4d\n" +
            "9d Kh\n" +
            "Kh Ac\n" +
            "Jc Qh\n" +
            "Ah 4c\n" +
            "Tc Qd\n" +
            "Kh Ks\n" +
            "Ac Kd\n" +
            "Kc Ad\n" +
            "Kd Td\n" +
            "4s Ks\n" +
            "Ah Kd\n" +
            "Ad 3c\n" +
            "Ks Ah\n" +
            "9c Tc\n" +
            "Tc Ad\n" +
            "7h 8h\n" +
            "Kh Kc\n" +
            "7d Ad\n" +
            "As 9d\n" +
            "9d Js\n" +
            "Tc Qh\n" +
            "Kd Kc\n" +
            "Jh Jd\n" +
            "Kd Qs\n" +
            "9h 9s\n" +
            "Ts Jh\n" +
            "Qc Ah\n" +
            "Ah Tc\n" +
            "9h 9c\n" +
            "7h Ah\n" +
            "6s As\n" +
            "6c 6s\n" +
            "8s Ad\n" +
            "9h 9s\n" +
            "Js 8s\n" +
            "Qd Ks\n" +
            "Ad Ts\n" +
            "Tc Th\n" +
            "Jd 7d\n" +
            "Qs Kc\n" +
            "9s Ah\n" +
            "9c 9s\n" +
            "Kc Td\n" +
            "Jd Tc\n" +
            "Th Ad\n" +
            "Jd Jc\n" +
            "As Ah\n" +
            "8c Qd\n" +
            "7h Ah\n" +
            "9h Ah\n" +
            "Tc 8h\n" +
            "Ad 8s\n" +
            "Ts Js\n" +
            "9c Kc\n" +
            "As Js\n" +
            "Js Jd\n" +
            "7h 7s\n" +
            "Th Kh\n" +
            "Js Ad\n" +
            "Kh Qc\n" +
            "Tc 6s\n" +
            "5s 5d\n" +
            "5h 6d\n" +
            "Jd Ah\n" +
            "9d Jc\n" +
            "Jc 4h\n" +
            "Kh Th\n" +
            "8h Kh\n" +
            "9c 6s\n" +
            "Jc Th\n" +
            "6d 6s\n" +
            "7h 7d\n" +
            "7s 7d\n" +
            "As 6c\n" +
            "5c 2c\n" +
            "Ad Qd\n" +
            "Ac 5s\n" +
            "4s 6c\n" +
            "4s Kd\n" +
            "Ac Td\n" +
            "Ad Ks\n" +
            "9s Ad\n" +
            "8h Qh\n" +
            "4s As\n" +
            "Jh 7h\n" +
            "2d Kh\n" +
            "Ks Ad\n" +
            "2c Ac\n" +
            "Th Ts\n" +
            "Kd Ts\n" +
            "4s 6c\n" +
            "8d 8s\n" +
            "9c Kc\n" +
            "Ks Qc\n" +
            "Qd Qh\n" +
            "Kd Tc\n" +
            "3s 4c\n" +
            "4d Ah\n" +
            "Qc Qd\n" +
            "Qd Js\n" +
            "4s 7h\n" +
            "Jh 8s\n" +
            "Kh Ts\n" +
            "Kh 5s\n" +
            "3s Ks\n" +
            "Qh Jd\n" +
            "9h Js\n" +
            "7h 7c\n" +
            "9d Qs\n" +
            "Th Ah\n" +
            "9c Th\n" +
            "7c 7h\n" +
            "Jd Jc\n" +
            "As 9s\n" +
            "Ks Ac\n" +
            "Jh Jd\n" +
            "9d Td\n" +
            "Jd Jc\n" +
            "Jd 2s\n" +
            "Td 3d\n" +
            "Ts Tc\n" +
            "Td Tc\n" +
            "Qc Qh\n" +
            "Qc 3c\n" +
            "4s 6s\n" +
            "Kd Qh\n" +
            "5d 2c\n" +
            "Qh Kh\n" +
            "Kh Qs\n" +
            "9s 8s\n" +
            "Jd 9d\n" +
            "8h 5h\n" +
            "Kc Ah\n" +
            "As 7d\n" +
            "Td 9h\n" +
            "Kc 6c\n" +
            "Kh 4h\n" +
            "7d Js\n" +
            "Ac Ad\n" +
            "Qs Qd\n" +
            "8s Ah\n" +
            "Jc Kc\n" +
            "Th Ts\n" +
            "9s 8s\n" +
            "Qc 8s\n" +
            "Jc 2c\n" +
            "Th Ah\n" +
            "7h 6s\n" +
            "8s 8d\n" +
            "As Qs\n" +
            "7c 7s\n" +
            "Jh Qs\n" +
            "9h Jh\n" +
            "Td Kc\n" +
            "3h Kh\n" +
            "5c 7d\n" +
            "Th Jc\n" +
            "Jd Kd\n" +
            "9c 9d\n" +
            "Kc 8c\n" +
            "6h 6d\n" +
            "Ah Ks\n" +
            "Ad Js\n" +
            "Jh Tc\n" +
            "Kd Qd\n" +
            "Kh Td\n" +
            "Kd Td\n" +
            "Qc 9h\n" +
            "4h Kc\n" +
            "7s Ah\n" +
            "8h 8s\n" +
            "Ad Td\n" +
            "Js Td\n" +
            "Ac Tc\n" +
            "Ks 6s\n" +
            "Kh As\n" +
            "4c Ks\n" +
            "Ac Ks\n" +
            "8s 8c\n" +
            "Ac 9h\n" +
            "Ks 4s\n" +
            "7s Ks\n" +
            "7s 7c\n" +
            "Th Ts\n" +
            "Th Jh\n" +
            "Kh Qs\n" +
            "Ac Qd\n" +
            "Td 9d\n" +
            "Ah Ts\n" +
            "As 9c\n" +
            "Qh Qs\n" +
            "Ah Kh\n" +
            "7d 6d\n" +
            "8h 8s\n" +
            "Td Qh\n" +
            "2d 6s\n" +
            "8d 8c\n" +
            "8s Ks\n" +
            "Qs Ac\n" +
            "6d 6c\n" +
            "3h Tc\n" +
            "As 9s\n" +
            "Ts Tc\n" +
            "Ac Qd\n" +
            "7c 4d\n" +
            "7d Ad\n" +
            "9c 9d\n" +
            "7c Jd\n" +
            "7h 7d\n" +
            "Qs Qc\n" +
            "Tc Ts\n" +
            "Ah 6h\n" +
            "Ah Qd\n" +
            "6c 6d\n" +
            "Td 9c\n" +
            "Kh Jh\n" +
            "Qs Ks\n" +
            "7d 8d\n" +
            "Ah Js\n" +
            "As 7h\n" +
            "5s Ac\n" +
            "7s 5s\n" +
            "9d Ts\n" +
            "Td 7d\n" +
            "Jh 9s\n" +
            "As Js\n" +
            "Ah Th\n" +
            "Tc Js\n" +
            "Qh 8h\n" +
            "As 9d\n" +
            "Ks Th\n" +
            "Qs Kd\n" +
            "As Jc\n" +
            "Tc Js\n" +
            "8h 8c\n" +
            "Qh 2s\n" +
            "Kd 9d\n" +
            "2c 5s\n" +
            "Ks Kc\n" +
            "As Jd\n" +
            "7h Ac\n" +
            "5c 5d\n" +
            "3h Ah\n";

    String table = "Qc Ks 8s Jh Tc\n" +
            "5s Ts 4s Jc 2d\n" +
            "7d 6h 5d 9c Tc\n" +
            "8s 9s Tc Ad 5c\n" +
            "2d 2s Qs As Jd\n" +
            "Ah Td Ad 6h 6s\n" +
            "Td 8s 2d 7c Ad\n" +
            "Jc Qd 5s 3d 9h\n" +
            "5s 6s 2h 6c 6h\n" +
            "2c Ac 3h 8s Qs\n" +
            "3c 8c 2h Ks 4h\n" +
            "4c 9d 9c Qh 4d\n" +
            "5s Ts Jc 3c Jd\n" +
            "Ah Kc 6h 7s Kd\n" +
            "4d 3h 5h 2s 8s\n" +
            "Td 7d 2s 9h 4d\n" +
            "As 8c 2s Ks Ad\n" +
            "Js Tc 4s 9c 2c\n" +
            "Jd 6d 8d Th 2d\n" +
            "8h Ks Ts Ah 3c\n" +
            "Jc 8c Qh 8d Th\n" +
            "3s 2c Jc 4s 5h\n" +
            "5s 6h 6d Ah Qc\n" +
            "9c 7c 7h 7d 8s\n" +
            "Tc Ad 6d 8c 5s\n" +
            "9h 2h 3c 6h Tc\n" +
            "Qh 2c 4h Jc Ks\n" +
            "5d 7c 8h 6c 3c\n" +
            "9s 8s 4c 5h Jd\n" +
            "Ah 7h 3d Kd 5h\n" +
            "2s Tc 3d Th Ad\n" +
            "2h Kd 6c 7d 3d\n" +
            "4c 5h 3h Ah Th\n" +
            "9c Qc 8h 7c 5c\n" +
            "6s 3c 3s 5s 7h\n" +
            "4h Ks Ac Kh Qc\n" +
            "2c Kc 5d Ts 3h\n" +
            "Js 6c 3d 2d 5s\n" +
            "6s 9d 2d Jd Jh\n" +
            "4c Jc Td 3c 9c\n" +
            "6s 7c 9d 3d Jh\n" +
            "7c 9c 2c As 6h\n" +
            "Ts 2d 9s Js As\n" +
            "Kc As Kd 3c 6s\n" +
            "8h Jd Qd 2s 4d\n" +
            "2s 6d Td Jd 7c\n" +
            "3s Qc 8h Td As\n" +
            "4s 6h 3d Td 7d\n" +
            "9h Qs 6s 5c 4s\n" +
            "5s Ac 8h 8c 6h\n" +
            "Js 6s Th 7c 2s\n" +
            "3c 9h Th 9c 2h\n" +
            "8d 3d Th 6s 4d\n" +
            "2s 7c 3d 6h 5c\n" +
            "Ah 7d 4h Kd 7h\n" +
            "Qc 2h Kd 2s Ad\n" +
            "7h 5c 9s 5s 7d\n" +
            "5c 2s 5s 3d Ks\n" +
            "Ad Jc Ts Ah 2c\n" +
            "9h Qh Ks Jd Ac\n" +
            "4h 9d Th 5s As\n" +
            "8s Th 7d 5h 3d\n" +
            "Qh Kc 7d 8c 5d\n" +
            "Ac Kc 6c Qs 8s\n" +
            "8s Td 6c 9h 8d\n" +
            "2c 9s 6s Jc 3h\n" +
            "Ac 8d 4h 3h 7d\n" +
            "Td 5d 7c Ac 4s\n" +
            "7h 8s 2s Th 2c\n" +
            "Ad Ah Js 7d 9s\n" +
            "Ks 9s 7d Qc Ts\n" +
            "Qc 7d Js 2d Jh\n" +
            "5c Ks 8s 4s 3h\n" +
            "2h 7h 6s Ks 5h\n" +
            "Tc 9d 2c 2h 5h\n" +
            "Th 5c Ts 6h Qd\n" +
            "5h 5s 4s 7h 6c\n" +
            "9c Tc 6s Jd Qh\n" +
            "Jc Tc 2h 8c 9h\n" +
            "8h Th 4s As Jh\n" +
            "Tc Jc 2h Kd 2d\n" +
            "5h Kc 3s 7h Ad\n" +
            "Ac As 3s 2h Jh\n" +
            "Kh 5c 6s 5d 2s\n" +
            "Ah 9d 2h Js 5s\n" +
            "3c 5c 4d 3h Jc\n" +
            "3s Th 5h Qs 2d\n" +
            "Jc 8h Kd 7h Qh\n" +
            "3d 2d 6c 8s 3s\n" +
            "Jc Jh Ad 9d 9c\n" +
            "Ts 9s 6d Ad Qd\n" +
            "Ah Td Jh Ac 6s\n" +
            "4s 9c 9d Kc Ac\n" +
            "5d Ks Td 5h Kd\n" +
            "Jh 6d Jc Th Ks\n" +
            "3s 5d 4h 5h 2d\n" +
            "Ah Qc 7d 2s Kc\n" +
            "7h 8c 6h Kd 5h\n" +
            "7h 2c 7d 6d 7c\n" +
            "Ac Tc 8c 5s 3s\n" +
            "5c 3h Qc 4d 3s\n" +
            "Td 6s As 7d Kh\n" +
            "4c 5d Ts 7c 5h\n" +
            "Ah 8s Qh 5c 7h\n" +
            "3h 2c 2d Qd 8h\n" +
            "4h 7s 9c As Qs\n" +
            "7s 8c Js Jd 2s\n" +
            "Qc Tc Js 5c 4h\n" +
            "Kd Jd 3d 5d 6d\n" +
            "Ac Tc Qh 7h 7s\n" +
            "7d 3c 4c 6h Jh\n" +
            "2c Kc 6c 5s 3c\n" +
            "5d Jd Td Ts 6h\n" +
            "8d 7h 6s Ah Kc\n" +
            "6s Ts Td Tc 8h\n" +
            "2s 2c 6s 7h 8h\n" +
            "3d 5d Kd 7h 6c\n" +
            "5h 6h 7d 5d Kc\n" +
            "Kh Qd 3s As 9c\n" +
            "Js Jh 4c 3h Tc\n" +
            "Jc 5s Qh Tc 9c\n" +
            "Ac 3s Ts 4d 6h\n" +
            "4s 7c 3d Td 5h\n" +
            "Jd Js 8d 6c 7c\n" +
            "As 3h 7d Qd Kd\n" +
            "Qc Ah Ad 8s 2s\n" +
            "6c 4c Jd 6h 4d\n" +
            "Ac 5h Js Qc Kh\n" +
            "5c 7s 8s 8c 9s\n" +
            "4h 2h 6s 6h 3h\n" +
            "3s 6d 3c 6c 2d\n" +
            "As 2d 5h 2s Js\n" +
            "Ts Kh 5c Ah Jc\n" +
            "8d 7d 3c 2d 7s\n" +
            "9s Jc Qs 4s 3h\n" +
            "3c 5c 4s 6s Kh\n" +
            "6s Qc 2c 5d Js\n" +
            "Ks 9h Jd 2h Td\n" +
            "Qh 3c 6h 6s Qc\n" +
            "9s Th 9h 7h 3h\n" +
            "8c 7h 2c Kh 3s\n" +
            "Js 2h 5s Qc Qs\n" +
            "8s Ac Qc 3s 6c\n" +
            "Kh Jd Ad Kd 6d\n" +
            "2c 7c 6s Jd 2d\n" +
            "Jc Jd 5c 2s Th\n" +
            "9h 8s 2c Ad 3s\n" +
            "9h Jc 7d 2s Qh\n" +
            "4s 9s 5d 8d 4h\n" +
            "3d 5c 7s 7c 2c\n" +
            "Kh 6s 7s 7h 6d\n" +
            "9h 8d Kh 7h 8s\n" +
            "5s 3h Ks 6d 3d\n" +
            "7s 8h Ts 3s 6s\n" +
            "Jd 9c 5s 5c Qc\n" +
            "5d 4c Qc 4h Kd\n" +
            "Jh 5d Kd Ad 8c\n" +
            "7d Qs 5s 7h Th\n" +
            "Tc 3h 4s Kh 9s\n" +
            "5c Ah Qs Qh Jh\n" +
            "Th Kd Jd 3h Qs\n" +
            "Qc Tc 7h 9d 5c\n" +
            "As 8s 4c 5d 3c\n" +
            "3h 9s Jh 3d Ah\n" +
            "3h 4c 5h Qs 3c\n" +
            "8d Ah 3d Ac Td\n" +
            "2c Kc Qs Qd Ks\n" +
            "5s 2c Qc Tc 3c\n" +
            "8d 8c 3s 9s As\n" +
            "4h Td 2c 9h Qd\n" +
            "6s Kc 8d Kd 6h\n" +
            "6h Ts 8h 9c 8s\n" +
            "2d Kh Kd 9s 7c\n" +
            "5c Ac 9d Tc Kh\n" +
            "Ac As Kh Qc 8h\n" +
            "Td 7s Kh 2s 8s\n" +
            "Ad 4c 8s 9s 6h\n" +
            "8c 3c 6s Js 7d\n" +
            "Th 5d 2c 7s Kh\n" +
            "3d 8h Qh 3s 6s\n" +
            "Ks 8d 7d Kc 4d\n" +
            "Tc 7d Ts Jc 5d\n" +
            "8h 6h 2s 8d 2h\n" +
            "8h 5c 5d 9d Qd\n" +
            "7c 4c 5s 3h 5h\n" +
            "Ts 8h 2h Tc 4h\n" +
            "Tc Ah 7d 6h 5h\n" +
            "Js 9c 4d Kc Td\n" +
            "7c 8s Qc Qh Ts\n" +
            "Tc 3d 7s 8c Kd\n" +
            "Jc 9d Js Kc 3c\n" +
            "8c Qh 7h 8s Qs\n" +
            "Ah 4h 2d 7s Jd\n" +
            "Ad As Js 9h 4s\n" +
            "Ac 5d 8c 5c 6c\n" +
            "2s 6h Td 3s 9h\n" +
            "8h Kd 6c 8s Tc\n" +
            "3c 2h 5d 2s Kd\n" +
            "Kc 2d 7d 7c Jc\n" +
            "3h Td 3c Kh 9s\n" +
            "Tc 3c 3d Qh Jh\n" +
            "4c 6s 9h 3h 7c\n" +
            "Qh 2s Jd 5d 4d\n" +
            "Kd 2h 8s Ah 4c\n" +
            "2d Jc Kh 5h 9c\n" +
            "6d Th 9d Ad Js\n" +
            "5s 4s 3c 9c 6d\n" +
            "2d Ks Qh Js 8d\n" +
            "Th 2d 7h 7d 2c\n" +
            "8h Kd 3s Ts 3d\n" +
            "7c 2c Qs 7h 2s\n" +
            "Kc 2h 3c Ks 2c\n" +
            "5c 2h 9d Ad 8s\n" +
            "5s 2c Jh Tc 6c\n" +
            "2d Ts Kd Js 2h\n" +
            "2s 9s 2d 6d Js\n" +
            "2d Tc 8d Jh 2h\n" +
            "8s 8c 5s 8d 3h\n" +
            "Kh 6d 4h 5c 6h\n" +
            "Qc 8c Ks Qh 2s\n" +
            "7h Ts 2s 4h 6d\n" +
            "Ah 9s Ad 8c Qd\n" +
            "Tc 7s Jc 3h As\n" +
            "Qh 3d 9d Qc 7h\n" +
            "5c 3s 7s 9s 4d\n" +
            "Ad 2s 7d 5d 3d\n" +
            "4s 6c 9h Kd 6h\n" +
            "Th 8h Kd 2s 4h\n" +
            "Qs 3c 8c 6s 2c\n" +
            "7h Ts Qh 9h 9s\n" +
            "Td 3c Ts 9s 5c\n" +
            "3s 4h Ks 6h 2d\n" +
            "Jc 4s 6c 9d Qh\n" +
            "8h 9h 3d Jc 9d\n" +
            "6h 3s 5d 4c 4d\n" +
            "2s 2h 6h 9s Kd\n" +
            "Jh Td 2c Kh Kd\n" +
            "4c Jh Jd 9c 6h\n" +
            "9d 2d 6d 3h 4d\n" +
            "4s 3h 8h 7s 4d\n" +
            "9c 2c 6d 3h 6s\n" +
            "4s 6d 9d 9s 2s\n" +
            "9s 6h 4d 3h Th\n" +
            "9s Qh Jc Jh Qd\n" +
            "Kh 3h 4h Jh 7s\n" +
            "3h 8s Js 2s 6h\n" +
            "4c 7c 9c 2d 7s\n" +
            "2d 7d 3s 6c 6s\n" +
            "Js 6s 8c 7s Qh\n" +
            "7s 8d 5h 2c Th\n" +
            "Kd 2d 9s 6d 8d\n" +
            "Qc 9s 3d As Td\n" +
            "7h Qs 2h 9d 9h\n" +
            "Tc 9c Qd 6c As\n" +
            "5c 3h Tc 3d Ad\n" +
            "Qh 9s 3h 3c 4d\n" +
            "9d Qs 9s Jc Th\n" +
            "6c Ah Kc 6s Qc\n" +
            "2h 3d Tc 3h 3s\n" +
            "4s Kd 5s 2d 3h\n" +
            "9c Ts Jc 3h 3d\n" +
            "7d 3h Jh 8c Jc\n" +
            "Ac 5d As Ah 8s\n" +
            "3c 8d Ks 3s Kd\n" +
            "2c 2s 2d 7d 7h\n" +
            "Ad 6s As Qc Qd\n" +
            "5s Qh 2d Qd Th\n" +
            "Jc 6c 6s 4s 4h\n" +
            "6d 4h Tc 2d 6s\n" +
            "Jd 4d 4h 2c Jh\n" +
            "Ac Kd 8s Ad 3d\n" +
            "4h 2c 8d 5d 9d\n" +
            "9c 9h 5h 2s 8s\n" +
            "Qh Th 4c Td Kd\n" +
            "8d Js Qd 9h Ah\n" +
            "Ad 5s Jc 8c 3c\n" +
            "Kh 3s Qc 5d Kd\n" +
            "5c 2s 7d 7c Jh\n" +
            "Ad Qh Kd 3s 5c\n" +
            "Qc 6d Td 4d 6c\n" +
            "Qs 7h 9c Ah 2h\n" +
            "As 4s Qc Jd 4d\n" +
            "Qd 8c 7d Kd 4c\n" +
            "Qs 7s Kd Jc 4c\n" +
            "Kd 4h Qd Ks 7c\n" +
            "2c Js Ts 5d Jc\n" +
            "4d 9s Qh 7c 8h\n" +
            "2h 8d 6h Jh Th\n" +
            "2d 6h 4d 2h 5s\n" +
            "5s 4s 7h 3d 2d\n" +
            "6s Qs 8c 9h Qh\n" +
            "7h 2s 6d 9s Td\n" +
            "2d 4c 3c Kh 6h\n" +
            "7h Ks 7d Jc 8d\n" +
            "4s Qd 9s 5s 7d\n" +
            "Ad 2h Ks Qh Qs\n" +
            "9c 2s 5d Tc 2d\n" +
            "4d Qs 2c Ks 3c\n" +
            "9c Kc Tc 6h Jh\n" +
            "8c Ks Jd 9d Qs\n" +
            "3h 3s 7c Ts Th\n" +
            "Kd 3s Js Qd 4s\n" +
            "Td Kc 8c Jd Qh\n" +
            "7h Tc Kc 4s 2h\n" +
            "Ah 7c Js 5d 5h\n" +
            "Ts Kh 4d 4h Jc\n" +
            "Ah 6s 8s 7s 3d\n" +
            "Qc 6h 3h Th Ac\n" +
            "As 3d 9d 6s Jh\n" +
            "8d 3s 4s 7d Kh\n" +
            "5d Js 3h 2s 5c\n" +
            "Ah 9s 9h As Qc\n" +
            "As Qh Kd 8d 5c\n" +
            "Ac As 4s 6c 8c\n" +
            "Jh 2h 4c 3h 4d\n" +
            "3d 8c Ks 8s Ac\n" +
            "9s 7s Ks 6d 8d\n" +
            "Kh 3s 2s Td Kd\n" +
            "9d 4h 5s 2s Qh\n" +
            "Tc 7h 8d Ah 9s\n" +
            "5h 4s Kd Ts Ks\n" +
            "2s 4s Kh 3s Jd\n" +
            "Td Qd 4d Ks 6d\n" +
            "Jd 3h 7h Jh Ah\n" +
            "7c Kd 8s 4d Js\n" +
            "7d 7h 5c 3h 6c\n" +
            "8c Jc 6h 6s 2c\n" +
            "2s Ad 9c Kc 7c\n" +
            "Js 4c Qh 6s 2d\n" +
            "Qc Ah 8h 5d 2c\n" +
            "6d 7s 4s 3h Qs\n" +
            "7d Ts 5c 5d 6c\n" +
            "2s 3d Kd Ts 7s\n" +
            "7s 5h 5d Kh 8s\n" +
            "Jc 3h Qs 4d 9d\n" +
            "Qc 9s Ah Kd 5s\n" +
            "2d 2h Qd As 4s\n" +
            "2d 2h Qd 8d 4h\n" +
            "2h 9c Ks 6c Jd\n" +
            "4d 4c 8s 4h 5h\n" +
            "Jc Kh 4d Tc Jh\n" +
            "Kh Th Ac 7d 8h\n" +
            "6h 5c 3d Qh 2d\n" +
            "Qc 7c 6h 2d Jc\n" +
            "Th 5s Jd Ac 6d\n" +
            "6c 8d 9c 7s 3s\n" +
            "6d 5h Kh Ah 8d\n" +
            "6c 7c Ts 9d 2d\n" +
            "7c Ah 7h Ad 7s\n" +
            "9s 7h Kd Jc Jd\n" +
            "3c 5d 2h 7d 9s\n" +
            "2d 3s Kc Qs 6s\n" +
            "Kd 8d 2d 2c Th\n" +
            "Qd 4h 8d Jc 8s\n" +
            "6h 2h Ts 4c 3d\n" +
            "Kc 4c 2c 5s 8d\n" +
            "6h 7c Qs Kc Jd\n" +
            "Qs 7c 8h 8d 6d\n" +
            "Kc Th 9d Qs Ah\n" +
            "7c Jc 8d Kd 4h\n" +
            "4h Ts 8h 5d Kc\n" +
            "Jc 3d Qc Kc 7h\n" +
            "4d 4h 5h 3h 4c\n" +
            "Jh Ah 8h 5d Ks\n" +
            "Jd Ac 2d 5h Tc\n" +
            "Jh Qc 5d 9s 6d\n" +
            "3c Qs 2d Ad 9s\n" +
            "2c 3d As 2d Js\n" +
            "Js 2c 8c 5s Ts\n" +
            "Td 4d 9s 8c 6h\n" +
            "3s Qd 5h 3h 2s\n" +
            "Td Jh 6s 7c 7s\n" +
            "9c Qc Qs Jc Qd\n" +
            "8d Kd As Js 9c\n" +
            "As 4d Ad Th Jc\n" +
            "Kc 9s 9c 7s 5d\n" +
            "8s 6h Ac 9d Qc\n" +
            "Ah 9d 7c 7h 4d\n" +
            "Kd Kc 9d Tc 5s\n" +
            "8c 9s Th Ts 7d\n" +
            "9h Jd 5d Jh 3d\n" +
            "9s Td Js 5d Jh\n" +
            "Js 3d Td 3h Tc\n" +
            "Qh Jd 6d 6h Ks\n" +
            "9h Ac 9d Ad 2s\n" +
            "9c Ah 7c 9h Jd\n" +
            "Qd Ad Jc 2s Td\n" +
            "9c 7h 6h 9s Jc\n" +
            "Jh 2d 9s 8c Jc\n" +
            "3c As 9h 3h 7s\n" +
            "4c Jd 8c 5h 8h\n" +
            "Jd 6s 6c 2h 8h\n" +
            "3c 9h Qc 9d 7d\n" +
            "7s 8h 6d 6s Th\n" +
            "Th 4d 3h 3d 8s\n" +
            "2c 5d 4h 8d Kd\n" +
            "5c 4h Ad 4c Kc\n" +
            "8s Qh 5h 8c Kh\n" +
            "7c 7d As 9h Tc\n" +
            "Ad 5h Qc Jh 4h\n" +
            "9s Qh Jc 2h 8c\n" +
            "5h 5s 3c 8c Ac\n" +
            "Qs 2c 6s Ac Qd\n" +
            "7s Ts Ac Kh 8d\n" +
            "Th 6h 8c 2c 5s\n" +
            "3c 6c Th 4h Jc\n" +
            "5h Qs 2c Ks Jc\n" +
            "6c Ks 5h 9h 3d\n" +
            "4d 8c Ah 2c Kd\n" +
            "6c 7s 5h Kc 4d\n" +
            "8d Ts 3s 9h 6h\n" +
            "2s 3s 3c Jc 4d\n" +
            "6h Qc 4c As Th\n" +
            "3s 3d Ks Js Tc\n" +
            "Ks Jc Td 7h Ts\n" +
            "Ac Ah 8h Kh Jh\n" +
            "7h 6c Jh 4h Qh\n" +
            "9s 5c 7h Tc Kc\n" +
            "Kc Qs 9c 3s Tc\n" +
            "Jd 8h As 2h Qd\n" +
            "5d 7h 6c 8s 5c\n" +
            "Jh 9h 2d 8h Qc\n" +
            "9d Qd 2d 6c Js\n" +
            "7s 2h 5c 3s Td\n" +
            "9c 3h Th 7s 6s\n" +
            "Ks 2d 6d Ac Tc\n" +
            "Jd 6s Qh Ac 2h\n" +
            "3d Tc 7s 4d 7c\n" +
            "3h 6s 7d Ad Qd\n" +
            "Tc As 8c 2s 6d\n" +
            "2s 6c Jd Ks 5c\n" +
            "Jd 5h Jh Tc 9d\n" +
            "Jh 6d Qs Js 2d\n" +
            "2h Js Tc Qs Jc\n" +
            "Kh 6c 2s Th 8c\n" +
            "Th 9d 5d Qs 4h\n" +
            "3d 5h 5d Kc 7s\n" +
            "3h Th Ts Jd Qh\n" +
            "Ts Ad 4h Kc 9h\n" +
            "Qc 2d 8d 8h Kd\n" +
            "Js 7s Qs 3d 5s\n" +
            "Qh 5c 8c 3c 6h\n" +
            "6d Jc Kc 6h Qd\n" +
            "8h 8s 3s Tc 2s\n" +
            "Jd 6s Kd 4c 2c\n" +
            "5s 7d Kh Js 2h\n" +
            "5d Ks 8h 5s 9d\n" +
            "4s 5h 2c 5s 6h\n" +
            "8c 7h Ts 4d Qd\n" +
            "Ac 9s Qd 9c As\n" +
            "5c Kd 6s 8s 2c\n" +
            "3c 9h 4c Js 3s\n" +
            "5h 6d Td 9s 9h\n" +
            "6h Qd 7h Kd Jd\n" +
            "5h 8s 8h Ah Jc\n" +
            "2c Kh 6h Qc Qh\n" +
            "8d Ts 5s 2s 5h\n" +
            "9d 6d 2d Ad 6c\n" +
            "9c Ks 3s 6d Th\n" +
            "As Kd Js 3d 9d\n" +
            "4h Ts Qd Tc 2c\n" +
            "Jc 8s 2s 3h Jh\n" +
            "4s Kh 6c 6s 2s\n" +
            "As Kd Th 6d Kh\n" +
            "Ks 6s 9d 6c 2d\n" +
            "2d 9d 7s Kd Jd\n" +
            "4s Kc 7c Js 8h\n" +
            "Qc 9c 7s Qs Kc\n" +
            "4c 9c Qc 6d Qh\n" +
            "Ts 6d Kh 5s Qs\n" +
            "Jd 2s 9s 2c Kd\n" +
            "Ts 4d 5s 6h 9h\n" +
            "9s 8c 8d Qc 7h\n" +
            "8c Kh Kd 5s 6h\n" +
            "3h Jd Qd 9d 8s\n" +
            "3c 4d 6s Qc 8c\n" +
            "2c Jc Kh 5c 8c\n" +
            "9h Qs 9s Js Td\n" +
            "6h 5d 8s Kd Jh\n" +
            "3d 8h 5d Qc 9c\n" +
            "Qs 8d Qc 4h 6d\n" +
            "2s 4h 2c As Ks\n" +
            "Jd 9h 9s Qh 8c\n" +
            "Ks Js 2s 3h Kh\n" +
            "9d Ah 4s 4d 5s\n" +
            "2s 4s Ks 6s 5d\n" +
            "4c 7c Jd 3s Kc\n" +
            "Td 3s 9s As 9c\n" +
            "7s Jd Qs 9c 7h\n" +
            "8d Tc 8c Td 9d\n" +
            "4d 8s Qc Jd Ah\n" +
            "6c 7c Kh 8h 8s\n" +
            "6s Th Ah Ts 5h\n" +
            "Jd Ks Js 7d 9s\n" +
            "3h 4c Kd Ks Th\n" +
            "As 7s 8d 3d Th\n" +
            "Tc 7c 5d 6s Td\n" +
            "7h 4h 3c 8s Ah\n" +
            "Qd 5s 7d Ts 9c\n" +
            "5s Ts 5d 3h 3c\n" +
            "Ts 5h 6c 2s 3s\n" +
            "3h Qh 5d 3d Ad\n" +
            "Jc 5s 2s Kc 8h\n" +
            "Kh 2s 7c Qd 5d\n" +
            "Ac 5d Jh 7s 4s\n" +
            "6c 6h Qs 6d 6s\n" +
            "8s 8h Qc 5s 4s\n" +
            "5d Kc 8d 5c 6d\n" +
            "Td Ad As Jd Ac\n" +
            "8d Tc Qd 9d 8h\n" +
            "3c 8s 4d 7s 8d\n" +
            "Kh 5c 6s As 6c\n" +
            "5c Ah 7s 4c Td\n" +
            "5d 9h 7h 7c Kc\n" +
            "Kc 7c 4h Qc Qh\n" +
            "4s 4h 2d 3h Qh\n" +
            "9s 6c Kc Js 8d\n" +
            "Qs Qd Th 5s 2s\n" +
            "Qd 9s Js 4d 3d\n" +
            "5h 5d 8s 2d 7s\n" +
            "2c 5h Jd 9c Jc\n" +
            "7h 7s 3h Kc 5h\n" +
            "7h Ac 7s Th 6c\n" +
            "Jc 6h 6d 8h Qs\n" +
            "4h 8d 2d 4d 4c\n" +
            "2s 4s 6c 9h 5h\n" +
            "5s Ad 9d 6h Qs\n" +
            "9h 4d 2s 7d 4h\n" +
            "7d As 6d 6h Th\n" +
            "9d 2h 3c 9s As\n" +
            "9d Jh 2s Ts 4d\n" +
            "Ah 9s 9h As Qc\n" +
            "8d Kd 7c 3s Ah\n" +
            "2d 7d 5s 3c Ah\n" +
            "5h Kh Jh Ts Ad\n" +
            "Jh 2c Qd 2d Td\n" +
            "Qh Qs 6h Js 3d\n" +
            "2s Jh 8c Jc 2h\n" +
            "2s 8d Ts Jd 2c\n" +
            "5c 9h 9c 3h 8h\n" +
            "Tc 8h 7h 5c 7d\n" +
            "6s Jc 5s As Qc\n" +
            "3c 8c 8h As 3s\n" +
            "9s Th 3s 7d Js\n" +
            "6s 5d Ts 7s Qs\n" +
            "4d As 5s 7h Ts\n" +
            "7d 2d 5s 9d 9h\n" +
            "Js 9d 4c Kc Ks\n" +
            "7d Qh Kd 6d 3c\n" +
            "Th Jc Jh As 2c\n" +
            "Ad 8s Qd 8c 9c\n" +
            "Kd 8d 2d 6s 2h\n" +
            "3c 9s Jc 9h 2s\n" +
            "4h 9h Kc 7h 2s\n" +
            "2s As Kc Ad 8s\n" +
            "Ah As 9h Js 3c\n" +
            "8s 8d 4c 5d Kc\n" +
            "9s Kc 8h 5h 8s\n" +
            "7s Kd 3c Ah Js\n" +
            "Ts 5c 8s Qs Jh\n" +
            "8s 4h 3c Ac Th\n" +
            "Qh Jd Ah 2d 2s\n" +
            "Kd 9d 2h 6d 5s\n" +
            "Jc 8h Ks 7h 3s\n" +
            "7s Js 8d 7d Ts\n" +
            "8s 7c Kd 8h 5d\n" +
            "Jh Kh Qc 3d 8h\n" +
            "6h Ad Th Ah Td\n" +
            "3h Ah 4c 5c 8d\n" +
            "3d 2h Tc 6c 8h\n" +
            "Ad 4d 3d 3c 9h\n" +
            "Ah 3d Qh Ts 6c\n" +
            "Kc 8s Qh 7c 7d\n" +
            "9c 6h 5s 6c As\n" +
            "5h 8c 2h 7h Qh\n" +
            "Kd Jh 3d Ad Td\n" +
            "3s 6c 4d 8s 5d\n" +
            "5d 9c Qs 5c 2d\n" +
            "4c Qh 9d 6s 4h\n" +
            "Jc 5c Tc Td 7c\n" +
            "Kc 2s 9c 3d 5s\n" +
            "Ad 6s 9c 6d Qd\n" +
            "6c Kh Qc 6h 8h\n" +
            "7h 2s 2d Jh Ah\n" +
            "7d 2c 9d As Jc\n" +
            "Ks Td Tc 7d Qd\n" +
            "2d 9c Ad 6s Js\n" +
            "5s 2h 8c 5d 9h\n" +
            "Th Tc Ad 5h 7c\n" +
            "4d Jc 4c 8d 6d\n" +
            "9s Tc Jh Qc 4h\n" +
            "7c 3c 2s Kc 2d\n" +
            "7d 9h 9c 2c Th\n" +
            "Qs 6h 4c Ad Kh\n" +
            "Kc 3d Tc Ad 5s\n" +
            "Qd 5c Ad 2c 8c\n" +
            "Qd Jc 4h 3c 8d\n" +
            "5c 4s Tc 9c Kc\n" +
            "3d Ah Jh 3c Qh\n" +
            "Jc Qc As 8c 5h\n" +
            "Js 7d 5c 8h Qh\n" +
            "Jd 2d 6h Ac 4d\n" +
            "Jh 6c Ac 5h Td\n" +
            "Kc 3h 3s 3d Ah\n" +
            "Kh 6c 2s Th 8c\n" +
            "Th 9d 5d Qs 4h\n" +
            "9h 6c Kh Td 4h\n" +
            "3d 5h 5d Kc 7s\n" +
            "3h Th Ts Jd Qh\n" +
            "Ts Ad 4h Kc 9h\n" +
            "Qc 2d 8d 8h Kd\n" +
            "Js 7s Qs 3d 5s\n" +
            "As Jc 3s 2c 5h\n" +
            "9d 2s Jd Kh 5c\n" +
            "5h Th As 3s 4h\n" +
            "5d Ks 8h 5s 9d\n" +
            "9c 5d 8s 6c 7d\n" +
            "6c 3d 3c Js Ks\n" +
            "5h 6d Td 9s 9h\n" +
            "3d Qs 9h 2s Jd\n" +
            "9s 2h 8s 5h 9c\n" +
            "9s Js 3c Ad 5d\n" +
            "Kh Ah Qh 4c Jd\n" +
            "Tc 3c 7c Qd 4s\n" +
            "6c 2d 3h 7d 5c\n" +
            "8h 6c Ad Qd Ac\n" +
            "9s Jd Qd 7d 2c\n" +
            "7c 3h Jh 3s 5c\n" +
            "6h 4h Qc 5c 8d\n" +
            "7h Jh Qh Ah Jc\n" +
            "4h Kh 4c Js 7h\n" +
            "2h Qd 7h Td Jd\n" +
            "4c Tc 5c Ks 2d\n" +
            "As Ah Kc 4h Jc\n" +
            "7s Qs 5d 5c Jc\n" +
            "Qd Ad 2h 4c 7c\n" +
            "7s Ac 2d Js 8d\n" +
            "Th 8c Ad 6c 5s\n" +
            "8h 8d As Td 7d\n" +
            "7s 5s Ad 6s Ah\n" +
            "2c 4d 8d 5c 8h\n" +
            "Qs 3c 8d Kd 9c\n" +
            "Qs 6d 9c Kc 4c\n" +
            "Th Td Qd 5h Qs\n" +
            "5d 7c 7d Kh Js\n" +
            "4d Qh Jh Jc 7c\n" +
            "4s 3s 5s 2d 6s\n" +
            "4c Td 7d Th Qd\n" +
            "Jc Kc 9c Th Jd\n" +
            "Qc Qd Ac 2h Ts\n" +
            "Jc 6d 7s 5c Ts\n" +
            "7d 6s 5s 3h 4c\n" +
            "Ah 6d 9c Qh 3h\n" +
            "2h Qs Jc 6h 7h\n" +
            "Kh 2s Ts 9s 8c\n" +
            "3h 2h 9c Kd 8h\n" +
            "Js 2d 8c 2c 5s\n" +
            "Js Jc 4d 8h 4c\n" +
            "9s Jd 3d Js Ad\n" +
            "Th 4h As Ad Jd\n" +
            "As Ac 6s 4s Qs\n" +
            "Jh 9c Td 9d 6s\n" +
            "Qs 8h As 2h 3s\n" +
            "9c 5c 8c 8d Jh\n" +
            "6d Kh 7d Jh 3c\n" +
            "7s 5h Qd 4c 9d\n" +
            "Ts Qc Kc 3h Tc\n" +
            "Tc 8c 6c 2d Ks\n" +
            "7d Js Td Tc 3h\n" +
            "7s 9s 3h Ks Th\n" +
            "7s Tc 2c Qs Jd\n" +
            "3d Th Qc 6h Tc\n" +
            "5d Qc 6s 7s 9h\n" +
            "Kd 5c 9h 9s 2h\n" +
            "3d 8s Ah 7h Ts\n" +
            "2c Jh 3h 7s Jd\n" +
            "9h Td 9s 3c 9d\n" +
            "Qd 7c 7d 5c Kh\n" +
            "Td 7s 4c 4d 5h\n" +
            "Tc Js Ts 7d Ad\n" +
            "5s 9c 9d 2h Td\n" +
            "Jh 8h Qh 4h Kd\n" +
            "2c 5c 6c 5h 4s\n" +
            "8d 9d Jh Js 5s\n" +
            "Qs 2c 4s 2d Ah\n" +
            "5s 8s 7c 6c 3c\n" +
            "8c Kc 4d Ts Qd\n" +
            "6d 7d Qd 4c As\n" +
            "3c 7c 6h 2s Kd\n" +
            "Qc Ah 7h Ks Ts\n" +
            "8h Jc 7d Qc 2s\n" +
            "9d 5d Qc Ah 6s\n" +
            "8d Ts 7h 4h Qh\n" +
            "Tc Kc 4h 5s 9d\n" +
            "5d 9h 5c 4h 3d\n" +
            "Ks 2s Kc 9s 7s\n" +
            "Kh 2d Qs Jc 6c\n" +
            "2h Td 3h Th 2s\n" +
            "7h Tc 5c 8c 8d\n" +
            "7d Qc 7h 3d 4s\n" +
            "5c 2h Jd Ks Jh\n" +
            "Ac As 2d Kc 3d\n" +
            "3c 7c Js 7d Kc\n" +
            "8s 7h 7s 7c 6c\n" +
            "Kd 9s Ts Jd 4s\n" +
            "Th 5s 6c 4s As\n" +
            "3s 4c 8h Ah 7h\n" +
            "6d Js 3h 8d 9s\n" +
            "8c 7c Kc 8h 2d\n" +
            "2h 4h 6s Qc 6h\n" +
            "Jh 7c 2s 8c Jd\n" +
            "8c 2c 5s Qd Qs\n" +
            "6h 3h Kc 3d Kd\n" +
            "5h 6s Qd 9h 3c\n" +
            "3d 6h 3h 9c 4s\n" +
            "2h Js Ks Ts 5d\n" +
            "5d 9h 7c 4s Td\n" +
            "9s 4s Ts Kh 8c\n" +
            "Ts 3d Qs Qh As\n" +
            "5s Jc Qh Ac 2s\n" +
            "6h 5h Tc 4d 9h\n" +
            "6s Ac Qd 8d 7h\n" +
            "2h 5s Ac 7h Qs\n" +
            "Kd 4d 8s 9d 3d\n" +
            "Js 9s Jc 4s Ks\n" +
            "8c 7h Jd 3d 8d\n" +
            "6s 8c Kc 6d 7c\n" +
            "7c Kd 2c Kc Ks\n" +
            "5s 4s Ad Ks 4h\n" +
            "7h Kd 8s 4c 4h\n" +
            "2s Jc 8c Jh Th\n" +
            "8d Qh 3d Ks 9c\n" +
            "Qd Qh 6c 4d Kd\n" +
            "9d 3s Qs Th Ah\n" +
            "9s Kh Js Qs 2c\n" +
            "2c 5s 5c 8h 2d\n" +
            "2s Qh 3c Qs 3h\n" +
            "7s 4h Qh 7h 6s\n" +
            "Jh 4s 9d Tc 3s\n" +
            "7s Tc 6d 6c Td\n" +
            "Ad Jd Th 4c 9d\n" +
            "Ad 5h 5c Th Ac\n" +
            "Tc 3c 6c Jd 4c\n" +
            "Ah Kd 5c As Th\n" +
            "9s Qh 6d 5c 3s\n" +
            "3h 7s Ks 5s 8s\n" +
            "Jd 7h Qs 9h 9s\n" +
            "Jc 6h 7s Kc Ah\n" +
            "5h 6c Qc 7h Jd\n" +
            "Ac 7d Kc Qd Ad\n" +
            "3c Td Th 3h Qc\n" +
            "2h 3d Th 4s Jc\n" +
            "5c 6s Kd 9c 3d\n" +
            "6s 8h 9h 8s 2d\n" +
            "9d 3d Qh Td 3c\n" +
            "Qc Js 3h 4d Tc\n" +
            "Kc 8d Kh Th 5s\n" +
            "Js Ah 6d Tc 9s\n" +
            "9h 4c Ts 7d 7c\n" +
            "8c Ts Tc 6c 7h\n" +
            "3d 3c 5h 8s Ad\n" +
            "9s 4s Kc 4h 8s\n" +
            "2d Th 2c 8d Qh\n" +
            "3d Jh Qd Js 2d\n" +
            "3c Th Jh 4h Ad\n" +
            "8h 4h 9h Kh 2c\n" +
            "6c Ah 9s 7d 6h\n" +
            "Ah 4s 2d Kh Td\n" +
            "3h Kd Qs 5d Jc\n" +
            "Kh 6s 3d 7h Th\n" +
            "2d As Ks 2c 9s\n" +
            "9h Qd 9c 2h Kh\n" +
            "6h Jd 6s 3d 8h\n" +
            "Ts 6d 3h Qd Ac\n" +
            "9s Ks 9h Jc Ad\n" +
            "7s 7d Ah 9h Kc\n" +
            "6h Ts 7c 6s Kh\n" +
            "2d 8c 4s Ts 6c\n" +
            "Qs 6c Js 7s Jd\n" +
            "9c 5c 5d 8s Kh\n" +
            "5c 3s Tc Ah 9h\n" +
            "8s Ac 4h 7c 3d\n" +
            "5s Js Ah 2d 6s\n" +
            "6h Jd 8s Kc Kd\n" +
            "8d Kc 9d 3c Jc\n" +
            "8h Kh Ts 9d Tc\n" +
            "9h 3d 8c 5d Kc\n" +
            "Ad 8c Td 5s Qh\n" +
            "3s 8d Td Ac 8h\n" +
            "7h 6s Ad Ks 6h\n" +
            "Js Qc Th 8h Ts\n" +
            "4h 4d 7d 3h 3d\n" +
            "2h 6c Qc 7c Qh\n" +
            "6s As Jd 9d 4h\n" +
            "6h Td As 3c Ad\n" +
            "4s 2d 6d Qh Js\n" +
            "Kh Qh 4h Qc 6d\n" +
            "As Qs 4h 2s Kh\n" +
            "Ad 2h 4d 2c Kh\n" +
            "Td 8s Jh 5d 3s\n" +
            "4s Kc Ac 5h 3d\n" +
            "Jh 7d Jc 2s 9c\n" +
            "Kh 6h As 4s Jd\n" +
            "5s Kh Qd Ah 7h\n" +
            "5c 2c Ah Qc 9h\n" +
            "Tc 9d 8c 2h Ts\n" +
            "Qc 5h Jc 7c 9h\n" +
            "6d 4h 8s 9d Jh\n" +
            "3h Kh 9d 2c 9s\n" +
            "Th Js 7h 6c Ad\n" +
            "Qc 6d 3s Jh 3d\n" +
            "Js 7h 7s 9h As\n" +
            "6h 4d 7d 2h 8d\n" +
            "Js 9h 2h 2d 8d\n" +
            "5h Th Qd Td 6h\n" +
            "4c Kd 9s 2h Qd\n" +
            "5d 7s 6d 3c 4s\n" +
            "Qh 6h 4s Jc 6c\n" +
            "6h 7d 4c Th Kh\n" +
            "4d 9s 7d 6c Kc\n" +
            "6d 5s Ac Ah Kc\n" +
            "Tc Js 3s 9c Ts\n" +
            "Qc 3c 4c 6s 7d\n" +
            "Jd 8c 4d Qd 4s\n" +
            "3d Kc Jd Td 2s\n" +
            "Td Tc 7h Kd 3s\n" +
            "6d 4s 4d 7h 9s\n" +
            "3d 6h 4d 6s 7h\n" +
            "As 4c 9s 2h 3c\n" +
            "6d 7d 8s 3s 8h\n" +
            "6d Qh Qc 6c 9d\n" +
            "Qd 3c 2s 8h Kc\n" +
            "As 6h Ac Jh 2c\n" +
            "9c 5s 7d 8c 6h\n" +
            "Kh 6h 3s 5h 7d\n" +
            "8h Qs Tc 3c 6h\n" +
            "Qs Qd 3s 5c 6h\n" +
            "Ts 2c 2h 7d 9d\n" +
            "5c 6s 3h 4d Ks\n" +
            "7h 4c 7s 7d 5s\n" +
            "5c 9d 5d 8d Tc\n" +
            "Ac 8h 8d 2s 7c\n" +
            "4h 6c 5s Qs 6d\n" +
            "6c 2c Qh 4c Th\n" +
            "Qs As 4c 3d 4s\n" +
            "4c Td 2h 6h Jc\n" +
            "2h 3c 3d 3h 7s\n" +
            "6c 8h 8c Js 5h\n" +
            "Ah 7c 3d 8c Qd\n" +
            "8s Qh 3d Td 4h\n" +
            "5h 7c Jc 3s 4h\n" +
            "Td 3c 2d Kh Ac\n" +
            "4c 6h Jh 2h 8h\n" +
            "Jd 7h Td 9h 9d\n" +
            "Qh Ts 5s Ah 8c\n" +
            "6s Jd 3c Jh 3s\n" +
            "2h Ad 6s 4c 8s\n" +
            "9c 4d Qh 3s As\n" +
            "Kc Qh 7d Ah 5d\n" +
            "Tc As 3c Th 8s\n" +
            "6c 5c 3d 7h 9c\n" +
            "9s Ts 7d 6s 5h\n" +
            "5c Td 9s 2d 8c\n" +
            "Jh 2c Th 9c Jc\n" +
            "Jd Tc 5s 4c Ks\n" +
            "As 8h 2s 7s 4s\n" +
            "Qh 3s 9c Th Js\n" +
            "3c Tc 4d Qd 8h\n" +
            "Jh 2h Ts Th 6h\n" +
            "Qs 9h Jc 7c 6c\n" +
            "2c 9c Th 9h Qc\n" +
            "Qc 9c 7h 8h Tc\n" +
            "4d Kh 3d Kd Jd\n" +
            "9c Ts Js Ad 6s\n" +
            "6h 9d 2h 9c Ts\n" +
            "9c Ks Qc 3c 6c\n" +
            "4h 3h 5h Kc Jc\n" +
            "3s 5h Ts 8c 9h\n" +
            "Jd 2c As Ks 8s\n" +
            "Jc Qh 3h Th 2h\n" +
            "Qh 4s 3h 7d Ah\n" +
            "4d Js 3h 2c 2h\n" +
            "Kh 6s As 6d Qs\n" +
            "Jd 3s 2c Td Qd\n" +
            "7s 3s 3d 9c 6c\n" +
            "6h 5h 3c Qc Qs\n" +
            "Jh Ad 2c 8c Kc\n" +
            "5h 5c 9c 4h 8s\n" +
            "2h 6s Kc 2d 7s\n" +
            "As Ts Ac 4d 4c\n" +
            "Ks Kh 3s 8s Kd\n" +
            "5d 4h 2s 5c 8c\n" +
            "2d 6h Qc 8s 4c\n" +
            "7h 2s Kc 9c 9d\n" +
            "Jd 8d 3c Jc 7h\n" +
            "Ks 2c Td 9h As\n" +
            "As 2s Jc Jh 2h\n" +
            "4d 3h 2d 5s 2h\n" +
            "Jc Td Ah 2d 5s\n" +
            "Qs 9s 7h Ks 9d\n" +
            "9s 4h 3c 2c 6s\n" +
            "2c Ac 3s 5h Ad\n" +
            "Tc 4c 8s 9s 7h\n" +
            "7d Ah 6c Kc As\n" +
            "7s Jh 9d 9s 2s\n" +
            "3s 7h 6c 5h 8s\n" +
            "3c 9c 6h 7s Qs\n" +
            "3h Qh 6h 5d 9d\n" +
            "7c 3d 4d 7h 8c\n" +
            "6c 2c Kh 6s Th\n" +
            "2s Tc Kd 8s 3c\n" +
            "Qs Jc 8c 6h Kd\n" +
            "2h 5d 5h 7h Ts\n" +
            "2h Kd Ah Qh 9s\n" +
            "6d 9s 5h 2h 2d\n" +
            "Qh Ks 5s 3s Kd\n" +
            "3h Ah 4d As 3s\n" +
            "As 9c 2h 3s 7s\n" +
            "8h 7h 5h 8s 5c\n" +
            "Th Qs 7d 4s 5s\n" +
            "Qc 6h Kd 5h 6c\n" +
            "3h 8d 9d 6c 2s\n" +
            "5d 8c Ac 3c Jd\n" +
            "7d Ts 5s Th 4c\n" +
            "6s 4c 9s 4d Ks\n" +
            "Js 2h As Ad Jh\n" +
            "Tc 9c 5c Qd Jc\n" +
            "6c Js 3c Ts 5c\n" +
            "9d 9h Td 8h Jc\n" +
            "6h 2c 4h 5h Td\n" +
            "Tc Qc Kh 2d 9c\n" +
            "2s Jd 8h 5d 5h\n" +
            "8h Kh 3c Tc 5c\n" +
            "2c 7c Ts Qc 8s\n" +
            "4h 9h 7s Qd 3c\n" +
            "Jd Qd Ac Kc Ad\n" +
            "4c 3h Jd 3s Ks\n" +
            "Td 4s 9d 7h 8d\n" +
            "Qd 7h Jd Qs 4s\n" +
            "8s 3d Qc Jd Kh\n" +
            "7c Qc Jd As 6h\n" +
            "Kd 4s 3c 8h 6d\n" +
            "3s Qc 3d 4c As\n" +
            "4s 5d 8h Kh Tc\n" +
            "Th 3d Tc Kh 8c\n" +
            "Th Jd Jc Kc 7d\n" +
            "Td 9h 5c Qh Ad\n" +
            "Qd 5s Qh 7c 7h\n" +
            "8h Qh 7c 7d 3s\n" +
            "As 5s 5d 2d Th\n" +
            "As Td Ks Js 8h\n" +
            "Td Th Qs 5d 6h\n" +
            "5c Tc 3c Ad Jd\n" +
            "Kc Ad Kh 6c 6s\n" +
            "8h 3d Th Qc 8d\n" +
            "9h 6s Ac 9s 8d\n" +
            "3s 7s Ad Js Tc\n" +
            "8s Jh Jd 2h 5c\n" +
            "8c Kd 9c 4d Ac\n" +
            "Jh Qc Jc Kh 6h\n" +
            "Tc 8h Ac As Ks\n" +
            "3c 5d 7s 5s 5h\n" +
            "Ac 3s 4s Qc 6d\n" +
            "3s 3h 7h 6d 4c\n" +
            "Qh 8d Ac Kd 5h\n" +
            "Js 8c 6s Ts Th\n" +
            "Kh 7h 2s Qc 7d\n" +
            "As Qc 5s Td 9d\n" +
            "Jh 4d 8h 8c 6d\n" +
            "5c Qs 7s Ks 2s\n" +
            "Kc 7d 2d 6s 8d\n" +
            "3s As Js Kc 5h\n" +
            "8h 6d 8d 4c Qd\n" +
            "2h 4s 9h 4d 7h\n" +
            "As 5h 3c Kd Ad\n" +
            "Td 2h 9h 6d Ac\n" +
            "Ah 9h Ac Qc 7d\n" +
            "Th 3h Js 5d 5s\n" +
            "Th 5d Ad 3c 9d\n" +
            "6s Qd 6c 9h 5h\n" +
            "Qd 6s Th 3c 7d\n" +
            "2c Ts Th 7s 6h\n" +
            "4s Ks Js Td Kc\n" +
            "3c 5c 7d Jd Kc\n" +
            "Jc 6d 5h Td 4c\n" +
            "5d 8c 8d 6h 7s\n" +
            "2c Ac Js Qd Td\n" +
            "2h 4h Ah Js Qs\n" +
            "Js 4h Kd 2c 9c\n" +
            "7c Ac Th Td Qd\n" +
            "Jc 4c 8d 7c 3c\n" +
            "7c 7s Ah 6d 6s\n" +
            "Ac 8c 6c Tc 7d\n" +
            "9h 2c 6s Jc 9d\n" +
            "9h Qs 4h 8d 4s\n" +
            "9c Qs 5d 9d 5h\n" +
            "As 3c 6d Js 5d\n" +
            "9s Kh 5d Ac 2h\n" +
            "Kd As 5h 5s 9h\n" +
            "As 6h 5d 6c 7d\n" +
            "Ts 9c Tc 8d As\n" +
            "2s 2c Qd Ad 3d\n" +
            "Tc 3d 8h 6d 6h\n" +
            "4h Jd 3d 6h 7s\n" +
            "5s 5d 6c Qs Ac\n" +
            "Js 3c Ad Th 3d\n" +
            "Ac 9h 4c 5h Kc\n" +
            "Qc 8h Kc 7s Ac\n" +
            "4s Ah Qd 3h 5c\n" +
            "8c 7h Ad 2d Qd\n" +
            "6h 9s Jd 8s Ts\n" +
            "6s 8h Tc 3d 5d\n" +
            "2h Ts As 2d 8h\n" +
            "2d Qh 4s 6c Kc\n" +
            "5d Kd 2c Kc 9s\n" +
            "6h 9h 3c Ts 9s\n" +
            "9c 3h Tc 5d Th\n" +
            "Ac Js As 2s Ad\n" +
            "2d 7h 6d 4c Ad\n" +
            "6s Ac As 8c 9d\n" +
            "Ah 9s 8d Ac 6s\n" +
            "9c 9h 5h 7d 3s\n" +
            "9s 6d 5s 8s 4s\n" +
            "Ah Ac 8s 8c 3d\n" +
            "Js 2s 8d 3s Jc\n" +
            "Ks 9d 4h 2s 6h\n" +
            "Th As 9h 5d Ad\n" +
            "4s 6h 8h 5d 7d\n" +
            "Ks 8d 3h Qs 5s\n" +
            "9d Ad Jh Ts 6h\n" +
            "Ad Qd 9d Qc 6s\n" +
            "8h Kc 4s 8c 4d\n" +
            "5c Qs Kd Ah Qd\n" +
            "2c Kd 9d 5c Kc\n" +
            "2d Qs 4s Qc Js\n" +
            "Ts Ks 4h 5s Ac\n" +
            "As 5d 6h 8d 8c\n" +
            "6d 6s 8s Jh Jd\n" +
            "3h 3c 4c 8c 6c\n" +
            "3h 7s Kd 2c 7c\n" +
            "6s 9h As 8c 3c\n" +
            "Td 6s 5h 7h 3h\n" +
            "Js 7c Ah Ts 4h\n" +
            "6s 4d Kh 9s 3h\n" +
            "5c 5s Jd 3c 5d\n" +
            "Ac Ks 9d 9s Jh\n" +
            "6h 2h 6d Ah Kc\n" +
            "8d Th 3c 8h 4s\n" +
            "As Qh 4h Js 6d\n" +
            "8c Ah 2s 9c 6h\n" +
            "Qs 3c 6h 3s 7d\n" +
            "6d 8c Th 5d 9s\n" +
            "7d Ad Qc 6s Qd\n" +
            "6d Qd 6h 2s 3s\n" +
            "5h 7h 8d 5d Qh\n" +
            "4d 6h 3d 8c 5c\n" +
            "4h 8h 6d 9h 9d\n" +
            "6s Ts Ad 7s 6d\n" +
            "6h 6d Ah Qd 4d\n" +
            "5s 7s Kd 2d Jh\n" +
            "Qh Ad Th 3s 6d\n" +
            "9h Js 2d 8d 4h\n" +
            "3h 6s 5d Qc Jh\n" +
            "Qd Kc Kd 8h 4d\n" +
            "2d Js 9c 7s Jh\n" +
            "3s 4c Ts Ad 9s\n" +
            "9s 8h 9c 7d 3s\n" +
            "Qc 6d 2c Ks 9s\n" +
            "2h 9d 6h 6c 6d\n" +
            "5s Qh Ac Qd 9s\n" +
            "As 3s 3d 2s Ks\n" +
            "As 5d 3c Ad 8c\n" +
            "6h 9s 5h 8s Qd\n" +
            "5s 4s 8h 6c 6s\n" +
            "6d 7h 8d 3h 7c\n" +
            "2d 5h Ah 4s Th\n" +
            "As 2d 7d 5d 7h\n" +
            "4c 9d 9c Qd Qc\n" +
            "6c Ks 3h 2h Ac\n" +
            "3s 6s 8d Qs Th\n" +
            "4h Ts Th 6s Tc\n" +
            "As 3d Qh Jd 6s\n" +
            "2c 9s 6c 8d 7d\n" +
            "Jd 9h Jc 6c 8c\n" +
            "4c 7s 4s 8d Td\n" +
            "6c Qs 8c 5s 6d\n" +
            "Js 6c 9d 4d Ad\n" +
            "5h 4c Qs Qc 4s\n" +
            "Jh Js Kd 8c 5h\n" +
            "4s 2c 5d 6d 2s\n" +
            "Ts 6d 9c\n" +
            "Qh 4s 2h 2s Ts\n" +
            "2h Qc 7d 5s 8h\n" +
            "2h 4h Kc 3h Ks\n" +
            "2s 2d 4d Tc\n" +
            "3c 8c 8h Ad 6s\n" +
            "Qd 5s Ts 9c 7d\n" +
            "2h Qh 7s 2d Jh\n" +
            "5d Kd 6d 4h 6c\n" +
            "Jd 9s 7h 5d Jc\n" +
            "Js Kh 4h Kd Kc\n" +
            "Th Ts Ad 3c 4c\n" +
            "6c 5h Ks Js 2d\n" +
            "4s 5d Jd Ac 2d\n" +
            "7s Ac Ah 6c Qs\n" +
            "Ac Ks 2c 8h Kd\n" +
            "2c 5s 6h Td Ad\n" +
            "Ac 3h Ad 2d 4c\n" +
            "6c Tc 4h 7s Qd\n" +
            "4h 4c 9s Tc 8d\n" +
            "4d 3d Ac 3h 5h\n" +
            "6s Ks 4c Qh Jd\n" +
            "5s Qs 8s 3s Td\n" +
            "2d Js 5c Ad 6c\n" +
            "5d 8s 3s 6h Jd\n" +
            "4c 9d Qd 6h 6s\n" +
            "7c 2d 3s 5c Th\n" +
            "Jd As 8d 9h\n" +
            "4d 7s 8h 9s Ah\n" +
            "Qs 6c 8c Kd\n" +
            "8c 7h 5s 2c Tc\n" +
            "9s 8h Qs Ts 6c\n" +
            "5h 4d Qd 5c 3s\n" +
            "Jd 2d Ad 9d 8c\n" +
            "Ac 6d 2h Tc 2s\n" +
            "Qd 6h 6s Kh\n" +
            "5h Ad 2c\n" +
            "Js 4h 2s 9s\n" +
            "Qh 6s 5h Jd Jh\n" +
            "Kd As 4d 8d 9d\n" +
            "Th 5d 7h 6h Js\n" +
            "Jh 9d 4s\n" +
            "2s Qd Tc 3d 9h\n" +
            "2c As 4d 8s 9d\n" +
            "Kh Ks Kd 2h\n" +
            "7h 9d Jc Kh 2s\n" +
            "2d 6s Ac 2s 7c\n" +
            "Kd Kc Qh Jc\n" +
            "As Ad 9d\n" +
            "Kh 2d 5s 7h Qh\n" +
            "Qd 5h 9s Kc Jc\n" +
            "6h 9s As 2h Tc\n" +
            "3c 5c 6s Kc 5h\n" +
            "Kd Jh 9s 8d 2h\n" +
            "5c 5d Js Jc 8d\n" +
            "6d Qs Jc 7c Qc\n" +
            "Ts Td 5h\n" +
            "Kd 4h 4c 7d 9d\n" +
            "Qc Ts 6h 9d Ah\n" +
            "6s 7d 6h 3c Th\n" +
            "Th 4h Qd 3c 5h\n" +
            "4c Tc 8d 7c 2d\n" +
            "2s Qd 4h Ts Qc\n" +
            "3c Qh 7s 4s 3s\n" +
            "Ac Jc 6h 5s\n" +
            "8s Ac Qd Kh 7d\n" +
            "Jh 8s 8d 9c\n" +
            "2c 9s 9c Js 6c\n" +
            "Qs 9h Ks 2h 2s\n" +
            "Jc 9d Ad Ah 3h\n" +
            "6h 9d 9s\n" +
            "4s 3d 7d Jd Qs\n" +
            "4h 8h Tc 6s Kh\n" +
            "9c 6c 2d Qc\n" +
            "Qc 8d Ks 7s Qs\n" +
            "8h 8d 5d 5s\n" +
            "8h Ts Ac 8d 8c\n" +
            "3c 4c 6h 5h 8c\n" +
            "9d 7d 2d 4c As\n" +
            "2s 6s Th 9h 3h\n" +
            "6d 3s 6s\n" +
            "6h Js 3s 2h 9d\n" +
            "5h 7s Qd Th 3c\n" +
            "Ad 5d 2h Qc 7h\n" +
            "2h Qd 5d Th 7h\n" +
            "As 9s Ah\n" +
            "Kc 7d 4d 6s As\n" +
            "9d Ac 9s\n" +
            "Kd Tc 6c 7h Td\n" +
            "3s Jd 8c\n" +
            "Qs 7c 4d Kh 6d\n" +
            "8h 6d 8s 7c 4c\n" +
            "Ks 4s 7s 3c\n" +
            "6c 7c 5h\n" +
            "9c 5c 9h\n" +
            "8h Jd 3h 7s 8d\n" +
            "Kc Qd 5c Jc\n" +
            "Qd 2h 4s Qc\n" +
            "Ad 6h 4s Qc 6c\n" +
            "Qs 2h 8h 9c 3d\n" +
            "Jc 4h As Ah 3s\n" +
            "2h 7d 5h Ac\n" +
            "4d 6s Qc\n" +
            "Ad 2h 7c 2s As\n" +
            "Qd Qc 2h 7s Ac\n" +
            "7s 2h Jd 3s 5d\n" +
            "Ad 7h Td 7s\n" +
            "As 2h 9h Jd 2c\n" +
            "Ad Jc 9s Js 2c\n" +
            "As 8s 2d Ks 3c\n" +
            "2c 4h 5d 8s Kd\n" +
            "Tc Ah 5s 5c\n" +
            "Qh 8s 9h Ts\n" +
            "Ah 6c 5d\n" +
            "2c 4s Th 2d 6d\n" +
            "4d Qh Kh\n" +
            "4h 2d Ah 6c 5s\n" +
            "Jd 3c 4d 5h Tc\n" +
            "2d 5s 8d Tc 4s\n" +
            "2s 6c 6d 7s\n" +
            "4c 3c Kc Tc 7c\n" +
            "9d 7s 2s 5d Tc\n" +
            "9c 5d 8h Ac 8d\n" +
            "9h 2c 5s 3s Jd\n" +
            "6h Ks Jc\n" +
            "Qc 2h Kd 2s 6s\n" +
            "7d Jd Qc 2c 6h\n" +
            "6h Jd 3c 3d 7c\n" +
            "Tc Kh 4c 7h Jh\n" +
            "8s 6c 5s 3c Ad\n" +
            "5h Tc 4h Kc 8h\n" +
            "Kh 6c 9s 5s 3c\n" +
            "3h 6d 6h Ad 8s\n" +
            "9h Qc 2h 7d Td\n" +
            "Ac 9d Tc 4s 6s\n" +
            "Qc 7s 3s 5c 6c\n" +
            "Qh Qc 2s\n" +
            "Tc Th Ks 5s As\n" +
            "6d 8d Tc 8h\n" +
            "3c Qh 2s 6d Qd\n" +
            "9h 9d 8h Qs Td\n" +
            "Js Kc 5h\n" +
            "4s Jd Ac 8d Ah\n" +
            "5c Kh Th Qd Ah\n" +
            "8c Kd Kc 5s 4s\n" +
            "9s Kd Jc 8h 5h\n" +
            "2d 7c 2h\n" +
            "Kd Ah 3h 6c 6h\n" +
            "6h 2s Ah Qc\n" +
            "7s 5s 6h 2d Qd\n" +
            "9c Kh Ts 6c Js\n" +
            "9s Th 5c As 2d\n" +
            "7d Kd 4h 3c Qd\n" +
            "Th 5h 8h\n" +
            "Td Kd Tc 3h Jc\n" +
            "3c Js Kd 2c\n" +
            "4d 5d 2d As Ac\n" +
            "Ad Kh 5h 9c 6d\n" +
            "Jd 5h Ts Ac 3s\n" +
            "Jc Jd 6d 3c Tc\n" +
            "7h Tc 7c 4s Qh\n" +
            "Jd 8h 8c 8d 6d\n" +
            "7c 3h 4c 3s Tc\n" +
            "9s Kh 8h Ts 2s\n" +
            "8s 3s Td 4d Jd\n" +
            "8c 5d 9d 7s Ad\n" +
            "7d Jd Qs Ah As\n" +
            "5s 5c 2d As\n" +
            "5d 9s 3s Tc Qh\n" +
            "Td 9h 3c 4d\n" +
            "2d 7h 8s Ac 5d\n" +
            "8c 7c 9s 6c 6s\n" +
            "4d Td 3h\n" +
            "Qc 2d Tc 4s 7h\n" +
            "2d Ks 2h 5c 4d\n" +
            "3c Td 5c 3h Th\n" +
            "Ah Qh Th Jd Jh\n" +
            "6c Tc 8h 4d Qs\n" +
            "2h 6s 9d Qd\n" +
            "7d Qs 3h 8c Kc\n" +
            "7s Js 6h\n" +
            "Qc 4s Ac 8s 8d\n" +
            "6d 8c 3s\n" +
            "6s 5s Qd Ks 2d\n" +
            "Ad 5s Ks Tc\n" +
            "Ac Qh 7d Qs 8h\n" +
            "2d 9c 8h 9s 6d\n" +
            "Ks Jd Qs 5c 5s\n" +
            "5h 6d 5d\n" +
            "Jh Ad Ks 2h 6s\n" +
            "6s Ah 4s\n" +
            "Th 7h Ts\n" +
            "5h 7d Kd 9h\n" +
            "4s Jh 3d\n" +
            "7h 5s Jc 9s Qh\n" +
            "9d 2c 4d\n" +
            "7d Kd 3h\n" +
            "2s Kd 9c 8s\n" +
            "8c Qc 2c 2s 9d\n" +
            "6s Ts Qc 5s 9c\n" +
            "3d 4h 7d 7c 5c\n" +
            "8c Jh Qc As 9c\n" +
            "2d 5h 6h Kc 9c\n" +
            "8d 6h 5h 6d Jc\n" +
            "5h 2c 8c 9s\n" +
            "5s 7s Qd\n" +
            "Js 6d 6s\n" +
            "2c 2s 6d 5d Ks\n" +
            "2h 3h 4d\n" +
            "4c 8s 7d 9c 5c\n" +
            "5c 3s Qc 6c 7s\n" +
            "2d Qc 5h\n" +
            "Ts 6s 8h\n" +
            "Jc 4c Ac 2d Ts\n" +
            "4d 4s 7d 9c 5s\n" +
            "7d 3h 2d\n" +
            "As 3h 2s Kc 4d\n" +
            "2d 9d As\n" +
            "Qc Th 2s 5d Kd\n" +
            "Qs 8h Td\n" +
            "6h 6s Js\n" +
            "4d Qd 4c\n" +
            "6d Jc Ks\n" +
            "3h 8h 4s 2h 5h\n" +
            "2h Js 6h 7c\n" +
            "9h 9c 5c Ks\n" +
            "5h 2s Kh 9h 5c\n" +
            "Jh 8d Ac 5h 5s\n" +
            "9d 5s 7c As\n" +
            "7h Kd Th\n" +
            "Kh Qd Tc Jh 2h\n" +
            "Jh As Qc 8d Qd\n" +
            "Jc Kc Kh\n" +
            "4d Kc 4s\n" +
            "5h 3d Jh 2c\n" +
            "3h 7s 5d 8h Kh\n" +
            "Kd 9c Ts\n" +
            "Qh 7c 2h 6s Jh\n" +
            "Kd Jd 4d 5c 9c\n" +
            "Ks Qh 5d\n" +
            "Kh 8s 8c Ac 4c\n" +
            "7s 7c 5c 3s Qc\n" +
            "6d 8c Th Qh 5d\n" +
            "Jd Qc Jc 2d 3h\n" +
            "4h Js 6d 6c 8s\n" +
            "Js Qc 4d 5d 2s\n" +
            "5h 7c 3d 7h Jc\n" +
            "Jh 6h 9h Ac\n" +
            "4s 5d Js\n" +
            "5c 5s Ts 8h 7h\n" +
            "9c 6h 5s 7h 3d\n" +
            "Ks Qs 4s\n" +
            "7d Td Jd 7h 5d\n" +
            "Kc Qc 6h 9s 4c\n" +
            "8d Qs Ks\n" +
            "5s As Ah 3s 9d\n" +
            "7d Ad 8h 6s 5c\n" +
            "Jc 6c Qc 3d 7d\n" +
            "Tc 5h 2s\n" +
            "Jd Qd Kc Ts 6h\n" +
            "Kd Qc 5d 4c 5h\n" +
            "6s 5h 5s 7s 4d\n" +
            "9s 2h 3h As 7d\n" +
            "9c 7s 2c 8d Td\n" +
            "6h 5d 6s 8d\n" +
            "2c Kc Kd\n" +
            "5c 6d 6s Qc Ks\n" +
            "4d 8c Tc Jc 9h\n" +
            "4c 3h 4s Qc 5d\n" +
            "Jc 5s 5c 7s 6d\n" +
            "Kh Js 3s Td 8s\n" +
            "Kd Qh 7h\n" +
            "8c Ks Kh Jd As\n" +
            "Qh As 6c\n" +
            "5s Js Kd\n" +
            "Kd As 8s\n" +
            "Jc 4c Jh\n" +
            "Ah 3h 3c Ac 7h\n" +
            "Qc 7h 7c\n" +
            "7h Qc 5h 9d 2s\n" +
            "4c 7h As\n" +
            "3c 9d 3s 8d Jd\n" +
            "9c 5c 4s Ks\n" +
            "6s 9d Qc 7c 3d\n" +
            "Kh 7s Ah 3c\n" +
            "7d 4c Ts Th\n" +
            "4c 3h Tc 2c Qs\n" +
            "7c 7h Th\n" +
            "6c 7h 2h 7d\n" +
            "Ts 5d 9d 5s\n" +
            "7h Js Td 6s 7d\n" +
            "Jh 3c 5d 3d 9s\n" +
            "Js 4d 5s 9s Qs\n" +
            "4s 2s 8d\n" +
            "As Qc Ts 9s\n" +
            "4d 9d Jh Qd Ts\n" +
            "6s 2d Jd 5c 7h\n" +
            "5c Ah 9c 8c\n" +
            "8s 8h 6d\n" +
            "3h 6s 4d 9s Js\n" +
            "7c 3s Tc\n" +
            "3s 3c Ac\n" +
            "5h 9h 9d\n" +
            "8h Jc 4s\n" +
            "Jc 7c Qc\n" +
            "Ac 5c Qc\n" +
            "8s Jd 8c 8h\n" +
            "7d Qs 9c\n" +
            "Qd Qc 4d\n" +
            "2c 3d 4c 5h 2h\n" +
            "Js Ad 4c 4d\n" +
            "4h As 6s 3d 5c\n" +
            "Ac 7h 2s\n" +
            "Qs 4h 4d 6c 3h\n" +
            "6c Qd As\n" +
            "4h 7h Tc\n" +
            "3s Js Kc\n" +
            "6h 8h 3c 5s Ks\n" +
            "Kc Ts 6d\n" +
            "Th 7c Qs\n" +
            "Kc 3d 6s\n" +
            "8d 7d 3c 7c 5h\n" +
            "3d 9s 2d\n" +
            "9s 8s Js 7s As\n" +
            "9d Qs 5c Jh Kh\n" +
            "4s 9c 7c 9h 4c\n" +
            "4h 8c 9c Kh 2s\n" +
            "8c 3h 9c\n" +
            "Qd 2d 4h\n" +
            "Ad Qs Ts 5d Qc\n" +
            "Tc Jd 5c\n" +
            "Th Qd Ac Ts 2c\n" +
            "Kd 6c 7d 2d 6s\n" +
            "2d Jc 2c 8c 6c\n" +
            "Jc 9d Jd 8c Qh\n" +
            "8h Ah 5h Th\n" +
            "Tc Td 9c\n" +
            "Js Ah 4d 3c 3h\n" +
            "5s Ad 6h 4h Ac\n" +
            "Jh Kd 7d 5c 4h\n" +
            "5h Jh 9c 2d\n" +
            "9c Ah 4s Ks 7d\n" +
            "6c Qd Qc 3s 7s\n" +
            "2s 6s 5h Js\n" +
            "6d 6c 3c Kc 7c\n" +
            "Th As 5c 9d 2c\n" +
            "Qh 7c 6s 7s 4h\n" +
            "Ah 5h 5d Qc\n" +
            "6s 3d 5d Ah\n" +
            "4c 7s Js 2h 4s\n" +
            "4c 3c Th Tc\n" +
            "Kc 3c 9h\n" +
            "Qh Ks 2s 5c Tc\n" +
            "Th Ts 3d 8c 8d\n" +
            "Qd Jd Qs 7d Tc\n" +
            "Qd Qs 8h 9c\n" +
            "Ah 6d Tc 7d Kh\n" +
            "5s 7h Jd 8d\n" +
            "2s 8d Jh 7d 3c\n" +
            "As Ac Ks 4c 7s\n" +
            "Qd 7d Kh Qh 7s\n" +
            "8c 8d 5s Qc Jd\n" +
            "6c 5c 2h 4h Ac\n" +
            "Kd 2s 6s 9c Th\n" +
            "5h 6d Kd 3d 8s\n" +
            "6s 5c Td\n" +
            "4c 7h 9c Ah 4h\n" +
            "3s Th 3c 2d Tc\n" +
            "7s 5d 2s Kc 6d\n" +
            "5d Ac Ah\n" +
            "As 2c 4h Jc\n" +
            "As 3d 6s 8h\n" +
            "6s 8h 7h 5h Td\n" +
            "Tc 9c 6d 8d 3h\n" +
            "6s Js 2c 5d 7s\n" +
            "9c 4s 8c Jc Ks\n" +
            "7c 8c Td Qc 4d\n" +
            "Jd 2d 7c\n" +
            "3h Kd 7s 9d Kh\n" +
            "4d Th 9c 6s\n" +
            "7s 8d 7d\n" +
            "6d 3h Jc\n" +
            "2h Tc Kc Ts\n" +
            "4d Kd Qs 5h 9s\n" +
            "Jh Ts 3h\n" +
            "5s Kc 6s 2h\n" +
            "6d 9c Tc 7c 2c\n" +
            "Kd Tc 6d Ts Qs\n" +
            "Tc 8h 4s Jh\n" +
            "Ts 5s Kc 8c 4h\n" +
            "7s Jc 7d 6h Qc\n" +
            "Qs 5d Qh 8d\n" +
            "6d Qc Ah\n" +
            "9d 3s Ks 9s Qd\n" +
            "5h 3s 7h 2s Tc\n" +
            "7s 6c Qs 2c 3c\n" +
            "7c Td Tc 4d\n" +
            "Js 7d 6c 5s Kh\n" +
            "Ah 7h 2d Tc\n" +
            "As 3s Ah 8d 2h\n" +
            "Jd 6d 8h\n" +
            "Jc 7s 5d Qs 4h\n" +
            "Tc 6s Jd 2c 4h\n" +
            "Jd As Qs 8c 5d\n" +
            "8c 6h 9s Ks 4d\n" +
            "Ts Js 9c\n" +
            "7s Qs 6d Qd 9h\n" +
            "2d Js 9s Ks 4h\n" +
            "Kd 8d 4d Ac 2c\n" +
            "8s 4h Kd 5h Tc\n" +
            "Jc Kd 8h Js\n" +
            "As 7d Qs 8d\n" +
            "Ah 4s 7c\n" +
            "6d Ah 3h\n" +
            "3s 6s 6c\n" +
            "Qc Qd 3d\n" +
            "5h Td 8d 8h 6c\n" +
            "5h Ks 7h 7s Js\n" +
            "9s Jh Kh Td Tc\n" +
            "As 4d 3d Ad 6h\n" +
            "As 3c Ts Jc 6d\n" +
            "Td 8s Qs Ks 3c\n" +
            "4s 8h Th Qd 2c\n" +
            "Jc 5d 5c 2s Jh\n" +
            "6c 9c Kh Th 5s\n" +
            "3h 8c 7s 9s 8d\n" +
            "7c Kc 5d\n" +
            "4h 5s Ah 5d\n" +
            "6h 9h Ac 5d\n" +
            "Tc 7h 5s 8s 3d\n" +
            "9h Js As Ks 4c\n" +
            "5s 7d Ah Jh 9s\n" +
            "Qc Kd 4s Jc Jh\n" +
            "2h Kc 8c 4h Qd\n" +
            "Ts Qs 7s 4h 7c\n" +
            "Ad Jh 8s 5c Jd\n" +
            "Th Ts 7h Qs Qc\n" +
            "5c Qc Qd Qs 2c\n" +
            "Qd 7h 9c 3d 5c\n" +
            "5c 2s 3d 6h 4h\n" +
            "4s 3d 5c 2d Kc\n" +
            "7h Qs 8d Kd Jc\n" +
            "5c 2s 5s 9c 4c\n" +
            "Qd 2d 8s 3d\n" +
            "8c 6c 2s 2c 7d\n" +
            "Qh 7c Jh Jd\n" +
            "2s 7s 4d\n" +
            "5c 5h Ts\n" +
            "2s 7d 9h 5c\n" +
            "3h Ah 8h Kd 4c\n" +
            "Qs 8h Kd 9s Kh\n" +
            "6c 6d 4c Qh Jh\n" +
            "Jh Jc 6c 7h 7c\n" +
            "8h As 6d Kc 7h\n" +
            "Qh Kh 5d\n" +
            "6h 9s 4s 7h Jd\n" +
            "3h 7d Ad 2h 4d\n" +
            "Qs Kc Kd 7s 7c\n" +
            "9h Ad Qd 2h 4s\n" +
            "Jh 7s 8d Ks 9d\n" +
            "Qc Jd Td Ks 8h\n" +
            "6s Ah Ad 6c\n" +
            "4h 8d Ah Jd 8s\n" +
            "5d Jh 7s Kc 9s\n" +
            "Qc Qd Td 8c Kc\n" +
            "6d Qh 7d Ac\n" +
            "5s Jh 3h 7c Ks\n" +
            "6d 8c Qs Kc 8s\n" +
            "4s 7h 2d 3c Qd\n" +
            "3h 8c 7d As Jd\n" +
            "5s 2h Tc 9h Jd\n" +
            "8s Ts 9c\n" +
            "Ah 8s Jd 7h 3s\n" +
            "4c 9h 4s 7h 7d\n" +
            "Td Jd 4s 5d 7h\n" +
            "Qs Jc 7c 4d Ts\n" +
            "9c 8c 2d 9h Qc\n" +
            "Jd Tc Jh 8s 8h\n" +
            "7s 5d 8h 7h 7c\n" +
            "Qc Td 9s 8h 7c\n" +
            "5s 7h 8s Jc 3h\n" +
            "8s 5c Qh Qc Kh\n" +
            "6h Jd 7c Jh 2d\n" +
            "Jd Ah 7s 9d 8h\n" +
            "4c 7c 8s As 7s\n" +
            "3d 4s Kc 4d As\n" +
            "5d Js 4c 8s 4d\n" +
            "Qd 3c 3h 5h Tc\n" +
            "5h 3d Kd Ah Jc\n" +
            "6c 9h Jc 2h 5s\n" +
            "8d As Kh Qc 2h\n" +
            "3c 6c 5h\n" +
            "9c 9s 8d 9d 6s\n" +
            "7d 9h Jh 2h 5d\n" +
            "4h 2d Ad 6h 6c\n" +
            "9h Tc Qh Jd 3s\n" +
            "7d 3h 9d 5c 8h\n" +
            "Jh Ac 8d 9c 7c\n" +
            "Kh Js 7s Qd 9h\n" +
            "3d 4h Ac 3s Qs\n" +
            "Th 9c 7c 5s 2h\n" +
            "Qs Kc Ks 5h 9h\n" +
            "3s 5s Ad Ac 7h\n" +
            "2h 6d 5d Qd Ac\n" +
            "Tc 5d 5h As 4d\n" +
            "Qs Td 6s 9h Qc\n" +
            "8c 9h 7h 4c Ks\n" +
            "5c Tc 9h 5s Jh\n" +
            "Td 8h 3h Qs 2d\n" +
            "2d 2c Ts Qs 3h\n" +
            "6c 9s Ad 9h\n" +
            "4c 9d Ad\n" +
            "Jc Jh 8c 7d 8s\n" +
            "7c 2h 4c Qc Qs\n" +
            "Ks 8d Jd Td 3c\n" +
            "Th 9s 3s 3d As\n" +
            "9c 9d 4h 3h Jd\n" +
            "Ad Qc Td\n" +
            "7c 5s Kh Js 9h\n" +
            "8s Jd 6h As Td\n" +
            "Ts 8s 5d\n" +
            "9c 4h Qh 9s Kc\n" +
            "Ad 4h Qd 2s 8c\n" +
            "7s 6s 2c 2d 8s\n" +
            "2c 3c Ah\n" +
            "7d Ad 5d Qc 7c\n" +
            "3c 9s Kh Qd\n" +
            "Qh Th 3d 7h 5d\n" +
            "7d 2s Js\n" +
            "Jh 2c Td\n" +
            "Kh 5c 9s 8s 6s\n" +
            "3h 6h 4d 8c Kd\n" +
            "Kc Jc 6c 3s 2s\n" +
            "6c Kc 9h Jd 3h\n" +
            "4s Jh 5s\n" +
            "9h 7s Js 8c 6s\n" +
            "3d Kc 2h 9h 8c\n" +
            "4h 2c 5h 5c\n" +
            "5d 5s 6c 8h 9d\n" +
            "9h Jd Js\n" +
            "Kh 8s Qs 9h 4d\n" +
            "Ad Jc 3d\n" +
            "7h Kh 8s Qs 4d\n" +
            "5c Qs Qh 2d Ks\n" +
            "5d 2s 2h 4s Ah\n" +
            "Ts 2c 6h\n" +
            "Js 9s 2c Th\n" +
            "8s 6h 6d Ac Td\n" +
            "8s Tc 9c Qs 8h\n" +
            "7c 7d 4d 6h 3h\n" +
            "9s Kc Jd\n" +
            "Td 5s 6d\n" +
            "9c 8d 7d 3d 5c\n" +
            "4s Td 3c 9d Ah\n" +
            "8c 9h Qc Ad Th\n" +
            "7h Kd 2s 7s 6d\n" +
            "8c 5c 7d\n" +
            "Th 6h 6s 7c\n" +
            "9h 5s Ah Kh 6s\n" +
            "Ts 5s 2c 4h\n" +
            "3c Kh 6d\n" +
            "Qh Ts 3c\n" +
            "7h 3h Ac\n" +
            "5d 6c 8c Jc Jh\n" +
            "6s 9s 7d Td Qd\n" +
            "6h 3h 7c 4d\n" +
            "Js 7d 7h\n" +
            "Td 6c 8d Qd Ah\n" +
            "8h Tc 8c\n" +
            "Th 4h Js 8c 2c\n" +
            "Jd 8s 6s Tc 3d\n" +
            "5h 5c Jh 2d\n" +
            "6s 3d 9s 7d Jd\n" +
            "Qd 3d 4d\n" +
            "6c 8s Ac 3c\n" +
            "7h Qc Qh As 2s\n" +
            "Tc Kh 8s Ts Qd\n" +
            "Jc Qd Ac 8s Qs\n" +
            "9c 7h 9h\n" +
            "5d Jh Qh As\n" +
            "7h 3c As Kh 5s\n" +
            "3d 5s 9s Ts 6c\n" +
            "6s 6h 7h 4s Kc\n" +
            "4s 5c Ad As 3c\n" +
            "Tc 7c Ad\n" +
            "4d 4s 3d\n" +
            "Qc As 6d\n" +
            "3h 5c 3c 6s 3s\n" +
            "4c Qh Ah\n" +
            "6h 6s 7h 4h Qc\n" +
            "Ac 7c 7d 8c Jd\n" +
            "6d 9d 2c Tc Qh\n" +
            "8d 4s Ac Ad 3c\n" +
            "Jh 8s 9c 5d 4h\n" +
            "As Qh Jc 9d 8h\n" +
            "Qc Kc Qd\n" +
            "4c Qd 2d 4h 5d\n" +
            "8s Th Qc\n" +
            "8c 5s 2s Js Kc\n" +
            "Kd Ts 2s Ah\n" +
            "4s 3d 5s\n" +
            "2s 5c Kd Ad\n" +
            "5s Td 8h Qh\n" +
            "2s Qc 6s 7h Js\n" +
            "8s 5s 3c Ah 2c\n" +
            "Jh 7s 5d 3h 3c\n" +
            "7h 7c 2h Ks Kh\n" +
            "6h Js Qc Ts 3c\n" +
            "Jd 7c Qc 6d\n" +
            "Ts 9s 5h Kd 6c\n" +
            "3d 3h 8c 4h Jh\n" +
            "Ks Qc 3s Th 5d\n" +
            "8d 3h Jd Ts 6c\n" +
            "8d 4s Ah\n" +
            "7c Qs 5d 4c 8c\n" +
            "2c Qc Tc 5d Ac\n" +
            "6d 7c Kh Jc 2s\n" +
            "7h 3s 7c\n" +
            "Th 5h Jh Kd\n" +
            "6d 3c Kc 2d 9c\n" +
            "4h 9h 5h\n" +
            "3c 7c 3d Jd 2h\n" +
            "3h 5h 2s 8s Ks\n" +
            "Ad Td Jc Ks 9h\n" +
            "Tc 2c 7h\n" +
            "8h Js 3d Ad\n" +
            "7d 6h Jc 7s 6c\n" +
            "4d Ts 9c Qs\n" +
            "5d 5c 6h 9h 3s\n" +
            "7s Ah 3s 9d\n" +
            "7s 9d 2s 8d 4h\n" +
            "2c Jh 8d\n" +
            "Ac 8s 2h 3h 7h\n" +
            "Jh Ah 2h Ac Tc\n" +
            "Td Qs 9s\n" +
            "7h 8d 9h 9d 6s\n" +
            "7s Qs Ts\n" +
            "Qh Th 5c\n" +
            "Ac Ah 5h Qc Ks\n" +
            "Kd Kc 5h\n" +
            "4h 2s Ah Jc Jh\n" +
            "Ts 9h 5s Kd Ad\n" +
            "2s Js 6c\n" +
            "7s 8h Td 3d Qh\n" +
            "Ac Tc Qc 3d Jh\n" +
            "4h Js Ad Jc 2s\n" +
            "6c 7s 5s 2d 4h\n" +
            "2s 2h 4c 3c Qd\n" +
            "3c Th 6s 6h Qd\n" +
            "6s 5d 9h Kd 3h\n" +
            "9d 4c Jc 9h Kd\n" +
            "Qd Tc As 8d 8h\n" +
            "Qc 2s 6s\n" +
            "As Ac 6c Qs\n" +
            "9c Kd 2h\n" +
            "8s 6h 3c\n" +
            "7c Ks 6h 7d 4d\n" +
            "4c 5h 4d 2s\n" +
            "5d 5s Qd Ah 6d\n" +
            "Qc 7c 2d\n" +
            "2s Ts 7h Td 9c\n" +
            "Ac 8d 5s\n" +
            "2d 9c 7c\n" +
            "Kh 5c 5s\n" +
            "Qc 9s 3s Qs 4h\n" +
            "Qc Qh Kh 9h 8h\n" +
            "2d 8h Qd 3h Td\n" +
            "9c Qd 2s\n" +
            "Ah Ac Qs\n" +
            "Kd 4s 3h Qd 2d\n" +
            "6d Td 7c 4s 5h\n" +
            "3h 2c Tc 8c Td\n" +
            "4s Td 4c Qd 6d\n" +
            "Jc 9s 4c 3d As\n" +
            "Tc 4s 9d 4c 6h\n" +
            "6d 8s 6h\n" +
            "9s Kh 3h\n" +
            "8s 2c 9s\n" +
            "3d 4s 2d 7c 3s\n" +
            "4d Js 5d 8d 4h\n" +
            "4h 3h Jh 6d\n" +
            "Ac Kd 2d 3s 5d\n" +
            "9s 5c 5d 7d 3s\n" +
            "6d Ad 4s 2s Ah\n" +
            "Qh 7d Ks\n" +
            "9c Ad 9h 3s 8s\n" +
            "Js 8d Jc 5d 3c\n" +
            "6h Js Ks\n" +
            "Qd Qc 5h 7h Ks\n" +
            "Qs 5d 8c 5c 6h\n" +
            "5d Qc Kc 2d\n" +
            "9d 3s Ah\n" +
            "Kc 2h Td\n" +
            "Qh 7s 2h 5d\n" +
            "3c 9c 5h\n" +
            "Th Tc Kc 4s Kh\n" +
            "2d Kh Jc\n" +
            "2d As Kd 8s 9c\n" +
            "6c 6d 8d 7d 9c\n" +
            "6d 3c 6s\n" +
            "3c 5d Kh\n" +
            "9s 5h 2s\n" +
            "2c Kd Td 7h Jc\n" +
            "Ks Jc Ah Ts 9h\n" +
            "Qs 7h 3s 3c 8d\n" +
            "9d Tc 4s Ah As\n" +
            "Kd 7c As Kh\n" +
            "3s 7d Qs 6h\n" +
            "4c Qd Kd 9h 9d\n" +
            "2c Kd 5s Jc 7d\n" +
            "3c 9c 7h 9d Qh\n" +
            "3c 7d Th\n" +
            "Ah Jc Qc 7h Jd\n" +
            "Qd Qs 9d 2h 2d\n" +
            "3h 8d 2h 8s Jh\n" +
            "Ah 9h Kd\n" +
            "Qs Ah Ts\n" +
            "5s Jh Ad 3h 9c\n" +
            "Ad 3h 8h 6s 6h\n" +
            "Qh Qd 3c 7h Ah\n" +
            "3c 4h 3d Th Jd\n" +
            "Js Kc Jh Qc 5c\n" +
            "6s 3h Qc 6d 8s\n" +
            "Jc 7h 5s\n" +
            "3c 8d 9s Jc 3d\n" +
            "7c Qc 5s 9h 2h\n" +
            "Qc 7c Jc\n" +
            "Td 8c 3h\n" +
            "Ts 2s Jd\n" +
            "9d 6d 8d 5d 2d\n" +
            "2s Jd 4d 2c\n" +
            "Ks 7c 4s Td Qd\n" +
            "8s Ts Ac 2s\n" +
            "Js Jd 4d 9s 8h\n" +
            "7s Ah 4s\n" +
            "Td 3h 8s 5c\n" +
            "Jc 3s 6d 7c 3c\n" +
            "Ac Qs Qc 6s 7d\n" +
            "Kh 6d 9d 9c 8d\n" +
            "8s 2s Qd 7s 4s\n" +
            "8c Qd 7c 8s\n" +
            "2c Ah Ts\n" +
            "2d Kc 8c Ad 3d\n" +
            "Js 9s 3s Ks 7d\n" +
            "As Js 4h 7s 3c\n" +
            "8c 4d 7d\n" +
            "8s 6s As 3d 4h\n" +
            "5s Th 2h 7h Qc\n" +
            "5s 9c 8h 5h Qh\n" +
            "As 8h 6d 6c Ks\n" +
            "6s 2d Js Jc\n" +
            "7h Ks As\n" +
            "6c 7h Qs 5c 9d\n" +
            "Qc 9h Tc 6h 9c\n" +
            "Ks Ts 6c 3s 4s\n" +
            "Js Th 6d 5c\n" +
            "4s 6s 8c 8h 7d\n" +
            "5h 3s Td 7s Kd\n" +
            "5s 3d 6d 7h 6h\n" +
            "9d 3s 8c 7c Jh\n" +
            "6h 6s Jh 4d 9s\n" +
            "5s Th 6c 4s 8h\n" +
            "Kd Qs Js 7h Qc\n" +
            "Ac 3s Qh 9c 8d\n" +
            "Jc 2d 4d 2s\n" +
            "Td Tc 9d 8h 2s\n" +
            "4c Tc Ac 6s Jd\n" +
            "8h 2d 6c 5h\n" +
            "5d Qd As 7c Kc\n" +
            "5d 2d 7h\n" +
            "5d 4c Kc 4h Jh\n" +
            "7h 5h Jc\n" +
            "Tc 8s 2s Ks Js\n" +
            "6s 3c 9h\n" +
            "7h Qd Kd Th Td\n" +
            "Qc 8h 5c\n" +
            "4s 6h Td Jd 2c\n" +
            "2c Tc Ah 7h 8h\n" +
            "4s 5s 4c 9d Qh\n" +
            "9h 6c Tc 6s\n" +
            "As 4s Jh 5d 8c\n" +
            "9h 3d 7c 8s 8d\n" +
            "4h 2h 8s Ad 9s\n" +
            "As 4c 7h\n" +
            "9d Jd Ks Qc 7c\n" +
            "8s 9s Ac\n" +
            "6c Qd 8h 7d 9h\n" +
            "Qd Qs 7h 9h 4c\n" +
            "4h Ts 2d\n" +
            "As 9s Th 3s 6d\n" +
            "Jd Qh Ah Ac Ts\n" +
            "Ad Ah 5c 5h\n" +
            "4c Ah Kd 3d Ts\n" +
            "Ad 9s 3s Td 7d\n" +
            "Jd Ac As 9d Ks\n" +
            "Qc 5c Tc 6c\n" +
            "Tc 5h 2h Kd Kh\n" +
            "8c 2d 7c 5s 7d\n" +
            "4c Td Ac Qh 7h\n" +
            "4h Qh Jd Kc As\n" +
            "4c Qc 9h 8d 3d\n" +
            "9s 6s Ah 6d 3d\n" +
            "Tc 4h 4s 8s Td\n" +
            "Jd Qc 2d Jh 3d\n" +
            "Ts 5d 7h Ad 2h\n" +
            "9c 7c Js 2s 9h\n" +
            "Ad 5c 4s\n" +
            "Qc 9s Ad 9h Tc\n" +
            "4d 3d Qs Ah Kc\n" +
            "2c Ts 3c 6h 4c\n" +
            "Tc Ks 8s 5h 5d\n" +
            "9d 2c 8c 5h\n" +
            "Kd 4s 4h 7s Qc\n" +
            "7s 9s Kd 5s Kh\n" +
            "Kd 4h Jd 6s 8c\n" +
            "8s 4c 3d Ks 4s\n" +
            "7d 9d Kc 2c\n" +
            "9c Ad 3c 4d 5s\n" +
            "2s 6d Js Kh 5d\n" +
            "Js Ks 2c 9h 7c\n" +
            "4s Tc Qh Th 4c\n" +
            "9d 7h 3s Qd 3h\n" +
            "7d 4c Tc\n" +
            "5d Ad 3c Qc 3h\n" +
            "Ac 9h 5c\n" +
            "Ks 7s Qd Qs 8h\n" +
            "3d 6c 2h Ts Kc\n" +
            "4c Ad Th\n" +
            "8c 6c Qd 3c 2h\n" +
            "8s 6h 9d\n" +
            "4d Ad Jc\n" +
            "As 9c 5h 4h 2s\n" +
            "7s Ah 7h 4c Jc\n" +
            "8d 7d 4h 5d Qd\n" +
            "8s 7h 6d 2s 8d\n" +
            "9s Jc Td\n" +
            "4d 7d 8s 9s Qd\n" +
            "7d 6c As\n" +
            "4h 9s Qd\n" +
            "5c 6c 8d Th Qd\n" +
            "9h Qc 6s\n" +
            "8h Td 7c Tc Qh\n" +
            "7h 9h 6h 4s 8s\n" +
            "8s 8d 4d Ac\n" +
            "6h 4d Ts 3h 4h\n" +
            "2c Ac 5s Tc Qc\n" +
            "8c Jh 2s 7s Ts\n" +
            "Jd 3d 7s 9d Th\n" +
            "Kd 4c Ac Td Jh\n" +
            "5c 9c 5d Jc Qc\n" +
            "Th 8c 7c 9c 3h\n" +
            "5c 4h 7c 4s\n" +
            "3s Td 5s 4h 9s\n" +
            "2c 9s 5s Qh 4c\n" +
            "5c 3h Td 9h 4s\n" +
            "6h Th 4d Jh Jd\n" +
            "2d Qc 8c 9d 7d\n" +
            "Ts Ac 9s Qd 6d\n" +
            "8s 9h 2d 2c\n" +
            "Jc 9h Ac 6h 7h\n" +
            "4d 8s Ah 6s Kd\n" +
            "4c 6h 5d 9d 6s\n" +
            "Kh 3d Td Qs 6h\n" +
            "Ah Qc 9d 5h 7h\n" +
            "8c 7s 6s 9d 4h\n" +
            "Kd 8s 8h\n" +
            "6h 6c 4d 2h Ad\n" +
            "7c 8s Td 7s 9s\n" +
            "3s Ac 2c 4h 4c\n" +
            "Kc Qd 8h 4s 4d\n" +
            "7d Ah 8h Qh 5c\n" +
            "Jc Tc 5h 7h 3h\n" +
            "9s Qs 5s\n" +
            "5s 6s 3s 2c Th\n" +
            "3h Td Ah 5s 9h\n" +
            "4d As 7s 5h\n" +
            "2h Kd 9s\n" +
            "6s Qc Qd Kd 7s\n" +
            "6c 2h Qh Tc 5c\n" +
            "Js 4d 6s Kh Qc\n" +
            "6s 7h 6c Jh 5c\n" +
            "4d 8h Qs 6d Kc\n" +
            "Kh 9c 7s Ah 7c\n" +
            "As Ac 3c Kc\n" +
            "5s 6h 8h Ks 5h\n" +
            "9c 2c 8s\n" +
            "6h 5c Kc 5d 4c\n" +
            "9s Jh 2c 4s Td\n" +
            "9c Jh 7d As Ts\n" +
            "As Tc 2c Qd 5d\n" +
            "6c Kc 7h 3c Qs\n" +
            "7s 8c Ah 5c 6d\n" +
            "Ks 4d 4s Td Ah\n" +
            "2s Ts Qh\n" +
            "2h 7c Qd 4s Td\n" +
            "2c 3s Kc Jh\n" +
            "7c 6d Qh Ks Ac\n" +
            "5s 3s 8c 8s\n" +
            "Td 4s Kc Qs 8c\n" +
            "3d Kc 3s 6h 9s\n" +
            "8s Tc Ac 9s Td\n" +
            "8c 2s 2d 5c 9c\n" +
            "9c 9d 8d 4c 4d\n" +
            "9h 6d Kd 4d\n" +
            "5h 2h 7s Kc Kd\n" +
            "Th 6c 7h Ac Ad\n" +
            "5c 4s Kh 6c 3h\n" +
            "Jd 2d 3c 8h Js\n" +
            "5s 9h Td 8s 8d\n" +
            "Qc 4h 8c As 7s\n" +
            "Kd Qh 3h Jc Ts\n" +
            "8s 2h 6c Th Ks\n" +
            "Tc Qs 4h 3h 8d\n" +
            "Qc Ah 7h 6s 9d\n" +
            "2s Kc Qd 8c 6c\n" +
            "9d 3d Qc 4c 9s\n" +
            "Kc 9h Qd Qs 6c\n" +
            "Jh Ks 5c 9h Jc\n" +
            "Td 8h 2d Kd 7c\n" +
            "Qs 8s 4c 6c Qh\n" +
            "3h 3s 9d 2s Jd\n" +
            "Ts 3d Td 2h 8c\n" +
            "As 8s Js Qh 3s\n" +
            "9c Qh Kh 4d 3s\n" +
            "5d Jc 7c 4h Ts\n" +
            "3h 6s 5s 2s 8s\n" +
            "9d 4d Ad 6c Jc\n" +
            "Qd 3c Jh Tc Qs\n" +
            "3d 9s Qc Qs\n" +
            "2s Qd Qc 9c 3d\n" +
            "Kc 3s Jc 7c 9s\n" +
            "Ad 9d 7h 2s 9c\n" +
            "4h 5d Jh 8c 6c\n" +
            "2h 4c 9s Ac 6s\n" +
            "6c 3s 9h Qs 4d\n" +
            "Td 9h 5c 4c\n" +
            "3s 3d Jc 4d 7h\n" +
            "9h 7d Ks 6d 6s\n" +
            "8d 4d 2c 3c 7h\n" +
            "8s 5c 3d 6c 7h\n" +
            "9s 7h 4h Ah 6s\n" +
            "7c 8d Kh 3c Jd\n" +
            "Jd 4d 2d 7s 3s\n" +
            "9s 8s 5h 3c 9h\n" +
            "8h 8s 3c Qd 4s\n" +
            "7s 9c Kd Th 3d\n" +
            "4h Qd 6h Qc 8c\n" +
            "8c Td Kd Th 8s\n" +
            "8h Qs Jd Kd Kh\n" +
            "4s 5d 6h 9c 2d\n" +
            "Ts 3d 2c Qs 2s\n" +
            "Js 4s 8s 9d Jh\n" +
            "5h Ks 3h Ts 4c\n" +
            "Kd 6s Qd 4s 6d\n" +
            "6s 4s Kd 4h Jc\n" +
            "7s Ts 4d 9c 8s\n" +
            "6d Jd 4s 6h 7c\n" +
            "Js 5c 4s\n" +
            "Qs Th Ac Ks\n" +
            "Qd Kc Jh 8d 7d\n" +
            "3c Qs 2s 6c Kd\n" +
            "4c 6c Th 2s 2c\n" +
            "Td 7s 5c 2s\n" +
            "7c Js 5d 3c\n" +
            "9d 8s 4d Th Jc\n" +
            "8d 4c 7s 7d 5h\n" +
            "7d Jh Ac 3d Kh\n" +
            "Jd 9c 9d Th Jh\n" +
            "Qc 2h Tc 8h 2c\n" +
            "Tc 2d 9d Kc 6c\n" +
            "Kd 9d 2h 6c 2c\n" +
            "5c 4c Kc\n" +
            "Tc Jd 8h 6s 5c\n" +
            "2s 3h 6d 5d 5s\n" +
            "Qd 2s 9d 8c Ks\n" +
            "2s Qd 3d Ks Jc\n" +
            "4c 3c 4d 2s 7d\n" +
            "9s 4s 3c 2h 6h\n" +
            "Tc 5c Js 9d 2s\n" +
            "Kd As Qs Js 4h\n" +
            "7d Qd 8d 2s 4c\n" +
            "Qc Qh 7c 8h 8c\n" +
            "6h 5s 2s 8h 9s\n" +
            "3s 6h Qd Kd\n" +
            "9s 2s 7c Js 8h\n" +
            "3d 4c Kh\n" +
            "2d 5c 7h 6c 2s\n" +
            "7c 2d Qc Ts 7s\n" +
            "Ks Jh 4h\n" +
            "Jd 7h 8d As\n" +
            "Jd Ks Ah 4d\n" +
            "6d 5h 9s Qc 5c\n" +
            "Kh 3h Jd Qs Ts\n" +
            "Qs Ks 3h Js 4s\n" +
            "2c 5d 9d 4h 7d\n" +
            "3s Ah 7h\n" +
            "5h Qc 9h Jh Jd\n" +
            "4d Th Jc 8c 7d\n" +
            "3h Tc Ah Qs\n" +
            "4s 9s 6d Kh Qh\n" +
            "Ts Tc 4s Js 6h\n" +
            "8d Th Kc 6d Qh\n" +
            "7c Jd 7h 5c 7s\n" +
            "2d 6s 6c 9s Jc\n" +
            "5c 6s 4s 2h Tc\n" +
            "Qh 8s 8c Tc 5d\n" +
            "4s Kh Ks 5h 5c\n" +
            "6s Qc 9s 2c\n" +
            "6s 7d Jd Ts Qc\n" +
            "As 5s 8h 8s Kc\n" +
            "8c 5d Jd 4h\n" +
            "2h 4s 5c 8c 4c\n" +
            "Qs Qc 9d\n" +
            "2d 2s 7h 4h Kh\n" +
            "6d 5d 7c Qs Qc\n" +
            "4h 6s 5d 4s 5s\n" +
            "Ah Ts Qc 2c\n" +
            "6s 7h 9s Ts 8s\n" +
            "Ah Jd 8s 9d 2h\n" +
            "Jc Qd 8h As 4d\n" +
            "Ks 2h 8d Td Ac\n" +
            "4c 3c Th 2c Ac\n" +
            "7s 4c 4d Td 8d\n" +
            "Kh Qs 9d\n" +
            "5d 8d 9c 7d 4d\n" +
            "8h 9c 4d\n" +
            "9d 2d 4s 8s\n" +
            "5s 5d 7h Qs\n" +
            "8c 6h 3d As 4h\n" +
            "5s Th 2h 3h Ah\n" +
            "9s 5h 6s Kc 7h\n" +
            "7c 7d Qc Qs 9d\n" +
            "5s 2c 9s 3h 8d\n" +
            "7s 5d 4s 4d 9d\n" +
            "Td Ah 9s\n" +
            "5d Tc Qc Td 8h\n" +
            "4d 6s 8h 9c 3s\n" +
            "Qd 4h 2s Qc\n" +
            "Qs 4h 8h 9h 4d\n" +
            "Jh 2s 9c 4d 2c\n" +
            "6d 8s Jc 9d Jd\n" +
            "3h 9h Jc\n" +
            "Js Qd 2d Tc 2h\n" +
            "7c Td 5h 6d Ks\n" +
            "2c Qs 2d\n" +
            "9d Kh 3h Th\n" +
            "5s Ks 6c 8d Th\n" +
            "9s 8h 6h Ts 2d\n" +
            "3h 9d Ac Kc 8s\n" +
            "Td 6s 6d Kd 3s\n" +
            "5h 6d Qh Ac 3s\n" +
            "5h 2h 8h Qc 3d\n" +
            "8h 4c Jc 3d 9c\n" +
            "7s Jh Jd 5h 7d\n" +
            "5c Tc 6d Jh Ac\n" +
            "2h Qc 5c 3s 3c\n" +
            "Tc Jd 9d Js 8d\n" +
            "Kh Jd 5h\n" +
            "8h 6s 8s Tc Ad\n" +
            "Ad 4c 6h 2d 9h\n" +
            "Qs 5s 5c\n" +
            "7d 4h 2d Ad Th\n" +
            "2d Qs Qd\n" +
            "9s 5d 3c 4s 8h\n" +
            "Ks Ts 6d 5c Js\n" +
            "Td 7s Qd 8d 2d\n" +
            "Tc 3s Qh\n" +
            "8s Th 7c Kc Qd\n" +
            "3s 5c Qd 5s 2h\n" +
            "4d 6s Ks 4h 6h\n" +
            "Kd 2c 5s Kh 6d\n" +
            "7h 3s 4c Ts 9s\n" +
            "Qc 4s 9s Kc Ac\n" +
            "3d 2h Tc Js Th\n" +
            "Kc Tc 5d\n" +
            "Qs Jc Js 8s 4s\n" +
            "9h 3s 9s 7d Tc\n" +
            "Jh Jd 2h 9d 9c\n" +
            "6s 9s 6d 3d 9c\n" +
            "2h 6h 8h Kd Ad\n" +
            "6d Kh 6s\n" +
            "9d Ts Td 4d 3d\n" +
            "4s 4c 9c Ad 5s\n" +
            "5s Ts 3s 2h 9c\n" +
            "Kd 5d Qs 4s 6s\n" +
            "6h 6d Js 4d Ah\n" +
            "9h 9d Ad Ah\n" +
            "As Jd Kd 5h 3h\n" +
            "3h 2h Kh Tc Ts\n" +
            "4s Kh 2s 2h 6d\n" +
            "Qs 8s 5h 2h 7s\n" +
            "5d Qs 7h Jh Ah\n" +
            "Qd 2s 8s 9d 4h\n" +
            "9s 5h 7c Td 7h\n" +
            "5h As Jh Td Tc\n" +
            "3h 8s Ah 4h 3s\n" +
            "4d 6d Js 9h 6h\n" +
            "2d Qs Kc 7h 8c\n" +
            "3c Qd 7s 9h 8h\n" +
            "2c Ac 2s Jc 7s\n" +
            "9c Tc Kc\n" +
            "9s Th Qc 7c 7h\n" +
            "5d 3c Qh\n" +
            "Th 6s 4d\n" +
            "8h 8c Qh Jd\n" +
            "2d 9c Jd 9s\n" +
            "Kc Jh 4d 6c\n" +
            "6h 9c 3h Tc As\n" +
            "7s 3c 7c Td\n" +
            "9c 4d 3s 8c 9d\n" +
            "9s 3s Ad 5d 4s\n" +
            "Qd 7s Ac 3s\n" +
            "6c 8d 7c 9s Qd\n" +
            "Td 2s Jd Kc\n" +
            "4c 5h 8s Kh 6d\n" +
            "3c Th 6s Ks Jh\n" +
            "5c 7d Ts Td Kd\n" +
            "6d 3c Ah\n" +
            "6c 5d 8h 7d 5s\n" +
            "6c Qh Jh\n" +
            "3s Th 8h 9h 5s\n" +
            "5h 7d 4c Jh Ks\n" +
            "Jd 4h Th 9s 2d\n" +
            "5h Kc 6s 8c 3s\n" +
            "4c Kc 8s\n" +
            "Th Tc 4c Jh 2h\n" +
            "3c Td Jd 4c Jh\n" +
            "8c As 8d 2c Td\n" +
            "Ah 2c 2h Kc 7d\n" +
            "5d Jd 3h\n" +
            "6d 7s 8d Jc 4d\n" +
            "As Kh 3s 8s 6c\n" +
            "Tc 7c Qh Ah 8h\n" +
            "7h 8s 9s Qs 3c\n" +
            "Tc Kc 6h 9c Qd\n" +
            "9h 6h 3h 3d 4d\n" +
            "Jh Qd 8c 6d Kh\n" +
            "Js Kc 9s Qs Ah\n" +
            "5h 6h Th\n" +
            "6d 4s Ah 5h 9c\n" +
            "4h 3s Kh\n" +
            "Qc Qd Kd 3s Th\n" +
            "4h 2d Th 5h Ks\n" +
            "Qd 4d Jd\n" +
            "6c 4d Kc\n" +
            "Ah Th Ad\n" +
            "5c 5s Jd Ah 9d\n" +
            "Ac 6d Th Td 8s\n" +
            "Tc Qd 3h 9s 5s\n" +
            "Kd 9d As Td\n" +
            "9s Jc Qc Tc 2h\n" +
            "3s 9d Kc Ks 6d\n" +
            "9s 8h Jc Kh 4d\n" +
            "8s Th Qc\n" +
            "7s 4h 6c 3h\n" +
            "8h Td 4s 7c 7d\n" +
            "5h 3c Qh As\n" +
            "Kh Ac Qs\n" +
            "6s Qd 8s\n" +
            "Td 4h Kd\n" +
            "3d Ks 9s\n" +
            "6c Ad Jh Th 7h\n" +
            "5d Jd 6c 3s\n" +
            "5h Qh Jd 8c\n" +
            "7d 6h Kc Jd Ts\n" +
            "3h Ts 3s 4c 8s\n" +
            "Qs 4s 9c 7s Ts\n" +
            "Js 8d 3d Kc 6s\n" +
            "Qd Ad 7s 7c 4c\n" +
            "4d 5s 7d Th\n" +
            "Kc 5h 5s\n" +
            "3c 6h As\n" +
            "4s Qd 8h\n" +
            "Kc 9h 5h 7c 6d\n" +
            "8d 4h Td\n" +
            "2c 6d 4h\n" +
            "Ac 4c Qs 3d 2d\n" +
            "9d Qc 7d\n" +
            "2h 5h 3d 7s Kd\n" +
            "5c Js 6s 3s Td\n" +
            "4s 5c 3d Ts\n" +
            "8s Ad 6s Qh 2c\n" +
            "Kd Ts 8d\n" +
            "2h Kh Th 9d Ks\n" +
            "6s 9c As\n" +
            "3c 8h 8s\n" +
            "8d As 3h\n" +
            "Qh 7s 8h\n" +
            "Td 4d 2c 4h 8c\n" +
            "2h 2s Tc 3c Qd\n" +
            "As Kd Qs 9c 7c\n" +
            "6h 4h 9d\n" +
            "Th Qh 4d\n" +
            "2d 5h 8s Jc 7s\n" +
            "Kd 9s 9d 6h Ad\n" +
            "7d 5s 9h\n" +
            "8h Qs 2c 2s 9s\n" +
            "As 3h Kh Jc Jh\n" +
            "3d 8c Kd Tc Ad\n" +
            "4h Jd 6h As 9d\n" +
            "Td Ks 6h\n" +
            "6h Qh Qd 2h Ks\n" +
            "4d Qs Ah Kc 3d\n" +
            "Ac 2d 3h Qc 6h\n" +
            "5s Qd 2c 7c\n" +
            "Th 4s 9s Jc 4c\n" +
            "Ah 9h Jh 3s Td\n" +
            "As 9s Qc\n" +
            "Ad 9d 4s Ks Qc\n" +
            "8h 4s 5s 4d 9c\n" +
            "8h Ah As\n" +
            "Jh Kh Td 8h 7c\n" +
            "8h Td 8d\n" +
            "9c 3s Td Qc\n" +
            "5c 4c 5h 4h Qs\n" +
            "Qc 9h 9c 8s 2h\n" +
            "3h 5s Ts\n" +
            "9d 6s 7h Kh 2h\n" +
            "6h Jc 9h Tc Ts\n" +
            "7c 7h Ac 3c 5d\n" +
            "8s Td 7c 3d Kc\n" +
            "Ac Qd Ah 4c Kc\n" +
            "Kc 5d 4c 2s 7s\n" +
            "3h Qh As 4d 6s\n" +
            "9d Jc 3d 5h Js\n" +
            "Ts 5s Ah 2h 2c\n" +
            "Kd 3d Tc 9h 9c\n" +
            "5s 2h Qs 3h\n" +
            "Qh Qs 7d Jc 8c\n" +
            "Kc Jc 6s Qs Js\n" +
            "9c 3s 4d\n" +
            "Ad Jd 2h Qh 4c\n" +
            "Qs Ks 6c Qd 4h\n" +
            "4c 6c 3h 5d 9h\n" +
            "Jd 6c 6d 4d 2d\n" +
            "6d Jh 2d Kh Ah\n" +
            "Tc 8h Jc 2d 6c\n" +
            "As 3h 6d 4c 2c\n" +
            "5d 4c 5h Qh\n" +
            "4h Qh Ah Qs\n" +
            "Tc 9h 3s As 3h\n" +
            "Ac 3h Jd\n" +
            "Jh Td Ah Qc 4s\n" +
            "3c 5s Qd Js Jd\n" +
            "4h Ts 9d Jc Jh\n" +
            "5h 7d 4h 7h Jh\n" +
            "Ac 9d 2d\n" +
            "Td Jc Kc 5h 9h\n" +
            "Ks 8d 7c\n" +
            "5s Td 8d Th Jd\n" +
            "Th 8h Ad 2c Js\n" +
            "4d 9d 4s Jd 2d\n" +
            "4d Qs Td Ts 2s\n" +
            "8h 3c Kc Qd\n" +
            "Ts Kc 2d 7s Tc\n" +
            "8s Kc 4h Td Ks\n" +
            "Tc Ac Ah 9s Jd\n" +
            "3h 7d Jh\n" +
            "3c 8c Ah\n" +
            "7c Qc As Kd 6h\n" +
            "5d 6s 6h Ah\n" +
            "8d 7d 7s Qh 3d\n" +
            "2d 4c 8h 8s Kc\n" +
            "Jd Kc 6c 9d 2d\n" +
            "2s 6s 3c 7h 5d\n" +
            "9d Kc 2c Qs 3c\n" +
            "6c 7c 9s Jc 2s\n" +
            "4d 9d 5c 2s\n" +
            "Jd Ac 8d 4d 9h\n" +
            "Ad 6d 8s Jh 4c\n" +
            "5d Kd Jh 8h 9d\n" +
            "6h Jh Jd Qh 2c\n" +
            "4s 8c 6h Jd 9s\n" +
            "6s Jc 8d As 9d\n" +
            "8c 4h Tc 9d 9h\n" +
            "2s 3d 6c 5c\n" +
            "8c Ah 5c 7h Jh\n" +
            "9c Ts 3c 5d Jd\n" +
            "8c 9s Ks Qs 6d\n" +
            "5c 6c Js Ks 6h\n" +
            "3s Ts Jd Js Jc\n" +
            "As 4c Kd 8d Qc\n" +
            "7c 8d Jh 7d 6c\n" +
            "Jd 8c Qs Ac 5c\n" +
            "Qs Js 8h\n" +
            "Qs Ad 6h Jd Kh\n" +
            "5d 8d Qh 3s 3h\n" +
            "Kd 5s 2h Jh 4h\n" +
            "9s 5d 8s 3c 2h\n" +
            "8h 2c 4h 4d Ad\n" +
            "2c Ts Js Qs 8h\n" +
            "5c 2d 5h 6h Qh\n" +
            "Ac Qh 3h Kd 5s\n" +
            "Qd As 7s 5c 2d\n" +
            "Kd 7d 5c 7c 5s\n" +
            "9s 4d Ah 8s\n" +
            "Ac 3d 2c 5d 5c\n" +
            "9h 5s 2c 8h Js\n" +
            "7s Qs Ad 3d Jc\n" +
            "8c 6d 4h 6h As\n" +
            "4h 8d 3d\n" +
            "Ah 7c 9h 7d Tc\n" +
            "Ad 7c Ks 2h 5h\n" +
            "Kd Qh As 7d Ts\n" +
            "4c 7d Ts 2d\n" +
            "5s Js Ah Tc Kc\n" +
            "Ks 5h Qd Tc 5s\n" +
            "5h 8d Qh 2c 8h\n" +
            "4d 2s 6h 8c 2h\n" +
            "Ac 6s Qd 5c Qs\n" +
            "Qc Ac Qs 6h Ts\n" +
            "Js 3d 7h Jd Jh\n" +
            "4d 3s 9h 7s 3h\n" +
            "4s 7h 7d Jd 7c\n" +
            "6h 3d 5h 9c Kd\n" +
            "Ad 5s 9d 4d Tc\n" +
            "Qc 7h Ts Th 8d\n" +
            "3d 8h 4s 4h As\n" +
            "Jc As 3c Qh Ks\n" +
            "7s 2d 2h\n" +
            "9h Kh As Jd Js\n" +
            "9h Qh Ts 2h Tc\n" +
            "5c 2c Kc Qc 4s\n" +
            "7c 9c Jh Ah 5h\n" +
            "6h 7s 3c 4s Js\n" +
            "4c 2c As Ad 7c\n" +
            "5s 8s Qc Jh 8h\n" +
            "Td 5c 6d 9d Ac\n" +
            "8h Kc 6c Qs 2s\n" +
            "Jh Ah Ks 3d Ac\n" +
            "Qh 9s Kc\n" +
            "Qs Ac Kc 6c Qh\n" +
            "2c 4s 4d 7h 2s\n" +
            "Kh Js Kd Ad 5d\n" +
            "4s 2c 9c Qd 8c\n" +
            "Jh 2c Kd 6c\n" +
            "Qc 7d 8h 8d Qh\n" +
            "Qs 6d 2d 9d 8d\n" +
            "4s 9c 5h Td 5d\n" +
            "4h Ts 3s 2d Kc\n" +
            "Jd 3c 2s 7d Qc\n" +
            "Jd Ts 9s Kh 3c\n" +
            "Th 5h 5c 2d Qc\n" +
            "Ks 6s 9h 6h Qs\n" +
            "6s Ts Ks 5c Jd\n" +
            "3s 5d 7h 5s Jd\n" +
            "Js 6c Ac\n" +
            "Js Kd 5h 2d Ts\n" +
            "5h Jd Jh 4h 3h\n" +
            "Qh 9d 4d 8d Ts\n" +
            "Tc Ts Ah 7s 5h\n" +
            "9c Th Ah 2s 8h\n" +
            "4s Jh 7c Kd 7s\n" +
            "Td Kd 6d As Jh\n" +
            "Ac Kh Ah\n" +
            "7s 3d 7h Jh 4h\n" +
            "4c 5h 8h 6d Th\n" +
            "9s 7h 5s 6d 2h\n" +
            "Qs 3d 7s 6d 2d\n" +
            "6s 6c As 3h 7c\n" +
            "8d 4d 9s 3s Js\n" +
            "7h Qs 2d Ad 3c\n" +
            "2c 5c Th 5h 8c\n" +
            "Jd 7d Tc 7c 5d\n" +
            "5d 4d 8c Ts Qc\n" +
            "Kh 7h Ad 6c 5h\n" +
            "Ac Jd Qh 9c 7d\n" +
            "Th 9d Kc 3s 2c\n" +
            "Kh 7h Jc Qc 3h\n" +
            "6d 5c Ts 5s 4h\n" +
            "2d 7s Ah As Kh\n" +
            "4s 3d 7d Js 5h\n" +
            "Jc 3c 4c 5h Jh\n" +
            "7c Jh Ad 2c 6d\n" +
            "Ad 6s Ah 7c 4s\n" +
            "Tc 5h Kh 2h 8s\n" +
            "Qc Qh 5s\n" +
            "Jc Kh 5s 8d 3h\n" +
            "Jc 7h 7d\n" +
            "3d 8d 7d 9s 8h\n" +
            "3d 7s 7c 9h Jc\n" +
            "3h 9d 3s Jh As\n" +
            "Qs Td 4s Kc 8c\n" +
            "Ah 8s Jd 7h 4d\n" +
            "4h Jh 2d 4c 6c\n" +
            "8h 6s Kh Qs 4h\n" +
            "Ad 2d 5d\n" +
            "2s Kh 8s\n" +
            "7c 2c 8d 3h 5s\n" +
            "Ts Ah 4h 6c\n" +
            "6d 7h 5s 4d\n" +
            "8h 4s 7h Th Kd\n" +
            "Qh Jh 7h 8h 7d\n" +
            "6c 4d Jd Qc Kc\n" +
            "Kh 3h 6c Ad 7c\n" +
            "7c 6d 7h 5c 8c\n" +
            "9s 5s Kc 7s 2d\n" +
            "6h 7d 8d 2d\n" +
            "2h Ts Qc Qd 9d\n" +
            "Ad 7c Qd 6h Ac\n" +
            "2s 8d As Kh 9c\n" +
            "2s 8h Qd 6h Kd\n" +
            "9h 3h Qs 8s 5s\n" +
            "9c 7s 4h Kd 8d\n" +
            "6h 2h 2d Td\n" +
            "8c Qc 6h 3c Jc\n" +
            "Kd 5d Kh 5s Ad\n" +
            "2d 4c 9h 8h Jd\n" +
            "6c 7d 7s Ac 9h\n" +
            "2c Js 3h 5s 6h\n" +
            "6s 7c 2c Qh 5c\n" +
            "Qs 7s 2c 9h 7h\n" +
            "Ks 4d 7d 3d Qc\n" +
            "9s 8s 6d 9h 2c\n" +
            "2h Kc 2d Ts 7h\n" +
            "Kd 2d 7c 4d 9h\n" +
            "Jd 6h 2h 8d Ts\n" +
            "Ac 5h 3h 7d Qc\n" +
            "4h 5s 9c 6c Th\n" +
            "Ah 4c 6h 7h Qh\n" +
            "5s 8h Ks\n" +
            "6h 4c 9h 5d\n" +
            "7d 7c Ad 2h Jh\n" +
            "4c Kd 9d 3c 4d\n" +
            "3h Jd Qs 5d\n" +
            "9d 9s 5c 8d\n" +
            "2h 3h Kh 6s Th\n" +
            "Kh 5c 4h 4c Qh\n" +
            "Ac 3h 5s 3d Ts\n" +
            "Ac 6c 8h\n" +
            "3d Jh 8c Th Qc\n" +
            "Tc Kc 2s Ks 4c\n" +
            "8d Th Qc 3h 3s\n" +
            "Qh Js 7h 5h 9d\n" +
            "Qd 2s 8d Ac Ts\n" +
            "2h 9s 6d Ac 5h\n" +
            "4c 8c Jc 5s 6c\n" +
            "Jc 7c 5h 7d Ah\n" +
            "3h Ad 8c\n" +
            "Kd 4c 9c\n" +
            "Jc Kh 2h\n" +
            "Jc 4h Tc\n" +
            "3c 3s 7c 3d 6d\n" +
            "6d Qc 2s 7h 3c\n" +
            "6h 3c Tc Kd\n" +
            "9h Jd 5s 4s 2s\n" +
            "4h 3c 8c 5s 7s\n" +
            "Tc 2c Kc 5c 8d\n" +
            "8d 4c Ks Js Kh\n" +
            "8c Tc 2c 2h 7h\n" +
            "8h 8d 7h\n" +
            "8h 7c Ks Jc 5c\n" +
            "2c Ad Qd\n" +
            "3h Ah 2h 9s Kc\n" +
            "7c Kh Ah\n" +
            "4d 5h 4c 5c\n" +
            "Kd 9c Ad\n" +
            "Tc 9s 5c 2d\n" +
            "Ks Th 9d 3d 2d\n" +
            "Th Ks Ad 7c\n" +
            "2c 2h Jh\n" +
            "Td 5s 4h 9c 6c\n" +
            "8h 8d Tc\n" +
            "2c 5h 4h Jc 9h\n" +
            "2c 4s 7h\n" +
            "9c Ac 7d 4s\n" +
            "7h Kh 4c 6c Js\n" +
            "7s 2h 3c\n" +
            "Ks 5h 9d 3d 6h\n" +
            "3d 9d 3c\n" +
            "Kc 5c 6h Td 5s\n" +
            "3h 6h 7s 7h 2s\n" +
            "Jh Kh Ac\n" +
            "Qs 3c 8d 3s Jd\n" +
            "2c 5d 8s 6d Kc\n" +
            "Ac Kh 7h Jh 5s\n" +
            "5h 4d Kd Qd Jh\n" +
            "7h 4c 7c Kc Js\n" +
            "2d 8h 7d 4h 4c\n" +
            "Jc Qs Js 2s 4s\n" +
            "Ad 6d Th Jd 2s\n" +
            "9c 3c Jc\n" +
            "3c 7d 3s 4h 4s\n" +
            "Ts Ks 4c Qd 5s\n" +
            "2s 9s 2h Kh As\n" +
            "Jd Td 6c Ks 7s\n" +
            "Tc Kd 4h 9c 7s\n" +
            "5h 8s 7c Qh 2s\n" +
            "2s Ks Ad\n" +
            "Ks 3s 8s Qh 5s\n" +
            "5s 4h 5c Ts As\n" +
            "Th 4c Ah Td 4d\n" +
            "9s 7s 5h Th 6c\n" +
            "Qd Jd 6c Kd 3h\n" +
            "9c Ad Th\n" +
            "3h 7c 8s 6d\n" +
            "6c 5d 9d 5c Js\n" +
            "Ks 8c 9d\n" +
            "4d 2s 7h 2d Qs\n" +
            "3c 4d 8c Ac Tc\n" +
            "7c 5d 6d\n" +
            "Ah 5h 9d 7c As\n" +
            "8c Jh 6h 7d Td\n" +
            "Qs 7s 6d 4d 8s\n" +
            "9s Kc 9d 7s\n" +
            "4s 9d Kd 6h Jh\n" +
            "3d 9s Jh Qs Js\n" +
            "3s Js 6c Jc\n" +
            "6c 8s 3s 2h Kh\n" +
            "Ts 4s Ah 6h 8c\n" +
            "7d 4c Jc Ts Jd\n" +
            "Jh Ad 2h 8d 9s\n" +
            "Kc 7s 4d Tc Ac\n" +
            "3d Ts Qc 9h 7s\n" +
            "2d 3c Qd Ks 8d\n" +
            "2c 5s 3s As Jc\n" +
            "Jh 5h 8h 3d Ac\n" +
            "7c Kh Jc\n" +
            "9c Tc 3d 3s Jd\n" +
            "7c 4c 5c 9c\n" +
            "3s 8c Tc 3c As\n" +
            "2d Qc Qh 3c\n" +
            "2h 9c Qh 5c Qc\n" +
            "5d As 9h 8d Ah\n" +
            "Th 8c 7s As 2h\n" +
            "Ac 9h Qc Jd Jh\n" +
            "2s 4c 7h Js 8s\n" +
            "7s 5c 9d 3s As\n" +
            "Js Qd 8h 4c Qh\n" +
            "4s Jd 3d 9d 8c\n" +
            "7h Ks Jd Qh Ah\n" +
            "Td 6s 9d 8d 6c\n" +
            "Ts 9s Tc Qh 8d\n" +
            "6s 8h 3d 2s 7s\n" +
            "9s As Ac\n" +
            "Ad 7c Jc 2h Qh\n" +
            "Qd 5s Js 3h 2s\n" +
            "7h 2d 8c Tc Kc\n" +
            "9c 5d 8h 2h 7s\n" +
            "4d 5c 2s 7h 6c\n" +
            "Td Ac 7c 8s Ad\n" +
            "Ah 3s 8d Tc Qc\n" +
            "Qd 4d 2c 8h\n" +
            "Ks 4d 7h\n" +
            "7c 6d 8h 5h 6s\n" +
            "3h Qh 2s Js 8h\n" +
            "8d 9c 5d Kd\n" +
            "Ah Ac Td 8c Js\n" +
            "5c 3c 4h Kh 3h\n" +
            "Kc 9c Td 3c 9d\n" +
            "8s Ks 2d 5d 6d\n" +
            "Th Ah 9c 9d Jh\n" +
            "As Th Jc 2c 3h\n" +
            "Th 3s 4c 4h Qh\n" +
            "8d 3h 9c\n" +
            "5s Jh 6d 5d 6s\n" +
            "Qd Kc Js Ah 9c\n" +
            "Td 5c 6s 9h Kd\n" +
            "6h 4s 3s Qh 2s\n" +
            "Ks 9s Jd 4s 7s\n" +
            "Kc 6s 2s 6d\n" +
            "8h Ac 5h Tc 4s\n" +
            "Kh 9s Jd Qs Th\n" +
            "8d 9c 5s 3c 6s\n" +
            "Qs Qc As 8c\n" +
            "As 9d 2c 5d 9s\n" +
            "Ks 4s 9c 6s 6d\n" +
            "Qc 8c Kc Jc 6d\n" +
            "4h Kh 2h Kc 7c\n" +
            "5s 9h Ts 4c 7d\n" +
            "5h Qd 9h Qs 8c\n" +
            "2s 7d 8d As\n" +
            "9c 7d 7h Ah 3d\n" +
            "8h Kc Ts 8d 2s\n" +
            "6c Kc 2d 9s Kh\n" +
            "9c Ac Js 6s Jd\n" +
            "9d 7h 9h 6c 8s\n" +
            "Kh 2s Ts 3c 3s\n" +
            "3d 3h 9c 2s 7c\n" +
            "2s 3s 4s Qs As\n" +
            "3c As 5h 9c Kd\n" +
            "8c 6h 7s Qs Jh\n" +
            "Ah 9d Jc Ks As\n" +
            "Js 5h Jh 7h As\n" +
            "Td 9h 3s Js 2d\n" +
            "7d 8d 6h 4d 2s\n" +
            "3c 7c 8h 4c Qd\n" +
            "Kh Ad Th 4c Ks\n" +
            "9h 8h 2s Ad Js\n" +
            "7c 5c 6s Kc 6d\n" +
            "Qc 3d 8s Jd 7h\n" +
            "Js 4h Ah Td 2c\n" +
            "Ac 9c Ah Td 5d\n" +
            "7c 3d Ks Kc 8h\n" +
            "8h As Qc 3s 8c\n" +
            "Ks 9c 4c 9s\n" +
            "9s Kd 4s 2h Ac\n" +
            "Td 3h 6d Qd 6s\n" +
            "Th 6h 6s 5h Ts\n" +
            "Ks 7c 3d 8c Qs\n" +
            "8h 4c Ad 8s\n" +
            "Qd Tc Jh 2h Ac\n" +
            "Kd 2c 7d 3d Td\n" +
            "8c 5d Kd 2d 6s\n" +
            "7d Qs Td 5s 6s\n" +
            "Qc 4s Jc 2h 8h\n" +
            "Ts 6d Jh Ac 4c\n" +
            "2d Qs Jc Kc Ah\n" +
            "6s 8h 6h As 6d\n" +
            "9h 3c 9s Th 6d\n" +
            "Qs 8h Ah 3c 3h\n" +
            "6s 7s Th Kh 9h\n" +
            "6h 5s As Jc 9s\n" +
            "6s 3d 5s\n" +
            "9c Jd Ah 8d 9d\n" +
            "Ah 7c 6d Ts 2d\n" +
            "6c 5c 6s 2c Ac\n" +
            "4s 6c 3s Ah 3d\n" +
            "4d Kc Tc 3s 3c\n" +
            "4s Qc 6d Ad Ks\n" +
            "Ad 9d 6d Qd 2h\n" +
            "4c Ah Ac 4h\n" +
            "6d 6c 2h Ad Th\n" +
            "Ad Ks Jd 4c Kh\n" +
            "4h Kc 9h 7d Qs\n" +
            "Th 3s Js 2h 7c\n" +
            "7c 2c Ks 4h 3c\n" +
            "7c Ks Jh Qh 4s\n" +
            "6h 6s Ah 5s 7s\n" +
            "8h 2c Th 9h 6d\n" +
            "9h 4h Qd 2d\n" +
            "2s As Ad Ts Ah\n" +
            "3h Th Js 7d 6s\n" +
            "4c Ac Ad 5s\n" +
            "8h 3h 4c 7c 2c\n" +
            "Ah As Jh 2s 7d\n" +
            "3c Ks 3d Jd Ac\n" +
            "8h 8c 7d Qd 2c\n" +
            "Ah 7d 8c 2s 9h\n" +
            "4s Tc Qh 2c Ks\n" +
            "6d 2c 3s 7c 8d\n" +
            "4h Kc 6h As Qs\n" +
            "Qs As 2c 3s Ah\n" +
            "Kc 6s 7s As 7d\n" +
            "Ks Qd Jc Tc 8d\n" +
            "6s 4d 7s 8c 9d\n" +
            "8h Qd 5h Qc 9h\n" +
            "8d 7s 6s Kc Jh\n" +
            "4c Th 3s 5h Qs\n" +
            "Kd 4d 2d 8d 3c\n" +
            "4h 2d 2s Ac\n" +
            "8h As 5d 6s 4h\n" +
            "Ah 5d 2h 8h Ks\n" +
            "Js 8s 9h Ks Ah\n" +
            "Jh Qd 4c As 8h\n" +
            "Qd 3h 8d 9s Kd\n" +
            "Qs 5c Ts 6c 3s\n" +
            "Ks Kh 3s 6d 5c\n" +
            "6d 3h 7s Th 6c\n" +
            "9s 6h 3c Jh 6s\n" +
            "9s 8h Ts 6h 3c\n" +
            "3c Jc 5s 7s Ks\n" +
            "7d 4s Ac 7s 9c\n" +
            "6d 6h 2h 2d 7c\n" +
            "8d 4d 6c Kc\n" +
            "8d 4h 9s Kh\n" +
            "7s 5s 3c Ts Js\n" +
            "8c 4c Qs Kc 9d\n" +
            "2c 8c Qd Th 4s\n" +
            "7h Ah Qh 5c Ts\n" +
            "6d Ad 3d 5d 6s\n" +
            "Qd Ts Kh 8d 4s\n" +
            "6c Ad 8s 7h 4d\n" +
            "Td 8c As Jc Js\n" +
            "7c 6d 3h Ah 6h\n" +
            "2c Td Jd 2d 3h\n" +
            "Qh 8d 6h 2h Ts\n" +
            "5s 7s 2h 7h 3s\n" +
            "4h Ts Kc Kd Ac\n" +
            "6s Ks 9s 2s Ah\n" +
            "7h 6h Ts 3s Ks\n" +
            "4s 4c 7h Kh\n" +
            "7h 7d 4d Kh Js\n" +
            "4c 9h 4h 3c\n" +
            "5h 7c 4s Ad 5d\n" +
            "Jc 7h 9d 4h Jh\n" +
            "Ks Qc Jh Ad Td\n" +
            "3h 9c 4d 3c\n" +
            "4s 4c 9d\n" +
            "Jd 8d Qh 2d Qd\n" +
            "6c 5h Qh 9c 8h\n" +
            "6c 7c 4d Js 2s\n" +
            "Ks Th 3d 3c Tc\n" +
            "Ah 8d 7d 5h 2d\n" +
            "2d 2c Ac 7d\n" +
            "8s Th 2d Qh 3d\n" +
            "2h Js Jh Qs As\n" +
            "8c 2c 3s Ts Qc\n" +
            "Jc 7c Qh 7d\n" +
            "9d 4h 6s Qs Js\n" +
            "3s 5d 9c Th Kh\n" +
            "8c 7d 4h 2h 8s\n" +
            "6d Ad 4s 7c Th\n" +
            "Kh Ks Qd Jc 3c\n" +
            "4h Jc 8s 4s 9d\n" +
            "Qd 8s 6s Ah 3c\n" +
            "4s 2s Kc 8s\n" +
            "2h 9s 3d Kd 9d\n" +
            "6h 9h 6s Ks 6c\n" +
            "3c 4d 7s Qd 2s\n" +
            "3c 8d Qs 8c Qc\n" +
            "9d 2d 8c Jc Th\n" +
            "2s 5s 9s 8s 7c\n" +
            "Tc 8c 2d 5d\n" +
            "9c 7d Kh Qs 8c\n" +
            "Td 8h Js 7s 4h\n" +
            "3d 4h 7s 2d 6d\n" +
            "Ad 3d 6s 8s 9h\n" +
            "3h Qh 8s 5d 4c\n" +
            "3h Ts Js\n" +
            "Kd Ah 2h 8d 7d\n" +
            "Jc Kh As\n" +
            "As 8h 7h\n" +
            "8s 4d 9c 7h 4h\n" +
            "4c Ah Js\n" +
            "3h Ts 3d Tc\n" +
            "3d 6s 2d 5h 4h\n" +
            "Th 3d Qc 8h\n" +
            "Qd Td 4d Jd\n" +
            "2c 7h Ah 5s 8d\n" +
            "Th As 6s\n" +
            "8h Jh 2c 8s 2h\n" +
            "4d Kh 3s 3h Ah\n" +
            "Ac 6d 4c\n" +
            "4d Js 7c Qc\n" +
            "6s 4s 2s 3c Kd\n" +
            "5h Jd Qc 9s Ks\n" +
            "Th 2d 7c 9d 8h\n" +
            "3s 2d 9c 7h 5c\n" +
            "Ah As 8h 9h 5h\n" +
            "6c 6d 4s 4d\n" +
            "Kh 4h 3c Jd 6d\n" +
            "6h 6c 3s 6s 7d\n" +
            "5c Qs Ks 8s Jc\n" +
            "Th Ks 2d Tc 8d\n" +
            "Tc Js Ah 3d 2h\n" +
            "Ks 8c 8d Tc Ad\n" +
            "Ts 8c 9d\n" +
            "4s 9c 6c 8c Kd\n" +
            "Tc 9h 5d\n" +
            "5d 6h 8d Kh\n" +
            "Qs 8d 2h Ah 9c\n" +
            "9s 3h 3s 7c Jd\n" +
            "3d Td Kc Jc Jd\n" +
            "2s 8h Qd 7s Qc\n" +
            "8h Ts Jc 4s 2s\n" +
            "Qs 5c Ad 4d Jc\n" +
            "7d As 2h\n" +
            "8s 8c 2c Tc Kh\n" +
            "5h 8c 6c Ac Jc\n" +
            "Jd 5d 7d 7h 3d\n" +
            "9h 2h 2s 4h Kd\n" +
            "7c 8s 5s Ad 9d\n" +
            "Kh Js 8h 2h 5c\n" +
            "6c Qh 9c Qd 2h\n" +
            "3c 9s Ts\n" +
            "7h Kd 6c 5s\n" +
            "6d 2h 7s Ah 2c\n" +
            "Qd 9h 3h Ts\n" +
            "Qc 9c Ts Qs Jd\n" +
            "2c 3c Td 4h 9s\n" +
            "Jc 8c Qs Tc 3s\n" +
            "6h Jh 8d Ts 2h\n" +
            "6d 3h Kd Ts 4h\n" +
            "4h 5h Ac 3h 5d\n" +
            "8h 9c Ah 4h Js\n" +
            "Qs 7s Tc Kd Td\n" +
            "2s 7c Ks 5c Jc\n" +
            "3s 4h Ks Js 2s\n" +
            "7s As Qc 6d Ac\n" +
            "5d 6s 5s 7h 2s\n" +
            "Kh 2h Js 9d 6d\n" +
            "2c Qc 8c 7d 7c\n" +
            "Ts Qs 3c 3h 8d\n" +
            "6h 7h 4h 8s 9h\n" +
            "5s 2c Qh 7s Qd\n" +
            "2s 5s Ah Jh\n" +
            "4c As 9c 4h 4d\n" +
            "Ks 9c 7d 3h 4s\n" +
            "Qc 3c Th\n" +
            "Ts Qc 6s 4h 2s\n" +
            "2h Kc Th Ts Tc\n" +
            "Kc 6h 5d 7d 9d\n" +
            "2h 4d 9c 5s Kh\n" +
            "Qc 3d 8c 4d 3h\n" +
            "Kc 5s Kh 4c Qh\n" +
            "9s As Kh Js 2d\n" +
            "3c Ad 8c 4s 7s\n" +
            "Td 7d 4s As Kh\n" +
            "5s Th Kd Td 7h\n" +
            "8h 3c 2s 8d Qc\n" +
            "4c Qd 5s 4s Kh\n" +
            "6d Ks 3h 9d Kh\n" +
            "2d 5d 4c Ks 2c\n" +
            "Td 8s 9c 2s Jh\n" +
            "4h 2d Jc\n" +
            "Ah Tc 6s 3s 7s\n" +
            "Jc Kh 5h 3c Kd\n" +
            "Ah Kc 5c 7d Kd\n" +
            "9h Kd Jh 8c Qd\n" +
            "Td Qc Ts Kh 2s\n" +
            "2c 9c 4c Kd 4h\n" +
            "8h 8c Th Jd\n" +
            "5h Js Tc 7s\n" +
            "9d Ac Th 7h 9s\n" +
            "8h 5s 8s Qc Kh\n" +
            "9c 3h Qd 6d Jd\n" +
            "Jd 4c Kd Kh 5d\n" +
            "7c 2c 9d 4c 8c\n" +
            "2h Td 5c 7d 6d\n" +
            "3s Ts Jd 7c 5d\n" +
            "2s Th 3s Qs 4c\n" +
            "5h 9h Ac 7h 2h\n" +
            "3s 7d Th Ac\n" +
            "As 4d Qs 5c Qc\n" +
            "9d 5d 5s Kd 9h\n" +
            "Qd Kh 9d Jd\n" +
            "8h 3h Ad\n" +
            "6s Qc Kd 5c Ac\n" +
            "Ad 9c 3s Kh 6d\n" +
            "6s Jh 7s 8h 2s\n" +
            "5h 6s 2c Jh 9h\n" +
            "7s 8d Ac 9d 6s\n" +
            "6d 9d Ad 4c 9c\n" +
            "2c As Qh Jh Js\n" +
            "Kd 8c Jc 2h Th\n" +
            "6s 9s 9c Jh 8d\n" +
            "9d 7c 2c 6c 3s\n" +
            "8h 5h 6c\n" +
            "6c 3h 6d Kd Jc\n" +
            "4h Jh Ts 4c 8s\n" +
            "6s 5d 8s 8d 8h\n" +
            "6d Js As 6s 4h\n" +
            "5c Kc Qh 9c 7s\n" +
            "6h 7c 4d Js Ts\n" +
            "8s 9h Jh 5h 2c\n" +
            "9d As 9s 2s Ah\n" +
            "Jc 9d 6h Td As\n" +
            "3d Kc 2d Kh 5h\n" +
            "Ks 6c As 5c Qc\n" +
            "Kc 6c 8d 9c 9d\n" +
            "Ac Td 6s 3d Qc\n" +
            "Qc Kc 9s 5h 3c\n" +
            "Ah 6d 2d 9c 5h\n" +
            "8h 2h Jd 3h 3c\n" +
            "3s 3c 5s Ah 9s\n" +
            "5c 6s 3d 8c 7d\n" +
            "4d Jd 7c 2c Jh\n" +
            "5h 2h Jc 6c 4s\n" +
            "9h 3h 5d 5c Qc\n" +
            "8c Qc Th 3c Qs\n" +
            "2c Jh 6s 4c Qs\n" +
            "9d 3c Tc Ah 2d\n" +
            "Ah 3h 4s\n" +
            "8s Td 7h Qs 5h\n" +
            "5s 3h 8s 2h 6c\n" +
            "2h 6h 5s 5c 3s\n" +
            "Kh 2d Jh Qd\n" +
            "Ah 2c 6h 5s 4s\n" +
            "Jd 8s Ts 7c Jc\n" +
            "9h Th 3c 9c Qh\n" +
            "7s Tc Js 2c 3d\n" +
            "8s 6s 4d Ah 5s\n" +
            "Ts Js 8c 3d 2c\n" +
            "Qd Ad Ks 7h 6s\n" +
            "8h 3h Js 2s 9c\n" +
            "5h 2s 2c 3s 3c\n" +
            "6d Ad Ac 8h 4s\n" +
            "9d Jh Ah 5d 5s\n" +
            "Ad Qc 7s\n" +
            "Th 5s 5c 6c 7d\n" +
            "Kh 6c Kc 8s 8d\n" +
            "3h Qc Ad 4c 6d\n" +
            "6d 9h Jh Kc 3c\n" +
            "5c 2h Qd 4h Ks\n" +
            "7c Td Ks 4s 5s\n" +
            "Kc Qs 2s 9h As\n" +
            "9h Ac Kd 9d 5d\n" +
            "Tc 8s 3s Ks 5h\n" +
            "3c Ad 9h 5s 9d\n" +
            "7d Td Jd Qh\n" +
            "5h 3d Qs 7s Qc\n" +
            "Ts 9h 7d Ac As\n" +
            "4h Qd 9s Kc 5c\n" +
            "2h 5s 9d 6s 3d\n" +
            "9h 2s 4c Ac 6h\n" +
            "4d Tc 9d Jc 5c\n" +
            "Js 4h Ts 4s 8d\n" +
            "4c 7s 5s 6c 5c\n" +
            "7c Td 6c 4h\n" +
            "3d 4s Ad 2s 9d\n" +
            "8s Ad 8c Th\n" +
            "As Qc 9d 6c Th\n" +
            "8h Jd 5d Ad Ks\n" +
            "Kd 2d Qh Kc 2s\n" +
            "9c 6h Kc 8d 6d\n" +
            "3s 7h 8c 3h 4d\n" +
            "Jc As Jh 9h\n" +
            "Ac 4s Js\n" +
            "5d Qs 6c 8h Td\n" +
            "Jh Js Kh 6c 4s\n" +
            "Qd 8h 8c 8d 3h\n" +
            "7s Kc 8d Js As\n" +
            "5c 8c 2h 6h 7d\n" +
            "6h Qc Ad 9d Kd\n" +
            "Kc Ac 3h Qs Jh\n" +
            "4s 5h 5d Kd 6d\n" +
            "4h 9d 7c 5h Ad\n" +
            "8c Td Jd 5c Qs\n" +
            "Jh Tc 2d 2s 3c\n" +
            "Ah 2d 8s 2h Ks\n" +
            "2s 5s 4d 8s Qh\n" +
            "9h 3d 2d 3c 9d\n" +
            "Qd 2c 6c Ts 3d\n" +
            "3d 6h 9d Jc\n" +
            "Qd 9d 9c 7h 7c\n" +
            "5s 7c 6h Jc 8h\n" +
            "5s Ac 6c 9h Ad\n" +
            "5s 6s Th 3c Js\n" +
            "Ah Qc 8c 9s 5s\n" +
            "5h 6s Jh 5s 4h\n" +
            "Jc 2d 2c 5s Kd\n" +
            "Kh 3c 5c 7s 6h\n" +
            "9c 2s 2h 6h 3h\n" +
            "6h 3s Qd 2h Js\n" +
            "2c Ac 4s Qd 7h\n" +
            "Tc 9d Jh 3h Kc\n" +
            "9d 2h 2s 7s Td\n" +
            "4d 3s 8d\n" +
            "7h 7c Td Ah 7d\n" +
            "8c 3h 6c Kc Ad\n" +
            "Ac Kc 7s 8h 6h\n" +
            "Qs Ks Tc\n" +
            "9h 4h 7s Ac\n" +
            "Ah 2s Kh Js 5c\n" +
            "Qs 3s 6s 4d Qc\n" +
            "6c 2c 9s Tc Kh\n" +
            "4h Ks Td 3c Kc\n" +
            "Jd Jc Kd\n" +
            "Kc Kd As 7s Qd\n" +
            "Ks 9h 9c Tc\n" +
            "8h 6h 9d Ad Qc\n" +
            "4s Ts 4d Qd 5c\n" +
            "6c 9c 8c 2d 8d\n" +
            "Qs 2s 9h 8d 2d\n" +
            "8s Th 4h\n" +
            "Qs 9c Jd 8d\n" +
            "2c 8d As\n" +
            "9s Jd Ks\n" +
            "9s Tc Ks 7h 9c\n" +
            "Qh 8s 2c\n" +
            "7c 7d Th 2h Ah\n" +
            "Td 3s 7s 5d Qd\n" +
            "Tc Jh 4d 2h\n" +
            "5d Qs 9c Ks 3h\n" +
            "9d 8s 2c 8h 3h\n" +
            "6c 5s 3d\n" +
            "Qc Jc Td Jh Ad\n" +
            "Jc Qd Kd 2d 8h\n" +
            "Jc Th 4h 2s\n" +
            "8d 8c 7s 6c 4s\n" +
            "3s 8s 8d 6c\n" +
            "7s Ad 5h 5c Kh\n" +
            "Kh 7d 9d 9h\n" +
            "6s Td 7h 3d 8d\n" +
            "Kh 8c Ac\n" +
            "2d As 3c\n" +
            "3c 7c 8c Kc Ac\n" +
            "8h Qh 2c 7c As\n" +
            "7s Td 8s\n" +
            "Qc Kh 7h 5h\n" +
            "8d 3h 6c 3c Jc\n" +
            "Jd Ts 7d Ac 3d\n" +
            "5c 5s Kh\n" +
            "3c 7s 8s 9h\n" +
            "7c Ad 4h 6h\n" +
            "Js Ac 5h Th 5c\n" +
            "Qc 5c 4c Kc Qs\n" +
            "3d 5h Ks 4h 2s\n" +
            "2h Kd Jc 7s 7c\n" +
            "Ts 2s 4d Qh Kd\n" +
            "Qh 7s Ts 8d Ad\n" +
            "Jc 6d 2d Ac 6c\n" +
            "4s Ks 4d 7c Kh\n" +
            "7h 6c Qd 2s 5h\n" +
            "Jc 9d 9h 3c 7d\n" +
            "4d Ad Jd 5s Tc\n" +
            "As Ah 3h\n" +
            "2h 8c Kd 9h 4s\n" +
            "2s As 4h Th 5d\n" +
            "6c 8s 9s 3s 2d\n" +
            "Th 6h 5c\n" +
            "2d 8h Qs 9h\n" +
            "3d 3c Jd Ac 3h\n" +
            "9c 7c 4s\n" +
            "5s Th 6d 4s 3c\n" +
            "Ts Kh 4h 9c\n" +
            "Ks Jd 4d Ts Jc\n" +
            "Ac 2d 4c\n" +
            "9h 5s 6c Td 4h\n" +
            "5c 9c 7s 4s 9s\n" +
            "Jh Jd 4h\n" +
            "Ah 9h 9c 4h\n" +
            "9h 6c 3d 7s 2h\n" +
            "Ad 3h Jh\n" +
            "Ad 2h 4d 9s 7d\n" +
            "Ac As 8h 4s 6h\n" +
            "9d Ks 5c 6d 8h\n" +
            "Ah Js 2d 9s Jd\n" +
            "Kd 9d 7s\n" +
            "8c Td Ts Ah Qd\n" +
            "Ad As 2s Kh\n" +
            "Ah 2s Tc\n" +
            "6s 7s 7d Ks 7h\n" +
            "Js 6s 3d\n" +
            "Ah 3h Kc\n" +
            "9c Ks 8c 4c 5s\n" +
            "6c Qh 2h Ts Qd\n" +
            "Jd Kh Ks Kd\n" +
            "2s 7d 2h Jh 7h\n" +
            "5s 8c Qd 6c 6s\n" +
            "9c 3h 4c Td 2s\n" +
            "Tc Ks 6c 2s 3s\n" +
            "Td 6c 7c 2d Qs\n" +
            "7c 7s Jd As\n" +
            "Ts 6d Qh Tc 2c\n" +
            "3h 9d Td 3d Qh\n" +
            "Jc 2c Ks Td\n" +
            "7c 5s Jd 7h Jh\n" +
            "Tc 4h Kh 6s 4c\n" +
            "Kc 5h Jc 5d\n" +
            "9h 4d 3h Ts Kd\n" +
            "Qd Qh 5c\n" +
            "Ad 5c Qs Qh 7s\n" +
            "Kc 9d 6d 5d 5c\n" +
            "Jh 2d Qs\n" +
            "9d 5s Qd Kh Kc\n" +
            "9d 7d 2d\n" +
            "2h Jd 7c 7h Td\n" +
            "Ah Jh Ad\n" +
            "4s 4c 8d 7c 2d\n" +
            "9h Td 9c\n" +
            "As 4s 5s Ac 9d\n" +
            "Ah 8s Ks Qc 7h\n" +
            "6h 6s 3h As\n" +
            "6s 2d 7d\n" +
            "8h Kd 7c 2c 2s\n" +
            "Tc Qh Td 7h 6s\n" +
            "5h 6h Kd 9c Ac\n" +
            "8d 3d As 5c Ad\n" +
            "Jd 4c Td Th As\n" +
            "5s 3c 7s 6c Qd\n" +
            "4d 4h Qc 9h Tc\n" +
            "7c 9h 6d Qs 5s\n" +
            "Jd 4s Tc Kh As\n" +
            "Qs Qc 9c Kc 8s\n" +
            "Jd 7h Kh\n" +
            "Ac Jc 3c 2s 2c\n" +
            "3s 2c Ac Ts 4h\n" +
            "As 8c 7d 3d Qd\n" +
            "Ah 6d 3d Tc 9c\n" +
            "Ad 8h 4d 6d Qh\n" +
            "4h 9s 7h\n" +
            "4s 3d 8d As Kd\n" +
            "Kc Th Ks\n" +
            "9h Th 7s 8c Ks\n" +
            "3c 3h 6d 9d 8c\n" +
            "7c 5c 2d 6s 9s\n" +
            "7h 4s 8s 3d Th\n" +
            "Jc Qs Tc Td Qh\n" +
            "5c 9s 8h 7h 2d\n" +
            "Kh Qh 8s 9d 3c\n" +
            "Jc Kc Ac 2s 4d\n" +
            "2d 7d 9c 2h Td\n" +
            "9c 5c Td 3c 7c\n" +
            "Jd Ad 7s 9c 3h\n" +
            "7h Kc 4s Qc 6s\n" +
            "6s 7c Jh Ts\n" +
            "Jd Th Ac 4s 9c\n" +
            "Qc 9s 4s 5h Ts\n" +
            "5s 3s 6c 6d Tc\n" +
            "Qs Kc 2c\n" +
            "3c 4c 2s Td 4h\n" +
            "3c Js 7s\n" +
            "2h Kc 9h Qh 7s\n" +
            "9h 6s 2c 5s\n" +
            "9d Th Ks 6h 9c\n" +
            "Qc Qh 3s\n" +
            "5h 8h 2c\n" +
            "Kh 2d 9s Jd\n" +
            "As 8h 7d 5d Js\n" +
            "Kd 5s Ah 5h 6s\n" +
            "7h As 8d\n" +
            "9d 7h 7c\n" +
            "7c As Ah 6s Ac\n" +
            "Ac Ks 6c\n" +
            "Ad Js 4d\n" +
            "8s 6s Kh 6c 9s\n" +
            "Td 4c 3h Ac\n" +
            "6h 3h 4c 8s 4d\n" +
            "6d 4h 9c 4s Qh\n" +
            "Kd 9s 7s 3c 4c\n" +
            "2c Qs Qc 5s 8h\n" +
            "8h 6c 5d\n" +
            "Jh 2s 7h 7s Ts\n" +
            "4s Td 9c 8c 2s\n" +
            "7s Kh Kc 8s Ks\n" +
            "Ah Qc 2d 7c 2h\n" +
            "Td 7d 4d\n" +
            "7h 6s Kh\n" +
            "Ac Kc 5h 2c Ks\n" +
            "Kc Ks 6s\n" +
            "9d Ts Jd\n" +
            "6c 4h 4d\n" +
            "Td 3h 9d 9c\n" +
            "8c As 8h\n" +
            "Ah 5h 2c\n" +
            "Qh 7s 8d 8s 3c\n" +
            "Kc Jd 2s 2c Ts\n" +
            "4d 9d 5h As 9c\n" +
            "6s 9s Qc Ts\n" +
            "8c 9d 7c Jc 2s\n" +
            "6s 4d 6d\n" +
            "Ac 5c 2s 5h\n" +
            "Kd Jc 9h 5c 4d\n" +
            "Ks 2s 4d As Ad\n" +
            "Jc 4d Qd 6c 4s\n" +
            "Qs Kd 6h 6s As\n" +
            "Ac 6c Jd Kd 8c\n" +
            "3s Ts 9c Kd Jc\n" +
            "3h 2c 9d\n" +
            "Ks Kd 6d\n" +
            "2h 4c Jd Ah\n" +
            "Ac 7s 2s Kd\n" +
            "6c 2c Js Ks 7c\n" +
            "6s 5s 7s 4s\n" +
            "5d 2c 7c\n" +
            "5d 8c 8d 4h 4c\n" +
            "5c 2h 8d Td Kh\n" +
            "Jc Th Jh Qc 7c\n" +
            "Ks Th 4h\n" +
            "9c Ad Jh 7h 4s\n" +
            "6h Ah 7d\n" +
            "Kc 5c 2c 6s 9h\n" +
            "8s 7s Kd Qh Qs\n" +
            "8s 4h 4s\n" +
            "9d 8s 8c\n" +
            "Jc 6h 6s Qs\n" +
            "Kd Td Jh 8h 3c\n" +
            "2c Ts 6c\n" +
            "8c 7c 6s\n" +
            "8c 5d Jd\n" +
            "Tc 7c 6h Ad As\n" +
            "Ks Kd Kc Ts 6c\n" +
            "Js 6d 8d\n" +
            "Js 7h 4d Jc 7c\n" +
            "Jh 4c 3s Qd Td\n" +
            "3s Kc Ts 8s 6s\n" +
            "4s 5d 5c\n" +
            "Kh 3c 9d\n" +
            "3h 6h 8c 2s 6c\n" +
            "4d 6c 5h 6s 3h\n" +
            "6s 7d 5d 3c 3s\n" +
            "Ts 7d Ks 8h 2d\n" +
            "As Td Ac\n" +
            "2c 3d 5h 4d 4s\n" +
            "As Jh 3s\n" +
            "Kd 2d 3d Ah 7c\n" +
            "8h 9s 3s 5s Qd\n" +
            "9h 6c 5c 3c Tc\n" +
            "Qc Ah 5h 2d 3c\n" +
            "As 8d Qs 8s 2h\n" +
            "6d Ah Jd 7d 5h\n" +
            "Jh Qd 7s 9h Jc\n" +
            "9h Jc Ad 9s 7d\n" +
            "7s Kc 6h Jc 3d\n" +
            "Qc 7h Kc\n" +
            "Td 3d Jc 7c 5h\n" +
            "3h 4c 5c Kh Kd\n" +
            "4h 6s 6c 6d 4c\n" +
            "Jc 2s 2d 6s 5s\n" +
            "8d Jc 7h 6h\n" +
            "4s 7h Kd 5c 5s\n" +
            "4c Th Qh\n" +
            "Ah Kd 9d 7c\n" +
            "3s Ks 8d\n" +
            "Ah 8d 9s Kh 7c\n" +
            "9s Ts 8c 8s 5h\n" +
            "7d Ad 9c 2s 3h\n" +
            "8h 4h 2s Ah Jc\n" +
            "Ad 7h 8s\n" +
            "5s 4h 7h Ac 9d\n" +
            "2c 5h 2s 9c 6h\n" +
            "2c 2s Ts\n" +
            "4d Jd 8d Jh\n" +
            "9h Qd 4h\n" +
            "5c 2c 4d Jc 9d\n" +
            "Qc 8d Ac\n" +
            "7d Kd 6h 4c Kc\n" +
            "As 2h Ac 6s\n" +
            "Kh Js Jd\n" +
            "Qs 6c 9d Jc Td\n" +
            "Qd Td 2h\n" +
            "2h Kh 8s\n" +
            "Th 7s 7d Td Ac\n" +
            "7c 8h 5s\n" +
            "9h Ks Qs 4h\n" +
            "2d 4d Jd 7d 9c\n" +
            "9d 5c Jc\n" +
            "2h 2d Qs Ah\n" +
            "3s Qd 9c Qc 2d\n" +
            "8c Jc 4c 4h\n" +
            "3h Ts Kd 6s 7h\n" +
            "2c 3c 4s Jc Ac\n" +
            "6c 6d 9d\n" +
            "4c Th 4h 5h 5c\n" +
            "5c 6c Kd 5d 2c\n" +
            "Qh 5c Qs\n" +
            "9d Td 4d\n" +
            "Qd 2d 7s 2h As\n" +
            "4d 9c 4h Qs Ad\n" +
            "Js 6s 2d 3s 9h\n" +
            "4c 3h 7d 4d 5s\n" +
            "7d Kh Kc\n" +
            "Qh Ks Tc\n" +
            "Kc As 9c\n" +
            "6d 2s Qc Qs\n" +
            "4s Kh 2c Qh 4c\n" +
            "7h 6c Jd Kh Kd\n" +
            "Js 6h Ac 9d Kc\n" +
            "7d 5h 3s 3c 3d\n" +
            "9d 8s 3h 4s\n" +
            "3s As Jc 6d Qh\n" +
            "6s 3d 4d 5h 4h\n" +
            "7d 9d Th 4s 4c\n" +
            "Jc 2s 6c 3c 9h\n" +
            "4h Ac 3d 8c 8s\n" +
            "2c 2s 8c 6d\n" +
            "Jd Ah 5d 9s 8s\n" +
            "7c 4s Ks 3c\n" +
            "Jh 6c 9c 3s As\n" +
            "3s Ad Qd 7s Qh\n" +
            "Ks 4h Qc 4s 3h\n" +
            "6h As 7c 8h Ts\n" +
            "3d 8s Kh Ts\n" +
            "Ad 7c 8s 8c 3s\n" +
            "4d 7s 6h 9d 2s\n" +
            "Ad Qc 4s 2h 7c\n" +
            "Ac 2c 7c 5h Qh\n" +
            "4h 7c 2h 9c 5s\n" +
            "Tc Qc Qh Ac\n" +
            "Jh Js 7d\n" +
            "Ah 6c Ts 9h Qd\n" +
            "6h 9h 6d 4s\n" +
            "7c 7d 8s\n" +
            "2s Ad 8c\n" +
            "Tc 6d Th 5d Ad\n" +
            "2h 5h Ad Qd 3d\n" +
            "Qs Jd 4c Jc 5s\n" +
            "Ac Kd 3c 5h 6s\n" +
            "6h 9s 3c Ks\n" +
            "5h 3s 2d Kd 8c\n" +
            "Ac Kc 6s Ks 9h\n" +
            "5h 3d Jd Jc Kd\n" +
            "6c 2h Td Qd 7s\n" +
            "Td 5s 9c 9s 9h\n" +
            "Kc Jc 8s Td 5s\n" +
            "Qs 3d Kd\n" +
            "Td 3d Kd 6s 9h\n" +
            "3h Qh 5h 4c Kd\n" +
            "9s 8c 2h\n" +
            "Qd 9h 9s Qs Kc\n" +
            "7h 3c 9s 8d Ad\n" +
            "9d 9c 2d 2s Ts\n" +
            "Qh 2c 5d Kh 8h\n" +
            "8d 5s Js 4c 3d\n" +
            "Kc 9d Kd 2h 7h\n" +
            "Ks Qs Th Td\n" +
            "9d 5s 2c Kc Js\n" +
            "8d 2s 5s Jd 6c\n" +
            "2c 9c Js 4h 9d\n" +
            "Th 8h 8s Ac 9s\n" +
            "Ts 7d 7h 8h Th\n" +
            "3s Qc Jd Jh 6c\n" +
            "3h As 6d\n" +
            "As Js Qh\n" +
            "3s 6s 7s\n" +
            "5s Jd 6d Jc 8s\n" +
            "9h 4h Th\n" +
            "2c 6d 8c\n" +
            "Tc 8d 5c\n" +
            "6d Jc Ks\n" +
            "Th Qc 6s 3s 7c\n" +
            "7s 6c Jc 6h 5s\n" +
            "3c As 8d Kd 4h\n" +
            "3s 7d Ac\n" +
            "5s 2h Jc 3d Ks\n" +
            "7s Ad 8c Jd\n" +
            "5c 9h 5h 9s Ah\n" +
            "7c Qd Jc Kh Td\n" +
            "4h 8d Ts\n" +
            "Ts 8c As Th 8h\n" +
            "5s 4d 8d 4h Js\n" +
            "Qd Ts Th 6c\n" +
            "Qd Th Tc As 3c\n" +
            "7s 8c Ah 4c Qc\n" +
            "Tc Ac 7c 7s Qh\n" +
            "9s Kh Jc 3c 8s\n" +
            "Kc 5h Ts 7h Jc\n" +
            "Ah 5d 4s As Qd\n" +
            "6s 2h Ks 9h 7d\n" +
            "Qc 2c 5h Kh 5d\n" +
            "Kc Jd Qd Qc\n" +
            "6c Qh 4h\n" +
            "9d 6h 2c 7h Kc\n" +
            "Td 8s Ac 2c 5s\n" +
            "5h 9h 5c Jh Kd\n" +
            "7h 7s 5c Ac As\n" +
            "Kd 3s 5c\n" +
            "4h 6s Qh Jh\n" +
            "Jd 3c 4h 3s Kd\n" +
            "Tc 3d 7h 2s 3c\n" +
            "Js 9d 8c\n" +
            "6c Jc 7c 4d 2s\n" +
            "8h Qh Ad\n" +
            "Ac 2c 3c Ts 6c\n" +
            "9h 7c 7d\n" +
            "5d Jh 9h 7c 9s\n" +
            "Ks Kc 9s Th 3s\n" +
            "4d 3d 6h 3h 2s\n" +
            "5c 3d Qd Td Tc\n" +
            "6h Ad As\n" +
            "2h 7d Kh 7c 3s\n" +
            "Ks Jc Th 7h Kh\n" +
            "Kd Jh 3d 4h Ts\n" +
            "5s 7c 5c 9c Kc\n" +
            "3s Qs 2c 4c Kh\n" +
            "Qd Kd Ac\n" +
            "4c 8d Tc\n" +
            "5c Kd 2c 6s 7c\n" +
            "2d 3d 6d\n" +
            "Ah 8s Tc 7h 9h\n" +
            "9s Qh 8s\n" +
            "Jc 4s 4c 7d Ac\n" +
            "9s 9h Jc\n" +
            "6d Jd Ks Tc 8c\n" +
            "Ad 2d 6s\n" +
            "8d Ks 3c\n" +
            "Ah Ts 5d\n" +
            "2c 3d Kc Tc 4s\n" +
            "8d 9s Qh 5s Jd\n" +
            "Jd Th 5s 4c Jc\n" +
            "6c Js Kd\n" +
            "7d 2s 4c 9c 2c\n" +
            "Js Qc 4c 8s Kc\n" +
            "8d 8s 5s Jd 4h\n" +
            "9c 3c Ts\n" +
            "9h Qc 5s 4d 5c\n" +
            "Qh 2c 2s As 4c\n" +
            "5h 5c Qd 3c As\n" +
            "Tc Ks Ac\n" +
            "5c Kc 7c Kd 5d\n" +
            "Qs 3d 6h As Tc\n" +
            "6c Tc 6h\n" +
            "8c 6h 9s 2h 6d\n" +
            "5c 6d 7s\n" +
            "Ad 7h 9c Js 5s\n" +
            "Kh Th Kc\n" +
            "8d Ah 5c\n" +
            "6h Ts 2d 7c 5d\n" +
            "Ad 3h Kh 6c 8c\n" +
            "2s 2d 6h 4c 8d\n" +
            "Jc 9c 5c Kc Qs\n" +
            "Ad Ac 4c\n" +
            "4c Kc 6c 9s 3c\n" +
            "8h 8d Jc Kc Js\n" +
            "3c 8c Kh\n" +
            "7d 4d Kc Jd 2d\n" +
            "As Tc 9h Ks 5h\n" +
            "4h 8h 7h 6d Jd\n" +
            "8s 3c Jd 9h 8h\n" +
            "4s As 3c\n" +
            "Qh 5h 2s Ad\n" +
            "Kc 7s Kd\n" +
            "5h Tc 6h 6s\n" +
            "4s Qh 5d 2c 4c\n" +
            "8d Td 6h Ad 2s\n" +
            "2h Qs 2s\n" +
            "2h 7h 5s Qd Ac\n" +
            "4h Tc 3c 8h 2d\n" +
            "Qc 5d 4d\n" +
            "4c 8s 2h 3s Ad\n" +
            "8h Ac 8d 4c\n" +
            "9d 2c Ad\n" +
            "Qh Jd Ah\n" +
            "5h Jh Kh 5c Kc\n" +
            "Qd 4s Ts\n" +
            "8h 4h Jd 8s 2d\n" +
            "Ts 4d 4h Jd 3c\n" +
            "Ad 8d 4c Td Ah\n" +
            "Ts 8c Jh Jd 3c\n" +
            "7d Qc Qh 8s Jd\n" +
            "Kh 7s 9h Jc 6c\n" +
            "2h 4s Qc 7c\n" +
            "4h 4c Ah 5c Tc\n" +
            "4c 5s Kd\n" +
            "5s 5c 7d 9s 3c\n" +
            "As Jh 8s 3d 9c\n" +
            "4s 2c 3c Qh Qd\n" +
            "5s 2h 3h 5h 5c\n" +
            "5s 6h Ad 3d Td\n" +
            "4c 2h 2s 3c 8c\n" +
            "6h Ks 3d\n" +
            "Kh 2h 4h Jd 3c\n" +
            "2s Js 8c 2d 3c\n" +
            "4c Jd 9c 4h 6h\n" +
            "7d 2c Ac 4c Tc\n" +
            "Ah 2c Kh Th 3d\n" +
            "Qc 4s 3d\n" +
            "9c 4c Kh\n" +
            "Js 9d 9h\n" +
            "9h Kc 2d\n" +
            "9h 6s 3d\n" +
            "Th 2h Ts 9c Kc\n" +
            "3d 9c 2h Ac Ks\n" +
            "Jd 7h 2c\n" +
            "2s 3h Ks Kc 2h\n" +
            "9c Th 5s 2c 2h\n" +
            "4c 5h 3d Jc Qs\n" +
            "5d 9c 6d Kh 2c\n" +
            "Jc 4c 9d Js 3d\n" +
            "5s 8h 9d Jd 2h\n" +
            "6s Ad 5s 7h 8d\n" +
            "Jd Kh 6d 4s 8d\n" +
            "Ad Qh 7c 6s Qc\n" +
            "Qh 7h Ks 9s 9c\n" +
            "2h 7s Kh 9c 5h\n" +
            "3s Ad 9d 6h 6c\n" +
            "8c Tc 5c Kc 2h\n" +
            "3h 5h 3d\n" +
            "Jh Th 8d Ah 7h\n" +
            "7c 3d 6d\n" +
            "9d Jh 6h 2d Jd\n" +
            "Th 2c Qd Kd 6s\n" +
            "2h Jc Kd 3c 2s\n" +
            "Tc Ah 8s 2h 8h\n" +
            "8s 9c 3d 2s 3h\n" +
            "7h 9d 8c 3h Ts\n" +
            "4s 5s As\n" +
            "8s 7h 7c Ac 4s\n" +
            "Ts Qd Qs\n" +
            "5s 8d Td\n" +
            "Js Qd 2h 5h 3s\n" +
            "Qd 7h Js Ts As\n" +
            "2c 4c Ts\n" +
            "Th 5h 7c Kh 5d\n" +
            "3h Kc 2d 9c 2s\n" +
            "Kd 4d 2d\n" +
            "4d 5s Kc\n" +
            "5c Ks 6s 2s Qd\n" +
            "6d 7d Qd Th 8c\n" +
            "7h Jd Td 2h Tc\n" +
            "Ks 9s Td Ts 5c\n" +
            "7c Ah Td\n" +
            "8s 6d Jc Ts Jd\n" +
            "6s 2s Jh Ac 9c\n" +
            "4d 2h 8s 6d 5d\n" +
            "9h 6h 2c Qh As\n" +
            "9h 4c Js\n" +
            "3d 4d Kc 2s Qh\n" +
            "6h 2c 5h Th 9d\n" +
            "As Kd 5h Ad Qh\n" +
            "Kc 3d 2s 9h 7s\n" +
            "7d 5s 6h 9c\n" +
            "4h Kh 3h Ah\n" +
            "6s Tc 3s Ts 5s\n" +
            "4s 8s Qd 8h\n" +
            "Js Tc 9c 3s 5s\n" +
            "Ad 2d Tc 7d Kd\n" +
            "Qc Js 3c\n" +
            "4h 7c 9c 3h 6h\n" +
            "7d Kh 4d Jd Kd\n" +
            "Qh As 3s Jh 6c\n" +
            "Th 9d 6c 8s 6s\n" +
            "9h Ac Kd\n" +
            "3d 3h Ah 6c 9s\n" +
            "Th Kc Qc 6h 9h\n" +
            "Qh 8c 2s\n" +
            "Td 7d 2h 3d 9c\n" +
            "Kd Th Tc Ad 6d\n" +
            "7c 5h 8d 8h 9d\n" +
            "Ks Ac 9c Tc 7d\n" +
            "3s 6d Js 7h\n" +
            "8h Jd Kc\n" +
            "Js 3d Qc 3c 4c\n" +
            "Qc Ac 4d 7s 9s\n" +
            "5h 9h 2h Ks 6h\n" +
            "8s Th 7c Kh As\n" +
            "2s 2d 8d 4c\n" +
            "2s 9s 2c Tc 4d\n" +
            "3d Qc 4d 6d 2s\n" +
            "3s Th Kc 8s 7h\n" +
            "Jc Qs 5h Td 6d\n" +
            "Kc 4s Jd 3h 2d\n" +
            "Td 8c 9c\n" +
            "Jc Ad 7h\n" +
            "Ks 9h Qc 4c 6d\n" +
            "Kd 9h Td Js 8s\n" +
            "4s Ts 2s Kd 4d\n" +
            "Ts 9h 3s 4c 5c\n" +
            "8h 6d Th Jh\n" +
            "6d 4d 6s 9c 8c\n" +
            "8d Ac Ah 5s 8s\n" +
            "Th 9s 2c\n" +
            "Kd Qd 5c\n" +
            "4s 3s Jh 6d 7d\n" +
            "9s Ac Tc\n" +
            "2c Qh Qd 4c 2h\n" +
            "Tc 7s 8s Jd 2h\n" +
            "3s Ks Js 7h As\n" +
            "As 3h Kd 8s 7d\n" +
            "3c 3d 7h 7d Ks\n" +
            "2d Qh 2c 9c 6h\n" +
            "4c Qs 8d Kd 3s\n" +
            "Ah Ks 9d\n" +
            "7c 2d 9c 4c Jh\n" +
            "5h 6c 6d Kd 5s\n" +
            "Td Ks 2s Kd Qc\n" +
            "As Th 8d 4d\n" +
            "2d 7s 2s Jd 4s\n" +
            "6d 8d Kd Kc Tc\n" +
            "Qs 6d 5c 8h\n" +
            "3d Ac 5s Ts Jd\n" +
            "4s 9d 3s 3c 6c\n" +
            "2d Ks 5s Kd 2c\n" +
            "Ac Qs 2h 9h Qh\n" +
            "8h Ad Ah 2c 7h\n" +
            "Qd 2s 9c 7s 6c\n" +
            "8d 2h 7s 3c Jc\n" +
            "7h Ts 5h Kh 9h\n" +
            "Jc 6d 9s 8c 5s\n" +
            "6d Kc 7d Js Tc\n" +
            "6h Ts 7c 6d Jd\n" +
            "Ad 2h 2s 7s Jh\n" +
            "9h Ac 8s 9c 4d\n" +
            "4c 8d 9c Td 5c\n" +
            "5h 9c Kd\n" +
            "4s 2h 8s 5d 3h\n" +
            "2s 3c Tc 3h Td\n" +
            "4d Qh 7d 3h As\n" +
            "Td 8d 7s Qs 4h\n" +
            "Td Ks Jh Jd 5c\n" +
            "4h 8d 4s\n" +
            "Kd 4h 4c 3c Ah\n" +
            "7d Ks Kc\n" +
            "6s Kc 4d 8s 2h\n" +
            "Ks 4s Ad 7d 5d\n" +
            "5s 8c Kd 7c As\n" +
            "Jc Kc 7c 2d As\n" +
            "Th 3d Ac 3c 9c\n" +
            "Qc 4c Ks 4s 8s\n" +
            "8c 5c 8s\n" +
            "8h 8s 7c 4h 4d\n" +
            "5s 6s Kd 3d 4h\n" +
            "4c Jh Qh 8d 9s\n" +
            "8s 7s 7h 6c 5h\n" +
            "Js 3c 8c\n" +
            "9h 4d Ad 2h 2c\n" +
            "5h As Ah 6s Jc\n" +
            "Ad 9c Jh 6d 9s\n" +
            "Jc 2s Kd Js\n" +
            "Jd 8d 6d Kd\n" +
            "As 6s 8d\n" +
            "Kd 6d 8c 2s\n" +
            "6c 3c 2d 3h Td\n" +
            "6d Kh Ah 5h 7d\n" +
            "2d Ac 2c Tc Td\n" +
            "Kd 5c 2c\n" +
            "3h 4h Th Qd Jh\n" +
            "6d 4s 9c 2c Kh\n" +
            "3d 2s 3c Ks\n" +
            "6s Jd Ks 8s Kd\n" +
            "Ks 7h 3h\n" +
            "8s Kd 4d\n" +
            "8s 8d Kc 3s Jh\n" +
            "2d Jd 3h Jc 5c\n" +
            "2h Kd 5h Th 7s\n" +
            "6c Kc Ts 7d 2c\n" +
            "4c 7s 5h\n" +
            "4c 2s Jh Qc Ks\n" +
            "4c 3c 9d\n" +
            "9s 5c 6d Td Ts\n" +
            "Kc Th 7c 6c 4d\n" +
            "Th 6h Jh Kd 4s\n" +
            "5h 9c Jh Kd\n" +
            "Qh Kd Ad Ah Tc\n" +
            "8h 2h 4h 8s\n" +
            "8d Qd 4d\n" +
            "Jh Ad 5c 9s 8c\n" +
            "6c 7c Js 8h 3c\n" +
            "6h Kc 9c 5d\n" +
            "2d 4s 8h Th 8s\n" +
            "3h 3c 5c Ac 4c\n" +
            "Td Js 7h 9h 2s\n" +
            "9c Jh 7c\n" +
            "2d Td 4c 6d Ks\n" +
            "Ad 6c Td 4h 8c\n" +
            "2c 5d 8c Th Td\n" +
            "4d Tc 5s 2h\n" +
            "5s 5d Qd\n" +
            "4c Qd Ts 8s 2s\n" +
            "Ad 3s 9d\n" +
            "4c Qh 9s Kh 6d\n" +
            "2s 8d Ac 7h Ts\n" +
            "Ad Ac 4s Kd Tc\n" +
            "6c Qs 2d 6s 5s\n" +
            "Kc Jh 4s Qs 3c\n" +
            "Qs 4s 8h 8c Th\n" +
            "Ah 6h 3d 7c 5h\n" +
            "Js Ad Th Ts 4s\n" +
            "2d 2c 3s 8d Kc\n" +
            "8s 5c 8h Kh\n" +
            "8c 2c Qs 3d\n" +
            "9s Td 8c 4c Ks\n" +
            "6h Tc Js 5d 6d\n" +
            "3c Kd 7h 3s 4s\n" +
            "6c 4h 5c 3c\n" +
            "2d 7c Kh 9c 8d\n" +
            "Ah Qc 2c Ks 4h\n" +
            "Th Qd As Jh 6h\n" +
            "3d 2s 6s Kh\n" +
            "3d Ad 9d 7s Td\n" +
            "Ks Jh 2s\n" +
            "Jd 5c Ks\n" +
            "Ah Qh Kh 2h 6h\n" +
            "Kh Ac Ad 9s 4d\n" +
            "Ac 3c 5d 2c 4c\n" +
            "6c 4d Qs 3c 3d\n" +
            "9h Jc Td 6d 4s\n" +
            "9c Qh 3s 6c\n" +
            "9h 3c 7d\n" +
            "Kh 4s Js\n" +
            "Js Jc 5h Ks Qc\n" +
            "3s 2s As Ah Jh\n" +
            "4s 4c 5h 9s\n" +
            "3h Jc 9d 5s\n" +
            "4c 9d Tc Ah\n" +
            "2d 2s 6s Th 9h\n" +
            "Kh 2d Kc Ts 5d\n" +
            "2h 4s Td 3s 4h\n" +
            "9s Th 9c\n" +
            "7d 5d Qh\n" +
            "4d 5d Qs 4c\n" +
            "8h 3d 2c 9d 5s\n" +
            "7d 7s 3s 6d As\n" +
            "2c 6d Js Jd\n" +
            "Qh 5d 9s 6d Tc\n" +
            "9h Td 3h\n" +
            "3h Kc Jh 7c 9d\n" +
            "2c 3c Qc 5d 7c\n" +
            "4s 5c Kc Th 7c\n" +
            "4h Kd 8c Qc Ah\n" +
            "8c 9h 6d\n" +
            "2h 4c 2s Jh 5d\n" +
            "Ad Jd 3h Tc 7c\n" +
            "Ad 9c 8c Tc Kh\n" +
            "Qh Tc 8c Js Jd\n" +
            "Ah 6h 3s Qd 7h\n" +
            "5h 7d 5s 2h Kd\n" +
            "Kd 2h 6s 7s 5d\n" +
            "7h Qc 7d Ac\n" +
            "Kc 9c Qd 8s Kh\n" +
            "4h 6c 5h 2h Qd\n" +
            "Tc Qs 8h Kc 9s\n" +
            "Td 3d 3s 8d 5c\n" +
            "Kd 6s 6h 6d 8c\n" +
            "2d 3s Qc\n" +
            "Ks Qs 3s 4c 7c\n" +
            "8d Kd Jd\n" +
            "Jh Kc 8d\n" +
            "6c Js Th\n" +
            "Ac 8c Js 4c 2s\n" +
            "9d 4s 5s Qh Kh\n" +
            "Ah 6d 9d 2s\n" +
            "6s 9h 7s Tc Qd\n" +
            "2d 9s Qd\n" +
            "7d Kd 3s\n" +
            "9d Kd Qs\n" +
            "3h 3c 4d 9s Kc\n" +
            "Jd 8d 6c\n" +
            "3h 5h Jd 5s 2s\n" +
            "Qs Jc 2h Ts\n" +
            "4s 7d 3h\n" +
            "Qs Jh Ks Jc Qh\n" +
            "As 3d Jc\n" +
            "Jh 9d 2c 6s\n" +
            "5c 8d Jh Qd 3c\n" +
            "7h Kd 7d 9d 7c\n" +
            "Ts 7d Qh 9s\n" +
            "Td Qs 3c Qc Ad\n" +
            "9h Kh Ks 7h 5d\n" +
            "7d 4c Ac 7c 8s\n" +
            "8h Ks 6s 4c\n" +
            "5d 6h 7h 8c Ad\n" +
            "Qc 8s 7c 4s 6c\n" +
            "Kh 3s Qh 6h 9h\n" +
            "3d Kc 6c 2s 7s\n" +
            "3d Ts 4h 6h Tc\n" +
            "Th 3c Ts Qc\n" +
            "Qd Qh Js 2h 4d\n" +
            "4d Jd 2h Kh 7d\n" +
            "8d 2h 9s Ac 5c\n" +
            "Ks Ah 3c\n" +
            "7h 6s 3d Qs 6h\n" +
            "Jh 2h 9h 7s\n" +
            "6d 9s Qs Ah 4s\n" +
            "8d Ad 7h 5c Js\n" +
            "5h 5c Qd 7c Jc\n" +
            "Ad 5c Qh 3s\n" +
            "Ad 3d 2d\n" +
            "Th 4c 5h Ts Jh\n" +
            "3s 5s 2c 6d\n" +
            "6h 7c Kc Qd Kh\n" +
            "5c 2c 7c As 9s\n" +
            "Qc 2h Qs Jc 6d\n" +
            "Kh As 7d 5d\n" +
            "8s 5d 5c\n" +
            "5s 3s Js\n" +
            "5d 8h 2c 4d 9c\n" +
            "6d 6h Ah 7s 6c\n" +
            "5s 6c 5c 2c Js\n" +
            "5s 9d 2c 8s\n" +
            "Ad 2h 3h Qs Kh\n" +
            "3s Kh Qc Qs 4c\n" +
            "Qc Js 9h 5c Ts\n" +
            "8c 5d 8h 3s 3d\n" +
            "Qc Ts Kd 5h Js\n" +
            "Qd Kc Ah 7c Ad\n" +
            "2h Ts Qc Jd 3c\n" +
            "7h 8c Js 8h Ks\n" +
            "6s 7c 2s 3s Kc\n" +
            "Ad Th Qc 7h 5c\n" +
            "3c Jh Js Ac 7s\n" +
            "Qh Ks 6d Jh 6c\n" +
            "Jc Ts 5h 7h\n" +
            "3h 8d 9d Ks 4d\n" +
            "2c 2s 9c 6c 4c\n" +
            "Qd Ad Jd 7d 2d\n" +
            "5h 3d 9h 4c 6c\n" +
            "Qs 4d Js Ks Qc\n" +
            "Kc 3h 4s 6c 9h\n" +
            "Tc Jc 6s 2c 8d\n" +
            "Qs 9d 2s 8d 8s\n" +
            "3h 9h 2s Kc Js\n" +
            "Qc 7c 7s 9s\n" +
            "8s Jh Qc 8h 7d\n" +
            "6d 8d Ac 9h 4d\n" +
            "5h Jc 8s\n" +
            "Qh Qs 6d 7s 7h\n" +
            "Qc 2h Ks Qh Th\n" +
            "4h 9h 9c 7c Ad\n" +
            "6s As 2h Ac 2s\n" +
            "3c 6h 5c Ts Qd\n" +
            "2c Jc Ts Th Ac\n" +
            "6d Kd Jh\n" +
            "8c Ks 8d 9s 6d\n" +
            "5h 6c 3h\n" +
            "6h 2s 4c Tc\n" +
            "3c Jh Kc 3h 6d\n" +
            "4h 5s 7s 3s Qh\n" +
            "3c 3s 2d 7h 5c\n" +
            "2c 6h Ts Ah Tc\n" +
            "9h 6c 5d 8s 9d\n" +
            "6d Tc Ts 7d 4c\n" +
            "8h As Jh 9h 4c\n" +
            "7s 2s 6c Ad 7h\n" +
            "5s 6d Ts\n" +
            "Jc 7s 6d Jd Kd\n" +
            "Ac Kh As 6d 5d\n" +
            "3h 5c Qs 9d 5d\n" +
            "Qd 5s 4c\n" +
            "8c 8d 7d 8h Kh\n" +
            "3c Kd 7d 8c Js\n" +
            "Qc 9h 4c\n" +
            "5d Jd Jh 3c 6h\n" +
            "Qs Js 5c Jc 6s\n" +
            "2h Ad 5s\n" +
            "6d 2c 5c 8d\n" +
            "4h 7s Ad\n" +
            "6h 9d Kh\n" +
            "4s 7c Kd 8h 9c\n" +
            "5h 9s 7h\n" +
            "6d Kc 5h Kd\n" +
            "8d 6c 6d As\n" +
            "6c Ad 9h 4h\n" +
            "7c Kd Jd\n" +
            "7d Js Ah 3c\n" +
            "7h 3c 3d 7s Qh\n" +
            "7c 5d 3h 4d 2h\n" +
            "Qd 6s 6d\n" +
            "Jc 3s Qc 7s\n" +
            "Qs 7s Kd 6d 6s\n" +
            "8c 2d 9d 6c Qs\n" +
            "Ks As Th 5d 8h\n" +
            "4h 9s Qd Ac Tc\n" +
            "4h Td 2s\n" +
            "Jh 7h 2c 3c Qd\n" +
            "3h 7d Ad Qd Td\n" +
            "2h 8d 7c 6d As\n" +
            "8h As Kd Ks 9h\n" +
            "5h Jc 2d Kh 7d\n" +
            "3c Kh 7s 5d 2d\n" +
            "9s Ks 8s\n" +
            "8h 2h 8s 4c Td\n" +
            "3d 7c Th Jc Kc\n" +
            "Tc Ks 2s\n" +
            "Jc 6d Kh Ah 4s\n" +
            "7c 2h Ad Th 7s\n" +
            "Js 4c 3d Th\n" +
            "9h Qh Jh Tc Ac\n" +
            "Th 6h 6c\n" +
            "9h Jh 4d Th Qs\n" +
            "Td Ah 3h\n" +
            "Qs Td Ks 5s Jc\n" +
            "Tc Js 6c Jd 5c\n" +
            "9d Kc Kd 8s\n" +
            "Th 4d 9d 9c 8h\n" +
            "9s 7c 8d 6h 2h\n" +
            "Ah 9c Kh 7d Ks\n" +
            "Jd Jh Jc 8s Kc\n" +
            "6d Td Js 2c 4c\n" +
            "Kh Ah 9c 6c 7c\n" +
            "9c 9h Qc 6d 3s\n" +
            "5c 3c 8c 3d 7s\n" +
            "Qh Td Ah 4s\n" +
            "5d Qc Kh Qs 2c\n" +
            "4s 7s Jh Qd 6h\n" +
            "Qc 6c Qh Td Js\n" +
            "5c 7d 6s 2c 3h\n" +
            "2h Ks 2d 5d 8s\n" +
            "Td 2c Qs 2s 5d\n" +
            "Kc Jh 5c 3d Ks\n" +
            "4c 4h 5s Th 5c\n" +
            "Tc 6d 4s\n" +
            "9s 9d Qs\n" +
            "Qc Ks Ad As\n" +
            "Qs 7s 8c Ks 4s\n" +
            "4d Js Jh As Ks\n" +
            "6c 8h 2h Jd Ks\n" +
            "5h Ks Tc 3h\n" +
            "Qh Ac 8h 4c Td\n" +
            "6d 3s Jc Ad 9d\n" +
            "5d 7s 6d Js 8c\n" +
            "7s 5h Ah\n" +
            "Qc 8h As 3c Js\n" +
            "3c 4s 3d Kd\n" +
            "7h Th Kd 5s\n" +
            "3c Jd 4h 4c\n" +
            "7h 6c 8s 5s Td\n" +
            "As Jh 4d 3s\n" +
            "8s 2d 6d 2c 4c\n" +
            "Js 5h 4d 2d Qs\n" +
            "2d 4s 9s 3d 7d\n" +
            "8c 7d Th 3d 9h\n" +
            "Kd 2s Td 2d 4c\n" +
            "Ad As Qs Ks 4s\n" +
            "Qh 3d 7c Jd 3s\n" +
            "9c 6c 5s 3h Ah\n" +
            "7s Jc 5d 5h 3d\n" +
            "3c 9s Qs 6d Jc\n" +
            "5h Jc 9c 7s 2s\n" +
            "Kd 9c 3c Th\n" +
            "Th 5d Ah 9d 2d\n" +
            "Kc Qs 7d 9d\n" +
            "Ad 4h As 6d 4s\n" +
            "6s Kc Kh Kd Jc\n" +
            "9h 5d 8d 2s 5c\n" +
            "7h 4d Ad 7c\n" +
            "Ac 3h 6d 8d Qh\n" +
            "Qs 5d Tc\n" +
            "5s 5c 2h 3h\n" +
            "Ac Ts 2c 7d 9s\n" +
            "Ts 6c Ah 5s Kd\n" +
            "Th 8d Qh 3c 3h\n" +
            "6s Kh Qd 3d\n" +
            "Qh 2d 3s 5s As\n" +
            "4h 4d 9d 2c 4s\n" +
            "4h Ah Kd\n" +
            "4h 5c As\n" +
            "Ac 7c 5h 5c Td\n" +
            "4s Jc 2c\n" +
            "5h Th 3s 9c\n" +
            "9s 9h 5c As Tc\n" +
            "9c 5s 4c Kc 4h\n" +
            "4h 6s 4c 7h 2d\n" +
            "3d Jc Ts 4c Kh\n" +
            "Kd 6d 3c 8d 7c\n" +
            "6d Tc Ts 8d 4s\n" +
            "Ts 8d 7s Jc Ah\n" +
            "Tc 3h 8c Jh\n" +
            "7c Jh Kh\n" +
            "Ah 7h 2s 2c\n" +
            "Jh 5d 9d 4c 6s\n" +
            "Ad 5h 6s 8h Qh\n" +
            "4c 2s Td Jh Kd\n" +
            "Td 7s Ah 4d 6d\n" +
            "As 4h Ah 9c Qc\n" +
            "6s Qd Tc Jh 5s\n" +
            "9s Ts 7d 2c 3h\n" +
            "Qh 6c 2s\n" +
            "As Jd Js 8c 3d\n" +
            "9s Jc Ah\n" +
            "Kc Ac 7h 8h 9d\n" +
            "6c Ad Ks Qc 3s\n" +
            "3d 2s Qh\n" +
            "Jd 8d As 4h 9s\n" +
            "3s 5s 4h\n" +
            "5h 9s Jh 4c 5c\n" +
            "4d 7s Qc 3c 5c\n" +
            "9c 9h Qd\n" +
            "Qd 2c 8c Ah 9c\n" +
            "Qd Qs Jc Jh 4s\n" +
            "9d 2s 7s 7d 5s\n" +
            "As 9d 2c 7h 2s\n" +
            "3s Kh Ts\n" +
            "8h 5c Td 2s\n" +
            "5h Ah 7s 4h\n" +
            "Ac Jh 6c 6h 8h\n" +
            "Ks 4d 9h Qh 6d\n" +
            "2d Kd Tc 7s 9c\n" +
            "9c 9h Js\n" +
            "8c 9c Td Jd 8d\n" +
            "Qh Td 5c\n" +
            "7d 5d 4d 4s 2s\n" +
            "8s 6d 2h Jd 6h\n" +
            "As Js Td Qs 8h\n" +
            "Jd Jh 5s 4s 3h\n" +
            "2s Jh Kc As Kh\n" +
            "Qc 2h Th Kd Qh\n" +
            "2h 9s 2c Qs\n" +
            "Qd 8s Jc 7s 5s\n" +
            "Jd Td As 5h\n" +
            "9c 5d Tc 8d Kh\n" +
            "Jd 2h 2d 8s 9c\n" +
            "8d Jd Ks Qc\n" +
            "Td 3s 7s 9c Qs\n" +
            "Jc 7d Js 3s Kh\n" +
            "Ah Tc Qc 6h 7c\n" +
            "2c 2s 5h Kc 5s\n" +
            "7c 8h Kd\n" +
            "Ah 2h Jc Tc 5c\n" +
            "Js Qh 6s 2c Kh\n" +
            "3d Ts Js 2h 6c\n" +
            "4h 5s Qc 8s Qs\n" +
            "7s 2s Kc 6s 2h\n" +
            "Kh 3c 8s 5s 2h\n" +
            "5d 9s 3c Kc 8c\n" +
            "Kh Kc Qh 9d 4s\n" +
            "5c Qc Qd Kd 3d\n" +
            "8d 2s Kc Qs Jd\n" +
            "2d 4d 3d 4h 9s\n" +
            "6s 7d 6c 7c 5c\n" +
            "6s 3h Js 9c 9h\n" +
            "5s 2h Qs 2c Jc\n" +
            "Td Jc 6d 8s 2d\n" +
            "3s Qd 3h\n" +
            "2c 2d Jd 9h 6c\n" +
            "Js 4h 7d Kh 8c\n" +
            "2d Jh Js Th 3s\n" +
            "Jd 6s 5s 5c 2d\n" +
            "Jh 5d 3s 9d 8h\n" +
            "3d 7c Jh 5h 5c\n" +
            "Qc As Jd\n" +
            "Ks 8s 5c\n" +
            "Ah 4d 6s 8d 7s\n" +
            "Qc 8h Kd Ts\n" +
            "Ks 3s 8s 9d\n" +
            "6c Ad 3s\n" +
            "8h Ad Ah 5s\n" +
            "6d 5h Kc 9c 7d\n" +
            "Kh Qc Ac\n" +
            "7d Ad 3h 6d 7c\n" +
            "6d Td Tc\n" +
            "8c Qs 4c Kh Td\n" +
            "7s 4d 6c 2s Td\n" +
            "5d 2s Jh 5h Ks\n" +
            "9s Ac 4s 9d 3h\n" +
            "7c 9c 3c 8s Jd\n" +
            "8d 9d Qc Ad 8h\n" +
            "5h As 7h 6d 3s\n" +
            "Kc Ac 4d 2s 5d\n" +
            "2s 4s 6d Js Ks\n" +
            "9h 4s Ah 8c Ts\n" +
            "7h 3s Th\n" +
            "Ks 4s 6d 8h 7s\n" +
            "9s Td 4s Js Kh\n" +
            "Ts 4d Qh Kh Kd\n" +
            "Kh Qh 8h 8c Th\n" +
            "Ks Th 8d 4c 5h\n" +
            "8c 4h As 5h 7d\n" +
            "2c 2s 7c 8h 5s\n" +
            "5d 9d 7d 2h Kd\n" +
            "8s 2c Td Kd Jh\n" +
            "9c 3s 7h 5d Qc\n" +
            "3h Td 7d 9s Tc\n" +
            "Qc 9s Qh Kd Qs\n" +
            "Qs 3s Tc Ac 2h\n" +
            "3c Tc 8h 4s\n" +
            "5h Qd 8h 4c 9s\n" +
            "Th 9c 3c 7c Ts\n" +
            "Kh Td Ad 8d 6d\n" +
            "4h 7s 5d 8c Ah\n" +
            "4s Kd 4h 5d Js\n" +
            "7s 4c Jd 6s Js\n" +
            "Th 2d 9h 3s 7d\n" +
            "Tc As 4c Js 4d\n" +
            "7c Ah Ad Td Ts\n" +
            "4s Ac Jc\n" +
            "Qd 6s Ts 5h Jh\n" +
            "8c 9s 3c 7c 9d\n" +
            "Qd Td Ks Ad 7c\n" +
            "2h Ks 7s\n" +
            "3c 5h 2h 3s Qc\n" +
            "6h Qh 5c 2d 2h\n" +
            "4h 9d 8s 5d\n" +
            "Qh 6d Th Td 2d\n" +
            "2h 5s 6s 3h Th\n" +
            "8s Ac Kc 4c 7s\n" +
            "8c Th Kc\n" +
            "8h 5s 9c\n" +
            "6d Ks Kd\n" +
            "Jh 7s 5c 2h Jc\n" +
            "Js Tc 9c 6h 9d\n" +
            "Ac 4s Td\n" +
            "9d 3s Ah\n" +
            "7c 7s Kh 3h 2h\n" +
            "8d Ks 6s Kd 7s\n" +
            "7c 2d Ad 5h 2s\n" +
            "4d Ac 6s 8d\n" +
            "Jd 5c 5h\n" +
            "Kc Qs 5h\n" +
            "Kd Td Qc 6c Jd\n" +
            "3s 8h 7h Tc Td\n" +
            "5d 8h Jd Qc 2c\n" +
            "Kd 9s Qd\n" +
            "Qh 2s 5c\n" +
            "Js 7d 4d 2d\n" +
            "As Jh Td Ad Qs\n" +
            "Jh Kc 3d 2s\n" +
            "Tc 6s 8s 9d\n" +
            "3h 3s Jc 8s Tc\n" +
            "6c 6h 6s 3s Qd\n" +
            "8d Kc 8s\n" +
            "3d Ah Jh 5s 7s\n" +
            "7c Jh 8s 9c Ad\n" +
            "7c 6h 4h\n" +
            "Jc Ts 9h\n" +
            "6d Jh 6c 3h\n" +
            "6h Jh Qh 4d 8c\n" +
            "7h 4s 5h 9h\n" +
            "3h 6c 4h\n" +
            "2d Ts 5c 9h\n" +
            "Td 3s 4d 7d 9c\n" +
            "3c 2d As\n" +
            "Th Kd Kh 2d 2s\n" +
            "Jc 9c 9h Ad 5d\n" +
            "9c Ks 5d Ac\n" +
            "5s Qh 9s 7c 5c\n" +
            "Jc 5c 7h\n" +
            "6s 7d Jd 4h\n" +
            "Ts Js 5h 7d 6s\n" +
            "Th 4c 2h Ks 2c\n" +
            "5d Js Ks\n" +
            "7d 7s 2d 5h 5s\n" +
            "Kh 5h Qc 9s 2d\n" +
            "7c Qc 4c 2h 3c\n" +
            "Kh 7h As\n" +
            "Kd Js 5h\n" +
            "Js Td Th\n" +
            "4s Qs Qd Ac 6h\n" +
            "7c 8d 2d 2c\n" +
            "Td 9d Ks Js Ac\n" +
            "Jc 2s Ks 7d Kd\n" +
            "2c Kd Jh 6s 4s\n" +
            "2d Qc 6d Jh Th\n" +
            "2s Qh 6d 3d\n" +
            "Kd Jc 6h 3h Td\n" +
            "Ts 4s 2c 3h 9d\n" +
            "Jd 8d Ts\n" +
            "Js 3c 2c 8h\n" +
            "As 6s 6h Qs 7c\n" +
            "7s 7c 8h Kh Jh\n" +
            "Ad Th 9c Kd Ks\n" +
            "5s Ks Qh 7d Jd\n" +
            "Kh 9s 4s Ah 5d\n" +
            "8c Ac 2c 3d Ts\n" +
            "9c Jc Ad 6c Jh\n" +
            "Ah Qs 8c Ad Qc\n" +
            "4h Kc Qh Ks Ah\n" +
            "6s Ah Qd 3d Ks\n" +
            "4h 9d 9h 7h 8h\n" +
            "Jc 8s 5c 5h 6h\n" +
            "Jc 9h Tc Th Td\n" +
            "8s 3d 5d 4s 7h\n" +
            "Jh 7h Tc 3h Ah\n" +
            "3h Ad 4h 2h 5d\n" +
            "Td Ad 7h Ac Kh\n" +
            "Th 6s 3d\n" +
            "4d Td 9s 8d 5c\n" +
            "5s As Kc 9d 2s\n" +
            "2s Ts 4h 2d 6c\n" +
            "Qs Qd Qh\n" +
            "2c Kd Qc Js 6h\n" +
            "Ac Kd 8d 2c Jd\n" +
            "5c 9h 2c 9s Qc\n" +
            "8c 9h Jc 5s Qh\n" +
            "9c 7d Qh Th 9d\n" +
            "Ac Th 6s Jc 7h\n" +
            "Td 7d 9d 2h Qd\n" +
            "2c 7c 6c Kd Td\n" +
            "Jc 9s 3d Ks\n" +
            "Tc 8d Ad 4s 9h\n" +
            "8s 8c Tc 2s 9d\n" +
            "Tc Jh Js 2h 3c\n" +
            "Th Jc Kd\n" +
            "4c 2h Ts Qc\n" +
            "Qd Ah Jd 9c 2h\n" +
            "5c Kh Jc Qc 6h\n" +
            "3s 3c 6d 2h 5s\n" +
            "Ac 8s Ks 9s Tc\n" +
            "Jh 6h 8h Tc Qh\n" +
            "Qh 7h 4d 5s 2d\n" +
            "3c Ah 9h\n" +
            "Tc Td 9c 2d\n" +
            "3d 2d 7s 2c 8s\n" +
            "6s 7c Ac 9d 3s\n" +
            "6d 5d 9c Jc 6s\n" +
            "4d 5h Kh 2h\n" +
            "Ad 3c Ah 3s Qh\n" +
            "6d 2s 5c\n" +
            "2c 5c 6c Qs Qc\n" +
            "2d 9c 6h 9h Tc\n" +
            "Ts 5h 8c 4c\n" +
            "Ts 6c 9c 6d 7d\n" +
            "2h Qh 8d\n" +
            "7h 6h Ad Kh 9d\n" +
            "9d 3h 5c 6h 9c\n" +
            "Ad 9d Ah 5c Jh\n" +
            "6h 7d Qd Ad Kh\n" +
            "Qh 6h Kc 6s Ac\n" +
            "Kd 8c 6s 7s 4c\n" +
            "Jh 3s 6c 5s 2c\n" +
            "3h Ac 8s Ts Jh\n" +
            "6c Tc Ks 2d 4d\n" +
            "Qs Jc Kd Ts Kc\n" +
            "5s 8d 7c Qc\n" +
            "Js 9d 2s 2c Ks\n" +
            "Jc 9d 7h\n" +
            "Jd 4c 3c Ad Qh\n" +
            "7d Qd 6h Qh 4d\n" +
            "2c 8s Qc Kc 9c\n" +
            "Qd Td 7h 3d 7s\n" +
            "6h 9s Kh 3c 2s\n" +
            "2h 8d 5d 6d 4d\n" +
            "Qc Td 5s 5d 7c\n" +
            "Kd 8s Kh Ts Ah\n" +
            "Ks 4d Kc 2h As\n" +
            "7h Kc 6c Qs\n" +
            "7h Td 2h 3s 3c\n" +
            "5d Qc 6h 7s 3c\n" +
            "6h 2h 4s 6d Qs\n" +
            "Td 6c 2c Qd Ah\n" +
            "Kd 7c 6d Jh 7h\n" +
            "Qc Kd 5s 7c 2d\n" +
            "3d Qh Ac 6s\n" +
            "Jd 5s 7s 9c Ks\n" +
            "Kh 7d 9h Kd\n" +
            "6d Kc 2c 5s 7c\n" +
            "Td 8d 7c Kd 2d\n" +
            "Jd Tc 6c Kd 7s\n" +
            "7h 5h 3d Qc\n" +
            "6d Th 7c 2d 5h\n" +
            "Jh 4h Ac\n" +
            "3d 8s 5d Qh As\n" +
            "4s 7h 5d 8h 9h\n" +
            "Ts 2c 4h Kd 2s\n" +
            "6s Tc As Ac Jc\n" +
            "6h Jd 3c 8d Ac\n" +
            "7s Jd Th 9c 5s\n" +
            "Qc 3c 9h 7c\n" +
            "5h 2h Qs Td 2d\n" +
            "5d 9d Jc Js 9c\n" +
            "9d Tc Ac\n" +
            "8s Ts 6h\n" +
            "8c Qh 9c 7h\n" +
            "As Ks 4s 3s 4d\n" +
            "Ks Ac 2c 7h 9s\n" +
            "7h Ad Qc 7s 9s\n" +
            "Ts 6h Th 3s Tc\n" +
            "Kd Qs Ks Qh\n" +
            "7s Jc Kc As 9c\n" +
            "Jc 8d 5c 2d 4h\n" +
            "3c Th Qd 7h Td\n" +
            "Ah Kd 4h Kc 4d\n" +
            "4c Kd 8h Qs 8s\n" +
            "5h 6s Th 8s Qd\n" +
            "9d Tc Qd 7c Kh\n" +
            "Kc 6h 7c Ts 7d\n" +
            "4d Qc Ah As 8h\n" +
            "4s Tc Js 6c 4d\n" +
            "5d Ad 4h Jd Th\n" +
            "7d As 3h 2d Ah\n" +
            "Ts 5s 7s 9c Ac\n" +
            "6d 4c Jc 2c Td\n" +
            "Ks 3h Tc Qh Ah\n" +
            "Ac 4c 7h Tc 2c\n" +
            "7d 5s 6h 9c 6d\n" +
            "8s 6s 2h Jd Kh\n" +
            "Td 3d 2c 4s 9h\n" +
            "2c 5s 7c Qd 7s\n" +
            "4d Ks 6s 5c 8c\n" +
            "Qc 3d 4h 6d\n" +
            "4h 4c 8s Qs 5d\n" +
            "4s Ks 8s 8h 6c\n" +
            "Ks 6c 9d Qh Ad\n" +
            "9c Jd Js Qd 8h\n" +
            "5d Qs 6d\n" +
            "4d Td 9h Ah 3h\n" +
            "3h Tc 8s 8h Js\n" +
            "9s Ks Qs Ac 7d\n" +
            "Ah Jc 3h 4d 2c\n" +
            "9s Jh 6d 3s As\n" +
            "4h Ad 7s 6h As\n" +
            "Jh Ad Kh 2c 8d\n" +
            "6c Kd Tc\n" +
            "Ah 7d Tc 8h Kd\n" +
            "Ts 5h Ks Jh Js\n" +
            "Qs Js 3d Ac\n" +
            "3h 5d 5s 8d\n" +
            "8d Jc Td 4c 5h\n" +
            "9d 7h 4h 9s 2c\n" +
            "Kd 3h 7h Ad Ks\n" +
            "Td Jc 9h Ks 6h\n" +
            "As 3h Kd\n" +
            "Qs 2c Jd 7s\n" +
            "9h 4s Kc Ac 5s\n" +
            "3s Kh 2d 8d 2s\n" +
            "7s 6h 6c 4c 9s\n" +
            "7s 4s As Ac 5s\n" +
            "7s 3c 3h 7c 2d\n" +
            "2c 5d 7s 3d Tc\n" +
            "2h 4d Td 2d Qs\n" +
            "Ad Th 3h 9c Kh\n" +
            "7c Qs 3s 5s 2d\n" +
            "3c Jh Ks 6h 8c\n" +
            "4c 8s 8c 6c Jh\n" +
            "5h 6d 2s Qh 2c\n" +
            "5s 3s Kh As Qd\n" +
            "4s 8h 3s 5d\n" +
            "3h 4c As 2c Ts\n" +
            "Jd Tc 4c As 2h\n" +
            "Ac Kc Qc Td 7h\n" +
            "3c 6s 3d Jc Tc\n" +
            "9d 9h 7d 3h 5d\n" +
            "Jc Ks 5d 4s 8h\n" +
            "Qc 3h 8s Tc 9s\n" +
            "7c 8d Js 2d\n" +
            "7h 3s 7d 7c 8h\n" +
            "6d 5c Th 4c 3c\n" +
            "Ac 4c 8c 2s 4h\n" +
            "7h Kd 8s 2s Ah\n" +
            "7h 2h 6h Qc 5s\n" +
            "Kh 2h 5s Qs 9s\n" +
            "Qc 8s 9s 8c Kc\n" +
            "5h Ac Js 8c 4c\n" +
            "9s Qs 2h 6d Ac\n" +
            "Qs 3s 8d Kc\n" +
            "Qd Ts 6c Qc 9h\n" +
            "5s 7d Jc Ks 4s\n" +
            "Kd Tc 9c 4c Ah\n" +
            "8d 5s 5d Kd Jc\n" +
            "Ks 9s 8h Jh 3c\n" +
            "5s As 5c 2s\n" +
            "7s Jh Ad Tc Ac\n" +
            "Qd 4h Th 4d 2h\n" +
            "4d 6h 3d 2c 5s\n" +
            "4d 5c Qs Ad 4c\n" +
            "6c 2h 7h 8s 5d\n" +
            "Jh As 7d Ks Ah\n" +
            "7s Kc 4h 8h As\n" +
            "2c 9s Jd 6h 8s\n" +
            "As 6d Th Kc 9c\n" +
            "2d 2c 9d 5c 5s\n" +
            "6d Qs 3h 7d 9s\n" +
            "7d 3h 8h\n" +
            "2d 7d Qd Td 3h\n" +
            "9s 3h Kd 2d\n" +
            "2s 5h 2h 8d 8s\n" +
            "Ks 5h 9d 3d 2d\n" +
            "Ts 6h 6c Qd Th\n" +
            "7c Qs 6c Kc Kd\n" +
            "8d Th Jh 4c 9c\n" +
            "9h Kd Th 9c\n" +
            "Th 2d Tc 9h 9d\n" +
            "Tc 6s 9d Qs 5s\n" +
            "Ac Js 6h Qd 3c\n" +
            "7s 5h Qc 9d 7d\n" +
            "Jd 9s 3h Ad 8s\n" +
            "7h Kc Qc 6c Kd\n" +
            "9h 2s 5c 4h Kc\n" +
            "8c Kc 5c 8d Tc\n" +
            "5h Ac Qd\n" +
            "2s Qc 6d Kd 4h\n" +
            "9d 5d Td Ah 7s\n" +
            "2c 8h As 6d Kc\n" +
            "2d 9d 8s 7s 8c\n" +
            "9h Qc 3h 6h Qs\n" +
            "2h Tc 3h Js 8c\n" +
            "9h 9s 8d 2d\n" +
            "Kd 4c Ts Jc 2c\n" +
            "Th Td 9c 9s 8h\n" +
            "Qs 3c 2c 5c 7h\n" +
            "8c Qh 4s 6d\n" +
            "8s Qc 6h 8d Qh\n" +
            "Jh Js 7d 6c As\n" +
            "5c 2s 5d Jh Qc\n" +
            "Tc 5h Ad 3s 7s\n" +
            "4c Kh 2d 6h Qh\n" +
            "Ac Qd As Td 3s\n" +
            "6d Qs Kc 3s 9d\n" +
            "3s 3d 4c 5d 9h\n" +
            "4d Qc Qd 9h 2h\n" +
            "5c Ts 4c Td 6d\n" +
            "8h Qd 6d 7h 4c\n" +
            "Qs 5s 8h Ac Ts\n" +
            "5s 4h 6h 7h 2s\n" +
            "2c 9c 5h 6c\n" +
            "4s 6d 2d 5c Td\n" +
            "9c 5d 6c Qd 3h\n" +
            "9c 8d 9h 6c Qc\n" +
            "Kh 2s Qd Ad\n" +
            "As Qd 7s 9d Qs\n" +
            "8d 9h Td\n" +
            "2h 4h 7d 8d 4s\n" +
            "2c 6h Jh 7s\n" +
            "Ts 8c Ac Ks 7s\n" +
            "Jh Ts 3d Kc 5h\n" +
            "3h Jd 8d Td 5h\n" +
            "Qs As Qd Js 6d\n" +
            "9s Qd Js Tc 2h\n" +
            "Tc Jd 6s 4h 6c\n" +
            "3c 8h 5s 6h 7d\n" +
            "Qs Th 3s 7d 4s\n" +
            "Kh Jh Th 8d Ad\n" +
            "4d 3h 2h Qc 9h\n" +
            "6s 9s 5c 2d 7h\n" +
            "Qd 4s 3h Ad Kc\n" +
            "8s 2c 7s 9d 2h\n" +
            "Jh Th 6h 3h Kc\n" +
            "7d 7c Jh Ks 5h\n" +
            "4s 9h 2h Tc Qd\n" +
            "2s 4h 3s\n" +
            "7h 7c Th 6h Ts\n" +
            "4s 4h 2s Td Jh\n" +
            "6c Ad Jh 8s 7d\n" +
            "Jc Qh Jh 8h 3s\n" +
            "Ad Jc Ah Qd 6h\n" +
            "Qs Kc 9c 3s 2s\n" +
            "3h Th Ad 4s Jd\n" +
            "Ks 9d 7c As\n" +
            "5h 5d 8d 4h 2c\n" +
            "4s 4c 7d 2s 9h\n" +
            "6h Qc 6s\n" +
            "Qd 6h 2h 5h 3c\n" +
            "3c 9c Ks 5s 5c\n" +
            "7s Tc 7d 9d 6s\n" +
            "Ts Jd Ah 3s 6s\n" +
            "5h 3s 6c 2h Jd\n" +
            "5s Tc Qs As 6c\n" +
            "Kd 5d As Qs 4c\n" +
            "4h Kh Kd Qd Jc\n" +
            "Qc 9d 5d Kc 5c\n" +
            "Tc 4d 2d 3d 2c\n" +
            "As 3c 4c 3h Qh\n" +
            "5c 8h 4s 5d Kd\n" +
            "Qc 6d Ad 9s Jc\n" +
            "Kd 6c 6s 5s 2s\n" +
            "Jd 5s 6h 5d 8h\n" +
            "6c Ah 6d Kc 7c\n" +
            "8s 3h 3s Qc As\n" +
            "Ac Td 6h 7c Kd\n" +
            "9h 3h 3s 8h Ts\n" +
            "6d Kc Kh 6h 9c\n" +
            "3s Ts 7s 4s\n" +
            "7h Kd Ts 4h 7c\n" +
            "9h Jd Ah Tc 7c\n" +
            "3h 4d Js Qd 4h\n" +
            "5d 2c Qc Ks Js\n" +
            "4h 9d 5c 9s 2c\n" +
            "Jd 6d 3d 8h 7h\n" +
            "6d Ac Kd 6c\n" +
            "2d 5h 6h Ts 3s\n" +
            "3c 4d 9d 6c 8s\n";


//    String[] preFlopArray = preFlop.split("\n");
//    String[] flopArray = flop.split("\n");
//    String[] turnArray = turn.split("\n");
//    String[] riverArray = river.split("\n");
    String[] facesArray = cards.split("\n");
    String[] tableArray = table.split("\n");

    ArrayList<ArrayList<Card>> playerCards = new ArrayList<>();
    ArrayList<ArrayList<Card>> tableCards = new ArrayList<>();


    public void getCards() {
        String face1 = "";
        String suit1 = "";
        String face2 = "";
        String suit2 = "";
        for (String hand : facesArray) {


            String face1Letter = String.valueOf(hand.charAt(0));
            String suit1Letter = String.valueOf(hand.charAt(1));

            String face2Letter = String.valueOf(hand.charAt(3));
            String suit2Letter = String.valueOf(hand.charAt(4));

            switch (face1Letter) {
                case "2":
                    face1 = "two";
                    break;
                case "3":
                    face1 = "three";
                    break;
                case "4":
                    face1 = "four";
                    break;
                case "5":
                    face1 = "five";
                    break;
                case "6":
                    face1 = "six";
                    break;
                case "7":
                    face1 = "seven";
                    break;
                case "8":
                    face1 = "eight";
                    break;
                case "9":
                    face1 = "nine";
                    break;
                case "T":
                    face1 = "ten";
                    break;
                case "J":
                    face1 = "jack";
                    break;
                case "Q":
                    face1 = "queen";
                    break;
                case "K":
                    face1 = "king";
                    break;
                case "A":
                    face1 = "ace";
            }

            switch (suit1Letter) {
                case "c":
                    suit1 = "clubs";
                    break;
                case "d":
                    suit1 = "diamonds";
                    break;
                case "h":
                    suit1 = "hearts";
                    break;
                case "s":
                    suit1 = "spades";
            }

            switch (face2Letter) {
                case "2":
                    face2 = "two";
                    break;
                case "3":
                    face2 = "three";
                    break;
                case "4":
                    face2 = "four";
                    break;
                case "5":
                    face2 = "five";
                    break;
                case "6":
                    face2 = "six";
                    break;
                case "7":
                    face2 = "seven";
                    break;
                case "8":
                    face2 = "eight";
                    break;
                case "9":
                    face2 = "nine";
                    break;
                case "T":
                    face2 = "ten";
                    break;
                case "J":
                    face2 = "jack";
                    break;
                case "Q":
                    face2 = "queen";
                    break;
                case "K":
                    face2 = "king";
                    break;
                case "A":
                    face2 = "ace";
            }

            switch (suit2Letter) {
                case "c":
                    suit2 = "clubs";
                    break;
                case "d":
                    suit2 = "diamonds";
                    break;
                case "h":
                    suit2 = "hearts";
                    break;
                case "s":
                    suit2 = "spades";
            }
            Card card1 = new Card(suit1, face1);
            Card card2 = new Card(suit2, face2);

            playerCards.add(new ArrayList<Card>() {{
                add(card1);
                add(card2);
            }});

        }
    }


    public void getTable() {
        String face1 = "";
        String suit1 = "";
        String face2 = "";
        String suit2 = "";
        String face3 = "";
        String suit3 = "";
        String face4 = "";
        String suit4 = "";
        String face5 = "";
        String suit5 = "";
        String face1Letter = "";
        String suit1Letter = "";
        String face2Letter = "";
        String suit2Letter = "";
        String face3Letter = "";
        String suit3Letter = "";
        String face4Letter = "";
        String suit4Letter = "";
        String face5Letter = "";
        String suit5Letter = "";
        for (String hand : tableArray) {

            if (hand.length() == 8) {
                face1Letter = String.valueOf(hand.charAt(0));
                suit1Letter = String.valueOf(hand.charAt(1));

                face2Letter = String.valueOf(hand.charAt(3));
                suit2Letter = String.valueOf(hand.charAt(4));

                face3Letter = String.valueOf(hand.charAt(6));
                suit3Letter = String.valueOf(hand.charAt(7));
            }
            if (hand.length() == 11) {
                face1Letter = String.valueOf(hand.charAt(0));
                suit1Letter = String.valueOf(hand.charAt(1));

                face2Letter = String.valueOf(hand.charAt(3));
                suit2Letter = String.valueOf(hand.charAt(4));

                face3Letter = String.valueOf(hand.charAt(6));
                suit3Letter = String.valueOf(hand.charAt(7));

                face4Letter = String.valueOf(hand.charAt(9));
                suit4Letter = String.valueOf(hand.charAt(10));
            }
            if (hand.length() == 14) {
                face1Letter = String.valueOf(hand.charAt(0));
                suit1Letter = String.valueOf(hand.charAt(1));

                face2Letter = String.valueOf(hand.charAt(3));
                suit2Letter = String.valueOf(hand.charAt(4));

                face3Letter = String.valueOf(hand.charAt(6));
                suit3Letter = String.valueOf(hand.charAt(7));

                face4Letter = String.valueOf(hand.charAt(9));
                suit4Letter = String.valueOf(hand.charAt(10));

                face5Letter = String.valueOf(hand.charAt(12));
                suit5Letter = String.valueOf(hand.charAt(13));
            }


            switch (face1Letter) {
                case "2":
                    face1 = "two";
                    break;
                case "3":
                    face1 = "three";
                    break;
                case "4":
                    face1 = "four";
                    break;
                case "5":
                    face1 = "five";
                    break;
                case "6":
                    face1 = "six";
                    break;
                case "7":
                    face1 = "seven";
                    break;
                case "8":
                    face1 = "eight";
                    break;
                case "9":
                    face1 = "nine";
                    break;
                case "T":
                    face1 = "ten";
                    break;
                case "J":
                    face1 = "jack";
                    break;
                case "Q":
                    face1 = "queen";
                    break;
                case "K":
                    face1 = "king";
                    break;
                case "A":
                    face1 = "ace";
            }

            switch (suit1Letter) {
                case "c":
                    suit1 = "clubs";
                    break;
                case "d":
                    suit1 = "diamonds";
                    break;
                case "h":
                    suit1 = "hearts";
                    break;
                case "s":
                    suit1 = "spades";
            }

            switch (face2Letter) {
                case "2":
                    face2 = "two";
                    break;
                case "3":
                    face2 = "three";
                    break;
                case "4":
                    face2 = "four";
                    break;
                case "5":
                    face2 = "five";
                    break;
                case "6":
                    face2 = "six";
                    break;
                case "7":
                    face2 = "seven";
                    break;
                case "8":
                    face2 = "eight";
                    break;
                case "9":
                    face2 = "nine";
                    break;
                case "T":
                    face2 = "ten";
                    break;
                case "J":
                    face2 = "jack";
                    break;
                case "Q":
                    face2 = "queen";
                    break;
                case "K":
                    face2 = "king";
                    break;
                case "A":
                    face2 = "ace";
            }

            switch (suit2Letter) {
                case "c":
                    suit2 = "clubs";
                    break;
                case "d":
                    suit2 = "diamonds";
                    break;
                case "h":
                    suit2 = "hearts";
                    break;
                case "s":
                    suit2 = "spades";
            }

            switch (face3Letter) {
                case "2":
                    face3 = "two";
                    break;
                case "3":
                    face3 = "three";
                    break;
                case "4":
                    face3 = "four";
                    break;
                case "5":
                    face3 = "five";
                    break;
                case "6":
                    face3 = "six";
                    break;
                case "7":
                    face3 = "seven";
                    break;
                case "8":
                    face3 = "eight";
                    break;
                case "9":
                    face3 = "nine";
                    break;
                case "T":
                    face3 = "ten";
                    break;
                case "J":
                    face3 = "jack";
                    break;
                case "Q":
                    face3 = "queen";
                    break;
                case "K":
                    face3 = "king";
                    break;
                case "A":
                    face3 = "ace";
            }

            switch (suit3Letter) {
                case "c":
                    suit3 = "clubs";
                    break;
                case "d":
                    suit3 = "diamonds";
                    break;
                case "h":
                    suit3 = "hearts";
                    break;
                case "s":
                    suit3 = "spades";
            }

            switch (face4Letter) {
                case "2":
                    face4 = "two";
                    break;
                case "3":
                    face4 = "three";
                    break;
                case "4":
                    face4 = "four";
                    break;
                case "5":
                    face4 = "five";
                    break;
                case "6":
                    face4 = "six";
                    break;
                case "7":
                    face4 = "seven";
                    break;
                case "8":
                    face4 = "eight";
                    break;
                case "9":
                    face4 = "nine";
                    break;
                case "T":
                    face4 = "ten";
                    break;
                case "J":
                    face4 = "jack";
                    break;
                case "Q":
                    face4 = "queen";
                    break;
                case "K":
                    face4 = "king";
                    break;
                case "A":
                    face4 = "ace";
            }

            switch (suit4Letter) {
                case "c":
                    suit4 = "clubs";
                    break;
                case "d":
                    suit4 = "diamonds";
                    break;
                case "h":
                    suit4 = "hearts";
                    break;
                case "s":
                    suit4 = "spades";
            }

            switch (face5Letter) {
                case "2":
                    face5 = "two";
                    break;
                case "3":
                    face5 = "three";
                    break;
                case "4":
                    face5 = "four";
                    break;
                case "5":
                    face5 = "five";
                    break;
                case "6":
                    face5 = "six";
                    break;
                case "7":
                    face5 = "seven";
                    break;
                case "8":
                    face5 = "eight";
                    break;
                case "9":
                    face5 = "nine";
                    break;
                case "T":
                    face5 = "ten";
                    break;
                case "J":
                    face5 = "jack";
                    break;
                case "Q":
                    face5 = "queen";
                    break;
                case "K":
                    face5 = "king";
                    break;
                case "A":
                    face5 = "ace";
            }

            switch (suit5Letter) {
                case "c":
                    suit5 = "clubs";
                    break;
                case "d":
                    suit5 = "diamonds";
                    break;
                case "h":
                    suit5 = "hearts";
                    break;
                case "s":
                    suit5 = "spades";
            }
            Card card1 = new Card(suit1, face1);
            Card card2 = new Card(suit2, face2);
            Card card3 = new Card(suit3, face3);
            Card card4 = new Card(suit4, face4);
            Card card5 = new Card(suit5, face5);

            if (!face5Letter.equals("")) {
                tableCards.add(new ArrayList<Card>() {{
                    add(card1);
                    add(card2);
                    add(card3);
                    add(card4);
                    add(card5);
                }});
                continue;
            }
            if (!face4Letter.equals("")) {
                tableCards.add(new ArrayList<Card>() {{
                    add(card1);
                    add(card2);
                    add(card3);
                    add(card4);
                }});
                continue;
            }
            if (!face3Letter.equals("")) {
                tableCards.add(new ArrayList<Card>() {{
                    add(card1);
                    add(card2);
                    add(card3);
                }});
            }

        }
    }

    public ArrayList<String> getActions(String[] array) {
        ArrayList<String> tempArray = new ArrayList<>();
        String tempString;
        for (String action : array) {
            switch (String.valueOf(action.charAt(0))) {
                case "B":
                    tempString = "bet";
                    break;
                case "f":
                    tempString = "fold";
                    break;
                case "k":
                    tempString = "check";
                    break;
                case "b":
                    tempString = "bet";
                    break;
                case "c":
                    tempString = "call";
                    break;
                case "r":
                    tempString = "raise";
                    break;
                case "A":
                    tempString = "all-in";
                    break;
                case "-":
                    tempString = "no action";
                    break;
                default:
                    tempString = "Undeclared Variable";
            }
            tempArray.add(tempString);
        }
        return tempArray;
    }

    HashMap<Double, Double> handProbabilityMap = new HashMap<>();

    public HashMap<Double, Double> handStrengthGivenTableStrengthAndAction(Double tableStrength, String opponentAction, String gameState) {
        HashMap<Double, Double> probOfHand = new HashMap<>();
        int gameStateInt = 0;
        switch (gameState) {
            case "flop":
                gameStateInt = 3;
                break;
            case "turn":
                gameStateInt = 4;
                break;
            case "river":
                gameStateInt = 5;
        }
        Double sum = sumTableActionProb(tableStrength, opponentAction, gameStateInt);
        ArrayList<Double> as = new ArrayList<>(globalVariables.preFlopStateMap.keySet());
        for (int i = 0; i < as.size(); i++) {
            probOfHand.put(as.get(i),
                    (tableActionProb(as.get(i), tableStrength, opponentAction, gameStateInt) / sum));

        }
        handProbabilityMap = probOfHand;
        return probOfHand;
    }

    public Double tableActionProb(Double hand, Double tableStrength, String opponentAction, Integer gameState) {
        //player cards
        //table cards
        double matching = 0;
        double total = 0;
        winTest handWinTest = new winTest(new ArrayList<>());
        winTest tableWinTest;
        ArrayList<String> turnActions = globalVariables.turnAction;
        for (int i = 0; i < playerCards.size(); i++) {
            handWinTest = new winTest(playerCards.get(i));
            handWinTest.handCheck();
            if (hand == handWinTest.player.handValue) {
                tableWinTest = new winTest(new ArrayList<>(tableCards.get(i).subList(0, gameState)));
                tableWinTest.handCheck();
                if (tableWinTest.player.handValue == tableStrength && opponentAction.equals(turnActions.get(i))) {
                    matching++;
                }
            }
            total++;
        }
        return ((matching / total) * getProbOfHandAtState(handWinTest.player.handValue));
    }

    public Double sumTableActionProb(Double tableStrength, String opponentAction, Integer gameState) {
        Double sum = 0.0;
        winTest handWinTest;
        winTest tableWinTest;
        ArrayList<Double> as = new ArrayList<>(globalVariables.preFlopStateMap.keySet());
        winTest iWinTest = new winTest(new ArrayList<>());
        double matching = 0;
        double total = 0;
        for (int i = 0; i < as.size(); i++) {
            for (int j = 0; j < playerCards.size(); j++) {
                handWinTest = new winTest(playerCards.get(j));
                iWinTest = new winTest(playerCards.get(i));
                iWinTest.handCheck();
                handWinTest.handCheck();
                if (handWinTest.player.handValue == iWinTest.player.handValue) {
                    tableWinTest = new winTest(new ArrayList<>(tableCards.get(i).subList(0, gameState)));
                    tableWinTest.handCheck();
                    if (tableWinTest.player.handValue == tableStrength && opponentAction.equals(globalVariables.turnAction.get(j))) {
                        matching++;
                    }
                }
                total++;
            }
            sum += ((matching / total) * (getProbOfHandAtState(iWinTest.player.handValue)));
        }
        return sum;
    }

    public Double getProbOfHandAtState(Double handValue) {
        double size = 0;
        for (Integer value : globalVariables.probabilityOfHand.values()) {
            size += value;
        }
        return globalVariables.probabilityOfHand.get(handValue) / size;
    }


    public void saveActions(ArrayList<String> var, String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream("probabilities/" + fileName + ".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(var);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void saveStrings(HashMap<String, Double> var, String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream("probabilities/" + fileName + ".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(var);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void saveMapCount(HashMap<Double, Double> var, String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream("probabilities/" + fileName + ".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(var);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public void saveActions() {
        saveActions(globalVariables.preFlopAction, "preFlopActions");
        saveActions(globalVariables.flopAction, "flopActions");
        saveActions(globalVariables.turnAction, "turnActions");
        saveActions(globalVariables.riverAction, "riverActions");
    }

    public void saveStrings() {
        saveStrings(globalVariables.preFlopActionMapCount, "preFlopActionMapCount");
        saveStrings(globalVariables.flopActionMapCount, "flopActionMapCount");
        saveStrings(globalVariables.turnActionMapCount, "turnActionMapCount");
        saveStrings(globalVariables.riverActionMapCount, "riverActionMapCount");
    }

    public void saveMaps() {
        saveMapCount(globalVariables.preFlopStateMap, "preFlopStateMap");
        saveMapCount(globalVariables.flopStateMap, "flopStateMap");
        saveMapCount(globalVariables.turnStateMap, "turnStateMap");
        saveMapCount(globalVariables.riverStateMap, "riverStateMap");
    }

    public void getMaps(String fileName) {
        try {
            FileInputStream fileIn = new FileInputStream("probabilities/" + fileName + ".ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            switch (fileName) {
                case "preFlopActionMapCount":
                    globalVariables.preFlopActionMapCount = (HashMap<String, Double>) in.readObject();
                    break;
                case "flopActionMapCount":
                    globalVariables.flopActionMapCount = (HashMap<String, Double>) in.readObject();
                    break;
                case "turnActionMapCount":
                    globalVariables.turnActionMapCount = (HashMap<String, Double>) in.readObject();
                    break;
                case "riverActionMapCount":
                    globalVariables.riverActionMapCount = (HashMap<String, Double>) in.readObject();
                    break;
                case "preFlopStateMap":
                    globalVariables.preFlopStateMap = (HashMap<Double, Double>) in.readObject();
                    break;
                case "flopStateMap":
                    globalVariables.flopStateMap = (HashMap<Double, Double>) in.readObject();
                    break;
                case "turnStateMap":
                    globalVariables.turnStateMap = (HashMap<Double, Double>) in.readObject();
                    break;
                case "riverStateMap":
                    globalVariables.riverStateMap = (HashMap<Double, Double>) in.readObject();
                    break;
                case "preFlopActions":
                    globalVariables.preFlopAction = (ArrayList<String>) in.readObject();
                    break;
                case "flopActions":
                    globalVariables.flopAction = (ArrayList<String>) in.readObject();
                    break;
                case "turnActions":
                    globalVariables.turnAction = (ArrayList<String>) in.readObject();
                    break;
                case "riverActions":
                    globalVariables.riverAction = (ArrayList<String>) in.readObject();
            }
            in.close();
        } catch (IOException i) {

        } catch (ClassNotFoundException c) {
            Gdx.app.error("Class not found", "");
        }
    }


}
