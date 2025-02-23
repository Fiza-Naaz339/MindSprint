import 'D:/OneDrive - Olam International/Desktop/Training/API/first-app/src/App.css';
function Home() {
  return (
    <div className="home-container">
      <div
        id="carouselExampleCaptions"
        className="carousel slide"
        data-bs-ride="carousel"
      >
        <div className="carousel-indicators">
          <button
            type="button"
            data-bs-target="#carouselExampleCaptions"
            data-bs-slide-to="0"
            className="active"
            aria-current="true"
            aria-label="Slide 1"
          ></button>
          <button
            type="button"
            data-bs-target="#carouselExampleCaptions"
            data-bs-slide-to="1"
            aria-label="Slide 2"
          ></button>
          <button
            type="button"
            data-bs-target="#carouselExampleCaptions"
            data-bs-slide-to="2"
            aria-label="Slide 3"
          ></button>
        </div>
        <div className="carousel-inner">
          <div className="carousel-item active">
            <img
              src="https://wallpaper-house.com/data/out/5/wallpaper2you_52020.jpg"
              className="d-block w-100"
              alt="bg1"
              height={550}
            />
            <div className="carousel-caption d-none d-md-block">
              <h5>First slide label</h5>
              <p>
                Some representative placeholder content for the first slide.
              </p>
            </div>
          </div>
          <div className="carousel-item">
            <img
              src="https://wallpaperaccess.com/full/6175019.jpg"
              className="d-block w-100"
              alt="bg2"
              height={550}
            />
            <div className="carousel-caption d-none d-md-block">
              <h5>Second slide label</h5>
              <p>
                Some representative placeholder content for the second slide.
              </p>
            </div>
          </div>
          <div className="carousel-item">
            <img
              src="https://wallup.net/wp-content/uploads/2019/09/414380-space-748x479.jpg"
              className="d-block w-100"
              alt="bg3"
              height={550}
            />
            <div className="carousel-caption d-none d-md-block">
              <h5>Third slide label</h5>
              <p>
                Some representative placeholder content for the third slide.
              </p>
            </div>
          </div>
        </div>
        <button
          className="carousel-control-prev"
          type="button"
          data-bs-target="#carouselExampleCaptions"
          data-bs-slide="prev"
        >
          <span
            className="carousel-control-prev-icon"
            aria-hidden="true"
          ></span>
          <span className="visually-hidden">Previous</span>
        </button>
        <button
          className="carousel-control-next"
          type="button"
          data-bs-target="#carouselExampleCaptions"
          data-bs-slide="next"
        >
          <span
            className="carousel-control-next-icon"
            aria-hidden="true"
          ></span>
          <span className="visually-hidden">Next</span>
        </button>
      </div>

      <section className="content-section">
        <h2>About Shakugan no Shana</h2>
        <p>
          <strong>Shakugan no Shana</strong> is a popular Japanese light novel
          series written by Yashichiro Takahashi and illustrated by Noizi Ito.
          The story follows Yuji Sakai, a high school student who discovers that
          he is living in a world where time is manipulated by supernatural
          beings known as "Crimson Denizens." These beings consume human lives
          to sustain their existence.
        </p>
        <p>
          When Yuji encounters Shana, a fierce and powerful Flame Haze, his life
          takes a dramatic turn. Shana is dedicated to fighting the Crimson
          Denizens and protecting the human world. As Yuji becomes more involved
          in this hidden battle, he learns about the complexities of existence,
          identity, and the bonds that tie people together.
        </p>
        <p>
          The series is known for its engaging characters, intricate plot, and
          stunning visuals. It has been adapted into an anime series, manga, and
          even a video game, making it a beloved franchise among fans of the
          fantasy genre.
        </p>
      </section>

      <footer className="footer">
        
      </footer>
    </div>
  );
}

export default Home;
