package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Mira device specifications for Android Compose previews.
 *
 * This extension provides Mira device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mira.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mira: Any
  get() = object {
      /** Mira X2 */
      val X2 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
