import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { Child1 } from './child1/child1';
import { Child2 } from './child2/child2';
import { FormsModule } from '@angular/forms';
import { Ngif } from './ngif/ngif';
import { CalculatorService } from './calculator-service';
import { AdditionComponent } from './addition-component/addition-component';
import { SubtractionComponent } from './subtraction-component/subtraction-component';
import { EmployeeComponent } from './employee-component/employee-component';
import { PipeComponent } from './pipe-component/pipe-component';
import { Home } from './home/home';
import { About } from './about/about';
import { Contact } from './contact/contact';

@NgModule({
  declarations: [
    App,
    Child1,
    Child2,
    Ngif,
    AdditionComponent,
    SubtractionComponent,
    EmployeeComponent,
    PipeComponent,
    Home,
    About,
    Contact,
  ],
  imports: [BrowserModule, AppRoutingModule, FormsModule],
  providers: [CalculatorService, provideBrowserGlobalErrorListeners()],
  bootstrap: [App],
})
export class AppModule {}
