package com.example.springmongorestapi.Api;

import com.example.springmongorestapi.entity.User; // Doğru User sınıfını içe aktarıyoruz
import com.example.springmongorestapi.repository.UserRepository;
import com.example.springmongorestapi.service.UserService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RequiredArgsConstructor
@RestController
// bu sınıfın http isteklerine cevap verebilen bir sınıf olduğunu gösterir. Restful web servis saglayicisidr.
@RequestMapping(value = "/user", produces = "application/json")
//  Bu anotasyon, bu denetleyicinin "/user" URL'sine sahip istekleri ele alacağını belirtir.
public class UserApi {
    //bunun yerine burada repo çağırma repoyu service de çağır burada sace servisleri çağır


    private final UserService userService;

    @PostMapping(value = "/createOrUpdate")
    public ResponseEntity<User> kaydet(@RequestBody User user) {
        return ResponseEntity.ok(userService.save(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> hepsiniGetir() {
        return ResponseEntity.ok(userService.getAll());
    }




/*
    @PostConstruct
     public void init(){
        User user = new User();
        //user.setId("1");
        user.setName("Yusuf Semih");
        user.setSurname("KURT");
        //user.getFeatures();
        userrepository.save(user);
       }
*/

   /* @PostMapping
    public ResponseEntity<User> add(@RequestBody User user){ //@PostMapping anotasyonu ile bir HTTP POST isteği ele alıyorsunuz ve bu isteğin gövdesindeki verileri bir User nesnesine dönüştürmek istediğiniz için @RequestBody kullanılıyor.
        return ResponseEntity.ok(userrepository.save(user)); // tum mesajlarimizin bir duzende olmasi adina ResponseEntitiy
    }
    @GetMapping
    public ResponseEntity<List<User>> listAll(){
        return ResponseEntity.ok(userrepository.findAll()); // tum mesajlarimizin bir duzende olmasi adina ResponseEntitiy
    }*/

}
