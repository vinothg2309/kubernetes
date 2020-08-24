import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Employee } from './employee';
import { map } from 'rxjs/operators';
import { environment } from 'src/environments/environment';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular-app';
  employeeList:Employee[] = [];
  isEdit = false
  createNewEmployee = false;
  newEmployee:Employee = new Employee(0,'',0,'','',false)
  private backendUrl:string   = environment.backendUri;


  constructor(private http:HttpClient) {
  }

  ngOnInit() {
    this.findAll()
  }

  findAll(){
    this.http.get<Employee[]>(this.backendUrl+'/employee/findAll').subscribe(data => {
      this.employeeList = data;
    })
  }

  edit(employee: Employee){
    employee.isEdit = true
  }

  cancel(employee: Employee){
    employee.isEdit = false
  }

  onSubmit(employee: Employee){
    this.saveOrUpdateEmployee(employee)
  }

  saveOrUpdateEmployee(employee: Employee){
    this.http.post<Employee>(this.backendUrl+'/employee/save', employee).subscribe(data => {
      console.log(data);
      employee.isEdit = false
      this.findAll()
      this.createNewEmployee = false;
    })
  }


  delete(id:number){
    this.http.delete(this.backendUrl+'/employee/delete/' + id,{responseType: 'text'})
    .subscribe(data => {
      console.log(data);
      this.findAll()
    })
 }
 add() {
  this.createNewEmployee = true;
  this.newEmployee = new Employee(0,'',0,'','',false)
  this.newEmployee.isEdit = false;
 }

 saveNewEmployee(){
  this.saveOrUpdateEmployee(this.newEmployee)
 }

 cancelNew(){
  this.createNewEmployee = false;
 }

 ageChanged(event){
   this.newEmployee.age = event;
 }
 

}
