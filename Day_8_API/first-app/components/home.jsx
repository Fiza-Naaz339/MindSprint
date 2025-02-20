function Home() {
    return ( 
        <div>
            <div id="carouselExampleCaptions" class="carousel slide">
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
  </div>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="https://th.bing.com/th/id/R.5026a00084957e2366f667c92be7161c?rik=i5aauw6sAsT8PA&riu=http%3a%2f%2fjohndyer.name%2flab%2fcolorpicker%2frefresh_web%2fcolorpicker%2fimages%2fmap-blue-max.png&ehk=%2bzxaJM5%2fh0ylwTFyqB%2bKk96SAeOhi%2fiqWU%2bAJgoROO0%3d&risl=&pid=ImgRaw&r=0" 
      class="d-block w-100" alt="bg1"  height={350}/>
      <div class="carousel-caption d-none d-md-block">
        <h5>First slide label</h5>
        <p>Some representative placeholder content for the first slide.</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="https://th.bing.com/th/id/R.52a4bb53a252b084deacbf9310268e7e?rik=yGBSlMJAcG%2bgkw&riu=http%3a%2f%2fgetwallpapers.com%2fwallpaper%2ffull%2fe%2f8%2f9%2f183422.jpg&ehk=o3bd0vw7S0koN9dkxpvUHMAdH5iduniS33JPhLbiFmk%3d&risl=&pid=ImgRaw&r=0" 
      class="d-block w-100" alt="bg2" height={350}/>
      <div class="carousel-caption d-none d-md-block">
        <h5>Second slide label</h5>
        <p>Some representative placeholder content for the second slide.</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="https://tse3.mm.bing.net/th/id/OIP.EQWBL17Auqcm8jVvpXN77AHaFR?rs=1&pid=ImgDetMain" 
      class="d-block w-100" alt="bg3" height={350}/>
      <div class="carousel-caption d-none d-md-block">
        <h5>Third slide label</h5>
        <p>Some representative placeholder content for the third slide.</p>
      </div>
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>
        </div>
     );
}

export default Home;