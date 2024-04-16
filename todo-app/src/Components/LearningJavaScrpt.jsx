const person = {
    "name": "Ram",
    "address":{
        "village":"Royana",
        "City":"Nashik",
        "State":"Maharashtra"
    },
    "social":["twitter ", "linkedin ", "facebook ", "instagram "],
    profile : ()=>{
        person.social.map(profile=> console.log(profile)
        )
    }

}

export default function LearinngJavaScript(){
    return(
        <>
        <div>{person.name}</div>
        <div>{person.address.City}</div>
        <div>{person.social}</div>
        <div>{person.profile()}</div>
        </>
    )
}