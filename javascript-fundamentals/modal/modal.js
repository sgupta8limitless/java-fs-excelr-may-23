// modal js 

const openModal=()=>{

    document.getElementsByClassName('modal_overlay')[0].style.display="flex";

}


document.getElementById('open_modal').addEventListener('click',openModal);


document.getElementById('close').addEventListener('click',()=>{
    document.getElementsByClassName('modal_overlay')[0].style.display="none";
})


// nav js 

document.getElementById('service').onmouseover=function(){

    document.getElementsByClassName('services')[0].style.height="200px";
    document.getElementsByClassName('services')[0].style.boxShadow="0 0 3px 2px rgb(203, 203, 203)";

}

document.getElementById('service').onmouseleave=function(){

    document.getElementsByClassName('services')[0].style.height="0";
    document.getElementsByClassName('services')[0].style.boxShadow="none";

}







