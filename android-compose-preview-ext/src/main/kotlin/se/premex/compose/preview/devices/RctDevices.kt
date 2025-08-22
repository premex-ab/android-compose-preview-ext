package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * RCT device specifications for Android Compose previews.
 *
 * This extension provides RCT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rct.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rct: Any
  get() = object {
      /** RCT MX101M2 */
      val MX101M2 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
