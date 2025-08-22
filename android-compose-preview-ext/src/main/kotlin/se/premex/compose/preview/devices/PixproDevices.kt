package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * PIXPRO device specifications for Android Compose previews.
 *
 * This extension provides PIXPRO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Pixpro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Pixpro: Any
  get() = object {
      /** PIXPRO PIXPRO_L1_PRO */
      val PIXPRO_L1_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

  }
