package demo.empverification.controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/empms")
@OpenAPIDefinition(
    servers = {@Server(url = "/", description = "Default Server URL")},
    info = @Info(
        title = "Employment Verification Controller",
        version = "0.0.1",
        description = "This API is  used for Employment Verification."
    )
)

@CrossOrigin
@RequiredArgsConstructor
public class EmploymentVerificationController
{

    @GetMapping(value = "/")
    public String findEmployee(@RequestParam( "Id" ) String stationId)
    { return "result"; }
}