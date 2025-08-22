package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * UBOS device specifications for Android Compose previews.
 *
 * This extension provides UBOS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ubos.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ubos: Any
  get() = object {
      /** UBOS UTAB */
      val UTAB = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
