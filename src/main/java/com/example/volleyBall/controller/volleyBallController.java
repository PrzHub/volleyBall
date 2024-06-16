package com.example.volleyBall.controller;

        import com.example.volleyBall.model.volleyBallForm;
        import com.example.volleyBall.repository.volleyBallRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class volleyBallController {

    @Autowired
    private volleyBallRepository repository;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody volleyBallForm form) {
        repository.save(form);
        return ResponseEntity.ok("Registration successful");
    }
}
