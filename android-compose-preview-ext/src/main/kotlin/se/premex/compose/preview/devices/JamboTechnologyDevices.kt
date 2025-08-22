package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Jambo_Technology device specifications for Android Compose previews.
 *
 * This extension provides Jambo_Technology device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JamboTechnology.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JamboTechnology: Any
  get() = object {
      /** Jambo_Technology JP1 */
      val JP1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Jambo_Technology JP2 */
      val JP2 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
