

let ml = 100;

let slider = setInterval(()=>{

    console.log(-ml);

    document.getElementById('carousel').style.marginLeft = -ml+"%";
    document.getElementById('carousel').style.transition=".8s";

    if(ml==400)
    {
        setTimeout(()=>{
            ml=100;
            document.getElementById('carousel').style.transition="0s";
            document.getElementById('carousel').style.marginLeft=0;
        },800)
    }

    ml+=100;

   

},3000)




// logic for second carousel 

let ml2=100;

document.getElementById('next').addEventListener('click',()=>{

    document.getElementById('carousel2').style.marginLeft = -ml2+"%";
    document.getElementById('carousel2').style.transition=".8s";

    if(ml2==400)
    {
        setTimeout(()=>{
            ml2=100;
            document.getElementById('carousel2').style.transition="0s";
            document.getElementById('carousel2').style.marginLeft=0;
        },800)
    }

    ml2+=100;


})















