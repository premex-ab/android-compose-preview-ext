package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TBC device specifications for Android Compose previews.
 *
 * This extension provides TBC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tbc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tbc: Any
  get() = object {
      /** TBC TATV_8000 */
      val TATV_8000 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
