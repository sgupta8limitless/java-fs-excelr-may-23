let places = [

    {
        imageUrl:"https://images.pexels.com/photos/3408744/pexels-photo-3408744.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
        title:"Heavenly Mountains",
        activities:"Trek . Camping . Skiing"
    },
    {
        imageUrl:"https://images.pexels.com/photos/2113566/pexels-photo-2113566.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
        title:"Beautiful Aurora",
        activities:"Trek . Camping . Swimming"
    },
    {
        imageUrl:"https://images.pexels.com/photos/10399171/pexels-photo-10399171.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
        title:"Breathtaking Waterfall",
        activities:"Rafting . Swimming. Sight Seeing"
    },
    {
        imageUrl:"https://images.pexels.com/photos/8100784/pexels-photo-8100784.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
        title:"Wildlife",
        activities:"Getting Eaten . Injuries. Lot of Running"
    }


]

// creating logic  

function checkHttpUrl(string) {
    let givenURL;
    try {
        givenURL = new URL(string);
    } catch (error) {
       
      return false;  
    }
    return givenURL.protocol === "http:" || givenURL.protocol === "https:";
  }


document.getElementById("create").addEventListener("click",()=>{

    let titleVal = document.getElementById("title").value;
    let activitiesVal = document.getElementById("activities").value;
    let imageURLVal = document.getElementById("imageURL").value;

    let errors = [];

    if(titleVal.length===0)
    {
        errors.push("Title should not be empty");
    }

    if(activitiesVal.length===0)
    {
        errors.push("Activities should not be empty");
    }

    if(imageURLVal.length!==0)
    {

       
        if(checkHttpUrl(imageURLVal)===false)
        {
            errors.push("Not a valid image url")
        }
    }
    else 
    {
        errors.push("image url cant be empty")
    }

    console.log(errors);

   
    if(errors.length===0)
    {
        let place = {

        title:titleVal,
        activities:activitiesVal,
        imageUrl:imageURLVal

        }

        places.push(place);

        displayPlaces();
    }







    



})




// viewing logic 

function displayPlaces()
{

    document.getElementsByClassName('main')[0].innerHTML="";

    places.forEach((place,index)=>{

        generateCard(place,index);

    })
}

displayPlaces();


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

    let explore=document.createElement('button');
    explore.innerText="Explore";
    explore.addEventListener("click",()=>{

        console.log(place.title);
    });

    let deleteBTN=document.createElement('button');
    deleteBTN.innerText="Delete";

    deleteBTN.addEventListener("click",()=>{

       places.splice(index,1);
       displayPlaces();

    })

    cardDetails.appendChild(title);
    cardDetails.appendChild(activities);
    cardDetails.appendChild(explore);
    cardDetails.append(deleteBTN);
    card.appendChild(cardDetails);


    document.getElementsByClassName('main')[0].appendChild(card);
}