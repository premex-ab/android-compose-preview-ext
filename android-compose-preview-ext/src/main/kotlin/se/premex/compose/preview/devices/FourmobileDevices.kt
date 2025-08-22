package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * FourMobile device specifications for Android Compose previews.
 *
 * This extension provides FourMobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fourmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fourmobile: Any
  get() = object {
      /** FourMobile S710_Ruby */
      val S710_RUBY = "spec:width=720,height=1280,unit=px,dpi=320"

  }
