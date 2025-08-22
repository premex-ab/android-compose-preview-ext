package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Core_Innovations device specifications for Android Compose previews.
 *
 * This extension provides Core_Innovations device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CoreInnovations.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CoreInnovations: Any
  get() = object {
      /** Core_Innovations CRTB7001 */
      val CRTB7001 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Core_Innovations CTB1016G */
      val CTB1016G = "spec:width=600,height=1024,unit=px,dpi=160"

  }
