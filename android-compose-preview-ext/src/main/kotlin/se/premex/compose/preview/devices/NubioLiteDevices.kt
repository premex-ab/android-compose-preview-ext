package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Nubio_Lite device specifications for Android Compose previews.
 *
 * This extension provides Nubio_Lite device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NubioLite.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NubioLite: Any
  get() = object {
      /** Nubio_Lite LS032I */
      val LS032I = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Nubio_Lite LS032M */
      val LS032M = "spec:width=720,height=1440,unit=px,dpi=320"

  }
