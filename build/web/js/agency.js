/*!
 * Start Bootstrap - Agency v5.0.3 (https://startbootstrap.com/template-overviews/agency)
 * Copyright 2013-2018 Start Bootstrap
 * Licensed under MIT (https://github.com/BlackrockDigital/startbootstrap-agency/blob/master/LICENSE)
 */

body {
  overflow-x: hidden;
  font-family: 'Roboto Slab', -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, 'Helvetica Neue', Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol', 'Noto Color Emoji';
}



p {
  line-height: 1.75;
}

a {
  color: #fed136;
}

a:hover {
  color: #fec503;
}

.text-primary {
  color: #fed136 !important;
}

h1,
h2,
h3,
h4,
h5,
h6 {
  font-weight: 700;
  font-family: 'Montserrat', -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, 'Helvetica Neue', Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol', 'Noto Color Emoji';
}

section {
  padding: 100px 0;
}

section h2.section-heading {
  font-size: 40px;
  margin-top: 0;
  margin-bottom: 15px;
}

section h3.section-subheading {
  font-size: 16px;
  font-weight: 400;
  font-style: italic;
  margin-bottom: 75px;
  text-transform: none;
  font-family: 'Droid Serif', -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, 'Helvetica Neue', Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol', 'Noto Color Emoji';
}

@media (min-width: 768px) {
  section {
    padding: 150px 0;
  }
}

.btn {
  font-family: 'Montserrat', -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, 'Helvetica Neue', Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol', 'Noto Color Emoji';
  font-weight: 700;
}

.btn-xl {
  font-size: 18px;
  padding: 20px 40px;
}

.btn-primary {
  background-color: #fed136;
  border-color: #fed136;
}

.btn-primary:active, .btn-primary:focus, .btn-primary:hover {
  background-color: #fec810 !important;
  border-color: #fec810 !important;
  color: white;
}

.btn-primary:active, .btn-primary:focus {
  -webkit-box-shadow: 0 0 0 0.2rem rgba(254, 209, 55, 0.5) !important;
  box-shadow: 0 0 0 0.2rem rgba(254, 209, 55, 0.5) !important;
}


::-moz-selection {
  background: #fed136;
  text-shadow: none;
}

::selection {
  background: #fed136;
  text-shadow: none;
}

img::-moz-selection {
  background: transparent;
}

img::selection {
  background: transparent;
}

img::-moz-selection {
  background: transparent;
}

#mainNav {
  background-color: #212529;
}

#mainNav .navbar-toggler {
  font-size: 12px;
  right: 0;
  padding: 13px;
  text-transform: uppercase;
  color: white;
  border: 0;
  background-color: #fed136;
  font-family: 'Montserrat', -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, 'Helvetica Neue', Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol', 'Noto Color Emoji';
}

#mainNav .navbar-brand {
  color: #fed136;
  font-family: 'Kaushan Script', -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, 'Helvetica Neue', Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol', 'Noto Color Emoji';
}

#mainNav .navbar-brand.active, #mainNav .navbar-brand:active, #mainNav .navbar-brand:focus, #mainNav .navbar-brand:hover {
  color: #fec503;
}

#mainNav .navbar-nav .nav-item .nav-link {
  font-size: 90%;
  font-weight: 400;
  padding: 0.75em 0;
  letter-spacing: 1px;
  color: Green;
  font-family: 'Montserrat', -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, 'Helvetica Neue', Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol', 'Noto Color Emoji';
}

#mainNav .navbar-nav .nav-item .nav-link.active, #mainNav .navbar-nav .nav-item .nav-link:hover {
  color: #fed136;
}

@media (min-width: 992px) {
  #mainNav {
    padding-top: 25px;
    padding-bottom: 25px;
    -webkit-transition: padding-top 0.3s, padding-bottom 0.3s;
    transition: padding-top 0.3s, padding-bottom 0.3s;
    border: none;
    background-color: transparent;
  }
  #mainNav .navbar-brand {
    font-size: 1.75em;
    -webkit-transition: all 0.3s;
    transition: all 0.3s;
  }
  #mainNav .navbar-nav .nav-item .nav-link {
    padding: 1.1em 1em !important;
  }
  #mainNav.navbar-shrink {
    padding-top: 0;
    padding-bottom: 0;
    background-color: #212529;
  }
  #mainNav.navbar-shrink .navbar-brand {
    font-size: 1.25em;
    padding: 12px 0;
  }
}

header.masthead {
  text-align: center;
  color: #7CFC00;
  background-image: url("../img/Logo1.jpg");
  background-repeat: no-repeat;
  background-attachment: scroll;
  background-position: center center;
  background-size: cover;
}

header.masthead .intro-text {
  padding-top: 150px;
  padding-bottom: 100px;
}

header.masthead .intro-text .intro-lead-in {
  font-size: 22px;
  font-style: italic;
  line-height: 22px;
  margin-bottom: 25px;
  font-family: 'Droid Serif', -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, 'Helvetica Neue', Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol', 'Noto Color Emoji';
}

header.masthead .intro-text .intro-heading {
  font-size: 50px;
  font-weight: 700;
  line-height: 50px;
  margin-bottom: 25px;
  font-family: 'Montserrat', -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, 'Helvetica Neue', Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol', 'Noto Color Emoji';
}

@media (min-width: 768px) {
  header.masthead .intro-text {
    padding-top: 300px;
    padding-bottom: 200px;
  }
  header.masthead .intro-text .intro-lead-in {
    font-size: 40px;
    font-style: italic;
    line-height: 40px;
    margin-bottom: 25px;
    font-family: 'Droid Serif', -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, 'Helvetica Neue', Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol', 'Noto Color Emoji';
  }
  header.masthead .intro-text .intro-heading {
    font-size: 75px;
    font-weight: 700;
    line-height: 75px;
    margin-bottom: 50px;
    font-family: 'Montserrat', -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, 'Helvetica Neue', Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol', 'Noto Color Emoji';
  }
}

.service-heading {
  margin: 15px 0;
  text-transform: none;
}


#portfolio .portfolio-item {
  right: 0;
  margin: 0 0 15px;
}

#portfolio .portfolio-item .portfolio-link {
  position: relative;
  display: block;
  max-width: 400px;
  margin: 0 auto;
  cursor: pointer;
}

#portfolio .portfolio-item .portfolio-link .portfolio-hover {
  position: absolute;
  width: 100%;
  height: 100%;
  -webkit-transition: all ease 0.5s;
  transition: all ease 0.5s;
  opacity: 0;
  background: rgba(254, 209, 54, 0.9);
}

#portfolio .portfolio-item .portfolio-link .portfolio-hover:hover {
  opacity: 1;
}

#portfolio .portfolio-item .portfolio-link .portfolio-hover .portfolio-hover-content {
  font-size: 20px;
  position: absolute;
  top: 50%;
  width: 100%;
  height: 20px;
  margin-top: -12px;
  text-align: center;
  color: white;
}

#portfolio .portfolio-item .portfolio-link .portfolio-hover .portfolio-hover-content i {
  margin-top: -12px;
}

#portfolio .portfolio-item .portfolio-link .portfolio-hover .portfolio-hover-content h3,
#portfolio .portfolio-item .portfolio-link .portfolio-hover .portfolio-hover-content h4 {
  margin: 0;
}

#portfolio .portfolio-item .portfolio-caption {
  max-width: 400px;
  margin: 0 auto;
  padding: 25px;
  text-align: center;
  background-color: #fff;
}

#portfolio .portfolio-item .portfolio-caption h4 {
  margin: 0;
  text-transform: none;
}

#portfolio .portfolio-item .portfolio-caption p {
  font-size: 16px;
  font-style: italic;
  margin: 0;
  font-family: 'Droid Serif', -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, 'Helvetica Neue', Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol', 'Noto Color Emoji';
}

#portfolio * {
  z-index: 2;
}

@media (min-width: 767px) {
  #portfolio .portfolio-item {
    margin: 0 0 30px;
  }
}

.portfolio-modal {
  padding-right: 0px !important;
}

.portfolio-modal .modal-dialog {
  margin: 1rem;
  max-width: 100vw;
}

.portfolio-modal .modal-content {
  padding: 100px 0;
  text-align: center;
}

.portfolio-modal .modal-content h2 {
  font-size: 3em;
  margin-bottom: 15px;
}

.portfolio-modal .modal-content p {
  margin-bottom: 30px;
}

.portfolio-modal .modal-content p.item-intro {
  font-size: 16px;
  font-style: italic;
  margin: 20px 0 30px;
  font-family: 'Droid Serif', -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, 'Helvetica Neue', Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol', 'Noto Color Emoji';
}

.portfolio-modal .modal-content ul.list-inline {
  margin-top: 0;
  margin-bottom: 30px;
}

.portfolio-modal .modal-content img {
  margin-bottom: 30px;
}

.portfolio-modal .modal-content button {
  cursor: pointer;
}

.portfolio-modal .close-modal {
  position: absolute;
  top: 25px;
  right: 25px;
  width: 75px;
  height: 75px;
  cursor: pointer;
  background-color: transparent;
}

.portfolio-modal .close-modal:hover {
  opacity: 0.3;
}

.portfolio-modal .close-modal .lr {
  /* Safari and Chrome */
  z-index: 1051;
  width: 1px;
  height: 75px;
  margin-left: 35px;
  /* IE 9 */
  -webkit-transform: rotate(45deg);
  transform: rotate(45deg);
  background-color: #212529;
}

.portfolio-modal .close-modal .lr .rl {
  /* Safari and Chrome */
  z-index: 1052;
  width: 1px;
  height: 75px;
  /* IE 9 */
  -webkit-transform: rotate(90deg);
  transform: rotate(90deg);
  background-color: #212529;
}

.timeline {
  position: relative;
  padding: 0;
  list-style: none;
}

.timeline:before {
  position: absolute;
  top: 0;
  bottom: 0;
  left: 40px;
  width: 2px;
  margin-left: -1.5px;
  content: '';
  background-color: #e9ecef;
}

.timeline > li {
  position: relative;
  min-height: 50px;
  margin-bottom: 50px;
}

.timeline > li:after, .timeline > li:before {
  display: table;
  content: ' ';
}

.timeline > li:after {
  clear: both;
}

.timeline > li .timeline-panel {
  position: relative;
  float: right;
  width: 100%;
  padding: 0 20px 0 100px;
  text-align: left;
}

.timeline > li .timeline-panel:before {
  right: auto;
  left: -15px;
  border-right-width: 15px;
  border-left-width: 0;
}

.timeline > li .timeline-panel:after {
  right: auto;
  left: -14px;
  border-right-width: 14px;
  border-left-width: 0;
}

.timeline > li .timeline-image {
  position: absolute;
  z-index: 100;
  left: 0;
  width: 80px;
  height: 80px;
  margin-left: 0;
  text-align: center;
  color: white;
  border: 7px solid #e9ecef;
  border-radius: 100%;
  background-color: #fed136;
}

.timeline > li .timeline-image h4 {
  font-size: 10px;
  line-height: 14px;
  margin-top: 12px;
}

.timeline > li.timeline-inverted > .timeline-panel {
  float: right;
  padding: 0 20px 0 100px;
  text-align: left;
}

.timeline > li.timeline-inverted > .timeline-panel:before {
  right: auto;
  left: -15px;
  border-right-width: 15px;
  border-left-width: 0;
}

.timeline > li.timeline-inverted > .timeline-panel:after {
  right: auto;
  left: -14px;
  border-right-width: 14px;
  border-left-width: 0;
}

.timeline > li:last-child {
  margin-bottom: 0;
}

.timeline .timeline-heading h4 {
  margin-top: 0;
  color: inherit;
}

.timeline .timeline-heading h4.subheading {
  text-transform: none;
}

.timeline .timeline-body > ul,
.timeline .timeline-body > p {
  margin-bottom: 0;
}

@media (min-width: 768px) {
  .timeline:before {
    left: 50%;
  }
  .timeline > li {
    min-height: 100px;
    margin-bottom: 100px;
  }
  .timeline > li .timeline-panel {
    float: left;
    width: 41%;
    padding: 0 20px 20px 30px;
    text-align: right;
  }
  .timeline > li .timeline-image {
    left: 50%;
    width: 100px;
    height: 100px;
    margin-left: -50px;
  }
  .timeline > li .timeline-image h4 {
    font-size: 13px;
    line-height: 18px;
    margin-top: 16px;
  }
  .timeline > li.timeline-inverted > .timeline-panel {
    float: right;
    padding: 0 30px 20px 20px;
    text-align: left;
  }
}

@media (min-width: 992px) {
  .timeline > li {
    min-height: 150px;
  }
  .timeline > li .timeline-panel {
    padding: 0 20px 20px;
  }
  .timeline > li .timeline-image {
    width: 150px;
    height: 150px;
    margin-left: -75px;
  }
  .timeline > li .timeline-image h4 {
    font-size: 18px;
    line-height: 26px;
    margin-top: 30px;
  }
  .timeline > li.timeline-inverted > .timeline-panel {
    padding: 0 20px 20px;
  }
}

@media (min-width: 1200px) {
  .timeline > li {
    min-height: 170px;
  }
  .timeline > li .timeline-panel {
    padding: 0 20px 20px 100px;
  }
  .timeline > li .timeline-image {
    width: 170px;
    height: 170px;
    margin-left: -85px;
  }
  .timeline > li .timeline-image h4 {
    margin-top: 40px;
  }
  .timeline > li.timeline-inverted > .timeline-panel {
    padding: 0 100px 20px 20px;
  }
}

section#contact {
  background-color: #3366FF;
  background-image: url("../img/map-image.png");
  background-repeat: no-repeat;
  background-position: center;
  color: white;
  text-align:center;
}

section#contact .section-heading {
  color: #fff;
}

section#contact .form-group {
  margin-bottom: 25px;
}

section#contact .form-group input,
section#contact .form-group textarea {
  padding: 20px;
}

section#contact .form-group input.form-control {
  height: auto;
}

section#contact .form-group textarea.form-control {
  height: 248px;
}

section#contact .form-control:focus {
  border-color: #fed136;
  -webkit-box-shadow: none;
  box-shadow: none;
}

section#contact ::-webkit-input-placeholder {
  font-weight: 700;
  color: #ced4da;
  font-family: 'Montserrat', -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, 'Helvetica Neue', Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol', 'Noto Color Emoji';
}

section#contact :-moz-placeholder {
  font-weight: 700;
  color: #ced4da;
  font-family: 'Montserrat', -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, 'Helvetica Neue', Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol', 'Noto Color Emoji';
}

section#contact ::-moz-placeholder {
  font-weight: 700;
  color: #ced4da;
  font-family: 'Montserrat', -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, 'Helvetica Neue', Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol', 'Noto Color Emoji';
}

section#contact :-ms-input-placeholder {
  font-weight: 700;
  color: #ced4da;
  font-family: 'Montserrat', -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, 'Helvetica Neue', Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol', 'Noto Color Emoji';
}

section#cek {
  background-color: #212529;
  background-repeat: no-repeat;
  background-position: center;
}

section#cek .section-heading {
  color: #fff;
}

section#cek .form-group {
  margin-bottom: 25px;
}

section#cek .form-group input,
section#cek .form-group textarea {
  padding: 20px;
}

section#cek .form-group input.form-control {
  height: auto;
}

section#cek .form-group textarea.form-control {
  height: 248px;
}

section#cek .form-control:focus {
  border-color: #fed136;
  -webkit-box-shadow: none;
  box-shadow: none;
}

section#cek ::-webkit-input-placeholder {
  font-weight: 700;
  color: #ced4da;
  font-family: 'Montserrat', -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, 'Helvetica Neue', Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol', 'Noto Color Emoji';
}

section#cek :-moz-placeholder {
  font-weight: 700;
  color: #ced4da;
  font-family: 'Montserrat', -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, 'Helvetica Neue', Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol', 'Noto Color Emoji';
}

section#cek ::-moz-placeholder {
  font-weight: 700;
  color: #ced4da;
  font-family: 'Montserrat', -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, 'Helvetica Neue', Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol', 'Noto Color Emoji';
}

section#cek :-ms-input-placeholder {
  font-weight: 700;
  color: #ced4da;
  font-family: 'Montserrat', -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, 'Helvetica Neue', Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol', 'Noto Color Emoji';
}

footer {
  padding: 25px 0;
  text-align: center;
}

footer span.copyright {
  font-size: 90%;
  line-height: 40px;
  text-transform: none;
  font-family: 'Montserrat', -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, 'Helvetica Neue', Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol', 'Noto Color Emoji';
}

footer ul.quicklinks {
  font-size: 90%;
  line-height: 40px;
  margin-bottom: 0;
  text-transform: none;
  font-family: 'Montserrat', -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, 'Helvetica Neue', Arial, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol', 'Noto Color Emoji';
}

ul.social-buttons {
  margin-bottom: 0;
}

ul.social-buttons li a {
  font-size: 20px;
  line-height: 50px;
  display: block;
  width: 50px;
  height: 50px;
  -webkit-transition: all 0.3s;
  transition: all 0.3s;
  color: white;
  border-radius: 100%;
  outline: none;
  background-color: #212529;
}

ul.social-buttons li a:active, ul.social-buttons li a:focus, ul.social-buttons li a:hover {
  background-color: #fed136;
}
