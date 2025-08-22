package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * AVANGARD device specifications for Android Compose previews.
 *
 * This extension provides AVANGARD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Avangard.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Avangard: Any
  get() = object {
      /** AVANGARD R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** AVANGARD R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
