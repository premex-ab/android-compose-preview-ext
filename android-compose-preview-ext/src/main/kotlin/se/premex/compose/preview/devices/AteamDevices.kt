package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ATEAM device specifications for Android Compose previews.
 *
 * This extension provides ATEAM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ateam.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ateam: Any
  get() = object {
      /** ATEAM A1010 */
      val A1010 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ATEAM A801 */
      val A801 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
