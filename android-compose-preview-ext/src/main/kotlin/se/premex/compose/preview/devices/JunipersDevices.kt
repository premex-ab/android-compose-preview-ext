package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Junipers device specifications for Android Compose previews.
 *
 * This extension provides Junipers device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Junipers.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Junipers: Any
  get() = object {
      /** Junipers CT8 */
      val CT8 = "spec:width=800,height=1280,unit=px,dpi=240"

  }
