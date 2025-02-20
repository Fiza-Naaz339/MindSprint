async function fetchData(){
    try{
        const response= await fetch('https://jsonplaceholder.typicode.com/users')
        const json = await response.json();
        console.log(json)
    } catch (error) {
        console.log('Error occured', error)
    }
}
fetchData();
