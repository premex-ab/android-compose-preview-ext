package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TPLAY device specifications for Android Compose previews.
 *
 * This extension provides TPLAY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tplay.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tplay: Any
  get() = object {
      /** TPLAY SEI800TCT */
      val SEI800TCT = "spec:width=720,height=1280,unit=px,dpi=320"

  }
