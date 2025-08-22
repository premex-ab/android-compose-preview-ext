package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * IMPERIAL device specifications for Android Compose previews.
 *
 * This extension provides IMPERIAL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Imperial.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Imperial: Any
  get() = object {
      /** IMPERIAL R3_GTV */
      val R3_GTV = "spec:width=720,height=1280,unit=px,dpi=213"

      /** IMPERIAL R4_GTV */
      val R4_GTV = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
