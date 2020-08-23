export class Employee {
    id: number;
    name: string;
    age: number;
    designation: string;
    department: string;
    isEdit: Boolean;
    constructor(id: number, name: string, age:number, designation:string, department:string, isEdit: Boolean) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.department = department;
        this.isEdit = isEdit;
    }
}