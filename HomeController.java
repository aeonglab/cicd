@RestController
public class HomeController {
 
    @Value("${app.version:1.0.0}")
    String version;
 
    @GetMapping("/")
    public String home() {
        return "Hello CICD! version: " + version;
    }
}
