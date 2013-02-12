#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package ${package};

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Scope;

import ${package}.util.BaseApplication;

import com.vaadin.terminal.ExternalResource;

import com.vaadin.ui.Label;
import com.vaadin.ui.Window;


/**
 * Hello world!
 */
@Configurable(preConstruction=true)
@org.springframework.stereotype.Component(value="app")
public class App extends BaseApplication {
    /**
     * @see com.vaadin.Application#init()
     */
    @Override
    public void init() {
        setMainWindow(new MainWindow());
    }
    
    @Override
    public Window getWindow(String name) {
        Window w = super.getWindow(name);
        // If not, we must create a new window for this new browser window/tab
        if (w == null) {
            w = new MainWindow();
            w.setName(name);
            addWindow(w);
            w.open(new ExternalResource(w.getURL()));
        }
        return w;
    }
}
