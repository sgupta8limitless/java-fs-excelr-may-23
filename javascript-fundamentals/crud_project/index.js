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
        activities:"Getting Eaten . Injuries. Lot of Running",
        
    }


]


places.forEach((place)=>{
    generateCard(place);
})





function generateCard(place)
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

    cardDetails.appendChild(title);
    cardDetails.appendChild(activities);
    cardDetails.appendChild(explore);
    card.appendChild(cardDetails);


    document.getElementsByClassName('main')[0].appendChild(card);
}





