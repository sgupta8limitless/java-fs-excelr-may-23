let places;

if(localStorage.getItem("places")===null)
{
    localStorage.setItem("places","[]");   
}
else 
{
    places = JSON.parse(localStorage.getItem("places"));
}


// event for creating a place


document.getElementById("create").addEventListener("click",()=>{

    let titleVal = document.getElementById("title").value;
    let activitiesVal = document.getElementById("activities").value;
    let imageURLVal = document.getElementById("imageURL").value;

    if(validateForm(titleVal,imageURLVal,activitiesVal)===true)
    {
        let place = {

            title:titleVal,
            activities:activitiesVal,
            imageUrl:imageURLVal

        }

        places.push(place);

        localStorage.setItem("places",JSON.stringify(places));



        displayPlaces();
    }
    

})





// url validation function 
function checkHttpUrl(string) {
    let givenURL;
    try {
        givenURL = new URL(string);
    } catch (error) {
       
      return false;  
    }
    return givenURL.protocol === "http:" || givenURL.protocol === "https:";
}



// form validation function 
function validateForm(title,imageURL,activities)
{
    let errors = [];

    if(title.length===0)
    {
        errors.push("Title Should Not Be Empty");
        document.getElementById("title_error").innerText="Title should not be empty";
    }
    else 
    {
        document.getElementById("title_error").innerText="";
    }

    if(activities.length===0)
    {
        errors.push("Activities should not be empty");
        document.getElementById("activities_error").innerText="Activities should not be empty";
    }
    else 
    {
        document.getElementById("activities_error").innerText="";
    }

    if(imageURL.length!==0)
    {

       
         if(checkHttpUrl(imageURL)===false)
        {
            errors.push("Not a valid image url")
            document.getElementById("imageURL_error").innerText="Not a valid image url";
        }
        else 
        {
            document.getElementById("imageURL_error").innerText="";
        }
    }
    else 
    {
        errors.push("image url cant be empty")
        document.getElementById("imageURL_error").innerText="image url cant be empty";
    }

    if(errors.length===0)
    {
        return true;
    }




    return false;
    
}





// viewing all places 

function displayPlaces()
{

    if(places.length!==0)
    {
        document.getElementsByClassName('main')[0].innerHTML="";

        places.forEach((place,index)=>{

            generateCard(place,index);

        })
    }
    else 
    {
        document.getElementsByClassName('main')[0].innerHTML="No Data Available";
    }
    
}



// logic for closing modal 

document.getElementById("close").onclick=function(){
    document.getElementById("update_form").style.display="none";
}


let updateIndex=null;


function update()
{
    let titleVal = document.getElementById("title_upt").value;
    let activitiesVal = document.getElementById("activities_upt").value;
    let imageURLVal = document.getElementById("imageURL_upt").value;

    if(validateForm(titleVal,imageURLVal,activitiesVal)===true)
    {
        let updatedPlace = {

            title:titleVal,
            activities:activitiesVal,
            imageUrl:imageURLVal

        }

       places[updateIndex] = updatedPlace;

        localStorage.setItem("places",JSON.stringify(places));

        document.getElementById("update_form").style.display="none";
        
        displayPlaces();
    }

}

document.getElementById("update").addEventListener("click",update);




// single card generator 


function generateCard(place,index)
{
    // card div 
    let card = document.createElement('div');
    card.classList.add('card');

    // card img div 
    let cardImg = document.createElement('div');
    cardImg.classList.add('card-img');

    let img = document.createElement('img');
    img.src=place.imageUrl;

    cardImg.appendChild(img);
    card.appendChild(cardImg);

    // card details div 

    let cardDetails = document.createElement('div');
    cardDetails.classList.add('card-details');

    let title=document.createElement('h1');
    title.innerText=place.title;

    let activities=document.createElement('p');
    activities.innerText=place.activities;


    let actions=document.createElement("div");
    actions.classList.add('actions');

    let exploreBTN=document.createElement('i');
    exploreBTN.classList.add("fa-solid"); 
    exploreBTN.classList.add("fa-eye"); 
    exploreBTN.classList.add("explore"); 
    exploreBTN.addEventListener("click",()=>{

        console.log(place.title);
    });


    let editBTN = document.createElement("i");
    editBTN.classList.add("fa-solid"); 
    editBTN.classList.add("fa-pen-to-square"); 
    editBTN.classList.add("edit"); 
    editBTN.addEventListener("click",()=>{

        document.getElementById("update_form").style.display="flex";

        document.getElementById("title_upt").value = place.title;
        document.getElementById("activities_upt").value = place.activities;
        document.getElementById("imageURL_upt").value = place.imageUrl;

        updateIndex=index;

    })


    let deleteBTN = document.createElement("i");
    deleteBTN.classList.add("fa-regular"); 
    deleteBTN.classList.add("fa-trash-can"); 
    deleteBTN.classList.add("delete"); 
    

    deleteBTN.addEventListener("click",()=>{

       places.splice(index,1);

       localStorage.setItem("places",JSON.stringify(places));

       displayPlaces();

    })

    actions.append(exploreBTN,editBTN,deleteBTN);

    cardDetails.appendChild(title);
    cardDetails.appendChild(activities);
    cardDetails.appendChild(actions);
    card.appendChild(cardDetails);


    document.getElementsByClassName('main')[0].appendChild(card);
}



// initial calls 

displayPlaces();