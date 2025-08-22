package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * DAWLANCE device specifications for Android Compose previews.
 *
 * This extension provides DAWLANCE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dawlance.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dawlance: Any
  get() = object {
      /** DAWLANCE SW6H */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** DAWLANCE umeda */
      val UMEDA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
