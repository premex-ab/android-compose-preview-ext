package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Digiking device specifications for Android Compose previews.
 *
 * This extension provides Digiking device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Digiking.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Digiking: Any
  get() = object {
      /** Digiking capitolhill */
      val CAPITOLHILL = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Digiking keoneae */
      val KEONEAE = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
