package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * PRIME device specifications for Android Compose previews.
 *
 * This extension provides PRIME device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Prime.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Prime: Any
  get() = object {
      /** PRIME shinagawa */
      val SHINAGAWA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
