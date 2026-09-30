const readline=require("node:readline")
const input =readline.createInterface({
    input:process.stdin,
    output:process.stdout});

input.question("Enter your name:",(childName)=>{
    input.question("Enter your age:",(age)=>{
        const ageNumber = Number(age);
        input.question("Enter your GPA:",(gpa)=>{
            const gpaNumber = Number(gpa);
            input.question("Are you a student? (yes/no): ", (isStudent) => {
                const BooleanStuden=isStudent==="yes";
                input.question("Enter 1 skills:",(skills1)=>{
                    input.question("Enter 2 skills:",(skills2)=>{
                        input.question("Enter 3 skills:",(skills3)=>{


                            console.log("-------------------------------------");
                            console.log("          User Profile Card          ");
                            console.log("-------------------------------------");
                            console.log("your name:",childName);
                            console.log("your age:",ageNumber);
                            console.log("your GPA:",gpaNumber);
                            console.log("Is student: ",BooleanStuden);
                            console.log("Skills: ",skills1,skills2,skills3);
                            input.close()
                        })
                    })
                })
            })
        })
    })
})



