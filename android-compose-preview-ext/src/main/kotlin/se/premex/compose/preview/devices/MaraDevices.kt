package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Mara device specifications for Android Compose previews.
 *
 * This extension provides Mara device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mara.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mara: Any
  get() = object {
      /** Mara Mara_Z_d_sprout */
      val MARA_Z_D_SPROUT = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Mara Mara_Z_sprout */
      val MARA_Z_SPROUT = "spec:width=720,height=1440,unit=px,dpi=320"

  }
