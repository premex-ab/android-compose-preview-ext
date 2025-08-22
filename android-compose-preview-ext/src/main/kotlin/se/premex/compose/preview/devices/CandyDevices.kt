package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Candy device specifications for Android Compose previews.
 *
 * This extension provides Candy device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Candy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Candy: Any
  get() = object {
      /** Candy mateo */
      val MATEO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Candy pioneer */
      val PIONEER = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
