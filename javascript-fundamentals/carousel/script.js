


// logic for second carousel 

function goToSlide(slideNumber,tduration)
{
   
    document.getElementById('carousel2').style.marginLeft = -(slideNumber-1)*100+"%";
    document.getElementById('carousel2').style.transition=tduration+"s";

    
}


let currentSlide = 2;
let click=true;


document.getElementById('next').addEventListener('click',()=>{

    if(click==true)
    {
        click=false;
        currentSlide++;
        goToSlide(currentSlide,0.8);

        if(currentSlide==6)
        {
            currentSlide=2;
            setTimeout(()=>{
                goToSlide(currentSlide,0);
            },800)
        }

        setTimeout(()=>{
            click=true;
            console.log(click);
        },800)

    }
   

    
    


})

document.getElementById('prev').addEventListener('click',()=>{

    if(click==true)
    {
        click=false;
        currentSlide--;
        goToSlide(currentSlide,0.8);

        if(currentSlide==1)
        {
            currentSlide=5
            setTimeout(()=>{
                goToSlide(currentSlide,0);
            },800)
        }

        setTimeout(()=>{
            click=true;
            console.log(click);
        },800)
    }
    

    
    


})







