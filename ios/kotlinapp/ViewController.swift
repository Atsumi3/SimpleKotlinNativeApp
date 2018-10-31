import UIKit
import common

class ViewController: UIViewController {
    override func viewDidLoad() {
        super.viewDidLoad()
        
        let label = UILabel(frame: view.bounds)
        view.addSubview(label)
        
        // 中央表示
        label.textAlignment = .center
        
        // Kotlin側のコード呼び出し
        label.text = CommonKt.createApplicationScreenMessage()
    }
}
