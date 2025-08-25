# Preview Groups

Preview Groups enable developers to easily preview Jetpack Compose UI components across all devices of a selected brand. This feature streamlines UI testing and QA for brand-specific behaviors and layouts, especially valuable for enterprise or rugged device fleets.

## Features

- **Brand-based device grouping**: Access all devices from specific manufacturers
- **Programmatic device access**: Get device specifications through utility functions
- **Device categorization**: Filter devices by type (handhelds, tablets, etc.)
- **Comprehensive coverage**: Access complete device catalogs for supported brands

## Supported Brands

Currently supported brands for preview groups:

- **Zebra** (76 devices) - Enterprise and rugged handhelds, tablets, and vehicle computers

## Usage

### Basic Usage

#### 1. Programmatic Access to Device Groups

```kotlin
import se.premex.compose.preview.groups.PreviewGroups

// Get all Zebra devices
val zebraDevices = PreviewGroups.getZebraDevices()

// Get devices by brand name (case-insensitive)
val devices = PreviewGroups.getDevicesForBrand("zebra")

// Get list of all supported brands
val supportedBrands = PreviewGroups.getSupportedBrands()
```

#### 2. Creating Preview Groups Manually

Instead of writing multiple `@Preview` annotations individually, you can programmatically reference device specifications:

```kotlin
import androidx.compose.ui.tooling.preview.Preview
import se.premex.compose.preview.groups.PreviewGroups
import se.premex.compose.preview.device.catalog.android.Zebra

// Manual approach - select specific Zebra devices for previews
@Preview(name = "Zebra MC33", device = Zebra.MC33)
@Preview(name = "Zebra TC26", device = Zebra.TC26)  
@Preview(name = "Zebra TC27", device = Zebra.TC27)
@Preview(name = "Zebra ET50T", device = Zebra.ET50T)
@Composable
fun MyComposableZebraPreview() {
    MyComposable()
}
```

#### 3. Using Zebra Device Categories

For more targeted testing, use device categories:

```kotlin
import se.premex.compose.preview.groups.ZebraPreviewGroup

// Access devices by category
val handhelds = ZebraPreviewGroup.Categories.handhelds       // MC series
val touchComputers = ZebraPreviewGroup.Categories.touchComputers  // TC series  
val tablets = ZebraPreviewGroup.Categories.tablets           // ET series
val vehicleComputers = ZebraPreviewGroup.Categories.vehicleComputers // VC series

// Use in validation or testing
handhelds.forEach { deviceSpec ->
    // Validate layout works on handheld form factors
}
```

### Advanced Usage

#### Testing Across Device Categories

```kotlin
import se.premex.compose.preview.groups.ZebraPreviewGroup

// Test your composable across different Zebra device categories
fun validateAcrossZebraDevices() {
    val categories = listOf(
        "Handhelds" to ZebraPreviewGroup.Categories.handhelds,
        "Touch Computers" to ZebraPreviewGroup.Categories.touchComputers,
        "Tablets" to ZebraPreviewGroup.Categories.tablets,
        "Vehicle Computers" to ZebraPreviewGroup.Categories.vehicleComputers
    )
    
    categories.forEach { (categoryName, devices) ->
        println("Testing $categoryName with ${devices.size} devices")
        devices.forEach { deviceSpec ->
            // Perform testing logic here
        }
    }
}
```

#### Dynamic Preview Generation

```kotlin
// Generate preview content dynamically for documentation or validation
fun generateZebraPreviewCode(): String {
    val devices = PreviewGroups.getZebraDevices()
    return devices.mapIndexed { index, deviceSpec ->
        val deviceName = ZebraPreviewGroup.deviceNames[index]
        """@Preview(name = "Zebra $deviceName", device = Zebra.$deviceName)"""
    }.joinToString("\n")
}
```

## Benefits

1. **Comprehensive Testing**: Easily test across entire device fleets
2. **Enterprise Focus**: Designed for enterprise apps that run on specific device brands
3. **Developer Productivity**: Reduce manual preview setup time
4. **Quality Assurance**: Catch brand-specific layout issues early
5. **Categorized Access**: Target specific device types (handhelds, tablets, etc.)

## Example: Enterprise App Preview Setup

```kotlin
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import se.premex.compose.preview.device.catalog.android.Zebra

// Preview key Zebra devices for enterprise warehouse app
@Preview(name = "Handheld - MC33", device = Zebra.MC33)
@Preview(name = "Touch Computer - TC26", device = Zebra.TC26) 
@Preview(name = "Tablet - ET50T", device = Zebra.ET50T)
@Preview(name = "Vehicle - VC80X", device = Zebra.VC80X)
@Composable  
fun WarehouseAppPreview() {
    WarehouseManagementScreen()
}
```

## Future Enhancements

- Support for additional brands (Samsung, Google, Honeywell, etc.)
- Screen size and resolution filtering
- Custom preview group creation
- Integration with Android Studio's preview system
- Preview templates for common enterprise scenarios

---

This feature makes it easier to ensure your Compose UI works seamlessly across devices from specific manufacturers, especially valuable for enterprise applications targeting branded device fleets.