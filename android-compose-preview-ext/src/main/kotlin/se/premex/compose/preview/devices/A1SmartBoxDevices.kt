package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * A1_Smart_Box device specifications for Android Compose previews.
 *
 * This extension provides A1_Smart_Box device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.A1SmartBox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.A1SmartBox: Any
  get() = object {
      /** A1_Smart_Box A1_B866V2F02 */
      val A1_B866V2F02 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
