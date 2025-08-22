package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Ginzzu device specifications for Android Compose previews.
 *
 * This extension provides Ginzzu device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ginzzu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ginzzu: Any
  get() = object {
      /** Ginzzu RS8502 */
      val RS8502 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Ginzzu RS9602 */
      val RS9602 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
