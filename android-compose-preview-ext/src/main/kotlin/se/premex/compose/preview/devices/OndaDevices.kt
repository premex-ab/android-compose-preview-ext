package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ONDA device specifications for Android Compose previews.
 *
 * This extension provides ONDA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Onda.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Onda: Any
  get() = object {
      /** ONDA T9S */
      val T9S = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
