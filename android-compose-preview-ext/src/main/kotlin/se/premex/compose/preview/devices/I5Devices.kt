package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * i5 device specifications for Android Compose previews.
 *
 * This extension provides i5 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.I5.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.I5: Any
  get() = object {
      /** i5 V10 */
      val V10 = "spec:width=480,height=1014,unit=px,dpi=213"

      /** i5 10080 */
      val _10080 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
