package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * High_Q device specifications for Android Compose previews.
 *
 * This extension provides High_Q device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HighQ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HighQ: Any
  get() = object {
      /** High_Q ELT0704H */
      val ELT0704H = "spec:width=600,height=1024,unit=px,dpi=160"

      /** High_Q ELT0706H */
      val ELT0706H = "spec:width=600,height=1024,unit=px,dpi=160"

      /** High_Q ELT0802H */
      val ELT0802H = "spec:width=800,height=1280,unit=px,dpi=160"

  }
