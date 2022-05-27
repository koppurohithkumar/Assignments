import { useState } from 'react';
import {nanoid} from 'nanoid';
import './App.css';
import data from './mock-data.json'
function App(){
  const [employees, setEmployees] = useState(data);

  const [addFormData, setAddFormDeta] = useState({
    Name : '',
    Job : ''
  })
  const handleAddFormChange = (event) => {
    event.preventDefault();
    const fieldName = event.target.getAttribute('name');
    const fieldValue = event.target.value;
    const newFormDeta = {...addFormData};
    newFormDeta[fieldName] = fieldValue;
    setAddFormDeta(newFormDeta);
  }

  const handleAddFormSubmit = (event) =>{
    event.preventDefault();
    const newEmployee = {
      id : nanoid(),
      Name : addFormData.Name,
      Job : addFormData.Job
    }
    const newEmployees = [...employees, newEmployee];
    setEmployees(newEmployees);
   
  }
  const handleDeleteClick = (employeeId) => {
    const newEmployees = [...employees];

    const index = employees.findIndex((employee) => employee.id === employeeId);

    newEmployees.splice(index, 1);

    setEmployees(newEmployees);
  };


  return (
    <div className="App">
      {/* <Q2/> */}
      <table>
        <thead>
          <tr>
            <th>Name</th>
            <th>Job</th>
            <th>Remove</th>
          </tr>
        </thead>
        <tbody>
          {employees.map((employee)=>
          <tr>
            <td>{employee.Name}</td>
            <td>{employee.Job}</td>
            <td><button onClick={handleDeleteClick}>Delete</button></td>
          </tr>)} 
        </tbody>
      </table>
      <h2>Add new Employee</h2>
      <form onSubmitCapture={handleAddFormSubmit}>
        <label >Name</label><br/>
        <input
          type="text"
          name="Name"
          required="required"
          placeholder='Enter a Name'
          onChange={handleAddFormChange}></input>
          <br/><br/>
        <label >Job</label><br/>
        <input
          type="text"
          name="Job"
          required="required"
          placeholder='Enter your Job'
          onChange={handleAddFormChange}></input>
          <br/><br/>
          <button type='submit'>Submit</button>
      </form>
    </div>
  );
}

export default App;