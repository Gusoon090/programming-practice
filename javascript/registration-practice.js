function checkReading(){
    const childName="Gusoon";
    const age=4;
    const activity="read";
    if(childName === ""){
        console.log("Please enter your name:");
    }
    else if (age < 4 ){
        console.log("This activity is for ages 4 and above");
    }
    else if (activity === "" ){
        console.log("This porgram should read or write ");
    }
    else{
        console.log("You can start reading");
    }
}
checkReading()