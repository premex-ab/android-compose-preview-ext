package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * GLOBAL_3 device specifications for Android Compose previews.
 *
 * This extension provides GLOBAL_3 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Global3.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Global3: Any
  get() = object {
      /** GLOBAL_3 Global3_B01 */
      val GLOBAL3_B01 = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
