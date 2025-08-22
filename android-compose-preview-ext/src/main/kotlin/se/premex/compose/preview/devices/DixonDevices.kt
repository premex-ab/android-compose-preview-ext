package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Dixon device specifications for Android Compose previews.
 *
 * This extension provides Dixon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dixon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dixon: Any
  get() = object {
      /** Dixon S5790 */
      val S5790 = "spec:width=720,height=1520,unit=px,dpi=300"

      /** Dixon TS_M103A */
      val TS_M103A = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
