package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SkyNZ device specifications for Android Compose previews.
 *
 * This extension provides SkyNZ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Skynz.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Skynz: Any
  get() = object {
      /** SkyNZ SEI700SKY */
      val SEI700SKY = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SkyNZ SkyNZ3151 */
      val SKYNZ3151 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
