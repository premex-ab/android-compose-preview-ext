package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TRUFON device specifications for Android Compose previews.
 *
 * This extension provides TRUFON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Trufon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Trufon: Any
  get() = object {
      /** TRUFON TRUFON_FLEX */
      val TRUFON_FLEX = "spec:width=720,height=1600,unit=px,dpi=280"

  }
