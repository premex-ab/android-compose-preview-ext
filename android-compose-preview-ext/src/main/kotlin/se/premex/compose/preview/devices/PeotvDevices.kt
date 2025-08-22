package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * PEOTV device specifications for Android Compose previews.
 *
 * This extension provides PEOTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Peotv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Peotv: Any
  get() = object {
      /** PEOTV SEI300SLT */
      val SEI300SLT = "spec:width=720,height=1280,unit=px,dpi=213"

  }
