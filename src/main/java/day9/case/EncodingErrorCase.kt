package day9.case

class EncodingErrorCase {

    companion object {
        val case = """
            24
            27
            31
            3
            26
            29
            14
            16
            25
            15
            32
            6
            41
            22
            2
            1
            12
            8
            7
            4
            48
            13
            47
            34
            5
            18
            33
            11
            45
            3
            9
            10
            14
            21
            16
            15
            17
            20
            19
            6
            22
            23
            12
            8
            7
            26
            24
            13
            25
            27
            29
            18
            28
            35
            42
            30
            31
            32
            14
            33
            21
            46
            36
            37
            15
            19
            40
            63
            20
            22
            38
            67
            34
            39
            43
            41
            53
            29
            44
            45
            76
            84
            50
            35
            55
            42
            56
            74
            48
            73
            49
            58
            88
            51
            63
            64
            69
            68
            70
            71
            77
            78
            86
            85
            95
            90
            114
            138
            83
            91
            136
            206
            153
            97
            121
            119
            109
            115
            120
            131
            139
            137
            141
            207
            181
            155
            163
            173
            176
            174
            210
            180
            305
            192
            212
            369
            303
            228
            206
            224
            234
            229
            317
            251
            280
            350
            278
            296
            318
            379
            328
            336
            382
            497
            354
            372
            386
            440
            398
            418
            524
            587
            479
            430
            453
            707
            696
            812
            697
            664
            596
            574
            771
            722
            682
            1175
            690
            758
            1140
            726
            826
            784
            816
            897
            992
            883
            1066
            909
            1112
            1179
            1170
            1296
            1318
            2088
            1238
            1380
            1300
            1995
            1372
            1466
            1416
            1448
            1896
            1510
            1542
            2112
            1986
            1725
            1780
            3008
            1949
            1975
            3412
            2282
            2721
            2408
            2734
            2828
            2864
            3018
            3459
            2672
            2788
            2820
            2882
            2958
            3228
            3322
            4231
            3267
            4670
            3505
            3674
            4957
            4257
            4683
            4383
            5522
            4690
            5129
            5080
            5406
            5460
            5492
            5554
            6247
            8175
            5608
            10162
            8195
            9663
            6495
            6589
            6772
            7888
            10278
            8803
            9763
            8640
            13803
            9073
            10928
            10182
            9770
            10540
            10486
            10866
            10952
            11046
            14411
            14422
            12103
            17541
            16981
            18573
            13084
            18918
            24897
            14660
            16528
            17876
            17443
            17713
            18843
            19255
            19559
            19952
            24908
            20310
            35824
            21352
            25363
            24036
            23149
            31188
            25187
            26763
            27744
            29612
            39565
            38870
            40023
            32103
            57441
            38795
            38814
            35156
            36968
            38098
            39207
            39511
            44501
            41662
            43459
            64233
            91977
            47185
            65558
            48336
            51950
            54799
            66614
            90745
            82970
            71310
            76912
            67259
            69071
            74667
            79760
            72124
            73254
            86696
            134559
            86163
            120357
            85121
            115595
            109017
            95521
            146374
            99135
            100286
            103135
            106749
            121413
            140513
            136330
            138569
            139383
            141195
            172859
            142325
            145378
            151884
            157245
            171817
            186982
            198656
            171284
            237704
            180642
            202270
            194656
            195807
            243648
            240330
            305405
            209884
            276843
            274899
            310386
            275713
            279764
            302623
            483245
            287703
            393312
            297262
            309129
            367091
            471520
            412154
            375298
            455541
            376449
            382912
            668211
            470706
            493069
            450214
            484783
            585285
            486727
            977852
            550612
            555477
            578336
            590326
            584965
            596832
            606391
            673711
            664353
            1135059
            957433
            788603
            942268
            973281
            1005691
            759361
            1021318
            920920
            934997
            1378929
            1476397
            971510
            1037339
            1042204
            1796700
            1963894
            1133813
            1163301
            1175291
            1344326
            1385435
            1280102
            1338064
            1423714
            1934652
            2482088
            1760113
            1730871
            2285793
            1680281
            1972336
            2306355
            2421133
            1906507
            2008849
            2013714
            3844847
            2171152
            2761778
            3586788
            2501365
            2297114
            2338592
            3330221
            2618166
            2665537
            3010973
            5061092
            3103995
            3411152
            3440394
            3490984
            4269450
            4310828
            3652617
            3878843
            4807720
            3915356
            3920221
            4022563
            6889816
            4468266
            8460337
            6088153
            6806858
            4635706
            4915280
            4956758
            6931378
            6270783
            8936320
            6114968
            6515147
            6544389
            6851546
            7093011
            7143601
            7675180
            7531460
            7572838
            7794199
            8383622
            7835577
            7942784
            8490829
            11275124
            9103972
            11150853
            9550986
            9592464
            9872038
            11227541
            11071726
            12385751
            12630115
            14768191
            13658748
            13944557
            13395935
            13995147
            15248018
            14818781
            15104298
            19658746
            20778527
            18696436
            16219199
            15778361
            23309610
            23546133
            18654958
            18976010
            20622712
            22502153
            26625262
            20943764
            31323497
            36048062
            25015866
            28477529
            27054683
            27340492
            27391082
            28214716
            29923079
            39319148
            30882659
            31997560
            39640200
            34433319
            34474797
            61865879
            37630968
            39277670
            45995450
            39598722
            39919774
            45959630
            43445917
            64397876
            47998447
            54445765
            53230582
            59097375
            62648035
            68134490
            60805738
            76950116
            58137795
            69563279
            62880219
            77550742
            73710989
            68908116
            106136242
            72105765
            76908638
            121018014
            79197444
            106093952
            79518496
            83365691
            145084606
            96676499
            115878617
            120785830
            107676347
            111368377
            151624261
            118943533
            136591208
            127045911
            134985984
            127701074
            154459380
            131788335
            141013881
            142619105
            148426612
            156427134
            149014403
            281505291
            158715940
            180042190
            189459643
            239295604
            191042038
            228464834
            236664447
            300828020
            219044724
            226619880
            298985723
            255534741
            245989444
            373035355
            290504275
            259489409
            268714955
            272802216
            280802738
            283632986
            291045717
            394416056
            305441537
            307730343
            371084228
            338758130
            599549062
            380501681
            573630236
            410086762
            501267050
            527168722
            519872744
            528204364
            517665597
            373803594
            586244275
            574156492
            532291625
            540292147
            578243753
            1028435772
            685943218
            856423727
            574678703
            596487254
            613171880
            644199667
            646488473
            709842358
            986975474
            1101325214
            906095219
            1106448117
            937255484
            914095741
            891469191
            1145463505
            1049957222
            947960086
            948482297
            1152400245
            1072583772
            1106970328
            1118535900
            1299115098
            1600147354
            1510582995
            1828724675
            1221167176
            1209659134
            1323014238
            2220425353
            1594970770
            2066495986
            1820190960
            1797564410
            1805564932
            1998439519
            1851351225
            1839429277
            2355122639
            2169649473
            3405079861
            2542930856
            2021066069
            2662983240
            2179554100
            2225506228
            2328195034
            3219606695
            2821314530
            2430826310
            2532673372
            3060596453
            2804629904
            4702322845
            3392535180
            3415161730
            3617755370
            3603129342
            6150428742
            3644994209
            4167624311
            3860495346
            4009078750
            4190715542
            4200620169
            5337303276
            5865226357
            5593269825
            7921464859
            4405060328
            7032917100
            5845988040
            5252140840
            4963499682
            5491422763
            6135802714
            9136416972
            6219791634
            9692042932
            7770753653
            7018291072
            7220884712
            7248123551
            7505489555
            7654072959
            11223632642
            7869574096
            8199794292
            8391335711
            8605680497
            10556769507
            12509713835
            13364023478
            10454922445
            9368560010
            11337410803
            10215640522
            10743563603
            11099302396
            11711214397
            12355594348
            13238082706
            13440676346
            14672364031
            26678759052
            14469008263
            14726374267
            18613137699
            15159562514
            19911008689
            16069368388
            22571234870
            21724154358
            16997016208
            17974240507
            19584200532
            19823482455
            20112123613
            21314942918
            20467862406
            27406779191
            23656316868
            21842865999
            22810516793
            28113040377
            25593677054
            27909684609
            28167050613
            36515230030
            29195382530
            35653568920
            34310574799
            41753874688
            31228930902
            48279174226
            48580902783
            44534671151
            65410191556
            48377547015
            37558441039
            40052062938
            77474556756
            40579986019
            50977567406
            42310728405
            44653382792
            70220413014
            47436543053
            67744160932
            53503361663
            54789059584
            56076735222
            84732292565
            60424313432
            63505957329
            65539505701
            93030929807
            68787371941
            71280993840
            77610503977
            78138427058
            79869169444
            80632048957
            82211823831
            82890714424
            155612983814
            162342796542
            117656956067
            175242753638
            105077696224
            92089925845
            107860856485
            242986914570
            108292421247
            119042867364
            150999195772
            154171708264
            330855737452
            143677932759
            129045463030
            136820499541
            140068365781
            238503698238
            148891497817
            165102538255
            162080993275
            160501218401
            162843872788
            270203653027
            201933581788
            225949377314
            197167622069
            199950782330
            224120563588
            200382347092
            211132793209
            285711997358
            227335288611
            291889335818
            616567734810
            265865962571
            283217171294
            269113828811
            272723395789
            276888865322
            493822917606
            472137234815
            324924866063
            309392716218
            432284646302
            322582211676
            323345091189
            360011494857
            397118404399
            467799544359
            400333129422
            397549969161
            411083575539
            424502910680
            411515140301
            546002694133
            493201251182
            496449117422
            608142037357
            669404211075
            595305607465
            541837224600
            549612261111
            582116112007
            600233956511
            632737807407
            648269957252
            682593706533
            631974927894
            720132180837
            645927302865
            893999086583
            1019657177658
            1093907121755
            868132673781
            1328274218194
            809065109462
            822598715840
            836018050981
            904716391483
            1078565229429
            1315437788302
            1038286342022
            1131728373118
            1091449485711
            1123953336607
            1214853919414
            1149846217622
            1264709818540
            1232208884405
            1264712735301
            1454573643734
            1536691319377
            1940793482580
            1529197290299
            1454992412327
            2151385550776
            2353724130324
            2397329964080
            1631663825302
            3808297774058
            1645083160443
            3851903607814
            2116851571451
            1943002733505
            2578945748934
            2129735827733
            2215402822318
            2223177858829
            2877292044848
            2273799554229
            2364700137036
            2719705147628
            2793910025600
            2496921619706
            3996363962338
            2984189702626
            2991683731704
            6843587339518
            3086656237629
            3606377963103
            3276746985745
            3761399653035
            3574666558807
            3588085893948
            3761934731894
            3774818988176
            4708681576667
            4836556719079
            4072738561238
            5855692734679
            5374213664554
            4438580681147
            4496977413058
            5550546539974
            4638499691265
            5481111322332
            5216626767334
            5290831645306
            6661322796436
            5975873434330
            6070845940255
            6363403223374
            6674742131577
            6693034200732
            8103355376161
            6851413544552
            7162752452755
            11601333133902
            8483500564843
            9243046054226
            7847557549414
            11266705079636
            9077080372412
            8569715974296
            11406239274653
            8935558094205
            9135477104323
            10614373125595
            9855126458599
            9929331336571
            14352103871657
            11654234868680
            17307407326327
            13526155676129
            12046719374585
            14174201316416
            13038145354951
            17646796346708
            13544447745284
            19098172512825
            14014165997307
            15010310002169
            25440906396052
            16331058114257
            16417273523710
            20731315241092
            17505274068501
            17705193078619
            18071035198528
            18790684552804
            18864889430776
            18990603562922
            38038722567419
            19784457795170
            23455487012700
            25084864729536
            23700954243265
            28554757747453
            25572875050714
            31109180553479
            31828829907755
            31191244091992
            39455072393359
            31719359075926
            29024475999476
            32515584070670
            31341368116426
            34036251192876
            32748331637967
            33922547592211
            35210467147120
            35576309267029
            63939575729959
            36861719751332
        """.trimIndent()
    }
}