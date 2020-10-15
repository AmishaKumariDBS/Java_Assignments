package com.training.org;

import java.net.URI;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;
        import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

        import com.training.org.UpdateEmployee;
        import com.training.org.Employee;
        import com.training.org.Employees;

@RestController
@RequestMapping(path = "/employees")
public class SpringToolController
{
    @Autowired
    private UpdateEmployee up;

    @GetMapping(path="/", produces = "application/json")
    public Employees getEmployees()
    {
        return up.getAllEmployees();
    }

    @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee)
    {
        Integer id = up.getAllEmployees().getEmployeeList().size() + 1;
        employee.setEmpId(id);

        up.addEmployee(employee);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(employee.getEmpId())
                .toUri();

        return ResponseEntity.created(location).build();
    }
}
