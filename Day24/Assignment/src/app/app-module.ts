import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { FormsModule } from '@angular/forms';
import { EmployeeComponent } from './employee-component/employee-component';
import { StudentComponent } from './student-component/student-component';
import { ProductComponent } from './product-component/product-component';
import { CompanyComponent } from './company-component/company-component';
import { EventComponent } from './event-component/event-component';
import { CounterComponent } from './counter-component/counter-component';
import { EmployeeRegistrationComponent } from './employee-registration-component/employee-registration-component';
import { ProductCatalogComponent } from './product-catalog-component/product-catalog-component';
import { StudentResultComponent } from './student-result-component/student-result-component';

@NgModule({
  declarations: [
    App,
    EmployeeComponent,
    StudentComponent,
    ProductComponent,
    CompanyComponent,
    EventComponent,
    CounterComponent,
    EmployeeRegistrationComponent,
    ProductCatalogComponent,
    StudentResultComponent,
  ],
  imports: [BrowserModule, AppRoutingModule, FormsModule],
  providers: [provideBrowserGlobalErrorListeners()],
  bootstrap: [App],
})
export class AppModule {}
