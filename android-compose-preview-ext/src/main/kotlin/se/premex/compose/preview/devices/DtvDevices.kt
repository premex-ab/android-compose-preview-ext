package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * DTV device specifications for Android Compose previews.
 *
 * This extension provides DTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dtv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dtv: Any
  get() = object {
      /** DTV Digital_Life_P3 */
      val DIGITAL_LIFE_P3 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
