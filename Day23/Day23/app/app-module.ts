import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { provideHttpClient } from '@angular/common/http';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { MyChild } from './my-child/my-child';
import { MyChild2 } from './my-child2/my-child2';
import { FormsModule } from '@angular/forms';
import { EmployeeComponent } from './employee-component/employee-component';
import { StudentComponent } from './student-component/student-component';
import { ProductCatalog } from './product-catalog/product-catalog';
import { CompanyDashboard } from './company-dashboard/company-dashboard';
import { EventRegistrationForm } from './event-registration-form/event-registration-form';
import { CounterApplication } from './counter-application/counter-application';
import { StructuralDirective } from './structural-directive/structural-directive';
import { CalculatorService } from './calculator-service';
import { AdditionComponent } from './addition-component/addition-component';
import { SubtractionComponent } from './subtraction-component/subtraction-component';
import { EmployeeContent } from './employee-content/employee-content';
import { HomeComponent } from './home-component/home-component';
import { AboutComponent } from './about-component/about-component';
import { ContactComponent } from './contact-component/contact-component';

@NgModule({
  declarations: [
    App,
    MyChild,
    MyChild2,
    EmployeeComponent,
    StudentComponent,
    ProductCatalog,
    CompanyDashboard,
    EventRegistrationForm,
    CounterApplication,
    StructuralDirective,
    AdditionComponent,
    SubtractionComponent,
    EmployeeContent,
    HomeComponent,
    AboutComponent,
    ContactComponent,
  ],
  imports: [BrowserModule, AppRoutingModule, FormsModule],
  providers: [provideBrowserGlobalErrorListeners(), provideHttpClient(), CalculatorService],
  bootstrap: [App],
})
export class AppModule {}
