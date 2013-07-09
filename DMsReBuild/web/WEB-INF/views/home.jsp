<!DOCTYPE HTML>
<html>

<head>
  <title>SDMS College</title>
  <meta name="description" content="website description" />
  <meta name="keywords" content="website keywords, website keywords" />
  <meta http-equiv="content-type" content="text/html; charset=windows-1252" />
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css" title="style" />
</head>

<body>
  <div id="main">
    <div id="header">
      <div id="logo">
        <div id="logo_text">
          <!-- class="logo_colour", allows you to change the colour of the text -->
          <h1><a href="index.html">Sri Durga Malleswara Siddartha <span class="logo_colour">Mahila Kalasala.</span></a></h1>
          <h2>Affiliated to Krishna University, Vijayawada.</h2>
        </div>
      </div>
      <div id="menubar">
        <ul id="menu">
          <!-- put class="selected" in the li tag for the selected page - to highlight which page you're on -->
          <li class="selected"><a href="#">Home</a></li>
          <li><a href="#">Arts Department</a></li>
          <li><a href="#">Science Department</a></li>
          <li><a href="#">About Us</a></li>
          <li><a href="#">Contact Us</a></li>
        </ul>
      </div>
    </div>
    <div id="site_content">
      <div class="sidebar">
        <!-- insert your sidebar items here -->
        <h3>Latest News</h3>
        <h4>New Website Launched</h4>
        <h5><%=new java.util.Date()%></h5>
        <p>Sai Teja Infotech Launched a New WebSite. Take a look around and let us know what you think.<br /><a href="#">Read more</a></p>
        <p></p>
        <h4>Results</h4>
        <h5><%=new java.util.Date()%></h5>
        <p>Keep Visiting the Site for Results.<br /><a href="#">Read more</a></p>
        <h3>Exams</h3>
        <ul>
          <li><a href="${pageContext.request.contextPath}/params">Post Internal Marks</a></li>
          <li><a href="${pageContext.request.contextPath}/attendance">Class Work Attendance</a></li>
          <li><a href="${pageContext.request.contextPath}/report">Reports</a></li>
          <li><a href="${pageContext.request.contextPath}/editMarks">Update Internal Marks</a></li>
          <li><a href="#">Admin</a></li>
        </ul>
        <h3>Search</h3>
        <form id="search_form">
          <p>
            <input class="search" type="text" name="search_field" value="Enter keywords....." />
            <input name="search" type="image" style="border: 0; margin: 0 0 -9px 5px;" src="${pageContext.request.contextPath}/resources/images/search.png" alt="Search" title="Search" />
          </p>
        </form>
      </div>
      <div id="content">
        <!-- insert the page content here -->
        <h1>Welcome to Siddhartha Academy.</h1>
        <p>Siddhartha Academy of General & Technical Education came into existence in 1975.  The Academy today has a 250 member, enthusiastic band of philanthropist Life Members from various sections of the society drawn from Vijayawada, Andhra Pradesh, the rest of India and the USA.  The Academy has established 14 educational institutions that offer a variety of courses ranging from KG to PG in general education besides specific courses for technical and professional education.</p>

        <h2>Institutions offering courses.</h2>
        <p>Arts, Science and Commerce at Intermediate, Degree and Post Graduate levels.:</p>
        <ul>
          <li>Parvathaneni Brahmaya Siddhartha College of Arts & Science (Estd. 1975)</li>
          <li>Parvathaneni Brahmayya Siddhartha Junior College of Arts & Science (Estd. 1975 )</li>
          <li>Post Graduate center of Parvathaneni Brahmayya Siddhartha College of Arts & Science (Estd.1987 )</li>
          <li>A.G & S.G. Siddhartha Arts & Science Degree  College, Vuyyuru, Krishna District. (Estd. 1975)</li>
          <li>Sir Durga Malleswara Siddhartha Mahila Kalasala (Estd. 1985).</li>
          <li>Sri Durga Malleswara Siddhartha Mahila Junior College (Estd. 1982).</li>
          <li>Veeramachaneni Paddayya Siddharta Public School (Estd. 1977).</li>
          <li>KCP Siddhartha Adarsh Residential Public School (Estd. 1991).</li>
          <li>Prasad V. Potluri Siddhartha Institute of Technology (Estd. 1998)</li>
        </ul>
      </div>
    </div>
    <div id="content_footer"></div>
    <div id="footer">
      Copyright &copy; | <a href="#">Site design from,  Sai Teja InfoTech, Vijayawada - 10</a> |
    </div>
  </div>
</body>
</html>
