# Web-Services

Projet TPWS:

démarage de serveur web ServeurJaxWS

![image](https://user-images.githubusercontent.com/102218192/163495158-b912b35e-ce2c-4651-821e-508a28978696.png)

ce fichier XML est un document WSDL qui donne une description sur le web service 

![wsdl](https://user-images.githubusercontent.com/102218192/163495304-bf27d495-f4e9-4a78-8a24-cd16d592362a.PNG)
![wsdl2](https://user-images.githubusercontent.com/102218192/163495308-0341bdbe-a928-4cdd-a00f-330619690f9a.PNG)

On teste le web service avec l'outil SoapUI

![soap](https://user-images.githubusercontent.com/102218192/163495562-39b2fc7f-f5f2-4d4a-aceb-cc20a0123d55.PNG)

![soap1](https://user-images.githubusercontent.com/102218192/163495625-2902f536-0e76-44c3-9b94-5d095bf23939.PNG)

![soap2](https://user-images.githubusercontent.com/102218192/163495641-feada605-70cb-4acc-8b4c-b439fb6f67ff.PNG)

dans cette partie On utilise des annotaion JAX BIND

![soapAnota](https://user-images.githubusercontent.com/102218192/163496555-383e350b-84da-49e2-a21a-2978ad1302c8.PNG)

projet ClientWebSer:

Maintennat on crée une application client et on génére un proxy(ws) alors nous avons utilisé le WSDL et à partir de ce document nous générons des classes et des interfaces que nous avons utilisé pour communiquer avec Le web service

![image](https://user-images.githubusercontent.com/102218192/163496714-6c8f6386-40ce-499a-9043-4a8de2909457.png)

![image](https://user-images.githubusercontent.com/102218192/163497097-147fa7ab-05d7-4212-bc83-d2e6818f0a59.png)

on affiche tous les comptes 

![image](https://user-images.githubusercontent.com/102218192/163497532-4cf6e00c-3153-425b-9655-57e633245729.png)

projet ConsoleApp:

Maintenant on utilise un autre client.Net et la même chose on générer le document wsdl

![image](https://user-images.githubusercontent.com/102218192/163498082-e7623d50-1250-4c2d-8a6e-8811227fd461.png)

On liste tous les comptes 

![consol1](https://user-images.githubusercontent.com/102218192/163498247-99f3130d-7f31-4875-a922-b1398f1c11ab.PNG)



