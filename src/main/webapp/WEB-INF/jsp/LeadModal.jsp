<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="css/LeadModal.css">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Leads</title>
</head>
<body>
 
    
    <div class="bg-modal">

        <div class="modal-content">
            <div class="close">+</div>
            <form action="">
                <input type="text" placeholder="Lead Owner">
                <div class="dropdown">
                <select name="Lead Status" id="dropdown_lead">
                    <option value="Lead Status">Lead Status</option>
                    <option value="new">New</option>
                    <option value="contacted">Contacted</option>
                    <option value="working">Working</option>
                    <option value="qualified">Qualified</option>
                    <option value="unqualified">Unqualified</option>
                </select>
                
               
            <select name="Name:Salutation" id="dropdown_name">
            <option value="Name:Salutation">Name:Salutation</option>
            <option value="mr.">Mr.</option>
            <option value="ms">Ms.</option>
            <option value="mrs">Mrs.</option>
            <option value="dr">Dr.</option>
            <option value="prof">Prof.</option>
            </select>



            <input type="text" placeholder="Fisrt Name">
            <input type="text" placeholder="Last Name">
            <input type="number" placeholder="Phone">
            <input type="text" placeholder="Company">
            <input type="text" placeholder="Email">
            <input type="text" placeholder="Address Information">
            <input type="text" placeholder="Street">
            <input type="text" placeholder="City">
            <input type="text" placeholder="State/Province">
            <input type="text" placeholder="Zip/Postal Code">
            <input type="text " placeholder="Country">
            <input type="text" placeholder="Website">
            <input type="text" placeholder="Additional Information">
            <input type="number" placeholder="No. of Employees">


            <select name="Lead Source" id="dropdown_source">
            <option value="Lead Source">Lead Source</option>
            <option value="advertisement">Advertisement</option>
            <option value="Employee">Employee</option>
            <option value="referral">Referral</option>
            <option value="in-store">In-Store</option>
            <option value="social">Social</option>
            <option value="other">Other</option>
            </select>


            <input type="number" placeholder="Annual Revenue">

            <select name="Industry" id="dropdown_industry">
            <option value="Industry">Industry</option>
            <option value="agriculture">Agriculture</option>
            <option value="chemical">Chemical</option>
            <option value="biotechnology">Biotechnology</option>
            <option value="banking ">Banking</option>
            <option value="etc">etc</option>
            </select>

            <input type="text" placeholder="Description Information">
            <br><br>
            <button>Save Details</button>
            </form>

        </div>
    </div>
</body>
</html>