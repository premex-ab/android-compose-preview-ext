package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * COMTECO device specifications for Android Compose previews.
 *
 * This extension provides COMTECO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Comteco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Comteco: Any
  get() = object {
      /** COMTECO DV8535-KBC */
      val DV8535_KBC = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
