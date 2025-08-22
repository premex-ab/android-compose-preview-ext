package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Unitech device specifications for Android Compose previews.
 *
 * This extension provides Unitech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Unitech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Unitech: Any
  get() = object {
      /** Unitech EA510 */
      val EA510 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Unitech TB85 */
      val TB85 = "spec:width=800,height=1280,unit=px,dpi=320"

      /** Unitech wd200 */
      val WD200 = "spec:width=480,height=800,unit=px,dpi=240"

  }
