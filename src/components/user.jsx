import { use, useEffect} from "react"
import { useState } from "react"
import axios from 'axios'
function Users(){
    const[users,setUsers]=useState([])
   const fetchData=async()=>{
        try{
            const resp=await axios.get('http://localhost:3000/user')  
            //console.log(resp)
            setUsers(resp.data)
        }
        catch(error){
            console.log(error)
        }
    }
    const deleteUser=async (id)=>{
        try {
            const resp = await axios.delete(`http://localhost:3000/user/${id}`);
            if(resp.status===200){
                alert('user deleted successfully');
                setUsers(users.filter(user=>user.id!==id));
            }
        } catch (error) {
            console.log(error);
            
        }
    }
    useEffect(()=>{
        fetchData()
 
   
    },[])
    return (
        <div>
        <h3>User's List</h3>
        <table className="table table-striped table-bordered">
            <thead>
                <tr>
                    <th>Id</th><th>Name</th><th>Email</th><th>Address</th><th>Operations</th>
                </tr>
            </thead>
            <tbody>
                {
                    users.map(user=>(
                        <tr>
                            <td>{user.id}</td>
                            <td>{user.name}</td>
                            <td>{user.email}</td>
                            <td>{user.address}</td>
                            <td>
                                <button className="btn btn-danger" onClick={()=>deleteUser(user.id)}>X</button>
                            </td>
                        </tr>
                    ))
                }
            </tbody>
        </table>
        </div>
    )
}
export default Users;